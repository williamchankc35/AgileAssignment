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
public class Affiliates {
   
    
    private String ResID;
    private String ResPass; 
    private String ResName;
    private String ResAdd;
    private String ResTel;
    private String ResOwner;

    public Affiliates(){}
     //setter
     public Affiliates(String ResID,String ResPass,String ResName,String ResAdd,String ResTel,String ResOwner){
     this.ResID = ResID;
     this.ResPass = ResPass;
     this.ResName = ResName;
     this.ResAdd = ResAdd;
     this.ResTel = ResTel;
     this.ResOwner = ResOwner;
             
     }
      
     //getter
    public String getResID() {
        return ResID;
    }
    
    public String getResPass() {
        return ResPass;
    }
    public String getResName() {
        return ResName;
    }

    public String getResAdd() {
        return ResAdd;
    }

    public String getResTel() {
        return ResTel;
    }

    public String getResOwner() {
        return ResOwner;
    }
    
 
}
