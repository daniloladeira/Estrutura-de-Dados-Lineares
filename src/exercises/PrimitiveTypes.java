package exercises;

public class PrimitiveTypes {
    public static void main(String[] args) {
        // tipo -> numéricos inteiros
        byte yearsOfService = 20;
        short flightNumbers = 352;
        int id = 1;
        long points = 3_230_401_042L;

        // tipo -> numéricos reais
        float salary = 1_144.4F;
        double sells = 2_991_797_103.01;

        // tipo -> boolean
        boolean isOnVacation = false;

        // tipo -> caractere
        char status = 'A'; // ativo

        // dias de empresa
        System.out.println(yearsOfService * 365);

        // numero de viagens
        System.out.println(flightNumbers / 2);

        // pontos por real
        System.out.println(points / sells);

        System.out.println("ID - " + id + ": gains -> " + salary);
        System.out.println("Is on vacation? " + isOnVacation);
    }
}
