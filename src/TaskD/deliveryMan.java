/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TaskD;

/**
 *
 * @author Chew
 */
public class deliveryMan {
    private String name;
    private String IC;
    private String gender;
    private String phoneNo;
    private String state;
    private String id;
    
    public deliveryMan(){
    }
    
    public deliveryMan(String name, String IC, String gender, String phoneNo, String state,String id) {
        this.name = name;
        this.IC = IC;
        this.gender = gender;
        this.phoneNo = phoneNo;
        this.state = state;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getIC() {
        return IC;
    }

    public String getGender() {
        return gender;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    public String getid() {
        return id;
    }
}

