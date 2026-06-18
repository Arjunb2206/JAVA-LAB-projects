class Book{
     String title;
     String author;

    public void setDetails(String title ,String author) {
    this.title =title;
    this.author=author;
    }

    void displayDetails() {
        System.out.println("[title :" + title + " , author Name :" + author + "]");
    }
}

class BookDetails {
    public static void main(String[] args) {
       Book b1 =new Book();
       Book b2 =new Book();
       Book b3 =new Book();

       b1.setDetails("java","Herbert Schildt");
       b2.setDetails("python","Eric Matthes");
       b3.setDetails("software engineering","Roger S. Pressman");

        b1.displayDetails();
        b2.displayDetails();
        b3.displayDetails();
        
    }
}
