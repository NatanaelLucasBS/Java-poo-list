public abstract class Ninjas {
    protected String nome;
    protected String aldeia;
    
    public Ninjas(String nome, String aldeia) {
        this.nome = nome;
        this.aldeia = aldeia;
    }

    public abstract void apresentar();

    public void falar(){
        System.out.println("Eu sou " + nome + " da aldeia " + aldeia + ".");
    }


}
