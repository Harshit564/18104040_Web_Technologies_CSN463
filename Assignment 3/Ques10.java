class Question10 {

    static int  MAX = 100;
     static void transpose(int mat[][], int tr[][], int N){
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                tr[i][j] = mat[j][i];
    }
     
    static boolean isSymmetric(int mat[][], int N){
        int tr[][] = new int[N][MAX];
        transpose(mat, tr, N);
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                if (mat[i][j] != tr[i][j])
                    return false;
        return true;
    }

    static boolean isSkewSymmetric(int mat[][], int N) {
        int tr[][] = new int[N][MAX];
        transpose(mat, tr, N); 
        for (int i = 0; i < N; i++) 
            for (int j = 0; j < N; j++) 
                if (mat[i][j] != -tr[i][j]) 
                    return false; 
        return true; 
    } 

    public static void main(String[] args) { 
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        if(isSymmetric(arr, arr.length)){
            System.out.println("Matrix is Symmetric");
        } else if(isSkewSymmetric(arr, arr.length)){
            System.out.println("Matrix is Skew-Symmetric");
        } else {
            System.out.println("Matrix is neither Skew-Symmetric nor Symmetric");
        }
    }
}
