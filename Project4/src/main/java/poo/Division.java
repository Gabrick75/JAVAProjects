package poo;

public class Division {
    public static void dividir() {
        IO.println("");
        IO.println("Bem vindo a tela de divisão!");

        IO.println("Digite o primeiro numero:");
        int numero1 = Input.SCANNER.nextInt();

        IO.println("Digite o segundo numero:");
        int numero2 = Input.SCANNER.nextInt();

        if (numero2 == 0) {
            IO.println("Divisão por zero não é permitido!");
            return;
        }
        double soma = (double) numero1 / numero2;

        IO.println("A divisão de seus numeros deu: " + soma);

        IO.println("");
    }
}
