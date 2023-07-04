package programs;

public class ValueOf {  
    public static void main(String[] args) {          
        // Boolean to String  
        boolean bool = true;    
        boolean bool1 = false;    
        String s1 = String.valueOf(bool);    
        String s2 = String.valueOf(bool1);  
        System.out.println(s1);  
        System.out.println(s2);  
    }  
}  