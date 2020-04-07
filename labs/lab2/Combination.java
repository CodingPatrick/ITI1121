public class Combination {

    // Instance variables.
    private int one;
    private int two;
    private int three;

    // Constructor
    public Combination( int first, int second, int third ) {
        // Your code here
        this.one = first;
        this.two = second;
        this.three = third;
    }

    // An instance method that compares this object
    // to other.
    // Always check that other is not null, i)
    // an error would occur if you tried to
    // access other.first if other was null, ii)
    // null is a valid argument, the method should
    // simply return false.

    public boolean equals( Combination other ) {
        // Put your code here and remove the line below
        if (other == null){
            return false;
        } else{
            return (( one == other.one ) && (two == other.two) && (three == other.three));
        }
    }

    // Returns a String representation of this Combination.
    public String toString() {
        // Put your code here and remove the line below
        return (one + ":" + two + ":" + three);
    }

}
