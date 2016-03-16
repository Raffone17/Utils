import java.util.Scanner;

public class AssociatiEngim
{
	public static void main (String [] args)
	{ 
		SocioEngim[] sociEngim = new SocioEngim[6];
		int i, ore;
		String nome;
		Scanner tastiera=new Scanner(System.in);

		
		sociEngim[0] = new SocioEngim("Sempronio","Bruto","1985",1365);
		sociEngim[1] = new SocioEngim("Felice","Mastronzo","1967",1193);
		sociEngim[2] = new SocioPlus("Carlino","Pirlon","1991",1532);
		sociEngim[3] = new SocioPlus("Mario","Rossi","1971",1028);
		sociEngim[4] = new SocioPremium("Maddio","Santo","1977",1428);
		sociEngim[5] = new SocioProf("Tizio","Caio","1975",1245,"Corso Palestro 22");

		for(i=0; i<sociEngim.length; i++){
			sociEngim[i].addLezioneStandard();
			//System.out.println("******* Socio n°"+(i+1)+" ******");
			//System.out.println(sociEngim[i]);
			//System.out.println("************************************");
		}

		for(i=0; i<sociEngim.length; i++){
			nome = sociEngim[i].getNome();
			nome = nome.concat(" ");
			nome = nome.concat(sociEngim[i].getCognome());
			System.out.println("Quante ore di lezione per socio n°"+(i+1)+" chiamato "+nome);
			ore = tastiera.nextInt();
			sociEngim[i].addOreLezione(ore);
		}

		for(i=0; i<sociEngim.length; i++){

			System.out.println("*********** Socio n°"+(i+1)+" ************");
			System.out.println(sociEngim[i]);
			System.out.println("********************************************");
		}
		System.out.println("\n\n-------- Il socio con più crediti: --------");
		System.out.println(getSocioCreditoMax(sociEngim));
		System.out.println("\n\n-------- Il socio con più punti mensa: ---");
		System.out.println(getSocioPuntiMensaMax(sociEngim));

	}

	private static SocioEngim getSocioCreditoMax(SocioEngim[] listaSoci)
	{
		int max=0, socio=0;

		for(int i=0; i<listaSoci.length; i++){
			if(listaSoci[i].getNumeroCrediti()>max){
				max = listaSoci[i].getNumeroCrediti();
				socio = i;
			}
		}

		return listaSoci[socio];
	}

	private static SocioPremium getSocioPuntiMensaMax(SocioEngim[] listaSoci)
	{

		int max=0, socio=0;
		SocioPremium toRet=null;


		for(int i=0; i<listaSoci.length; i++){
			if(listaSoci[i] instanceof SocioPremium){

				if(((SocioPremium)listaSoci[i]).getPuntiMensa()>=max){
					toRet = (SocioPremium)listaSoci[i];
					max = toRet.getPuntiMensa();
					
				}
			}
		}

		return toRet;
	} 
}