package JavaPoli;

public class Pregui�a extends Animal { 
	public Pregui�a () { 
		super ();		
	} 
	public String som () {
		String somCavalo = "Deixa que amanh� eu fa�o"; 
		return somCavalo;
	} 
	public String locomove () {
		String locomoveCavalo = "lentamente"; 
		return locomoveCavalo;
	}
    public String exibirPregui�a() {
    	return "Nome pregui�a: "+nome+" idade pregui�a: "+idade+"Ele emite o som"+som()+"E t� vindo: "+locomove();
    }

}
