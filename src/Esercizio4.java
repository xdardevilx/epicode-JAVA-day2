import java.util.Scanner;

public class Esercizio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci un numero intero: ");
        int n = input.nextInt();
        input.close();
        System.out.println(contoAllaRovescia(n));
    }

    public static int contoAllaRovescia(int n) {
        int x = n;
        while (x > 0) {

            x--;
            System.out.println(x+1);
        }
        return x;
    }
}
