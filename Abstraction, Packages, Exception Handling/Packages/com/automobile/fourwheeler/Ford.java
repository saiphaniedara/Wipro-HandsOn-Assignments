package com.automobile.fourwheeler;
import com.automobile.Vehicle;
public class Ford extends Vehicle{
	private String modelName;
	private String regNo;
	private String ownerName;
	private int speed;
	private int temp;
	public Ford(String mname,String reg,String oname,int spd,int temp)
	{
		modelName=mname;
		regNo=reg;
		ownerName=oname;
		speed=spd;
		this.temp=temp;
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
	public int tempControl()
	{
		return temp;
	}
}
