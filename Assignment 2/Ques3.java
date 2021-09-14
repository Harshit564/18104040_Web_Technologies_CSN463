import java.util.Scanner;
public class Ques3 {
    public static String stringSorter(String s){
        char ch[] =  s.toCharArray();
        for(int i = 0; i < ch.length; i++){
            for(int j = i; j < ch.length;j++){
                if(j > i){
                    if((int)ch[i] > (int)ch[j]){
                        char c = ch[i];
                        ch[i] = ch[j];
                        ch[j] = c;
                    }
                }
            }
        }
        String sortedString = "";
        for (int i = 0; i < ch.length; i++) {
            sortedString += ch[i];
        }
        return sortedString;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        String sortedString = stringSorter(str);
        System.out.println("Sorted string is: " + sortedString);
        sc.close();
    }
}