package Gerenciador;

class FTP extends Servico {
	@Override
    public void enviaArquivo(String arquivo) {
        System.out.println("Enviando arquivo via FTP: " + arquivo);
    }

    @Override
    public void recebeArquivo(String arquivo) {
        System.out.println("Recebendo arquivo via FTP: " + arquivo);
    }
}


