package task01;

public class Incremental {

    private static int count = 0;

    private static Incremental incremental;
    private int numero;

    private Incremental() {
        numero = ++count;
    }

    public static synchronized Incremental getInstance() {
        return incremental == null ? (incremental = new Incremental()) : incremental;
    }

    public String toString() {
        return "task01.Incremental " + numero;
    }
}