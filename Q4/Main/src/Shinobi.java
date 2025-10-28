class Shinobi extends Ninjas {
    protected int nivelChakra;

    public Shinobi() {
        super("Shinobi genérico", "Konoha");
        this.nivelChakra = 50;
    }

    public Shinobi(String nome, String aldeia, int nivelChakra) {
        super(nome, aldeia);
        this.nivelChakra = nivelChakra;
    }

    // Sobrecarga de método
    public void apresentar() {
        System.out.println("Sou um Shinobi de nível " + nivelChakra);
    }

    public void apresentar(boolean detalhado) {
        if (detalhado)
            System.out.println(nome + " — Aldeia: " + aldeia + " | Chakra: " + nivelChakra);
        else
            apresentar();
    }

    public void treinar() {
        nivelChakra += 10;
        System.out.println(nome + " treinou! Chakra atual: " + nivelChakra);
    }
}