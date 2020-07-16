package JavaPoli;

public class Cavalo extends Animal { 
	public Cavalo () { 
		super ();		
	} 
	public String som () {
		String somCavalo = "Pocotó Pocotó"; 
		return somCavalo;
	} 
	public String locomove () {
		String locomoveCavalo = "Trotando"; 
		return locomoveCavalo;
	}
    public String exibirCavalo() {
    	return "Nome Cavalo: "+nome+" idade cavalo: "+idade+"Ele emite o som"+som()+"E tá vindo: "+locomove();
    }
}