import java.util.Scanner;

public class ProvaBici
{
	public static void main (String [] args)
	{ 
		String modello, nome, cognome, risposta="si";
		int i=0, marcia, velocita=0, scelta=1, numBici=0, num, pos=0, eta;

		Bicicletta[] bici = new Bicicletta[100];

		Scanner tastiera=new Scanner(System.in);

		System.out.println("Inserisci un elenco di bici");
		while(risposta.equals("si")){

		 	
		 	System.out.println("Inserisci nome proprietario:");
		 	nome=tastiera.nextLine();
		 	System.out.println("Inserisci cognome proprietario:");
		 	cognome=tastiera.nextLine();
		 	System.out.println("Inserisci eta proprietario:");
		 	eta=tastiera.nextInt();
		 	tastiera.nextLine();
			System.out.println("Inserisci modello:");
			modello=tastiera.nextLine();
		 	System.out.println("Inserisci marcia:");
		 	marcia=tastiera.nextInt();
		 	System.out.println("Inserisci velocita:");
		 	velocita=tastiera.nextInt();
		 	tastiera.nextLine();
		 	Persona tizio = new Persona(nome,cognome,eta);
			bici[i] = new Bicicletta(modello,tizio,velocita,marcia);
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
			System.out.println("5) Stampa la bici più veloce");
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
						System.out.println("\n***Bici numero "+(i+1)+":****");
						bici[i].stampaStato();
						System.out.println("********************************");
					}
					
				break;
				case 4:
					System.out.println("Inserisci nome proprietario:");
				 	nome=tastiera.nextLine();
				 	System.out.println("Inserisci cognome proprietario:");
				 	cognome=tastiera.nextLine();
				 	System.out.println("Inserisci eta proprietario:");
				 	eta=tastiera.nextInt();
				 	tastiera.nextLine();
					System.out.println("Inserisci modello:");
					modello=tastiera.nextLine();
				 	System.out.println("Inserisci marcia:");
				 	marcia=tastiera.nextInt();
				 	System.out.println("Inserisci velocita:");
				 	velocita=tastiera.nextInt();
				 	tastiera.nextLine();
					bici[num] = new Bicicletta(modello,new Persona(nome,cognome,eta),velocita,marcia);
					num++;
					System.out.print("\033[H\033[2J");
					System.out.flush();
				break;
				case 5:
					for(i=0; i<num; i++){
						if(i==0){
							velocita=bici[i].getVelocita();
							pos=i;
						}else{
							if(bici[i].getVelocita()>velocita){
								velocita=bici[i].getVelocita();
								pos=i;
							}
						}
					}
					System.out.println("******Bici piu veloce:******");
					bici[pos].stampaStato();
					System.out.println("********************************");
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