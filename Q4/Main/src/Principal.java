public class Principal {
    public static void main(String[] args) {
        System.out.println("=== NARUTO OO ===");

        Shinobi shinobi = new Shinobi("Iruka", "Konoha", 60);
        Hokage hokage = new Hokage("Naruto", "Konoha", "Rasenshuriken");
        Jonin jonin = new Jonin();
        Uchiha sasuke = new Uchiha();

        // Testes
        System.out.println("\n-- SHINOBI --");
        shinobi.falar();
        shinobi.apresentar(true);
        shinobi.treinar();

        System.out.println("\n-- HOKAGE --");
        hokage.apresentar();
        hokage.usarHabilidade();
        hokage.iniciarMissao();
        hokage.completarMissao();
        hokage.modoSabio();

        System.out.println("\n-- JONIN --");
        jonin.apresentar();
        jonin.copiarJutsu();

        System.out.println("\n-- UCHIHA --");
        sasuke.apresentar();
        sasuke.usarHabilidade();
        sasuke.evoluirDoujutsu("Mangekyou Sharingan");
    }
}