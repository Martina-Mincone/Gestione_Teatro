
public class Spettacolo {
	private String titolo;
	private String compagnia;
	private String dataora;
	private Persona[] spettatori;// array di tipo persona 
	private int postiPrenotati=0;
	private static final int CAPIENZA=100; //costante condivisa
	
	//costuttore 
	public Spettacolo(String titolo, String compagnia, String dataora) {
		this.titolo=titolo;
		this.compagnia=compagnia;
		this.dataora=dataora;
		
		this.spettatori= new Persona[CAPIENZA];//inizializzazione dell'array con 100 posti inizialmente null
		
	}
	
	//	RESTITUIRE IL NUMERO DI POSTI ANCORA DISPONIBILI
	public int postiDisponibili() {
		return CAPIENZA-postiPrenotati;
		
	}
	
	// PRENOTARE UN NUOVO POSTO E RITORNA FALSE SE NON CI SONO PIU
	public boolean pronota(Persona spettatore) {//tipo persona
		if(postiDisponibili()>0) {//chiamo metodo 
			spettatori[postiPrenotati]= spettatore;
			postiPrenotati++;
			return true;
		}else
			return false;
	}
	
	// STAMPA L'ELENCO DELLE PRENOTAZIONI
	public void stampaPrenotazioni() {
		System.out.println("Spettacolo "+ titolo);
		System.out.println("Del "+ dataora);
		System.out.println();
		
		for(int i=0;i<postiPrenotati;i++) {
			spettatori[i].visualizza();		}
	}
	
}
