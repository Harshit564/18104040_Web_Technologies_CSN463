import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Ques2 {
    public static int[] countingSort(int[] arr){
        int n = arr.length;
        int freq[] = new int[21];
        for(int i = 0; i < n; i++){
            freq[arr[i]]++;    
        }
        int index[] = new int[21];
        index[0] = freq[0];
        for(int i = 1; i < 20; i++){
            index[i] = freq[i] + index[i-1];
        }
        ArrayList<Integer> O = new ArrayList<Integer>();
        for(int i = 0; i < 21; i++){
            while(freq[i] > 0){
                O.add(i);
                index[i]--;
                freq[i]--;
            }
        }
        for(int i = 0; i < O.size(); i++){
           arr[i] = O.get(i);
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println("Enter the number of elements in the array that you wish to sort");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] inputArray = new int[n];
        System.out.println("Do you want the array elements to be random (Y or N ?)");
        char C = sc.next().charAt(0);
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i < 21; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        if(C == 'Y' || C == 'y'){
            for(int i = 0; i < n; i++){
                inputArray[i] = list.get(i)%21;
            }
        }else{
            System.out.println(("Please enter "+ n +" numbers between 0 and 20 (Numbers can be repeated)"));
            for(int i = 0; i < n; i++){
                int number = sc.nextInt();
                inputArray[i] = number;
            }
        }
        System.out.println("Input array:    ");
        for(int i = 0; i < n; i++){
            System.out.print(inputArray[i]+" ");
        }
        System.out.println(" is to be sorted using Counting Sort");
       int[] outputArray =  countingSort(inputArray);
        System.out.print("Sorted array:   ");
        for(int i = 0; i < n; i++){
            System.out.print(outputArray[i]+" ");
        }
        sc.close();
    }
}