import java.util.Scanner;

public class Tamagotchi {

    //Atributos
    private String nome;
    private int fome;
    private int felicidade;
    private String emoji;
    private boolean jogoRodando;

    //Construtor
    public Tamagotchi() {
        fome = 0;
        felicidade = 100;
        emoji = "😺";
        jogoRodando = true;
    }

    //Getters e setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getFome() {
        return fome;
    }

    public int getFelicidade() {
        return felicidade;
    }

    public String getEmoji() {
        return emoji;
    }

    public boolean isJogoRodando() {
        return jogoRodando;
    }

    //Métodos
    //ToDo implementar aumento de fome e felicidade de forma aleatório (definir se é uma boa ideia)

    public void exibirStatus(){
        System.out.println();
        System.out.println("Status de: " + getNome());
        System.out.println("- Fome: " + fome);
        System.out.println("- Felicidade: " + felicidade);
        System.out.println("- Roupa: " + emoji);
        System.out.println();
    }

    public void alimentar(){
        fome -= 10;
        felicidade += 10;
        if (fome < 0){
            fome = 0;
        }

        felicidade += 20;
        if (felicidade > 100){
            felicidade = 100;
        }

        System.out.println("Nhan, nhan..." + getNome() + " adorou o lanchinho! :D");
        exibirStatus();
    }

    public void darCarinho(){
        felicidade += 20;
        if (felicidade > 100){
            felicidade = 100;
        }
        System.out.println("Ownt... " + getNome() + " está feliz por ter recebido um dengo >.<");
        exibirStatus();
    }

    public void passear(){
        felicidade += 10;
        fome += 20;
        if (felicidade > 100){
            felicidade = 100;
        }
        System.out.println("Uhu! Parece que " + getNome() + " adorou o passeio (:");
        exibirStatus();
    }

    public void passarTempo(){
        fome += 7;
        felicidade -= 5;
        System.out.println();
        System.out.println("Algum tempo se passou...");

        if (fome > 100){
            fome = 100;
        }

        if (felicidade < 0){
            felicidade = 0;
        }

        if (fome >= 100 || felicidade <= 0){
            System.out.println();
            System.out.println("Não sabemos bem como dizer isso...");
            System.out.println("Bem...");
            System.out.println("Sentimos muito, mas... ");
            System.out.println(getNome() + " não está mais entre nós.");
            jogoRodando = false;
        }
        exibirStatus();
    }

    public void trocarRoupa(String novoEmoji){
        emoji = novoEmoji;
    }

}
