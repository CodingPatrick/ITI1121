import java.util.*;

public class Dictionary implements Map<String, Integer> {

    private final static int INITIAL_CAPACITY = 10;
    private final static int INCREMENT = 5;
    private int count;

    private Pair[] elems;

    public int getCount() {
      return count;
    }

    public int getCapacity() {
      return elems.length;
    }

    public Dictionary() {
        /* Your code here */
        elems = new Pair[INITIAL_CAPACITY];
        count = 0;
    }

    @Override
    public void put(String key, Integer value) {

        if (key == null || value == null) {
            throw new NullPointerException("key or value is null");
        }
        if (count == elems.length) {
            increaseCapacity();
        }

        elems[count] = new Pair(key, value);
        count++;
    }

    private void increaseCapacity() {
        /* Your code here.  Use this in put() where necessary. */
        Pair[] newList = new Pair[this.getCapacity() + INCREMENT];
        for( int i = 0; i < this.getCapacity(); i++){
          newList[i] = elems[i];
        }
        // copying the new list into elems
        // elems now has an increased capacity of 5
        elems = newList;
    }

    @Override
    public boolean contains(String key) {
        /* Your code here. */

        if (key == null) {
            throw new NullPointerException("key is null");
        }

        for(int i = count-1; i>=0; i--) {
          if(elems[i].getKey().equals(key)){
            return true;           
          }
        }
        return false;
    }

    @Override
    public Integer get(String key) {
        /* Your code here. */

        if (key == null) {
            throw new NullPointerException("key is null");
        }

        for(int i = count-1; i>=0; i--) {
          if(elems[i].getKey().equals(key)){
            return elems[i].getValue();
          }
        }
        throw new NoSuchElementException();
        // return -1;
    }

    @Override
    public void replace(String key, Integer value) {
        /* Your code here. */
        if(key == null || value == null){
          throw new NullPointerException("key or value is null");
        }

        for(int i = count-1; i>=0; i--){
          if (elems[i].getKey().equals(key)){
                elems[i].setValue(value);
            }
        }
        throw new NoSuchElementException();
    }

    @Override
    public Integer remove(String key) {
        /* Your code here. */
        if(key == null){
            throw new NullPointerException("key is null");
        }
        int removed = 0;
        for(int i = count-1; i>=0; i--){
          if (elems[i].getKey().equals(key)){
            removed = elems[i].getValue();
            elems[i].setValue(null);
            count = count -1;
            return removed;
          }
        }
        throw new NoSuchElementException();
    }

    @Override
    public String toString() {
      String res;
      res = "Dictionary: {elems = [";
      for (int i = count-1; i >= 0 ; i--) {
          res += elems[i];
          if(i > 0) {
              res += ", ";
          }
      }
      return res +"]}";
    }

}