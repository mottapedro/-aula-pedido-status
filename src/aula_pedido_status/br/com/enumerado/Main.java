package aula_pedido_status.br.com.enumerado;



public class Main {

    public static void main(String[] args) {
        Pedido pedido = new Pedido("Pedido #001");

        // Alterar estados
        pedido.alterarStatus(Pedido.Status.ANDAMENTO);
        pedido.alterarStatus(Pedido.Status.TERMINADO);

        // Gravar dados em arquivo
        String caminhoArquivo = "pedido_dados.txt"; // Nome do arquivo na raiz do projeto
        pedido.gravarDadosEmArquivo(caminhoArquivo);
    }
}


