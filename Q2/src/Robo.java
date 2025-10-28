
public class Robo {
    private int linha = 0;
    private int coluna = 0;
    private int passo = 1;

  
    public Robo(int linha, int coluna, int passo) {
        this.linha = linha;
        this.coluna = coluna;
        this.passo = passo;
    }

    public String mostrarPosicaoAtual() {
        return "(" + linha + ", " + coluna + ")";
    }

    public void andarFrente(){
        this.linha = Math.max(0, linha - passo);
    }

    public void andarTras(){
        this.linha = Math.min(19,linha + passo);
    }
    

    public void andarDireita(){
        this.coluna = Math.min(39, coluna + passo);
    }

    
    public void andarEsquerda(){
        this.coluna = Math.max(0, coluna - passo);
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    public int getPasso() {
        return passo;
    }

    public void setPasso(int passo) {
        this.passo = passo;
    }

    

}
