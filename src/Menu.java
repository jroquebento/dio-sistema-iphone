import java.util.Scanner;

public class Menu {
    public void mostrarMenu(String resposta){
        if(resposta.equals("")){
            System.out.println("Menu Inicial");
            System.out.println("---------------");
            System.out.println("1 - Reprodutor de Musica");
            System.out.println("2 - Aparelho Telefônico");
            System.out.println("3 - Navegador na Internet");
            System.out.println("4 - Desligar");
        }
        else if(resposta.equals("1")){
            System.out.println("Reprodutor Musical");
            System.out.println("---------------");
            System.out.println("1 - Tocar Música");
            System.out.println("2 - Pausar");
            System.out.println("3 - Selecionar Música");
            System.out.println("4 - Voltar");
        }
        else if(resposta.equals("2")){
            System.out.println("Aparelho Telefônico");
            System.out.println("---------------");
            System.out.println("1 - Ligar");
            System.out.println("2 - Atender");
            System.out.println("3 - Iniciar Correio de Voz");
            System.out.println("4 - Voltar");
        }
        else if (resposta.equals("3")){
            System.out.println("Navegador de Internet");
            System.out.println("---------------");
            System.out.println("1 - Exibir Página");
            System.out.println("2 - Adicionar Nova Aba");
            System.out.println("3 - Atualizar Página");
            System.out.println("4 - Voltar");
        }
    }

    public String entrarAplicativo(String resposta, Iphone iphone,String tipo,Scanner leitor){
        this.limparTela();
        while(!resposta.equals("4")){
            this.mostrarMenu(resposta);
            resposta = leitor.next();
            this.limparTela();
            System.out.println();
            if(tipo.equals("musica")){
                iphone.escolherFuncionalidade("musica", resposta);
                if(!resposta.equals("4"))
                    resposta = "1";
            }
            else if (tipo.equals("telefone")){
                iphone.escolherFuncionalidade("telefone", resposta);
                if(!resposta.equals("4"))
                    resposta = "2";
            }
            else if (tipo.equals("navegador")){
                iphone.escolherFuncionalidade("navegador", resposta);
                if(!resposta.equals("4"))
                    resposta = "3";
            }
            System.out.println();
        }
        return resposta = "";
    }
    
    public void limparTela(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
