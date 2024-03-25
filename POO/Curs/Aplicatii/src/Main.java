// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static int minFallingPathSum(int[][] matrix) throws Exception {

        if (matrix.length != matrix[0].length) throw new Exception("NU E MATRICE PATRATICA");
       if (matrix.length < 1 || matrix.length > 100) throw new Exception("1<=n<=100");
       for(int i=0;i<matrix.length;i++)
           for(int j =0;j<matrix.length;j++)
               if(matrix[i][j]<-100 || matrix[i][j]>100)throw new Exception("-100 <= matrix[i][j] <= 100");

       int sum = 0;
        int col = 0;
        int min =0;
        do {
            min = matrix[0][col];
            //pentru misjloc
            for (int i = 1; i < matrix.length; i++) {
                int n;
                if (col >= 1 && col <= (matrix.length - 2)) {
                     n = matrix[i][col - 1];
                    if (n > matrix[i][col])
                        n = matrix[i][col];
                    else if (n > matrix[i][col + 1])
                        n = matrix[i][col + 1];

                    min += n;

                } else if (col == 0) {
                    n = matrix[i][col];
                    if (n > matrix[i][col + 1])
                        n = matrix[i][col + 1];
                    min += n;
                } else if (col == (matrix.length - 1)) {
                    n = matrix[i][col];
                    if (n > matrix[i][col - 1])
                        n = matrix[i][col - 1];
                    min += n;
                }

            }


            if (col == 0 || sum > min)
                sum = min;
            col++;
        } while (col <matrix.length);

        return sum;
    }

    public static void main(String[] args) {
        try { int[][]matrix = {{-19,57},{-40,-5}};
            int[][]matrix1={{2,1,2},{6,5,4},{7,8,9}};
            System.out.println(minFallingPathSum(matrix1));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
