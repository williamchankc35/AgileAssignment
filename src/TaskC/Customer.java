/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TaskC;

/**
 *
 * @author WKazma
 */
public class Customer {
    private String PhoneNo;
    private String CusName;
    private String CusAddress;
    
    public Customer(){}
    
    public Customer(String PhoneNo, String CusName, String CusAddress){
        this.PhoneNo = PhoneNo;
        this.CusName = CusName;
        this.CusAddress = CusAddress;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(String PhoneNo) {
        this.PhoneNo = PhoneNo;
    }

    public String getCusName() {
        return CusName;
    }

    public void setCusName(String CusName) {
        this.CusName = CusName;
    }

    public String getCusAddress() {
        return CusAddress;
    }

    public void setCusAddress(String CusAddress) {
        this.CusAddress = CusAddress;
    }
}
