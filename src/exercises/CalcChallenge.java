package exercises;

import java.util.Scanner;

public class CalcChallenge {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("N1: ");
        double N1 = input.nextDouble();


        System.out.println("OP? ");
        String op = input.next();

        System.out.println("N2: ");
        double N2 = input.nextDouble();

        double resul = "+".equals(op) ? N1 + N2 : 0;
        resul = "-".equals(op) ? N1 - N2 : resul;
        resul = "*".equals(op) ? N1 * N2 : resul;
        resul = "/".equals(op) ? N1 / N2 : resul;
        resul = "%".equals(op) ? N1 % N2 : resul;


        System.out.printf("%.2f %s %.2f = %.2f", N1, op, N2, resul);
        input.close();
    }
}
