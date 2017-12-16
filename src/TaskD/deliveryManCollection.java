/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TaskD;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;

/**
 *
 * @author Chew
 */
public class deliveryManCollection {
    private deliveryMan[] info;
    
    public deliveryManCollection(){
        info = collectInfo();
    }    
    
    public deliveryMan[] collectInfo(){
        deliveryMan[] info ={new deliveryMan("Peter Lee","911121-08-6541","Male","016-3345789","Available","A1234"),
            new deliveryMan("Kelvin Hew","881129-08-5516","Male","019-4457238","Break","B1234"),
            new deliveryMan("Jimmy Tan","830614-13-4789","Male","012-5456218","Available","C1234"),
            new deliveryMan("Derak Chong","891125-10-9993","Male","017-3354821","Break","D1234"),
            new deliveryMan("Jessica Ng","930324-10-4521","Female","010-3994745","Available","E1234")};
        return info;
    }
    
    public String[] getdeliveryManName(){
        String[] name = new String[info.length];
        for (int i = 0; i < info.length; ++i) {
            name[i] = info[i].getName();
        }
        return name;
    }
    
    public String[] getdeliveryManGender(){
        String[] gender = new String[info.length];
        for (int i = 0; i < info.length; ++i) {
            gender[i] = info[i].getGender();
        }
        return gender;
    }
    public String[] getdeliveryManHp(){
        String[] hp = new String[info.length];
        for (int i = 0; i < info.length; ++i) {
            hp[i] = info[i].getPhoneNo();
        }
        return hp;
    }
    public String[] getdeliveryManState(){
        String[] addrs = new String[info.length];
        for (int i = 0; i < info.length; ++i) {
            addrs[i] = info[i].getState();
        }
        return addrs;
    }
    
    public String[] getdeliveryManId() {
        String[] ID = new String[info.length];
        for (int i = 0; i < info.length; ++i) {
            ID[i] = info[i].getid();
        }
        return ID;
    }
    
    public String ShowDate(){
        Date d = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyyy");
        return sf.format(d);
    }
    
//    public String ShowTime(){
//        new Timer(0, new ActionListener() {
//        
//            public void actionPerformed(ActionEvent e){
//                Date d = new Date();
//                SimpleDateFormat sf = new SimpleDateFormat("hh:mm:ss");
//            }
//        }
//        ).start();
//        return sf.format(d);
//    }
   
    public String toString(int index) {
        
        return "Name : " +info[index].getName()+ 
               "\nContact No: " +info[index].getPhoneNo()+
               "\nGendder: " + info[index].getGender()+"\n";
    }

    /*public deliveryMan get(int index) {
        return info[index];
    }*/
}
