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
public class AD {
    private Affiliates[] AffArrayList;
    
    public AD(){
    AffArrayList = AffDetail();
    }
//ARRAY 
    public Affiliates[] AffDetail(){
      Affiliates[] AffArrayList ={ 
          new Affiliates("A001","1234","Thai Food","Setapak","03-95438866","Raymond Wong"),
          new Affiliates("A002","1234","Chinese Food","Setapak,","03-4322222","Albert"),
          new Affiliates("A003","1234","Curry House","Setapak","03-8888888","Viji")
      };
  
      return AffArrayList;
    
    }
   //Get Data 
    public String[] getAffID(){
     String[] AffID = new String[AffArrayList.length];
        for (int i = 0; i < AffArrayList.length; ++i) {
            AffID[i] = AffArrayList[i].getResID();
        }
        return AffID;
    }
    public String[] getAffPass(){
    String[] AffPass = new String[AffArrayList.length];
        for (int i = 0; i < AffArrayList.length; ++i) {
            AffPass[i] = AffArrayList[i].getResPass();
        }
        return AffPass;
    }
     public String[] getAffName(){
    String[] AffName = new String[AffArrayList.length];
        for (int i = 0; i < AffArrayList.length; ++i) {
            AffName[i] = AffArrayList[i].getResName();
        }
        return AffName;
    }
     public String[] getAffAdd(){
    String[] AffAdd= new String[AffArrayList.length];
        for (int i = 0; i < AffArrayList.length; ++i) {
            AffAdd[i] = AffArrayList[i].getResAdd();
        }
        return AffAdd;
    }
     public String[] getOwnerName(){
    String[] OwnerName = new String[AffArrayList.length];
        for (int i = 0; i < AffArrayList.length; ++i) {
            OwnerName[i] = AffArrayList[i].getResOwner();
        }
        return OwnerName;
    }
     
     //Create
     
}
