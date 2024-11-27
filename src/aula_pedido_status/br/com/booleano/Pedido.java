package aula_pedido_status.br.com.booleano;

public class Pedido {
	private boolean statusSolicitado;
	private boolean statusAndamento;
	private boolean statusTerminando;
	private String nomePedido;

	public Pedido(String nomePedido) {
		super();
		this.nomePedido = nomePedido;
		this.statusSolicitado = true;
		this.statusAndamento = false;
		this.statusTerminando = false;
	}
	
	public void alterarStatusSolicitado() {
		this.statusSolicitado= true;
		this.statusAndamento = false;
		this.statusTerminando = false;
	}
	
	public void alterarStatusAndamento() {
		this.statusSolicitado= false;
		this.statusAndamento = true;
		this.statusTerminando = false;
	}
	
	public void alterarStatusTermiando() {
		this.statusSolicitado= false;
		this.statusAndamento = false;
		this.statusTerminando = true;
	}
	
	public void imprimirDados() {
		System.out.println("Nome do Pedido :" + nomePedido);
		System.out.println("Status  Solicitado       :" + statusSolicitado);
		System.out.println("Status  Andamento       :" + statusAndamento);
		System.out.println("Status  Terminando       :" + statusTerminando);
		
		
	}

}
