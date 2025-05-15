import java.util.Scanner;
class Matrix{
    private int [][] data1,data2,sum;
    public Matrix()
    {
        data1 = new int[3][3];
        data2 = new int[3][3];
        sum= new int[3][3];
    }
    public void setMatrix()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of 1st 3x3 matrix: ");
        for (int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                data1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements of 2nd 3x3 matrix: ");
        for (int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                data2[i][j]=sc.nextInt();
            }
        }
    }
    public int[][] getMatrixSum()
    {
        
        for (int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                
                
                    sum[i][j] = data1[i][j]+data2[i][j];
                
            }
        }
        return sum;
    }
    public void displaySum() {
        System.out.println("Sum of the two matrices is: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

    }
}
public class MatrixAdd {
    public static void main(String[] args) {
        Matrix m = new Matrix();
        m.setMatrix();
        m.getMatrixSum();
        m.displaySum();
    }
}
