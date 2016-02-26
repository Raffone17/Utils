import java.util.Scanner;

public class MioUfficio
{
	public static void main (String [] args)
	{ 
		int dim, i, scelta = 1;
		String nome;
		float stipendio;

		
		Scanner tastiera=new Scanner(System.in);

		if(args.length!=0){
			System.out.println("Cosa scrivi a fare sulla console di comando?");
		}

		System.out.println("****Iserisci numero impiegati: ***");
		dim=tastiera.nextInt();
		tastiera.nextLine();
		Impiegati[] impiegato = new Impiegati[dim];

		for(i=0; i<dim; i++){
			System.out.println("****Iserisci impiegato n "+(i+1)+": ***");
			System.out.println("Nome e Cognome: ");
			nome = tastiera.nextLine();
			System.out.println("Stipendio: ");
			stipendio = tastiera.nextFloat();
			tastiera.nextLine();
			impiegato[i] = new Impiegati(nome,stipendio);

		}
		
		Ufficio mioUfficio = new Ufficio(impiegato);
		mioUfficio.stampaUfficio();
		/*System.out.println("***Inserisci un nome da cercare: ***");
		nome = tastiera.nextLine();
		i=mioUfficio.cercaImpiegato(nome);
		System.out.println("***Inserisci l'aumento di stipendio: ***");
		stipendio = tastiera.nextFloat();
		mioUfficio.incrementaStipendio(i,stipendio);
		mioUfficio.stampaUfficio();*/

		while(scelta != 0){
			System.out.println("*****Cosa vuoi fare?*********");
			System.out.println("1) Aumenta stipendio");
			System.out.println("2) Cerca impiegato");
			System.out.println("3) Stampa tutti impiegati");
			System.out.println("----------------------------");
			System.out.println("0) Esci");
			scelta=tastiera.nextInt();
			tastiera.nextLine();
			switch(scelta){
				case 1:
					System.out.print("\033[H\033[2J");
					System.out.flush();
					System.out.println("Inserisci nome dell'impiegato:");
					nome = tastiera.nextLine();
					i=mioUfficio.cercaImpiegato(nome);

					if(i == -1){
						System.out.println("Impiegato non trovato");
					
					}else{
						System.out.println("Inserisci l'aumento di stipendio: ");
						stipendio = tastiera.nextFloat();
						mioUfficio.incrementaStipendio(i,stipendio);
						mioUfficio.stampaImpiegato(i);
					}	
				break;
				case 2:
					System.out.print("\033[H\033[2J");
					System.out.flush();
					System.out.println("Inserisci nome dell'impiegato:");
					nome = tastiera.nextLine();
					i=mioUfficio.cercaImpiegato(nome);
					if(i == -1){
						System.out.println("Impiegato non trovato");
					
					}else{
						mioUfficio.stampaImpiegato(i);
					}	

				break;
				case 3:
					System.out.print("\033[H\033[2J");
					System.out.flush();
					mioUfficio.stampaUfficio();

				break;
				case 0:
					System.out.println("Ciao Ciao!");
				break;
				default:
					System.out.println("Scelta non presente!!! ");
					System.out.print("\033[H\033[2J");
					System.out.flush();
				break;
			}
		}

	}
}