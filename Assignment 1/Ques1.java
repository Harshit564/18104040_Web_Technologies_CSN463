import java.util.Scanner;
public class Ques1 {
    
    public static int countMatches(String text, String str) {
        int count = 0;
        int sizeOfString = str.length();
        int sizeOfText = text.length();
        
        for(int i = 0; i <= (sizeOfString - sizeOfText); i++){
            int j;
            for(j = 0; j < sizeOfText; j++){
                if (str.charAt(i + j) != text.charAt(j)) {
                    break;
                }
            }
            
            if(j == sizeOfText){
                count++;
                j = 0;
            }
        }
        return count;
    }
 
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input string:");
        String str = sc.nextLine();       
        System.out.println("Enter the substring:");
        String substr = sc.nextLine();       
        System.out.println(countMatches(substr, str)+" substring occurences found");      
        
        sc.close();
    }
}
