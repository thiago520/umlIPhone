public class Main {
    public static void main(String[] args) {

        iphone iphone = new iphone();
        System.out.println("-------------------------------------");
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorrerioVoz();
        System.out.println("-------------------------------------");
        iphone.pausar();
        iphone.tocar();
        iphone.selecionarMusica();
        System.out.println("-------------------------------------");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        iphone.exibirPagina();
    }
}