public class ContactsManager {
    Contact[] myFriends;
    int friendsCount;

    public ContactsManager() {
        myFriends = new Contact[100];
        friendsCount = 0;
    }

    public void addContact(Contact contact) {
        myFriends[friendsCount] = contact;
        friendsCount++;
    }

    public Contact searchContact(String searchName) {
        for (int i = 0; i < friendsCount; i++) {
            if (myFriends[i].name.equalsIgnoreCase(searchName)) {
                return myFriends[i];
            }
        }
        return null;
    }
}

