package Gerenciador;


public class Main {

    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Uso: java Main.java <servico> <arquivo> <operacao>");
            System.out.println("Serviços suportados: googledrive, ftp, aws");
            System.out.println("Operações suportadas: enviar, receber");
            return;
        }

        String servico = args[0];
        String arquivo = args[1];
        String operacao = args[2];

        Servico servicoArmazenamento;

        switch (servico.toLowerCase()) {
            case "googledrive":
                servicoArmazenamento = new GoogleDrive();
                break;
            case "ftp":
                servicoArmazenamento = new FTP();
                break;
            case "aws":
                servicoArmazenamento = new AWS();
                break;
            default:
                System.out.println("Serviço inválido. Serviços suportados: googledrive, ftp, aws");
                return;
        }

        Gerenciador gerenciador = new Gerenciador(servicoArmazenamento);
        
        switch (operacao.toLowerCase()) {
        case "enviar":
            gerenciador.enviaArquivo(arquivo);
            break;
        case "receber":
            gerenciador.recebeArquivo(arquivo);
            break;
        default:
            System.out.println("Operação inválida. Operações suportadas: enviar, receber");
        }

    }
}


