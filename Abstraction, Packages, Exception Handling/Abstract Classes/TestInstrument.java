package abstractClasses;
import java.util.Random;
public class TestInstrument {

	public static void main(String[] args) {
		Instrument[] ins=new Instrument[10];
		Random r=new Random();
		int ch;
		for(int i=0;i<10;i++)
		{
			ch=r.nextInt(3);
			switch(ch)
			{
			case 0:
				ins[i]=new Piano();
				break;
			case 1:
				ins[i]=new Flute();
				break;
			case 2:
				ins[i]=new Guitar();
				break;
			}
		}
		System.out.println("Behavior of Instrument objects 1-10: \n");
		for(int i=0;i<10;i++)
		{
			System.out.println("Instrument "+(i+1)+" : "+ins[i].play()+"\n");
		}

	}

}
