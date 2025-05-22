import javax.swing.*;

public class Person {

    private String name;
    private String address;
    private String mobile;

    public Person(String name, String address, String mobile) {
        this.name = name;
        this.mobile = mobile;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void displayInfo(){
        JOptionPane.showMessageDialog(null, "Name: "+name+"\nAddress: "+address+"\nMobile no: "+mobile);
    }

}
