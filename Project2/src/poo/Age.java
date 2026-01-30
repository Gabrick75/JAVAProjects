package poo;

public class Age {

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
