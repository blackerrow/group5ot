/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author ken
 */
public class Location implements Serializable {
    
    //class instance variables
    private int row;
    private int column;
    private boolean visited;
    private Scene scene = null;
    private String locationName = null;
    private int locationNumber;
    

 
    
   // private int amountRemaining;
   

    //constructor
    public Location() {
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public int getLocationNumber() {
        return locationNumber;
    }

    public void setLocationNumber(int locationNumber) {
        this.locationNumber = locationNumber;
    }



    
    
       public Scene getScene() {
        return scene;
    }

   public void setScene(Scene scene) {
        this.scene = scene;
    }
    
//    getters and setters
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

//    public int getAmountRemaining() {
//        return amountRemaining;
//    }
//
//    public void setAmountRemaining(int amountRemaining) {
//        this.amountRemaining = amountRemaining;
//    }

//    public Map getMap() {
//        return map;
//    }
//
//    public void setMap(Map map) {
//        this.map = map;
//    }
    
    //hash, equals and tostring
    @Override
    public int hashCode() {
        int hash = 7;
//        hash = 41 * hash + this.row;
//        hash = 41 * hash + this.column;
        hash = 41 * hash + (this.visited ? 1 : 0);
      //  hash = 41 * hash + this.amountRemaining;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Location other = (Location) obj;
        if (this.visited != other.visited) {
            return false;
        }
        if (!Objects.equals(this.scene, other.scene)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return locationNumber + ": " + locationName + "  " ;
    }

   

  
    
   
    
    
    
    
}
