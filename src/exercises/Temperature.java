package exercises;
// (F° - 32) * 5/9 = °C
public class Temperature {

    public static void main(String[] args) {
        int F = 74;
        final int diff = 32;
        final double factor = 5.0 / 9.0;

        double result = (F - diff) * factor;
        System.out.println(F + "F° -> " + result + "C°");
    }
}
