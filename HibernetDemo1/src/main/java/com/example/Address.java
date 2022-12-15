package com.example;
import javax.persistence.Embeddable;

@Embeddable
public class Address
{
private String Hname,area,city;
private int pincode;

public Address(String hname, String area, String city, int pincode) //parameterized constructor
{
super();
Hname = hname;
this.area = area;
this.city = city;
this.pincode = pincode;
}

public Address() 
{

}

public String getHname() {
return Hname;
}

public void setHname(String hname) {
Hname = hname;
}

public String getArea() {
return area;
}

public void setArea(String area) {
this.area = area;
}

public String getCity() {
return city;
}

public void setCity(String city) {
this.city = city;
}

public int getPincode() {
return pincode;
}

public void setPincode(int pincode) {
this.pincode = pincode;
}




}
