package Es3;

public class Main {
    public static void main(String[] args) {
        RubricaTelefonica rubrica1 = new RubricaTelefonica();
        rubrica1.addNewContact("Aldo Baglio",3314567890L);
        rubrica1.addNewContact("Giovanni Storti",3314567891L);
        rubrica1.addNewContact("Giacomo Poretti",3314567892L);
        rubrica1.searchContactByName("Aldo");
        rubrica1.searchContactByName("Aldo Baglio");
        rubrica1.searchContactByValue(3314567891L);
        rubrica1.searchContactByValue(3314567897L);
        System.out.println("uso metodo printDirectory");
        rubrica1.printDirectory();
    }
}
