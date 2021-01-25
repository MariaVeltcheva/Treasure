//package com.company;

import java.util.*;

public class Treasure {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        int[][] values = new int[num][num];
        int k=1;
        for(int i=0; i <num; i++) {
            for(int j=0; j < k; j++) {
                values[i][j] = s.nextInt();
            }
            k++;
        }

        int finalAns = maxSum(values,num-1,num-1);
        System.out.println(finalAns);

        //for (int i = values.length-1; i>=0; i--)
        //    System.out.println(Arrays.toString(values[i]));

    }

    static int maxSum(int tri[][], int m, int n)
    {
        for (int i = m - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                if (tri[i + 1][j] > tri[i + 1][j + 1])
                    tri[i][j] += tri[i + 1][j];
                else
                    tri[i][j] += tri[i + 1][j + 1];
            }
        }

        return tri[0][0];
    }

}
