public class FloodFill {
    public static void main(String args[]){
        int a[][] = {{1,1,1,1,1,1,1,1},
                     {1,1,1,1,1,1,0,0},
                     {1,0,0,1,1,0,1,1},
                     {1,2,2,2,2,0,1,0},
                     {1,1,1,2,2,0,1,0},
                     {1,1,1,2,2,2,2,0},
                     {1,1,1,1,1,2,1,1},
                     {1,1,1,1,1,2,2,1}};
        floodFill(a, 4, 3, 3, 2);
        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<a[0].length;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void floodFill(int a[][],int r,int c,int toFill,int prevfill){
        int rows = a.length;
        int columns = a[0].length;
        if(r>=rows||r<0||c>=columns||c<0){
            return;
        }
        if(a[r][c]!=prevfill){
            return;
        }
        a[r][c] = toFill;
        floodFill(a, r-1, c, toFill, prevfill);
        floodFill(a, r, c-1, toFill, prevfill);
        floodFill(a, r+1, c, toFill, prevfill);
        floodFill(a, r, c+1, toFill, prevfill);
    }

}
