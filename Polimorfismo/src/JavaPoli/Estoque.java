package JavaPoli; 
import java.util.*;

public class Estoque {
 public static void main (String args) { 
	 Collection<String> estoque = Arrays.asList("Celular", "Caixa de som", "TV");
	 System.out.println ("Produtos adicionados: "+estoque); 
	 
	 estoque.remove("Caixa de som"); 
	 System.out.println("Estoque sem caixa de som: "+estoque);
	 
	 Collection<String> estoqueUM = Arrays.asList("Notebook"); 
	 estoque.addAll(estoqueUM); 
	 System.out.println("Estoque atualizado: " +estoque ); 
	 
	 for (String loja: estoque) {
		 System.out.println("Prudutos atualizados");
	 }
 }
}
