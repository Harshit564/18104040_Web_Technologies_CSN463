import java.util.*;

public class Ques6 {

    static void reArrange(int arr[], int n){
        Arrays.sort(arr) ;
         
        Vector<Integer> v1 = new Vector<Integer>();
        Vector<Integer> v2 = new Vector<Integer>();
     
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0)
                v1.add(arr[i]);
            else
                v2.add(arr[i]);
        }
     
        int index = 0, i = 0, j = 0;
     
        boolean flag = false;
        
        if (arr[0] % 2 == 0)
            flag = true;
     
        while (index < n && index != -1) {
     
            if (flag == true) {
                arr[index] = (int)v1.get(i);
                i++;
                index++;
                flag = !flag;
            } else {
                arr[index] = (int)v2.get(j) ;
                j++ ;
                index++;
                flag = !flag;
            }
        }
        for (i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n]; 
        System.out.println("Enter the elements of the array:"); 
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        reArrange(arr, n);
        sc.close();
    }
}