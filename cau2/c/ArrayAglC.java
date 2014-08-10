class ArrayAlg 
 { 
    public static <T extends Comparable> Pair<T> max2max(T[] a) 
   { 
      if (a == null || a.length == 0) return null; 
      T max = a[0];
      T max2 = a[0];
      for (int i = 1; i < (a.length); i++) 
      { 
         if (max.compareTo(a[i]) < 0) max = a[i];
         if (max2.compareTo(a[i]) < 0) max2 = a[i-1];   
      }
      return new Pair<T>(max2, max); 
   } 
 }         
 	
public class ArrayAglC {
public static void main(String[] args) {
           Integer[] words = { 2, 1, 4, 5, 3}; 
           Pair<Integer> mm = ArrayAlg.max2max(words);
           System.out.println("MaxInteger = " + mm.getSecond()); 
           System.out.println("Max2Integer = " + mm.getFirst()); 
           
           
}}