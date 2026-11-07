public class gen {

    public static <T, U> void printPair(T first, U second) {
        System.out.println(first + " " + second);
    }

    public static void main(String[] args) {
        printPair(10, "Shreya");
        printPair("Java", 99.5);
    }
}