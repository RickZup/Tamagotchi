import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Tamagotchi amigoVirtual = new Tamagotchi();
        Scanner entrada = new Scanner(System.in);

        System.out.println();
        System.out.println("Qual o nome do seu Tamagotchi?");
        amigoVirtual.setNome(entrada.next());

        System.out.println();
        System.out.println("Loading...");
        System.out.println("Wait......");
        System.out.println();
        System.out.println("Pronto! " + amigoVirtual.getNome() + " foi criado!");
        amigoVirtual.exibirStatus();

        while (amigoVirtual.isJogoRodando()){
            System.out.println("Como você quer interagir com " + amigoVirtual.getNome() + "?");
            System.out.println("1. Passar o tempo");
            System.out.println("2. Aliemntar");
            System.out.println("3. Levar para passear");
            System.out.println("4. Dar carinho!");
            System.out.println("5. Trocar de roupa");

            int resposta = entrada.nextInt();

            switch (resposta){

                case 1:
                    amigoVirtual.passarTempo();
                    break;
                case 2:
                    amigoVirtual.alimentar();
                    break;
                case 3:
                    amigoVirtual.passear();
                    break;
                case 4:
                    amigoVirtual.darCarinho();
                    break;
                case 5:
                    System.out.println("Digite o novo emoji:");
                    String novoEmoji = entrada.next();
                    amigoVirtual.trocarRoupa(novoEmoji);
                    break;
                default:
                    System.out.println("Opa... Escolha outro número, de 1 a 5!");
            }
        }
    }
}