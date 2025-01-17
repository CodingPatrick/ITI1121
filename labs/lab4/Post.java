import java.util.Calendar;
import java.util.Date;

public class Post implements Likeable, Comparable<Post> {

    protected int likes;
    private Date timeStamp;
    private String userName;

    public Post(String userName) {
      // Your code here
      this.userName = userName;
      this.likes = 0;
      timeStamp = Calendar.getInstance().getTime();
      this.timeStamp = timeStamp;
    }

    public String getUserName() {
	     return userName;
    }

    public Date getTimeStamp() {
	     return timeStamp;
    }

    // Implement the methods required by the interface Likeable.
    // This file will not compile unless they are present with the correct name and signature.
    public void like(){
      likes = likes + 1;
    }

    public int getLikes(){
      return likes;
    }

    public String toString() {
    	String str = new String();
    	str = getClass().getName() + ": " + timeStamp + ", " + userName + ", likes = " + likes;
    	return  str;
    }

  	public int compareTo(Post other){
  		// Your code here.
      return this.timeStamp.compareTo(other.timeStamp);
  	}

  	public boolean isPopular(){
  		// Your code here.
      if(likes > 100){
        return true;
      }
      else{
        return false;
      }
  	}
}
