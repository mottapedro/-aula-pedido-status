package aula_pedido_status.br.com.enumerado;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Pedido {
    public enum Status {
        SOLICITADO, ANDAMENTO, TERMINADO
    }

    private String nomePedido;
    private Status status;

    public Pedido(String nomePedido) {
        this.nomePedido = nomePedido;
        this.status = Status.SOLICITADO;
    }

    public void alterarStatus(Status novoStatus) {
        this.status = novoStatus;
    }

    public void imprimirDados() {
        System.out.println("Nome do Pedido: " + nomePedido);
        System.out.println("Status Atual: " + status);
    }

    @Override
    public String toString() {
        return "Pedido{" +
               "nomePedido='" + nomePedido + '\'' +
               ", status=" + status +
               '}';
    }

    // Método para gravar os dados em um arquivo de texto
    public void gravarDadosEmArquivo(String caminhoArquivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo, true))) {
            writer.write("Nome do Pedido: " + nomePedido);
            writer.newLine();
            writer.write("Status Atual: " + status);
            writer.newLine();
            writer.write("---------------------------");
            writer.newLine();
            System.out.println("Dados gravados com sucesso em: " + caminhoArquivo);
        } catch (IOException e) {
            System.err.println("Erro ao gravar os dados no arquivo: " + e.getMessage());
        }
    }
}


