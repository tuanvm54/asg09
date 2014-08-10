
class ArrayAlg { 
             public static <T> T printArray(T[] a) 
               {
               	for(int i=0;i<=a.length;i++){
               		System.out.println(a[i]+ " ");
               		}
               	 
               	return a[0];
               		} 
           }               
              
public class ArrayAgl {
	public static void main(String[] args) {
	String[] names = { "One", "Two", "Three","Four" };
	String middle = ArrayAlg.<String>printArray(names); 
	}	
}

















                   
           
           