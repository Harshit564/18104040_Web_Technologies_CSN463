import java.util.Scanner;
public class Ques6 {
  public static void main(String[] args) {
    System.out.println("Enter the number: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(n >= Integer.MAX_VALUE){
      while(n >= Integer.MAX_VALUE){
        System.out.println("Input to Large. Please enter an Integer less than "+ Integer.MAX_VALUE);
        n = sc.nextInt();
      }      
    }
    if(n <= 0){
      while(n <= 0){
        System.out.println("Wrong input. Please enter a positive Integer");
        n = sc.nextInt();
      }
    }
    sc.close();
    System.out.println("Hailstone sequence of "+ n +" is:");
    System.out.print(n +" ");
    while(n != 1){
        if(n > Integer.MAX_VALUE || n <= 0){
          System.out.println("Current Value Exceeded Maximum Integer value, exiting...");
          break;
        }
        if(n%2 == 0){
            n /= 2;
        }else{
            n *= 3;
            n++;
        }
        System.out.print(n +" ");
    }
  }  
}