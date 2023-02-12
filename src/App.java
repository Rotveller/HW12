public class App {
    public static void main(String[] args) {
        Author SteveMcConnell = new Author("Steve", "McConnell");
        Book СodeComplete = new Book(SteveMcConnell, "СodeComplete", 1993);
        System.out.println("СodeComplete.bookName = " + СodeComplete.getBookName());
        System.out.println("СodeComplete.authorName = " + СodeComplete.getAuthorName().getFirstNameAuthor()+СodeComplete.getAuthorName().getSurnameAuthor());
        System.out.println("СodeComplete.yearPublicationBook = " + СodeComplete.yearPublicationBook);
        СodeComplete.setYearPublicationBook(2023);
        System.out.println("СleanCode.yearPublicationBook = " + СodeComplete.yearPublicationBook);
        Author RobertMartin  = new Author("Robert", "Martin");
        Book СleanCode = new Book(RobertMartin, "СleanCode", 2008);
        System.out.println("СleanCode.bookName = " + СleanCode.getBookName());
        System.out.println("СleanCode.authorName = " + СleanCode.getAuthorName().getFirstNameAuthor()+СleanCode.getAuthorName().getSurnameAuthor());
        System.out.println("СleanCode.yearPublicationBook = " + СleanCode.yearPublicationBook);
    }
}