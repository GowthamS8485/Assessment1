package prodapt25;

public class TesterEntity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BusinessLogic bl=new BusinessLogic();

        bl.addBooks();    

        System.out.println("\nAfter adding the Books ");
        bl.displayBooks();    

        bl.updateBooks(3,4001,"Stuart Little","E.B.White");    

        System.out.println("\nAfter Updating the book ");
        bl.displayBooks();

        bl.deleteBook(4);

        System.out.println("\nAfter Deleting the book ");
        bl.displayBooks();

	}

}
