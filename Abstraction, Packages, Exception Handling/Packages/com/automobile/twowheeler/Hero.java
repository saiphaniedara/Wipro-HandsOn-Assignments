package com.automobile.twowheeler;
import com.automobile.Vehicle;
public class Hero extends Vehicle{
	private String modelName;
	private String regNo;
	private String ownerName;
	private int speed;
	public Hero(String mname,String reg,String oname,int spd)
	{
		modelName=mname;
		regNo=reg;
		ownerName=oname;
		speed=spd;
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
	public int getSpeed()
	{
		return speed;
	}
	public void radio()
	{
		System.out.println("Controlling the radio device");
	}

}
