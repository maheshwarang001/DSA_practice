public class Grid {

    public static void main (String sts[]){
        System.out.println(gridway(0,0,3,3));

    }
    public static int gridway(int i , int j , int m , int n){

        if(i == n-1 && j == m-1){
            return 1;
        }
        else if(i==n || j==m){
            return 0;
        }

        int w1 = gridway(i+1,j,m,n);
        int w2 = gridway(i,j+1,m,n);

        return w1+w2;
    }
}
