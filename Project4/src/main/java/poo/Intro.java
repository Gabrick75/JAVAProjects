package poo;
import java.util.Scanner;

public class Intro {
    public static void options(){
        byte options;

        IO.println("Bem vindo a aplicação de cálculos matemáticos!");

        IO.println("Escolha uma opção: \n 1 - Soma \n 2 - Sutração \n 3 - Multipicação \n 4 - Divisão \n 5 - Sair");
        Scanner selection = new Scanner(System.in);
        options = selection.nextByte();

        switch(options){
            case 1:
                IO.println("Carregando tela de Soma");
                Sum.somar();
                break;
            case 2:
                IO.println("Carregando tela de Subtrações");
                break;
            case 3:
                IO.println("Carregando tela de Multiplicações");
                break;
            case 4:
                IO.println("Carregando tela de Divisões");
                break;
            case 5:
                IO.println("Saindo do programa");
                break;

        }
    }
}
