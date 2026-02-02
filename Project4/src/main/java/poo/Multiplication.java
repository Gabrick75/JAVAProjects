package poo;

public class Multiplication {
    public static void multiplicacao() {
        IO.println("");
        IO.println("Bem vindo a tela de multiplicação!");

        IO.println("Digite o primeiro numero:");
        int numero1 = Input.SCANNER.nextInt();

        IO.println("Digite o segundo numero:");
        int numero2 = Input.SCANNER.nextInt();

        int soma = numero1 * numero2;

        IO.println("A multiplicação de seus numeros deu: " + soma);

        IO.println("");
    }
}
