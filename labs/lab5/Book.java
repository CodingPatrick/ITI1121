public class Book {

    // Your variables declaration here
    private String author;
    private String title;
    private int year;

    public Book (String author, String title, int year) {
        // Your code here
        this.author = author;
        this.title = title;
        this.year = year;
    }

    public String getAuthor() {
        // Your code here
        return author;
    }

    public String getTitle() {
        // Your code here
        return title;
    }

    public int getYear() {
        // Your code here
        return year;
    }

    public boolean equals(Object other) {
        // Your code here

        if ( other instanceof Book) {
            
            Book bookOther = (Book) other;

            if (author == null && bookOther.author == null){
                return ((title.equals(bookOther.title)) && (year == bookOther.year));
            }
            if (title == null && bookOther.title == null){
                return ((author.equals(bookOther.author)) && (year == bookOther.year));
            }
            if ( (title == null && bookOther.title != null) || (title != null && bookOther.title == null)){
                return false;
            }
            if ( (author == null && bookOther.author != null) || (author != null && bookOther.author == null)){
                return false;
            }
            else{
                return ((author.equals(bookOther.author)) && (title.equals(bookOther.title)) && (year == bookOther.year));
            }
        }
        else {
            return false;
        }
    }

    public String toString() {
        // Your code here
        return this.author + ": " + this.title + " (" + this.year + ")";
    }
}
