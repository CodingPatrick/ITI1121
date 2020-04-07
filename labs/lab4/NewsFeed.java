/* *
 * Use static array for NewsFeed
 * with constant MAX_SIZE
 * */

public class NewsFeed {

    private Post[] messages;
    private int size;
    public static final int MAX_SIZE = 25;

    public NewsFeed() {
    	// Your code here.
      this.messages = new Post[MAX_SIZE];
      this.size = 0;
    }

    public void add(Post message) {
      // Your code here.
      if( size < 25 && size != MAX_SIZE){
        messages[size] = message;
        size = size + 1;
      }
    }

    public Post get(int index) {
	     return messages[index];
    }

    public int size() {
	     return size;
    }

	  public void sort(){
			int i, j, argMin;
			Post tmp;
			for (i = 0; i < size - 1; i++) {
				argMin = i;
				for (j = i + 1; j < size(); j++) {
					if (messages[j].compareTo(messages[argMin]) < 0) {
						argMin = j;
					}
				}

  			tmp = messages[argMin];
  			messages[argMin] = messages[i];
  			messages[i] = tmp;
		  }

	  }

  	public NewsFeed getPhotoPost(){
  		// Your code here
      NewsFeed feedOfPics = new NewsFeed();
      for(int i = 0; i < size; i++){
        if( messages[i] instanceof PhotoPost ){
          feedOfPics.add(messages[i]);
        }
      }
      return feedOfPics;
  	}

  	public NewsFeed plus(NewsFeed other){
  	  // Your code here
      NewsFeed newFeed = new NewsFeed();
      for(int i = 0; i < this.size;){
        newFeed.add(this.messages[i]);
        i = i + 1;
      }
      for(int i = 0; i < other.size;){
        newFeed.add(other.messages[i]);
        i = i + 1;
      }
      newFeed.sort();
      return newFeed;
  	}

}
