
package Admin;

import java.io.Serializable;

public class Person implements Serializable{
    
    // Data Fields
    private String name;
    private int ssn;
    private int age;
    private String address;
    private String phoneNb;
    
    // Constructor
    public Person(String name, int age, int ssn, String phoneNb, String address) {
        this.name = name;
        this.ssn = ssn;
        this.age = age;
        this.phoneNb = phoneNb;
        this.address = address;
    }

    public Person() {
        this.name = "unknown";
        this.ssn = -1;
        this.age = -1;
        this.phoneNb = "unknown";
        this.address = "unknown";
    }
    
    // Methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNb() {
        return phoneNb;
    }

    public void setPhoneNb(String phoneNb) {
        this.phoneNb = phoneNb;
    }
    
    
}