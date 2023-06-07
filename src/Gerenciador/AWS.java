package Gerenciador;

class AWS extends Servico {
	@Override
    public void enviaArquivo(String arquivo) {
        System.out.println("Enviando arquivo para o AWS: " + arquivo);
    }
    
	@Override
    public void recebeArquivo(String arquivo) {
        System.out.println("Recebendo arquivo do AWS: " + arquivo);
    }
}
