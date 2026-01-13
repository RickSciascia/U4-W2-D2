package Es3;

import java.util.HashMap;

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
    public void SearchContactByValue(long numero) {
        if(contatti.containsValue(numero)) System.out.println("Risultato: " + contatti.values(numero));
        else System.out.println("Contatto non trovato");
    }
}

