import java.io.*;
import java.util.*;

class Game {
    private List<Player> jogadores = new ArrayList<>();
    private Dado dado1 = new Dado();
    private Dado dado2 = new Dado();
    private final String arquivoRanking = "ranking.txt";
    private Scanner sc = new Scanner(System.in);

    // ----------- (h) Mostrar ranking TOP 5 -----------
    public void mostrarRanking() {
        List<Player> ranking = carregarRanking();
        ranking.sort((a, b) -> b.getVitorias() - a.getVitorias());

        System.out.println("==== RANKING TOP 5 ====");
        if (ranking.isEmpty()) {
            System.out.println("Nenhum jogador ainda.");
        } else {
            for (int i = 0; i < Math.min(5, ranking.size()); i++) {
                System.out.println((i + 1) + ". " + ranking.get(i));
            }
        }
        System.out.println("========================");
        System.out.println("Pressione Enter para continuar...");
        sc.nextLine();
    }

    // ----------- (a) Adicionar jogadores -----------
    public void adicionarJogadores() {
        int qtd;
        do {
            System.out.print("\nQuantos jogadores (1 a 11)? ");
            qtd = sc.nextInt();
            sc.nextLine();
        } while (qtd < 1 || qtd > 11);

        for (int i = 0; i < qtd; i++) {
            String nome;
            do {
                System.out.print("\nJogador " + (i + 1) + " - Nome: ");
                nome = sc.nextLine();
            } while (nomeExiste(nome));

            int aposta;
            do {
                System.out.print("Aposta (2 a 12): ");
                aposta = sc.nextInt();
                sc.nextLine();
            } while (aposta < 2 || aposta > 12);

            jogadores.add(new Player(nome, aposta));
        }
    }

    // ----------- (d) Lançar dados e (e) verificar vencedores -----------
    public void jogar() {
        System.out.println("\n--- Lançando os dados ---");
        int r1 = dado1.rolar();
        int r2 = dado2.rolar();
        int soma = r1 + r2;

        System.out.println("Dado 1: " + r1 + " | Dado 2: " + r2 + " → Soma: " + soma);

        List<Player> vencedores = new ArrayList<>();
        for (Player p : jogadores) {
            if (p.getAposta() == soma) {
                vencedores.add(p);
            }
        }

        if (vencedores.isEmpty()) {
            System.out.println("\nNinguém acertou. A máquina venceu!");
        } else {
            System.out.println("\n VENCEDORES:");
            for (Player p : vencedores) {
                System.out.println(" - " + p.getNome());
                p.addVitoria();
            }
            atualizarRanking(vencedores);
        }
    }

    // ----------- (f e g) Registrar vitórias em arquivo -----------
    private void atualizarRanking(List<Player> vencedores) {
        List<Player> ranking = carregarRanking();

        for (Player vencedor : vencedores) {
            boolean existe = false;
            for (Player r : ranking) {
                if (r.getNome().equalsIgnoreCase(vencedor.getNome())) {
                    r.addVitoria();
                    existe = true;
                    break;
                }
            }
            if (!existe) {
                ranking.add(new Player(vencedor.getNome(), 0, 1));
            }
        }

        salvarRanking(ranking);
    }

    // ----------- Carregar e salvar arquivo (ASCII) -----------
    private List<Player> carregarRanking() {
        List<Player> ranking = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(arquivoRanking))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(" ");
                if (partes.length == 2) {
                    String nome = partes[0];
                    int vitorias = Integer.parseInt(partes[1]);
                    ranking.add(new Player(nome, 0, vitorias));
                }
            }
        } catch (IOException e) {
            // se o arquivo não existir, começa vazio
        }
        return ranking;
    }

    private void salvarRanking(List<Player> ranking) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(arquivoRanking))) {
            for (Player p : ranking) {
                pw.println(p.getNome() + " " + p.getVitorias());
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar ranking!");
        }
    }

    // ----------- Verifica duplicidade de nome (case-insensitive) -----------
    private boolean nomeExiste(String nome) {
        for (Player p : jogadores) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Nome já cadastrado! Escolha outro.");
                return true;
            }
        }
        return false;
    }
}