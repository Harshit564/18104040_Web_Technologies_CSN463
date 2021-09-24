import java.util.Scanner;
class Question2 {
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
        int[] array = new int[20];  
        for(int i = 0; i < 20; i++)  
            array[i] = sc.nextInt();
        System.out.println(array[1]);      
        sc.close();    
    }
}
