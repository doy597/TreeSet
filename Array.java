import java.util.TreeSet;
import java.util.Iterator;

class Array{
  Array(){
      TreeSet a;
      a = new TreeSet();
      a.add("dog");
      a.add("cat");
      a.add("dog");
      a.add("rabbit");
      a.add("cat");

      /** get‚¹‚¸Iterator‚Åˆ— */
      Iterator it;
      it = a.iterator();
      while(it.hasNext()){
        System.out.println(it.next());
      }
  }
  public static void main(String args[]){
      new Array();
  } 
}