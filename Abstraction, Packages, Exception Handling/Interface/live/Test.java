package live;
import interfaces.Playable;
import music.string.Veena;
import music.wind.Saxophone;
public class Test {

	public static void main(String[] args) {
		Veena v1=new Veena();
		v1.play();
		Saxophone s1=new Saxophone();
		s1.play();
		Playable p1=v1;
		p1.play();
		p1=s1;
		p1.play();	

	}

}
