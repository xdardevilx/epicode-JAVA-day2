
public class Esercizio1 {
    public static void main(String[] args) {
        String s = "ciao";

        int n = s.length();
        if (pariDispari(n)) {
            System.out.println("pari");
        } else {
            System.out.println("dispari");
        }

        int anno = 2019;
        if (annoBisestile(anno)) {
            System.out.println("bisestile");
        } else {
            System.out.println("non bisestile");
        }
    }

    public static boolean pariDispari(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean annoBisestile(int anno) {
        if (anno % 4 == 0) {
            return true;
        } else if (anno % 100 == 0 && anno % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
    
}