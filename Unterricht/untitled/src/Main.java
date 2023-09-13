// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.printf("Freitag, 15.09.2017\n");
        System.out.printf("Freitag, %d.09.2017\n", 15);
        System.out.printf("Freitag, %d.%d.2017\n", 15, 9, 2017);
        System.out.printf("Freitag, %d.%d.%d\n", 15, 9, 2017);
        System.out.printf("Freitag, %d.%2d.%d\n", 15, 9, 2017);
        System.out.printf("Freitag, %d.%02d.%d\n", 15, 9, 2017);
        System.out.printf("Freitag, %d.%-2d.%d\n", 15, 9, 2017);
        System.out.printf("Freitag, %d.%+2d.%d\n", 15, 9, 2017);
        System.out.printf("Freitag, %d.%+-8d.%d\n", 15, -9, 2017);
    }
}