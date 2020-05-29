package abstractClasses;
import java.util.Random;
public class TestCompartment {

	public static void main(String[] args) {
		Random r=new Random();
		Compartment[] comp=new Compartment[10];
		for(int i=0;i<10;i++)
		{
			int ch=r.nextInt(4);
			switch(ch)
			{
			case 0:
				comp[i]=new FirstClass();
				break;
			case 1:
				comp[i]=new Ladies();
				break;
			case 2:
				comp[i]=new General();
				break;
			case 3:
				comp[i]=new Luggage();
				break;
			}
		}
		System.out.println("Behavior of Compartment objects 1-10:\n");
		for(int i=0;i<10;i++)
		{
			System.out.println("Compartment-"+(i+1)+": "+comp[i].notice()+"\n");
		}

	}

}
