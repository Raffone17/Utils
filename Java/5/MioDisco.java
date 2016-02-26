import java.util.Scanner;

public class MioDisco
{
	public static void main (String [] args)
	{ 
		String titolo, autore,anno;
		String scelta = "si";
		int i, dim, count=0;

		Scanner tastiera=new Scanner(System.in);
		CompactDisc[] catalogo = new CompactDisc[100];

		if(args.length<4){
			System.out.println("Numero argomenti non sufficiente!");

		}else
		{
			titolo = args[0];
			autore = args[1];
			anno = args[2];
			String[] canzoni = new String[args.length-3];
			for(i=0; i<args.length-3; i++){
				canzoni[i] = args[i+3];
			}
			CompactDisc miodisco = new CompactDisc(titolo,autore,anno,canzoni);
			catalogo[count] = new CompactDisc(titolo,autore,anno,canzoni);
			count++;

			miodisco.stampAll();
			while(scelta.equals("si")||scelta.equals("Si")){

				System.out.println("Inserisci nuovo disco:");
				System.out.println("Titolo:");
				titolo=tastiera.nextLine();
				System.out.println("Autore:");
				autore=tastiera.nextLine();
				System.out.println("Anno:");
				anno=tastiera.nextLine();
				System.out.println("Numero brani:");
				dim=tastiera.nextInt();
				tastiera.nextLine();

				String[] brani = new String[dim];
				for(i=0; i<dim; i++){
					System.out.println("Inserisci Track"+i+":");
					brani[i]=tastiera.nextLine();
				}
				catalogo[count] = new CompactDisc(titolo,autore,anno,brani);
				count++;
				System.out.println("Vuoi continuare l'inserimento,si o no:");
				scelta=tastiera.nextLine();

			}

			Catalogo mieidischi = new Catalogo(catalogo);
			System.out.print("\033[H\033[2J");
			System.out.flush();
			System.out.println("Il mio catalogo:");
			mieidischi.stampAll();
			System.out.println("Numero cd per autore:");
			autore=tastiera.nextLine();
			mieidischi.numeroCdAutore(autore);
			System.out.println("Numero cd per anno:");
			anno=tastiera.nextLine();
			mieidischi.numeroCdAnno(anno);
			System.out.println("Trova album:");
			titolo=tastiera.nextLine();
			mieidischi.trovaAlbum(titolo);
			System.out.println("Trova album per autore:");
			autore=tastiera.nextLine();
			mieidischi.elencoCdAutore(autore);
		}
	}
}