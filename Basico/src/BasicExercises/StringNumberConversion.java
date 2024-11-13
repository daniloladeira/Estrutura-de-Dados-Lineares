package BasicExercises;

import javax.swing.*;

public class StringNumberConversion {

    public static void main(String[] args) {
        String v1 = JOptionPane.showInputDialog("Enter the first number (N1)");
        String v2 = JOptionPane.showInputDialog("Enter the second number (N2)");

        System.out.println("Concatenation of v1 and v2: " + v1 + v2);

        double n1 = Double.parseDouble(v1);
        double n2 = Double.parseDouble(v2);

        double sum = n1 + n2;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + sum / 2);
    }
}
