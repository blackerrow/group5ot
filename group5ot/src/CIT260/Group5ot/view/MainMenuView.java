/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.view;

import CIT260.Group5ot.control.GameControl;
import CIT260.Group5ot.control.MapControl;
import CIT260.Group5ot.exceptions.GameControlException;
import group5ot.Group5ot;
import java.util.Scanner;
import CIT260.Group5ot.model.Character;
import CIT260.Group5ot.model.InventoryItem;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author crims
 */
public class MainMenuView extends View {

    protected final PrintWriter console = Group5ot.getOutFile();

    Character ch;
    
    /*public class MainMenuView
    {*/
        private String promptMessage;
                

        public MainMenuView() {
                   super( "\n"
                        + "\n|*| ------------------------- |*|"
                        + "\n|*| ****    Main Menu    **** |*|"
                        + "\n|*| ------------------------- |*|"
                        + "\n|*| B - Begin New Game        |*|"
                        + "\n|*| L - Load Saved Game       |*|"
                        + "\n|*| H - Help Menu             |*|"                 
                        + "\n|*| G - Game Menu             |*|"
                        + "\n|*| S - Save game             |*|"
//                        + "\n|*| T - Test Menu             |*|"
                        + "\n|*| Q - Quit                  |*|"
                        + "\n|*| ------------------------- |*|");
        }
   
    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
            case "B": // create and start new game
               try{ this.startNewGame();}
                catch (GameControlException ex){
                    ErrorView.display(ex.getClass().getName(), "Error Reading input: " + ex.getMessage());
                }
                break;
            case "L": // get and start an existing game
                this.startExistingGame();
                break;
            case "H": // display the help menu
                this.displayHelpMenu();
                break;
            case "G": // display the Game menu
                this.displayGameMenu();
                break;
            case "S": // save the current game
                this.saveGame();
                break; 
            case "T": // test the game features
                this.displayTestMenu();
                break; 
            case "Q": // end the game
                System.exit(0);
                break; 
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        
         return false;
    }    

    private void startNewGame() throws GameControlException {
        
        //Create BeginGameView object
        BeginGameView beginGameView = new BeginGameView();
                
        // Display the BeginGameView
        beginGameView.displayBeginGameView();

    }

    private void startExistingGame() {
        this.console.println("\n\nEnter the file path for file where the game"
                + " is to be saved.");
        String filePath = this.getInput();
        
        try { 
            GameControl.getSavedGame(filePath);
        } catch(Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void displayHelpMenu() {
        //Create HELP menu object
        HelpMenuView helpMenuView = new HelpMenuView();
                
        // Display the help menu view
        helpMenuView.display();
    }

    private void displayGameMenu() {
        //Create Game menu object
        GameMenuView gameMenuView = new GameMenuView();
                
        // Display the Game menu view
        gameMenuView.display();
    }
    
    
    //display the test menu
   private void displayTestMenu(){
       TestMenuView testMenuView = new TestMenuView();
       
       testMenuView.display();
   }
    
    private void saveGame() {
        this.console.println("\n\nEnter the file path for file where the game"
                + " is to be saved.");
        String filePath = this.getInput();
        
        try { 
            GameControl.saveGame(Group5ot.getCurrentGame(), filePath);
        } catch(Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());

        }
    }
    //go to the map view
//    private void displayMapView() {
//        //Create map view object
//        MapView mapView = new MapView();
//                
//        // Display the map view
//        mapView.display();
//    }
    //display the barrelvolumecalcview
    private void displayBarrelVolumeCalcView() {
        //Create map view object
        BarrelVolumeCalcView calcBarrel = new BarrelVolumeCalcView();
                
        // Display the map view
        calcBarrel.display();
    }  
}
