import java.util.Comparator;

public class BookComparator implements Comparator<Book> {

    // Implement the comparator method for books.
	
	public int compare(Book one, Book two) {

        if ( one.getAuthor().compareTo(two.getAuthor()) != 0){
            return one.getAuthor().compareTo(two.getAuthor());
        }
        else if ( one.getTitle().compareTo(two.getTitle()) != 0){
            return one.getTitle().compareTo(two.getTitle());
        }
        else if ( one.getAuthor().compareTo(two.getAuthor()) != 0){
            return one.getAuthor().compareTo(two.getAuthor());
        }
        else if ( one.getYear() < two.getYear()) {
            return -1;
        }
        else if ( one.getYear() > two.getYear()) {
            return 1;
        }
        else {
            return 0;
        }

    }
}