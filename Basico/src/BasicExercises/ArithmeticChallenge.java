package BasicExercises;

public class ArithmeticChallenge {

    public static void main(String[] args) {
        int line11 = (6 * (3 + 2));
        int line11r = (int) Math.pow(line11, 2);
        int line11r2 = line11r / (3*2);

        int line12 = ((1 - 5) * (2 - 7) / 2);
        int line12r = (int) Math.pow(line12, 2);
        int numerator = (int) Math.pow(line11r2 - line12r, 3);
        int denominator = (int) Math.pow(10, 3);

        int finalformula = numerator / denominator;

        System.out.println(finalformula);
    }
}
