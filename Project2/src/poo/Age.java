package poo;

import java.util.Scanner;

public class Age {

    public static byte readValidAge(Scanner sc) {
        int age;
        boolean invalid;

        do {
            System.out.print("Digite a sua idade: ");
            age = sc.nextInt();

            invalid = age < 0 || age > 127;

            if (invalid) {
                System.out.println("Idade inválida! Digite um valor real.");
            }

        } while (invalid);

        return (byte) age;
    }

    public static void checkAge(byte age) {
        if (age < 0) {
            System.out.println("A idade inserida é inválida");
        } else if (age < 18) {
            System.out.println("Menor de Idade");
        } else if (age <= 65) {
            System.out.println("Idade Ativa");
        } else {
            System.out.println("Aposentado");
        }

        System.out.println("A sua idade é: " + age);
    }
}
