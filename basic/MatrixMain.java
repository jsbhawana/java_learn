import java.util.Scanner;
class Matrix{
    private int [][] data;
    public Matrix()
    {
        data = new int[3][3];
    }
    public void setMatrix()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of 3x3 matrix: ");
        for (int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                data[i][j]=sc.nextInt();
            }
        }
    }
    public int getDiagonalSum()
    {
        int sum=0;
        for (int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(i==j)
                {
                    sum+=data[i][j];
                }
            }
        }
        return sum;
    }
}
public class MatrixMain {
    public static void main(String[] args) {
        Matrix m = new Matrix();
        m.setMatrix();
        System.out.println("Sum of diagonal elements is: " + m.getDiagonalSum());
    }
}
