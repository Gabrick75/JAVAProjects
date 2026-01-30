import java.util.Scanner;
import poo.Age;

import static poo.Age.readValidAge;

public class Main {
    public static void main(String[] args) {

        Scanner getAge = new Scanner(System.in);
        byte age = readValidAge(getAge);

        Age.checkAge(age);
    }
}
