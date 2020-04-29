
public class UsaSpettacolo {
	public static void main(String args[]) {
		//creo persone
		Persona p1= new Persona("Martina Mincone","Via Cesare Battisti, 9");
		Persona p2= new Persona("Francesco Talento", "Via Cesare Battisti,9");
		
		//creo uno spettacolo
		Spettacolo s= new Spettacolo("Macbeth","Attori Dilettanti","13/04/2020-21:00");
		
		//prenotazione posti
		
		boolean ok1= s.pronota(p1);
		boolean ok2=s.pronota(p2);
		
		if(!ok1 || !ok2)
			System.out.println("posti non disponibili!");
	
		//stampa elenco di persone
		s.stampaPrenotazioni();
		
		//stampa posti ancora disponibili
		System.out.println("Ci sono ancora "+ s.postiDisponibili()+" posti disponibili");
		
	}
}
