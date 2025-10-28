class Hokage extends Ninjas implements Missao, HabilidadeEspecial {
    private String jutsu;

    public Hokage() {
        super("Naruto Uzumaki", "Konoha");
        this.jutsu = "Rasengan Supremo";
    }

    public Hokage(String nome, String aldeia, String jutsu) {
        super(nome, aldeia);
        this.jutsu = jutsu;
    }

    @Override
    public void apresentar() {
        System.out.println("Sou o Hokage " + nome + " e domino o " + jutsu);
    }

    @Override
    public void usarHabilidade() {
        System.out.println(nome + " usa sua habilidade especial: " + jutsu + "!");
    }

    @Override
    public void iniciarMissao() {
        System.out.println(nome + " inicia uma missão S-Rank!");
    }

    @Override
    public void completarMissao() {
        System.out.println(nome + " concluiu a missão com sucesso!");
    }

    public void modoSabio() {
        System.out.println(nome + " entrou no Modo Sábio!");
    }
}
