import java.util.Scanner;

public class App {
    private static final int LINHAS = 20;
    private static final int COLUNAS = 40;
    private static int[][] sala = new int[LINHAS][COLUNAS];
    private static Robo r1;

    public static void main(String[] args) throws Exception {
        r1 = new Robo(0, 0, 1);
        Scanner sc = new Scanner(System.in);
        int opc;
        
        do {
            atualizarSala();
            mostrarSala();
            
            // MOSTRAR MENU
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Andar para Frente");
            System.out.println("2 - Andar para Trás");
            System.out.println("3 - Andar para Direita");
            System.out.println("4 - Andar para Esquerda");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            
            opc = sc.nextInt();
            
            
            switch(opc) {
                case 1:
                    r1.andarFrente();
                    break;
                case 2:
                    r1.andarTras();
                    break;  
                case 3:
                    r1.andarDireita();
                    break;
                case 4:
                    r1.andarEsquerda();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opc != 0);

        sc.close();
    }

    private static void atualizarSala() {
        for(int i = 0; i < LINHAS; i++) {
            for(int j = 0; j < COLUNAS; j++) {
                sala[i][j] = 0;
            }
        }
        sala[r1.getLinha()][r1.getColuna()] = 1; 
    }
    
    private static void mostrarSala() {
        System.out.println("\nSala (20x40):");
        System.out.println("Robô na posição: " + r1.mostrarPosicaoAtual());
        System.out.println();
        
        for(int i = 0; i < LINHAS; i++) {
            for(int j = 0; j < COLUNAS; j++) {
                System.out.print(sala[i][j] + " ");
            }
            System.out.println();
        }
    }
}