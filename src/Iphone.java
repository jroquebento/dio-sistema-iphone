public class Iphone implements IReprodutorMusical, IAparelhoTelefonico, INavegadorInternet {
    
    // Reprodutor Musical
    public void tocar() {
        System.out.println("Tocando a música...");
    }
    public void pausar() {
        System.out.println("A música foi pausada.");
    }
    public void selecionarMusica(){
        System.out.println("A música foi selecionada.");
    }

    // Aparelho Telefônico
    public void ligar(){
        System.out.println("Ligando...");
    }
    public void atender(){
        System.out.println("Chamada atendida.");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Correio de voz iniciado.");
    }

    // Navegador na Internet
    public void exibirPagina(){
        System.out.println("Exibindo a página...");
    }
    public void adicionarNovaAba(){
        System.out.println("Nova aba adicionada.");
    }
    public void atualizarPagina() {
        System.out.println("Página atualizada com sucesso.");
    }

    public String escolherFuncionalidade(String tipo,String resposta){
        if(tipo.equals("musica")){
            if(resposta.equals("1")){
                this.tocar();
            }
            else if (resposta.equals("2")){
                this.pausar();
            }
            else if (resposta.equals("3")){
                this.selecionarMusica();
            }
            else if (resposta.equals("4")){
                return resposta = "4";
            }
            else{
                System.out.println("Valor Inválido!");
            }
        }
        else if(tipo.equals("telefone")){
            if(resposta.equals("1")){
                this.ligar();
            }
            else if (resposta.equals("2")){
                this.atender();
            }
            else if (resposta.equals("3")){
                this.iniciarCorreioVoz();
            }
            else if (resposta.equals("4")){
                return resposta = "4";
            }
            else{
                System.out.println("Valor Inválido!");
            }
        }
        else if(tipo.equals("navegador")){
            if(resposta.equals("1")){
                this.exibirPagina();;
            }
            else if (resposta.equals("2")){
                this.adicionarNovaAba();
            }
            else if (resposta.equals("3")){
                this.atualizarPagina();
            }
            else if (resposta.equals("4")){
                return resposta = "4";
            }
            else{
                System.out.println("Valor Inválido!");
            }
        }
        return resposta;
    }
}
