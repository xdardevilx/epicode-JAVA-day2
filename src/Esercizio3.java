import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args) {
        String s = "";
        Scanner input = new Scanner(System.in);
        while (!s.equalsIgnoreCase("q")) {
            System.out.println("inserisci una stringa o 'q' per uscire");
            s = input.nextLine();
        }
        input.close();
        System.out.println("hai soddisfatto la richiesta");
        dividiCaratteri(s);
    }

    public static String dividiCaratteri(String st) {
        String stDivisa = "";
        for (int i = 0; i < st.length(); i++) {
            stDivisa = stDivisa + st.charAt(i) + ",";
        }
        return stDivisa;
    }
}
