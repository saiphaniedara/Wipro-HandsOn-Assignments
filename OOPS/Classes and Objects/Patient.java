package classesandobjects;

class Patient {
String patientName;
double height;
double weight;
public Patient(String patientName,double height,double weight)
{
	this.patientName=patientName;
	this.height=height;
	this.weight=weight;
}
public double computeBMI(){
	{
		return (weight/(height*height));
	}
}
	public static void main(String[] args) {
	Patient patient1=new Patient("Phani",64.0,1.61);
	System.out.println("The BMI of "+patient1.patientName+" is : "+patient1.computeBMI());;
	}

}
