package JavaPoli;

public class Preguiça extends Animal { 
	public Preguiça () { 
		super ();		
	} 
	public String som () {
		String somCavalo = "Deixa que amanhã eu faço"; 
		return somCavalo;
	} 
	public String locomove () {
		String locomoveCavalo = "lentamente"; 
		return locomoveCavalo;
	}
    public String exibirPreguiça() {
    	return "Nome preguiça: "+nome+" idade preguiça: "+idade+"Ele emite o som"+som()+"E tá vindo: "+locomove();
    }

}
