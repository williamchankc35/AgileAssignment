/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PartB;

/**
 *
 * @author user
 */
public class DeliverymanGS {
    private String DMName;
    private String DMAge; 
    private String DMGender;
    private String DMIC1;
    private String DMIC2;
    private String DMIC3;
    private String DMAddress1;
    private String DMAddress2;
    private String DMAddress3;
    private String DMEmail;
    private String DMContactNo1;
    private String DMContactNo2
    
    public DeliverymanGS(String DMName, String DMAge, String DMGender, String DMIC1, String DMIC2, String DMIC3, String DMAddress1, String DMAddress2, String DMAddress3, String DMEmail, String DMContactNo1, String DMContactNo2){
     this.DMName = DMName;
     this.DMAge = DMAge;
     this.DMGender = DMGender;
     this.DMIC1 = DMIC1;
     this.DMIC2 = DMIC2;
     this.DMIC3 = DMIC3;
     this.DMAddress1 = DMAddress1;
     this.DMAddress2 = DMAddress2;
     this.DMAddress3 = DMAddress3;
     this.DMEmail = DMEmail;
     this.DMContactNo1 = DMContactNo1;
     this.DMContactNo2 = DMContactNo2;
    }
     
    public String getDMName() {
        return DMName;
    }
    
    public String getDMAge() {
        return DMAge;
    }
    public String getDMGender() {
        return DMGender;
    }

    public String getDMIC1() {
        return DMIC1;
    }

    public String getDMIC2() {
        return DMIC2;
    }

    public String getDMIC3() {
        return DMIC3;
    }
    public String getDMAddress1() {
        return DMAddress1;
    }
    
    public String getDMAddress2() {
        return DMAddress2;
    }
    public String getDMAddress3() {
        return DMAddress3;
    }

    public String getDMEmail() {
        return DMEmail;
    }

    public String getDMContactNo1() {
        return DMContactNo1;
    }

    public String getDMContactNo2() {
        return DMContactNo2;
    }
}