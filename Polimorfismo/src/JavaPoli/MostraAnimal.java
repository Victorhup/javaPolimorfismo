package JavaPoli;

public class MostraAnimal {
 public static void main (String args[]) {
	 Cachorro cachorro = new Cachorro (); 
	 Cavalo cavalo = new Cavalo();
	 Pregui�a pregui�a = new Pregui�a(); 
	 
	 cachorro.setNome("El Loco Billy");
	 cachorro.setIdade(3); 
	 cavalo.setNome("Garanh�o");
	 cavalo.setIdade(8);
	 pregui�a.setNome("Felipe");
	 pregui�a.setIdade(29);
	 
	 System.out.println(cachorro.exibirCachorro()); 
	 System.out.println(cavalo.exibirCavalo());
	 System.out.println(pregui�a.exibirPregui�a());
 }
}
