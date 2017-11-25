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
    public Menu(){
    }
    
    public Menu(String FoodID, String FoodName, String Price, String Description,int Priority) {
        this.FoodID = FoodID;
        this.FoodName = FoodName;
        this.Price = Price;
        this.Description = Description;
        this.Priority= Priority;       
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
}  
