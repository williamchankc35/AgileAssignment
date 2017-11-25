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
    
    public Menu[] MenuItem(){
      Menu[] MenuArrayList ={ 
          new Menu("F001","Rice","10.00","Promotion",1),
          new Menu("F002","Egg","10.00","",2)             
      };
  
      return MenuArrayList;
    
    }
       
}
