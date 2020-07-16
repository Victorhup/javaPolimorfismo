package JavaPoli;

public class MostraAnimal {
 public static void main (String args[]) {
	 Cachorro cachorro = new Cachorro (); 
	 Cavalo cavalo = new Cavalo();
	 Preguiça preguiça = new Preguiça(); 
	 
	 cachorro.setNome("El Loco Billy");
	 cachorro.setIdade(3); 
	 cavalo.setNome("Garanhão");
	 cavalo.setIdade(8);
	 preguiça.setNome("Felipe");
	 preguiça.setIdade(29);
	 
	 System.out.println(cachorro.exibirCachorro()); 
	 System.out.println(cavalo.exibirCavalo());
	 System.out.println(preguiça.exibirPreguiça());
 }
}
