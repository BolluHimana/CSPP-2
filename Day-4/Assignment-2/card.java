class Card {
    private String title;
    private String author;
    private String subject;

    //constructor

    Card(){

    }

    Card(final String t, final String a, final String s) {
        this.title = t;
        this.author = a;
        this.subject = s;
    }

    //getters

    public String getTitle() {
        return this.title;
    }
    public String getAuthor() {
        return this.author;
    }
    public String getSubject() {
        return this.subject;
    }
    
    //setters
    //void because it is not returning anything

    public void setTitle(final String toSet) {
        this.title = toSet;
    }
    public void setAuthor(final String toSet) {
        this.author = toSet;
    }
    public void setSubject(final String toSet) {
        this.subject = toSet;
    }

    public String toString(){
        return this.title +" "+ this.author + " "+this.subject; 
    }
}