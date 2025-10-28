class Uchiha extends Shinobi implements HabilidadeEspecial {
    private String doujutsu;

    public Uchiha() {
        super("Sasuke Uchiha", "Konoha", 200);
        this.doujutsu = "Sharingan";
    }

    @Override
    public void apresentar() {
        System.out.println(nome + " da " + aldeia + " possui o " + doujutsu);
    }

    @Override
    public void usarHabilidade() {
        System.out.println(nome + " ativa o " + doujutsu + "!");
    }

    public void evoluirDoujutsu(String novo) {
        this.doujutsu = novo;
        System.out.println(nome + " evoluiu seu doujutsu para: " + doujutsu);
    }
}