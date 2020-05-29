package com.automobile.fourwheeler;
import com.automobile.Vehicle;
public class Logan extends Vehicle{
private String modelName;
private String regNo;
private String ownerName;
private int speed;
private int gps;
public Logan(String mname,String reg,String oname,int spd,int gps)
{
	modelName=mname;
	regNo=reg;
	ownerName=oname;
	speed=spd;
	this.gps=gps;
}
public String getModelName()
{
	return modelName;
}
public String getRegistrationNumber()
{
	return regNo;
}
public String getOwnerName()
{
	return ownerName;
}
public int speed()
{
	return speed;
}
public int gps()
{
	return gps;
}
}
