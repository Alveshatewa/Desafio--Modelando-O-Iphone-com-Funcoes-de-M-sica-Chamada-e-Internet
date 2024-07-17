import java.util.Scanner;

public class Iphone implements FuncoesDoIphone{

/*Atributos da classe iphone*/

    private String operadora;
    private boolean ligado;

    /*Adicionando a biblioteca Scanner para ler os dados via teclado*/
    Scanner scan = new Scanner(System.in);
    /*Método construtor*/

    public Iphone(String operadora) {
        this.operadora = operadora;
        this.ligado = false;
    }

    /*Métodos de manipulação Getters e setters*/

    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    /*Implementação dos métodos da interface FuncoesDoIphone*/

    @Override
    public void fazerChamadas() {
        // Declarando variáveis locais
        String numero;
        /* Pedindo para o usuário informar a operadora e o número de telefone que deseja contactar*/
        System.out.println("Informe a operadora");
        this.operadora = scan.nextLine();
        System.out.println("Informe o número/ Contacto");
        numero = scan.nextLine();

        System.out.println("Ligando para o terminal " + numero + " via operadora " + this.operadora);
    }

    @Override
    public void entrarInternet() {
        /*Declarando as variáveis locais para acesso a internet*/
        String url;
        System.out.println("Digite a sua url ou link");
        url = scan.nextLine();

        /*Verificando se a url informada é válida, Caso afirmativo, acessa o link, caso negativo,
        * informar uma mensagem de erro*/

        if(!(url.startsWith("https://www."))){
            System.out.println("A url informada não é válida!");
        } else{
            System.out.println(" Carregando sua página...");
        }

    }

    @Override
    public void tocarMusics() {

        /*Variáveis locais para permitir tocar, avançar, recuar e pausar a música*/
        boolean play  = false;

        /*Verificando se o telefone está ligado para poder tocar músicas*/

        if(!ligado){
            System.out.println("Abrindo reprodutor de músicas...");
            play = true;
            System.out.println("Reproduzindo a música...");

        } else{
            System.out.println("Impossível tocar músicas com o telefone desligado!");
        }
    }

    public void ligarTelefone(){
        // Verificando se o telefone está ou não desligado

        if (!ligado){
            System.out.println("Ligando o iphone...");
        } else{
            System.out.println("O iphone está desligado!");
        }
    }

    public void desligarTelefone(){

        /* Implementando uma lógica inversa ao ligar o telefone*/

    if(!ligado){
        System.out.println("Desligando o iphone...");
    } else{
        System.out.println("O iphone já está desligado!");
    }
    }
}
