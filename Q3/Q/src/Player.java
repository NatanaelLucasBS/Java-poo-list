class Player {
    private String nome;
    private int aposta;
    private int vitorias;

    public Player(String nome, int aposta) {
        this.nome = nome;
        this.aposta = aposta;
        this.vitorias = 0;
    }

    public Player(String nome, int aposta, int vitorias) {
        this.nome = nome;
        this.aposta = aposta;
        this.vitorias = vitorias;
    }

    public String getNome() {
        return nome;
    }

    public int getAposta() {
        return aposta;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setAposta(int aposta) {
        this.aposta = aposta;
    }

    public void addVitoria() {
        vitorias++;
    }

    @Override
    public String toString() {
        return nome + " - " + vitorias + " vitória(s)";
    }
}