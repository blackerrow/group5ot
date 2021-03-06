/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.view;
import CIT260.Group5ot.exceptions.GunControlException;
import CIT260.Group5ot.control.GunControl;
import CIT260.Group5ot.control.LocationControl;
import java.io.IOException;
import static java.lang.Double.parseDouble;

/**
 *
 * @author ken
 * 
 */


public class HuntView extends View {

    public HuntView(){
        
        double random = Math.random() * 100;

        if (random <= 25) {
            System.out.println(    
                  "\n                   |\\=.                    "
                + "\n                  /  6',                    "
                + "\n          .--.    \\  .-'                   "
                + "\n         /_   \\   /  (_()                  "
                + "\n           )   | / `;--'                    "
                + "\n          /   / /   (                       "
                + "\n         (    `\"    _)_                    "
                + "\n          `-==-'`\"\"\"\"\"\"`              "
                + "\n|*| ------------------------------------ |*|"
                + "\n|*| ****      SQUIRREL...YUCK!      **** |*|"
                + "\n|*| ------------------------------------ |*|"
                + "\n|*| S - Shoot                            |*|"
                + "\n|*| Q - Return to game menu              |*|"                 
                + "\n|*| ------------------------------------ |*|");
        
        }  else if (random > 25 && random <=50) {
            System.out.println(    
                  "\n                    \\     "
                + "\n                     \\_   "
                + "\n                  .---(')  "
                + "\n                o( )_-\\_  "
                + "\n|*| ------------------------------------ |*|"
                + "\n|*| ***  WOULD YOU EAT THIS RABBIT?  *** |*|"
                + "\n|*| ------------------------------------ |*|"
                + "\n|*| S - Shoot                            |*|"
                + "\n|*| Q - Return to game/main menu         |*|"                 
                + "\n|*| ------------------------------------ |*|");
       
        } else if (random > 50 && random <=75) {

            System.out.println(
                  "\n                  {_}                       "
                + "\n                 '-=\\                      "
                + "\n                    \\____(                 "
                + "\n                   _|/---\\_                "
                + "\n                   \\        \\             "       
                + "\n                                            "
                + "\n|*| ------------------------------------ |*|"
                + "\n|*| ****         YUMMY DEER!        **** |*|"
                + "\n|*| ------------------------------------ |*|"
                + "\n|*| S - Shoot                            |*|"
                + "\n|*| Q - Return to game/main menu         |*|"                 
                + "\n|*| ------------------------------------ |*|");            
            
        } else if (random > 75 && random <= 100) {
            
            System.out.println(    
                  "\n                     (____)                 "
                + "\n                      (oo)                  "
                + "\n               /-------\\/                  "
                + "\n              / |     ||                    "
                + "\n             *  ||----||                    "
                + "\n                ~~    ~~                    "         
                + "\n                                            "
                + "\n|*| ------------------------------------ |*|"
                + "\n|*| ****      KILL THE BEAST!       **** |*|"
                + "\n|*| ------------------------------------ |*|"
                + "\n|*| S - Shoot                            |*|"
                + "\n|*| Q - Return to game/main menu         |*|"                 
                + "\n|*| ------------------------------------ |*|");            
            
        }
        
    }        


    public void gunControlTaxCalculation() throws IOException{
        //Here I am going to bring in the gunControl class
        // Declares the variable and assigns a new object.
        GunControl calcGunControl = new GunControl(); 

        //get subtotal from user
        System.out.println(
                              "\nTo shoot, please solve this problem."
                            + "\nHow much were your bullets...before tax?"
        );
        //Scanner inputSubtotal = new Scanner(System.in);
        String inputSubtotal = null;
        inputSubtotal = this.keyboard.readLine();

        //store it in a variable called subtotal
        double subtotal = parseDouble(inputSubtotal);
        System.out.println("You entered the cost as: " + subtotal);

        //get tax from user
        System.out.println("What was the tax rate, entered as a decimal, when you bought them?, IE: .08 for 8%:");
        //Scanner inputTax = new Scanner(System.in);
        String inputTax = null;
        inputTax = this.keyboard.readLine();
        
        double tax = parseDouble(inputTax);

        System.out.println("You entered tax as: " + tax);

        try {
            double bulletPrice = calcGunControl.calcTaxProblem(subtotal, tax);
       
        
            System.out.println(
                              "\n||********   Calculate the price of bullets with tax   ********||"
                            + "\n|| In order to fire the gun, you must first calculate          ||"
                            + "\n|| the price of bullets including tax.                         ||"
                            + "\n|| ---------------------------------------------------------   ||"
                            + "\n|| To figure out the total cost of something, you must         ||"
                            + "\n|| follow two steps.  First, multiply the subtotal amount of   ||"
                            + "\n|| " + subtotal + " by the tax rate which was " + tax + " to get the tax amount. ||"
                            + "\n|| Second, add that amount to the subtotal.                    ||"
                            + "\n||***************************************************************"
                            + "\n\n"
                            + "Now, how much were your bullets plus tax?"
            );
            // Scanner userAnswer = new Scanner(System.in);
            String userAnswer = null;
            userAnswer = this.keyboard.readLine();
            double answer = parseDouble(userAnswer);

            System.out.println("\nYou entered " + answer);
            System.out.println("\nThe correct answer was " + bulletPrice);

            if (answer == bulletPrice) {
                System.out.println("\nThat is correct, you got your target!");
                //go back to the hunting menu
                MeatShareCalcView mscv = new MeatShareCalcView();
                mscv.display();
//                this.displayHuntingSceneView();

            }
            else{ System.out.println("\nSorry, please try again");
                //player must start again from the beginning
                this.gunControlTaxCalculation();
            }
        }   catch (GunControlException gc) {
                    System.out.println(gc.getMessage());
        }        
    }
    
    @Override
    public boolean doAction(String choice) {

            choice = choice.toUpperCase(); // convert choice to upper case

            switch (choice) {
                case "S": {
                    try {
                        // Calculate Tax to shoot gun
                        this.gunControlTaxCalculation();
                    } catch (IOException ex) {
                        System.out.println("Error in calculation.  Try again.");
                    }
                }
                    break;
                case "Q": // return to the previous screen
                    this.displayHuntingSceneView();
                    break;
                default:
                    System.out.println("\n*** Invalid selection *** Try again");
                    break;
            }

            return false;
    }
    
    public void displayHuntingSceneView() {
        HuntingSceneView huntSceneView = new HuntingSceneView();
        huntSceneView.display();
    }    
    
    private void displayTestMenu(){
        TestMenuView testMenuView = new TestMenuView();
        testMenuView.display();
    }

}
