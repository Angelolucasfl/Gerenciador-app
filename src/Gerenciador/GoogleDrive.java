package Gerenciador;

class GoogleDrive extends Servico {
	@Override
    public void enviaArquivo(String arquivo) {
        System.out.println("Enviando arquivo para o Google Drive: " + arquivo);
    }
    
	@Override
    public void recebeArquivo(String arquivo) {
        System.out.println("Recebendo arquivo do Google Drive: " + arquivo);
    }
}
