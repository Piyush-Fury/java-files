public class add_metrics {
    public static void main(String[] args) {
        //These are the two metrics which have to be added
        int [][] a = {{1,3,4},
                      {2,4,3},
                      {3,4,5}};
                      
        int [][] b = {{1,3,4},
                      {2,4,3},
                      {1,2,4}};

        //this is the array where we will store the results or sum of both of the metrics
        int [][] c = new int [3][3];

        for(int i=0;i<3;i++) // For ROWS
        {
            for(int j=0;j<3;j++) // FOR Columns
            {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j]+"");
            }
            System.out.println();
        }


    }
}
