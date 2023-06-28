import java.util.Scanner;

public class Tamagotchi {
    private int fome;
    private int felicidade;
    private String emoji;

    public Tamagotchi() {
        fome = 0;
        felicidade = 100;
        emoji = "😺";
    }

    public void alimentar() {
        fome -= 20;
        if (fome < 0) {
            fome = 0;
        }
        felicidade += 10;
        if (felicidade > 100) {
            felicidade = 100;
        }
        System.out.println("Você alimentou o tamagotchi. Fome: " + fome + ", Felicidade: " + felicidade);
    }

    public void carinho() {
        felicidade += 20;
        if (felicidade > 100) {
            felicidade = 100;
        }
        System.out.println("Você deu carinho ao tamagotchi. Fome: " + fome + ", Felicidade: " + felicidade);
    }

    public void passear() {
        felicidade += 10;
        if (felicidade > 100) {
            felicidade = 100;
        }
        System.out.println("Você levou o tamagotchi para passear. Fome: " + fome + ", Felicidade: " + felicidade);
    }

    public void trocarRoupa(String novoEmoji) {
        emoji = novoEmoji;
        System.out.println("Você trocou a roupa do tamagotchi. Novo emoji: " + emoji);
    }

    public void passarTempo() {
        fome += 5;
        felicidade -= 5;
        if (fome >= 100 || felicidade <= 0) {
            System.out.println("Seu tamagotchi morreu!");
            System.exit(0);
        }
        System.out.println("Passou o tempo. Fome: " + fome + ", Felicidade: " + felicidade);
    }

    public static void main(String[] args) {
        Tamagotchi tamagotchi = new Tamagotchi();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("O que você quer fazer?");
            System.out.println("1. Alimentar");
            System.out.println("2. Dar carinho");
            System.out.println("3. Levar para passear");
            System.out.println("4. Trocar de roupa");
            System.out.println("5. Passar o tempo");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    tamagotchi.alimentar();
                    break;
                case 2:
                    tamagotchi.carinho();
                    break;
                case 3:
                    tamagotchi.passear();
                    break;
                case 4:
                    System.out.println("Digite o novo emoji: ");
                    String novoEmoji = scanner.next();
                    tamagotchi.trocarRoupa(novoEmoji);
                    break;
                case 5:
                    tamagotchi.passarTempo();
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
