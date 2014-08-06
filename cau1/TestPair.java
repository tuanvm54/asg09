
class Pair<T> 
   { 
      public Pair() { first = null; second = null; } 
      public Pair(T first, T second) 
        { this.first = first; this.second = second; } 

      public T getFirst() { return first; } 
      public T getSecond() { return second; }
      
      public void setFirst(T newValue) { first = newValue; } 
      public void setSecond(T newValue) { second = newValue; } 

      private T first; 
      private T second; 
      
      
      public String toString()
      	{ 
           return "(" + first + ", " + second + ")"; 
           	}
   } 

              
              
public class TestPair {
	
	
	public static void main(String[] args) {
		
		Pair<String> mm = new Pair<String> ("1st", "2nd"); 
              System.out.println(mm.getFirst() + "," + mm.getSecond()); 
        Pair<Integer>mn = new Pair<Integer> (1, 2); 
              System.out.println(mn.getFirst() + "," + mn.getSecond()); 
        
	}	
}
