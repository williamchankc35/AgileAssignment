/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PartA.GS;

/**
 *
 * @author Leong Tzee Yang
 */
public class Menu {
    private String FoodID;
    private String FoodName;
    private String Price;
    private String Description;
    private int Priority;   
    private String ID;
    
    public Menu(){
        
    }
    
    public Menu(String FoodID, String FoodName, String Price, String Description,int Priority,String ID) {
        this.FoodID = FoodID;
        this.FoodName = FoodName;
        this.Price = Price;
        this.Description = Description;
        this.Priority = Priority;
        this.ID = ID;
    }

    public String getFoodID() {
        return FoodID;
    }

    public String getFoodName() {
        return FoodName;
    }

    public String getPrice() {
        return Price;
    }

    public String getDescription() {
        return Description;
    }

    public int getPriority() {
        return Priority;
    }
    
    public String getID(){
        return ID;
    }

    public void setFoodID(String FoodID) {
        this.FoodID = FoodID;
    }

    public void setFoodName(String FoodName) {
        this.FoodName = FoodName;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public void setPriority(int Priority) {
        this.Priority = Priority;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

   
   
}