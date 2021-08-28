import java.util.*;

public class Ques4 {
    
    static void isAnagram(String string1, String string2) { 
        String s1 = string1.replaceAll("\\s", "");  
        String s2 = string2.replaceAll("\\s", "");
        boolean check = true;
        if(s1.length() != s2.length()){
            check = false;
        } else {
            char[] s1Array = s1.toLowerCase().toCharArray();
            char[] s2Array = s2.toLowerCase().toCharArray();
            Arrays.sort(s1Array);
            Arrays.sort(s2Array);
            check = Arrays.equals(s1Array, s2Array);
        }
        
        if(check){
            System.out.println("Strings are anagrams of each other");
        } else {
            System.out.println("Strings are not anagrams of each other");
        }
    }
    
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String string1 = sc.nextLine();
        System.out.println("Enter the second string:");
        String string2 = sc.nextLine();
        
        isAnagram(string1, string2);
        sc.close();
    }  
}
