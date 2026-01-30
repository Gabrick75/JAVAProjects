import java.util.Scanner;
import poo.Age;

public class Main {
    public static void main(String[] args) {
        byte age;

        System.out.println("Qual a sua idade?");
        Scanner getAge = new Scanner(System.in);
        age = getAge.nextByte();

        if (age < 0) {
            System.out.println("Idade inválida! Não pode ser negativa.");
            return; // encerra o programa
        }
        Age.checkAge(age);
    }
}
