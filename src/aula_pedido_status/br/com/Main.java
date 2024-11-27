package aula_pedido_status.br.com;

public class Main {
	
	public static void main(String[]args) {
		
		
		Pedido pedido1 = new Pedido("Pedido 1") ;
		
		
		pedido1.imprimirDados(); 
		Pedido pedido2 = new Pedido("Pedido 2") ;
		pedido2.alterarStatus("Andamento");
		pedido2.imprimirDados();
		
		Pedido pedido3 = new Pedido("Pedido 3") ;
		pedido3.alterarStatus("Terminado");
		pedido3.imprimirDados();
		
	}

}
