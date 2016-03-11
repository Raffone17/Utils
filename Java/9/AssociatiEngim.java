import java.util.Scanner;

public class AssociatiEngim
{
	public static void main (String [] args)
	{ 
		SocioEngim[] sociEngim = new SocioEngim[6];
		int i;
		Scanner tastiera=new Scanner(System.in);

		
		sociEngim[0] = new SocioEngim("Sempronio","Bruto","1985",1365);
		sociEngim[1] = new SocioEngim("Felice","Mastronzo","1967",1193);
		sociEngim[2] = new SocioPlus("Carlino","Pirlon","1991",1532);
		sociEngim[3] = new SocioPlus("Mario","Rossi","1971",1028);
		sociEngim[4] = new SocioPremium("Maddio","Santo","1977",1428);
		sociEngim[5] = new SocioProf("Tizio","Caio","1975",1245,"Corso Palestro 22");

		for(i=0; i<sociEngim.length; i++){
			sociEngim[i].addLezioneStandard();
			System.out.println("******* Socio n°"+(i+1)+" ******");
			System.out.println(sociEngim[i]);
			System.out.println("************************************");
		}
	}
}