import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int numero;
        String nome, agencia;
        double saldo;
        
        Scanner ler = new Scanner(System.in);

        System.out.printf("Insira seu numero bancario: ");
        numero = ler.nextInt();

        ler.nextLine();

        System.out.printf("\nInsira o numero da Agencia: ");
        agencia = ler.nextLine();

        System.out.printf("\nInsira seu nome: ");
        nome = ler.nextLine().toUpperCase();

        System.out.printf("\nInsira o seu Saldo: ");
        saldo = ler.nextDouble();

        System.out.printf("\nOlá " + nome + ", obrigado por criar uma conta em nosso banco, sua agencia e " + agencia + ", conta " + numero + " e seu saldo " + saldo + " ja esta disponivel para saque");

        ler.close();
    }
}
