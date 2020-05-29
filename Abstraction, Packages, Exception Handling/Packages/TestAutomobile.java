import com.automobile.Honda;
import com.automobile.twowheeler.*;
import com.automobile.fourwheeler.*;
public class TestAutomobile {

	public static void main(String[] args) {
	Hero heroBike=new Hero("Splendor","AP28DA0000","Sai Phani",75);
	System.out.println("Hero Bike Details are: ");
	System.out.println("Model Name: "+heroBike.getModelName());
	System.out.println("Registration Number: "+heroBike.getRegistrationNumber());
	System.out.println("Owner Name: "+heroBike.getOwnerName());
	System.out.println("Speed: "+heroBike.getSpeed());
	heroBike.radio();
	System.out.println();
	Honda hondaCar=new Honda("City","AP28DA4124","Sai Krishna",120);
	System.out.println("Honda Car Details are: ");
	System.out.println("Model Name: "+hondaCar.getModelName());
	System.out.println("Registration Number: "+hondaCar.getRegistrationNumber());
	System.out.println("Owner Name: "+hondaCar.getOwnerName());
	System.out.println("Speed: "+hondaCar.getSpeed());
	hondaCar.cdplayer();
	System.out.println();
	Logan loganCar=new Logan("X1245","AP28DA5831","Stefan",140,40);
	System.out.println("Logan Car Details are: ");
	System.out.println("Model Name: "+loganCar.getModelName());
	System.out.println("Registration Number: "+loganCar.getRegistrationNumber());
	System.out.println("Owner Name: "+loganCar.getOwnerName());
	System.out.println("Speed: "+loganCar.speed());
	System.out.println("Controlling Gps: "+loganCar.gps());
	System.out.println();
	Ford fordCar=new Ford("XlR8","AP28DA5650","Alaric",180,18);
	System.out.println("Ford Car Details are: ");
	System.out.println("Model Name: "+fordCar.getModelName());
	System.out.println("Registration Number: "+fordCar.getRegistrationNumber());
	System.out.println("Owner Name: "+fordCar.getOwnerName());
	System.out.println("Speed: "+fordCar.speed());
	System.out.println("Controlling Temperature: "+fordCar.tempControl());
	}

}
