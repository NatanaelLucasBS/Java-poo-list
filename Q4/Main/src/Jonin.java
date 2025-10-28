class Jonin extends Shinobi {
    private boolean liderEquipe;

    public Jonin() {
        super("Kakashi Hatake", "Konoha", 120);
        this.liderEquipe = true;
    }

    @Override
    public void apresentar() {
        System.out.println(nome + " é um Jōnin da " + aldeia + " (Chakra: " + nivelChakra + ")");
    }

    public void copiarJutsu() {
        System.out.println(nome + " usa o Sharingan para copiar um jutsu!");
    }
}