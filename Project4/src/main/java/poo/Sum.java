package poo;

public class Sum {
    public static void somar() {
        IO.println("");
        IO.println("Bem vindo a tela de soma!");

        int numero1;
        int numero2;
        int soma;

        IO.println("Digite o primeiro numero:");
        numero1 = Input.SCANNER.nextInt();

        IO.println("Digite o segundo numero:");
        numero2 = Input.SCANNER.nextInt();

        soma = numero1 + numero2;

        IO.println("A soma de seus numeros é " + soma);

        IO.println("");
        Intro.options();

    }
}
