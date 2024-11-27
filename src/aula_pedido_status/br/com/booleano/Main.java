package aula_pedido_status.br.com.booleano;

import aula_pedido_status.br.com.booleano.*;

public class Main {
	
public static void main(String[]args) {
		
		
		Pedido pedido1 = new Pedido("Pedido 1");
		
		
		pedido1.imprimirDados(); 
		
		pedido1.alterarStatusAndamento();
		pedido1.imprimirDados();
		
		
		pedido1.alterarStatusTermiando();
		pedido1.imprimirDados();
		
	}

}
