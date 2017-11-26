/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PartA.Array;
import PartA.GS.*;
/**
 *
 * @author Leong Tzee Yang
 */
public class MD {
    private Menu[] MenuArrayList;
    
    public MD(){
    MenuArrayList = MenuItem();
    }
 //ARRAY   
    public Menu[] MenuItem(){
      Menu[] MenuArrayList ={ 
          new Menu("F001","Thai Fried Rice","9.99","Promotion",5,"A001"),
          new Menu("F002","Tom Yam Soup","12.99","",5,"A001"),
          new Menu("F003","Green Curry Fried Rice","10.99","Best Choice",5,"A001"),
          new Menu("F004","JiaoZi 10pcs","25.99","",5,"A002"),
          new Menu("F005","Ma Po taufu","12.99","",5,"A002"),
          new Menu("F006","Kung Pao Chicken","12.99","",5,"A002"),
          new Menu("F007","Nasi Goreng Ayam","6.99","",5,"A003"),
          new Menu("F008","Nasi Goreng Cedawan","6.99","",5,"A003"),
          new Menu("F009","Nasi Goreng Ikan Masim","6.99","",5,"A003"),
      };
  
      return MenuArrayList;
    
    }
public String[] getFoodID(){
     String[] FoodID = new String[MenuArrayList.length];
        for (int i = 0; i < MenuArrayList.length; ++i) {
            FoodID[i] = MenuArrayList[i].getFoodID();
        }
        return FoodID;
    }
public String[] getFoodName(){
     String[] FoodName = new String[MenuArrayList.length];
        for (int i = 0; i < MenuArrayList.length; ++i) {
            FoodName[i] = MenuArrayList[i].getFoodName();
        }
        return FoodName;
    }
public String[] getPrice(){
     String[] Price = new String[MenuArrayList.length];
        for (int i = 0; i < MenuArrayList.length; ++i) {
            Price[i] = MenuArrayList[i].getPrice();
        }
        return Price;
    }
 
public String[] getDescription(){
     String[] Description = new String[MenuArrayList.length];
        for (int i = 0; i < MenuArrayList.length; ++i) {
            Description[i] = MenuArrayList[i].getDescription();
        }
        return Description;
    }
public int[] getPriority(){
     int[] Priority = new int[MenuArrayList.length];
        for (int i = 0; i < MenuArrayList.length; ++i) {
            Priority[i] = MenuArrayList[i].getPriority();
        }
        return Priority;
    }
public String[] getID(){
     String[] ID = new String[MenuArrayList.length];
        for (int i = 0; i < MenuArrayList.length; ++i) {
            ID[i] = MenuArrayList[i].getID();
        }
        return ID;
    }
}
