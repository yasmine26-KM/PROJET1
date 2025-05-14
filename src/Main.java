public class Main {
    public static void main(String[] args) {
        ContactsManager myContactsManager = new ContactsManager();

        Contact c1 = new Contact();
        c1.name = "YASMINE";
        c1.phoneNumber = "0201537454";
        myContactsManager.addContact(c1);

        Contact c2 = new Contact();
        c2.name = "ASSETOU";
        c2.phoneNumber = "0779967663";
        myContactsManager.addContact(c2);

        Contact c3 = new Contact();
        c3.name = "CHLOE";
        c3.phoneNumber = "0101536408";
        myContactsManager.addContact(c3);

        Contact c4 = new Contact();
        c4.name = "FATOUMATA";
        c4.phoneNumber = "0707005492";
        myContactsManager.addContact(c4);

        Contact c5 = new Contact();
        c5.name = "EMMANUEL";
        c5.phoneNumber = "0701755992";
        myContactsManager.addContact(c5);

         // Recherche d’un contact
        Contact result = myContactsManager.searchContact("EMMANUEL");
        if (result != null) {
            System.out.println("Numéro de Charlie : " + result.phoneNumber);
        } else {
            System.out.println("Contact non trouvé.");
        }
    }
}



