package Es2;

import java.util.*;

public class Es2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroN;
        System.out.println("1) es.2");
        System.out.println("quanto deve essere lungo l array?");
        numeroN = Integer.parseInt(sc.nextLine());
        System.out.println(getListaRandom(numeroN));
        ArrayList<Integer> arrayIniziale = new ArrayList<Integer>(getListaRandom(numeroN));
        System.out.println("2) es.2");
        System.out.println("Array Prima di applicare metodo getListaReverse :" + arrayIniziale);
        System.out.println("Applico getListaReverse: " + getListaReverse(arrayIniziale));
        System.out.println("3) es.2");
        System.out.println("Array Iniziale:" + arrayIniziale);
        System.out.println("invoco getPariDispari con true");
        getPariDispari(arrayIniziale, true);
        System.out.println("invoco getPariDispari con false");
        getPariDispari(arrayIniziale, false);
    }
    public static ArrayList<Integer> getListaRandom(int numero) {
        Random r = new Random();
        ArrayList<Integer> listaRandom = new ArrayList<>();
        for (int i =0 ; i < numero; i++) {
            listaRandom.add(r.nextInt(0,100));
        }
        Collections.sort(listaRandom);
        return listaRandom;
    }
    public static ArrayList<Integer> getListaReverse(ArrayList<Integer> arrayInteri) {
        ArrayList<Integer> arrayReversed = new ArrayList<>(arrayInteri.reversed());
        ArrayList<Integer> arraySummed = new ArrayList<>();
        arraySummed.addAll(arrayInteri);
        arraySummed.addAll(arrayReversed);
        return arraySummed;
    }
    public static void getPariDispari (ArrayList<Integer> arrayInteri, boolean b) {
        if(b) {
            for(int i = 0; i< arrayInteri.size();i+=2) {
                System.out.println("Posizione: " + i + " valore: " + arrayInteri.get(i));
            }}
        else {
                for (int i = 1; i< arrayInteri.size();i+=2) {
                    System.out.println("Posizione: " + i + " valore: " + arrayInteri.get(i));
                }
            }
    }
}
