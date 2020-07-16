package JavaPoli;

public class Cachorro extends Animal { 
	public Cachorro () { 
		super ();		
	} 
	public String som () {
		String somCavalo = "au au au"; 
		return somCavalo;
	} 
	public String locomove () {
		String locomoveCavalo = "correndo"; 
		return locomoveCavalo;
	}
    public String exibirCachorro() {
    	return "Nome Cachorro: "+nome+" idade cachorro: "+idade+" Ele emite o som "+som()+" E tá vindo: "+locomove();
    }

}
