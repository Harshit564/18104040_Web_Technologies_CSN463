import java.util.Scanner;

class Question7 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int array[] = new int[20];
    
        System.out.println("Enter the number range:");
        int n = sc.nextInt();
        array[0] = -1;
        array[1] = 1;

        System.out.println("FIBONACCI SERIES:");
        for(int k = 2; k <= n+1; k++){
            array[k] = array[k-1] + array[k-2];
            System.out.println(array[k]);
        }
        sc.close();
    }
}