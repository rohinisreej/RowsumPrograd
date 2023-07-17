import java .util.Scanner;
class Rowsum{
    public static void rowsum(int[][] array,int n,int m)
    {
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=0;j<m;j++)
            {
                sum+=array[i][j];
            }
            System.out.println(sum);
        }
    }

}
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the row: ");
        int row=scanner.nextInt();
        System.out.println("Enter the col: ");
        int col=scanner.nextInt();
        System.out.println("Enter the values: ");
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        Rowsum rs=new Rowsum();
        rs.rowsum(arr,row,col);

    }
}