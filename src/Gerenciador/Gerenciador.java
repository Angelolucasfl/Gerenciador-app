package Gerenciador;

public class Gerenciador {
    private Servico servico;

    public Gerenciador(Servico servico) {
        this.servico = servico;
    }

    public void enviaArquivo(String arquivo) {
        servico.enviaArquivo(arquivo);
    }

    public void recebeArquivo(String arquivo) {
        servico.recebeArquivo(arquivo);
    }
}

