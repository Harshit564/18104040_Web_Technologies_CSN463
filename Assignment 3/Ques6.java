import java.util.Scanner;

class Question6 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int arr[][] = new int[row][];
        for(int i = 0; i < row; i++){
            int col = sc.nextInt();
            for(int j = 0; j < col; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }  

        sc.close();
    }
}
