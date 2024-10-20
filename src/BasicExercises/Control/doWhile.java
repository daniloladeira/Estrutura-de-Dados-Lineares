package BasicExercises.Control;

import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double op;

        do {
            System.out.println("1 - Tabuada");
            System.out.println("2 - Divisão");
            System.out.println("3 - Sair");

            op = input.nextDouble();


            if (op == 1) {
                System.out.println("Digite um numero para ver a tabuada: ");
                int num = input.nextInt();

                System.out.println("Tabuada do número " + num);

                for (int i = 0; i <= 10; i++) {
                    System.out.printf("%d X %d = %d\n", num, i, num * i);
                }
            } else if (op == 2) {
                System.out.println("Digite o dividendo: ");
                double dividendo = input.nextDouble();

                System.out.println("Digite o divisor: ");
                double divisor = input.nextDouble();

                double resultado = dividendo / divisor;

                System.out.printf("%.2f / %.2f = %.2f\n", dividendo, divisor, resultado);
            } else if (op == 3) {
                System.out.println("Saindo");
            } else {
                System.out.println("OP inválido");
            }

        }while(op != 3);

        input.close();
    }
}
