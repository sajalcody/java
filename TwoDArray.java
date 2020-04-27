// package java;

class TwoDArray {
    public static void main(String[] args){
        int arr[][] = new int[5][5]; //=> int[][] arr = new int[5][5]
        int i,j,k=0;
        for(i=0;i<5;i++){
            for(j=0;j<5;j++)
            arr[i][j]=k++;
        }
        // for(i=0;i<5;i++){
        //     for(j=0;j<5;j++)
        //         System.out.print(arr[i][j] + " ");
        //     System.out.println();
        // }
        // System.out.println();
        // for(i=0;i<5;i++){
        //     for(j=0;j<6;j++) // No compile error but runtime exception: java.lang.ArrayIndexOutOfBoundsException:
        //         System.out.print(arr[i][j] + " ");
        //     System.out.println();
        // }
        int ar[][]={{-1,-2},{1,2}};
        for(i=0;i<2;i++){
            for(j=0;j<2;j++)
                System.out.print(ar[i][j] + " ");
            System.out.println();
        }

        int arz[][]=new int[5][];
        arz[0]=new int[1];
        arz[1]=new int[2];
        arz[2]=new int[3];
        arz[3]=new int[4];
        arz[4]=new int[5];
        k=0;
        for(i=0;i<5;i++){
            for(j=0;j<i+1;j++)
            arr[i][j]=k++;
        }
        for(i=0;i<5;i++){
            for(j=0;j<i+1;j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}