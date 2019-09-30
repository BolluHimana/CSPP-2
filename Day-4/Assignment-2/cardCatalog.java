class CardCatalog {
    Card[] myCard;
    int cardCatalogCount;
    CardCatalog() {
        this.myCard = new Card[4];
        this.cardCatalogCount = 0;
    }
    //adding 
    public void addCard(final Card card) {
        myCard[cardCatalogCount] = card;
        cardCatalogCount++;
    }
    public Card searchTitle(final String getTitle) {
        //  Your code goes here....
        for (int i = 0; i < cardCatalogCount; i++) {
            if (myCard[i].getTitle() == getTitle) {
                return myCard[i];
            }
        }
        return null;
    }
    public Card searchAuthor(final String getAuthor) {
        //  Your code goes here....
        for (int i = 0; i < cardCatalogCount; i++) {
            if (myCard[i].getAuthor() == getAuthor) {
                return myCard[i];
            }
        }
        return null;
    }
    public Card searchSubject(final String getSubject) {
        //  Your code goes here....
        for (int i = 0; i < cardCatalogCount; i++) {
            if (myCard[i].getSubject() == getSubject) {
                return myCard[i];
            }
        }
        return null;
    }
    public boolean removeContact(final String getTitle) {
        //  Your code goes here....
        //iterating through cards
        for (int i = 0; i < cardCatalogCount; i++) {
            if (myCard[i].getTitle() == getTitle) {
                // i is match
                for (int j = i + 1; j < cardCatalogCount; j++) {
                    myCard[i] = myCard[j];
                    i++;
                }
                myCard[cardCatalogCount] = null;
                cardCatalogCount--;
                return true;
            }
        }
        return false;
    }

    public void print() {
        for(int i = 0; i < myCard.length; i++){
            System.out.println(myCard[i]);
        }
    }
}