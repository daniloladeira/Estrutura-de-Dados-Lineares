//a partir do scanner pegar 3 strings usando nextline, cada string recebe 3 salarios de um funcionario e calcula a media
// porem o usuario pode separar as casas decimais tanto com "," quanto com "." precisa converter para numerico e mostrar a media

package exercises;

import java.util.Scanner;

public class ConversionChallenge {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1° SALARY: ");
        String salary1 = input.nextLine().replace(",", ".");

        System.out.println("2° SALARY: ");
        String salary2 = input.nextLine().replace(",", ".");

        System.out.println("3° SALARY: ");
        String salary3 = input.nextLine().replace(",", ".");

        double s1 = Double.parseDouble(salary1);
        double s2 = Double.parseDouble(salary2);
        double s3 = Double.parseDouble(salary3);

        double salaryAverage = (s1 + s2 + s3) / 3;

        input.close();
        System.out.printf("This worker salary average is: %.2f\n", salaryAverage);
    }
}
