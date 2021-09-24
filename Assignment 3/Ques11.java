class Question11 {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int x=(arr[0][0] * (arr[1][1] * arr[2][2]
                       - arr[1][2] * arr[2][1]));
        int y=(arr[0][1] * (arr[1][0] * arr[2][2]
                       - arr[1][2] * arr[2][0]));
        int z=(arr[0][2] * (arr[1][0] * arr[2][1]
                       - arr[1][1] * arr[2][0]));
        int determinant= x - y + z;
        System.out.println("Determinant of matrix is: " + determinant);
    }
}
