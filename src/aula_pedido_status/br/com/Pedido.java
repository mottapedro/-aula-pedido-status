package aula_pedido_status.br.com;

public class Pedido {
	
	private String status;
	private String nomePedido;
	
	
	public Pedido(String nomePedido) {
		super();
		this.status = "Solicitado";
		this.nomePedido = nomePedido;
	}
	
	public void alterarStatus(String novoStatus) {
		this.status = novoStatus;
	}
	
	
	public void imprimirDados() {
		System.out.println("Nome do Pedido :" + nomePedido);
		System.out.println("Status         :" + status);
		

	}
	

}
