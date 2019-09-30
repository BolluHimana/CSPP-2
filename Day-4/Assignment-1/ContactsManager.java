/**
 * This class maintains the contacts of your friends/relations/wellwisherset.
 *
 * The following are the opertaions that this ContactManager application can
 * perform.
 *
 * You can create a contact of your choice.
 *      Creates a contact and keep this in the ContactManager list.
 * You can search for a contact by name
 *      Search for a contact based on the name in the ContactManager list.
 * You can search for a contact by email.
 *      Search for a contact based on email in the ContactManager list.
 * You can delete a contact by name.
 *Search for a contact based on name of the contact and delete from the
 *      ContactManager list.
 *
 * @author Siva Sankar
 */

class ContactsManager {

    /**
     *Define a variable myFriends which is an array that can hold
     * the contacts of your friends.
     */
    private Contact[] myFriends;
    /**
     * Define a variable friendsCount of type int maintain the number of
     * contacts of your friends.
     */
    private int friendsCount;
    /**
     * When the object of ContactManager is created, the constructor should
     * constrcut the object initialy with the following requirements.
     *
     * 1. Initializes the friendsCount to 0 as there no contacts in the list.
     * 2. myFriends with array initial size of 500
     */
    ContactsManager() {
        final int fiveHundred = 500;
        this.myFriends = new Contact[fiveHundred];
        this.friendsCount = 0;
    }
    /**
     * The addContact method takes in a parameter of type contact object and
     * adds this to the contact list.
     * @param contact , to be added.
     */
    public void addContact(final Contact contact) {
        //  Your code goes here....
        myFriends[friendsCount] = contact;
        friendsCount++;

        //  Nothing to be returned... As this method is void...
    }
    /**
     * This method search for contact based on name of your friend and give
     * first occurance of contact in your friends list.
     * @param searchName , the name of contact to be searched in friends list.
     * @return the contact of the friend, null otherwise.
     */
    public Contact searchContact(final String searchName) {
        //  Your code goes here....
        for (int i = 0; i < friendsCount; i++) {
            if (myFriends[i].getName() == searchName) {
                return myFriends[i];
            }
        }

        return null;
    }

    /**
     * This method search for the contact based on the email of your friend
     * and gives the first occurance of the contact in your friends list.
     * @param email ,email of contact to be searched in the friends list.
     * @return the contact of the friend, null otherwise.
     */
    public Contact searchContactByEmail(final String email) {
        //  Your code goes here....
        for (int i = 0; i < friendsCount; i++) {
            if (myFriends[i].getEmail() == email) {
                return myFriends[i];
            }
        }
        return null;
    }
    /**
     * This method deletes contact based on name of your friend and returns
     * true on success and false if failure in deleting the contact.
     *
     * @param searchName , the name of  contact to be searchd in friends list.
     * @return true if contact has been removed successfuly and falseotherwise.
     */
    public boolean deleteContact(final String searchName) {
        //  Your code goes here....
        for (int i = 0; i < friendsCount; i++) {
            if (myFriends[i].getName() == searchName) {
                for (int j = i + 1; j < friendsCount; j++) {
                    myFriends[i] = myFriends[j];
                    i++;
                }
                myFriends[friendsCount] = null;
                friendsCount--;
                return true;
            }
        }
        return false;
    }
    // Any additional method that you want to implement by yourself.
    //  Happy Coding... Have Fun.....
}
