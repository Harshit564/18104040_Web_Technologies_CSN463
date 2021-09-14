public class Ques4 {
    public static void main(String[] args) {
        int n = 1;
        int sum = 1;
        long square = 1;
        int smallestN = 1;
        System.out.println("To find out Smallest n such that sumof(i) equals to n^2, \n1 to n and n is too large to be represented as an Integer");
        while(n > 0){
            if(square == sum){
                smallestN = n;
                System.out.println("Possible value for N: "+smallestN);
            }
            n++;
            sum += n;
            square = n*n;
        }
    }
}