public class JogoDeDados {
    public static void main(String[] args) {
        Game jogo = new Game();
        jogo.mostrarRanking();   // (h) Mostra o TOP 5
        jogo.adicionarJogadores(); // (a)
        jogo.jogar();              // (d, e, f, g)
    }
}