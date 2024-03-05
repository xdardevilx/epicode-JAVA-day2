import java.util.Scanner;
public class Esercizio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci un numero intero: ");
        int n = input.nextInt();
        input.close();
        System.out.println(contaLettere(n));
    
}
public static String contaLettere(int n){
   switch (n) {
    case 0:
    return "zero";
    case 1:
    return "uno";
    case 2:
    return "due";
    case 3:
    return "tre";
   
    default:
    return "non è un numero valido";
   }
}
}
