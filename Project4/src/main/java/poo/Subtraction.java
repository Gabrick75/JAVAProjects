package poo;

public class Subtraction {
    public static void subtrair() {
        IO.println("");
        IO.println("Bem vindo a tela de subtração!");

        IO.println("Digite o primeiro numero:");
        int numero1 = Input.SCANNER.nextInt();

        IO.println("Digite o segundo numero:");
        int numero2 = Input.SCANNER.nextInt();

        int soma = numero1 - numero2;

        IO.println("A subtração de seus numeros deu: " + soma);

        IO.println("");
    }
}
