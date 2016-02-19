import java.util.Scanner;

public class ProvaBici
{
	public static void main (String [] args)
	{ 
		String modello, proprietario, risposta="si";
		int i=0, marcia, velocita, scelta=1, numBici=0, num;

		Bicicletta[] bici = new Bicicletta[100];

		Scanner tastiera=new Scanner(System.in);

		System.out.println("Inserisci un elenco di bici");
		while(risposta.equals("si")){

		 	
		 	System.out.println("Inserisci proprietario:");
		 	proprietario=tastiera.nextLine();
			System.out.println("Inserisci modello:");
			modello=tastiera.nextLine();
		 	System.out.println("Inserisci marcia:");
		 	marcia=tastiera.nextInt();
		 	System.out.println("Inserisci velocita:");
		 	velocita=tastiera.nextInt();
		 	tastiera.nextLine();
			bici[i] = new Bicicletta(modello,proprietario,velocita,marcia);
			i++;
			
			System.out.println("Vuoi aggiungere un altra bici? ");
			risposta = tastiera.nextLine();

		}
		num=i;

		for(i=0; i<num; i++){
			System.out.println("Bici numero "+(i+1)+":");
			bici[i].stampaStato();
		}

		while(scelta != 0){
			System.out.println("Cosa vuoi fare?");
			System.out.println("1) Aumenta velocita bici");
			System.out.println("2) Cambia marcia bici");
			System.out.println("3) Stampa a video le bici");
			System.out.println("4) Aggiungi una bici");
			System.out.println("----------------------------");
			System.out.println("0) Esci");
			scelta=tastiera.nextInt();
			tastiera.nextLine();

			switch(scelta){
				case 1:
					System.out.println("Inserisci numero bici:");
					numBici=tastiera.nextInt()-1;
					if(bici[numBici]!= null){
						System.out.println("Inserisci l'aumento di velocita:");
						velocita=tastiera.nextInt();
						tastiera.nextLine();
						bici[numBici].aumentaVelocita(velocita);
						bici[numBici].stampaStato();
					}else{
						System.out.println("Bici non presente!!!");
					}
					System.out.print("\033[H\033[2J");
System.out.flush();
				break;
				case 2:
					System.out.println("Inserisci numero bici:");
					numBici=tastiera.nextInt()-1;
					if(bici[numBici]!= null){
						System.out.println("Inserisci nuova marcia:");
						marcia=tastiera.nextInt();
						tastiera.nextLine();
						bici[numBici].cambiaMarcia(marcia);
						bici[numBici].stampaStato();
					}else{
						System.out.println("Bici non presente!!!");
					}
					System.out.print("\033[H\033[2J");
System.out.flush();
				break;
				case 3:
					for(i=0; i<num; i++){
						System.out.println("Bici numero "+(i+1)+":");
						bici[i].stampaStato();
					}
					
				break;
				case 4:
					System.out.println("Inserisci proprietario:");
				 	proprietario=tastiera.nextLine();
					System.out.println("Inserisci modello:");
					modello=tastiera.nextLine();
				 	System.out.println("Inserisci marcia:");
				 	marcia=tastiera.nextInt();
				 	System.out.println("Inserisci velocita:");
				 	velocita=tastiera.nextInt();
				 	tastiera.nextLine();
					bici[num] = new Bicicletta(modello,proprietario,velocita,marcia);
					num++;
					System.out.print("\033[H\033[2J");
System.out.flush();
				break;
				case 0:
					System.out.println("Ciao Ciao");

				break;
				default:
					System.out.println("Comando non trovato!!!");
				break;
			}
		}

	}

}