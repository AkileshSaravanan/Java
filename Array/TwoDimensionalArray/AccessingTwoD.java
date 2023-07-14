import java.io.*;
import java.util.*;
public class AccessingTwoD
{
    public static void main(String args[])
    {
        int[][] arr = { {2,3},
                        {4,0},
                        {9,5}
                      };
        for(int i =0;i<3;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.println("arr["+i+"]["+j+"] = "+arr[i][j]);
            }
        }
    }
}