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
public class CustomerData {

    private Customer[] CustomerArrayList;

    public CustomerData() {
        CustomerArrayList = CustomerInfo();
    }

    public Customer[] CustomerInfo() {
        Customer[] CustomerArrayList = {
            new Customer("016-6548551", "Jason Loo", "Taman Melawati"),
            new Customer("012-6552148", "Mike Chen", "Taman Bahagia"),
            new Customer("019-9556221", "Mickey Wong", "Jalan Genting Klang"),
            new Customer("017-2256115", "Eason Chan", "Taman Bunga Raya"),
            new Customer("019-9663025", "Aaron Yuan", "Taman Sejati"),
            new Customer("016-5514845", "Low Meng Meng", "Jalan Sultan"),};
        return CustomerArrayList;
    }

    public String[] getPhoneNo() {
        String[] PhoneNo = new String[CustomerArrayList.length];
        for (int i = 0; i < CustomerArrayList.length; ++i){
            PhoneNo[i] = CustomerArrayList[i].getPhoneNo();
        }
        return PhoneNo;
    }
    
    public String[] getCusName() {
        String[] CusName = new String[CustomerArrayList.length];
        for (int i = 0; i < CustomerArrayList.length; ++i){
            CusName[i] = CustomerArrayList[i].getCusName();
        }
        return CusName;
    }
    
    public String[] getCusAddress() {
        String[] CusAddress = new String[CustomerArrayList.length];
        for (int i = 0; i < CustomerArrayList.length; ++i){
            CusAddress[i] = CustomerArrayList[i].getCusAddress();
        }
        return CusAddress;
    }
}
