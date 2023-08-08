
import Navegador.Browser;
import ReprodutorDeMidia.MusicPlayer;
import Telefone.Telefone;



public class Iphone {

    private String nomeUsuario = "Usuário 1";

    private String numero = "+55 91 3552-4489";


    public static void main(String[] args) {
        Browser browser = new Browser();

        browser.endereco();
        browser.exibirPagina();
        browser.novaAba();
        browser.recarregarPagina();

        MusicPlayer player = new MusicPlayer();
        player.selecionarMusica();
        player.tocarMusica();
        player.pausarMusica();
        player.proximaMusica();

        Telefone telefone = new Telefone();

        telefone.ligar();
        telefone.recebendoChamada();
        telefone.acessarCorreioDeVoz();
    }



}
