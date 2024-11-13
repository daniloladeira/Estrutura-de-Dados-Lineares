package BasicExercises.Control;

import java.util.Scanner;

public class SwitchBreak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String conceito = "";

        System.out.println("Informe a nota: ");
        int nota = input.nextInt();

        switch (nota) {
            case 10:
                conceito = "A";
                break;
            case 7:
                conceito = "B";
                break;
            case 6:
                conceito = "C";
                break;
            case 5:
                conceito = "D";
                break;
            case 1:
                conceito = "F";
                break;
            default:
                conceito = "Nota inválida";
                break;
        }

        System.out.println("Conceito: " + conceito);
        input.close();
    }
}
