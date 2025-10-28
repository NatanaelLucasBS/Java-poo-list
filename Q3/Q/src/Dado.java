class Dado {
    private int valor;

    public int rolar() {
        valor = (int) (Math.random() * 6) + 1;
        return valor;
    }
}