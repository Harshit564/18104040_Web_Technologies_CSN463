import java.util.*;
import java.util.Scanner;
public class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Paragraph");
        String para = sc.nextLine();
        Vector<String> v = new Vector<String>();
        
        System.out.println("Enter the word that need to be changed");
        Scanner sc1 = new Scanner(System.in);
        String oldWord = sc1.nextLine();
        v.add(oldWord);
            
        String output = "";
        for(String word : para.split(" ")){
            if(v.contains(word)){
                String newWord = ""; 
                newWord += word.charAt(0);
                for(int i = 1; i < word.length(); i++){
                    newWord += "*";
                }
                output += newWord;
            }else{
                output += word;
            }
            output += " ";
        }
        System.out.println("Final Paragraph after changes is: ");
        System.out.println(output);
        sc1.close();
        sc.close();
    }
}