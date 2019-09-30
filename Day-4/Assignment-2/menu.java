import javax.security.auth.Subject;

public class menu {
    public static void main(String[] args) {
        Card cardOne = new Card();
        cardOne.setTitle("harry potter");
        cardOne.setAuthor("k rowlling");
        cardOne.setSubject("fiction");
        Card cardTwo = new Card();
        cardTwo.setTitle("harry");
        cardTwo.setAuthor("potter");
        cardTwo.setSubject("pot");
        Card cardThree = new Card();
        cardThree.setTitle("harr");
        cardThree.setAuthor("por");
        cardThree.setSubject("pot");
        Card cardFour = new Card();
        cardFour.setTitle("hary");
        cardFour.setAuthor("pter");
        cardFour.setSubject("pott");
        // System.out.println("title:"+ cardOne.getTitluthor:"+ cardThree.getAuthor() +"subject: "+ cardThree.getSubject());
        CardCatalog obj = new CardCatalog();
        obj.addCard(cardOne);
        obj.addCard(cardTwo);
        obj.addCard(cardThree);
        obj.addCard(cardFour);
        obj.print();
        // System.out.println();
    }
}