import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        Iphone iphone = new Iphone();
        Menu menu = new Menu();
        
        String resposta = "";
        System.out.println();
        while(!resposta.equals("4")){
            menu.mostrarMenu(resposta);
            resposta = leitor.next();
            System.out.println();
            if(resposta.equals("1")){
                String tipo = "musica";
                resposta = menu.entrarAplicativo(resposta,iphone,tipo,leitor);
            }
            else if(resposta.equals("2")){
                String tipo = "telefone";
                resposta = menu.entrarAplicativo(resposta,iphone,tipo,leitor);
            }
            else if(resposta.equals("3")){
                String tipo = "navegador";
                resposta = menu.entrarAplicativo(resposta,iphone,tipo,leitor);
            }
            else if(resposta.equals("4")){
                break;
            }
            else{
                menu.limparTela();
                System.out.println("Valor inválido\n");
                resposta = "";
            }
        }
        System.out.println("Desligando...");
        leitor.close();
    } 
}
