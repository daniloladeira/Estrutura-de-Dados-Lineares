package BasicExercises.Control;

import java.util.Scanner;

public class IF_ELSE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Escolha um dia da semana pelo número ( 1; 2; 3; 4; 5; 6 ou 7)");

        double diaN = input.nextDouble();

        if (diaN == 1) {
            System.out.println("Domingo");
        } else if (diaN == 2) {
            System.out.println("Segunda");
        } else if (diaN == 3) {
            System.out.println("Terça");
        } else if (diaN == 4) {
            System.out.println("Quarta");
        } else if (diaN == 5) {
            System.out.println("Quinta");
        } else if (diaN == 6) {
            System.out.println("Sexta");
        } else if (diaN == 7) {
            System.out.println("Sábado");
        } else {
            System.out.println("Número invalido");
        }


        input.close();
    }
}
