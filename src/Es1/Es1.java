package Es1;

import java.util.HashSet;
import java.util.Scanner;

public class Es1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quanti parole vuoi inserire?: Inserisci un numero intero e premi invio!");
        int numeroN = Integer.parseInt(sc.nextLine());
        HashSet<String> setParole = new HashSet<>();
        HashSet<String> setParoleDuplicate = new HashSet<>();
        for (int i = 0; i < numeroN; i++) {
            System.out.println("Dammi la parola da inserire:");
            String parola = sc.nextLine();
            if (setParole.add(parola)) {
                System.out.println("Parola aggiunta");
            } else setParoleDuplicate.add(parola);
        }
        System.out.println("Le parole duplicate inserite sono: "+ setParoleDuplicate);
        System.out.println("Le parole distinte inserite sono: "+ setParole);
        System.out.println("Il numero di parole distinte sono: " + setParole.size());
        }
}
