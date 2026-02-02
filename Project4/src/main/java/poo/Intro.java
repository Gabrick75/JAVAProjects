package poo;

public class Intro {
    public static boolean options(){

        IO.println("Bem vindo a aplicação de cálculos matemáticos!");

        IO.println("Escolha uma opção: \n 1 - Soma \n 2 - Sutração \n 3 - Multipicação \n 4 - Divisão \n 5 - Sair");
        byte options = Input.SCANNER.nextByte();

        switch(options){
            case 1:
                IO.println("Carregando tela de Soma");
                Sum.somar();
                break;
            case 2:
                IO.println("Carregando tela de Subtrações");
                Subtraction.subtrair();
                break;
            case 3:
                IO.println("Carregando tela de Multiplicações");
                Multiplication.multiplicacao();
                break;
            case 4:
                IO.println("Carregando tela de Divisões");
                Division.dividir();
                break;
            case 5: {
                return false;
            }
            default: IO.println("Opção inválida");
        }
        return true;
    }
}
