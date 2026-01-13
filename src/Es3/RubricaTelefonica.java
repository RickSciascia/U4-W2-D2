package Es3;

import java.util.HashMap;
import java.util.Set;

public class RubricaTelefonica {
//    attributi
    public HashMap<String, Long> contatti = new HashMap<>();
//    metodi
    public void addNewContact(String nome, long numero) {
        contatti.put(nome,numero);
    }
    public void removeSelectedContact(String nome) {
        contatti.remove(nome);
    }
    public void searchContactByName(String nome) {
        if(contatti.containsKey(nome)) System.out.println("Risultato: " + contatti.get(nome));
        else System.out.println("Contatto non trovato");
    }
    public void searchContactByValue(long numero) {
        Set<String> nomi = contatti.keySet();
        for(String nome: nomi){
            if(numero == (contatti.get(nome))) {
                System.out.println("Contatto trovato: " + nome);
            }
        }
    }
    public void printDirectory(){
        Set<String> nomi = contatti.keySet();
        for (String nome: nomi) {
            System.out.println(nome + " " + contatti.get(nome));
        }
    }
}

