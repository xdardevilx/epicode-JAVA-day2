import java.util.Scanner;

public class Esercizio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci un numero intero: ");
        int n = input.nextInt();
        input.close();
        contoAllaRovescia(n);
    }

    public static void contoAllaRovescia(int n) {
        int x = n;
        while (x >= 0) {
            System.out.println(x);
            x--;
        }
    }
}
