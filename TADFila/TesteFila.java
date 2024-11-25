package TADFila;

public class TesteFila {
    public static void main(String[] args) {
        System.out.println("Teste de Fila:");

        Fila fila = new Fila(3);

        fila.enqueue(10);
        fila.enqueue(20);
        fila.enqueue(30);

        System.out.println(fila);

        fila.dequeue();
        System.out.println(fila);

        fila.dequeue();
        System.out.println(fila);

        System.out.println(fila.size());

        fila.enqueue(40);
        fila.enqueue(50);
        System.out.println(fila);

        fila.enqueue(60);
        System.out.println(fila);

        System.out.println(fila.isEmpty());
    }
}
