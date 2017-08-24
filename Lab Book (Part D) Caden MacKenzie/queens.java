import java.util.*;
import java.io.*;

public class queens{

    private static int counter;
    private static int[] col;
    private static int n;
    private static int combos;
    private static int visited;
    
    public static void calling(int n){
        int counter = 0;
        combos = 0;
        visited = 0;
        long mceSum = 0;
        System.out.println(n+" Queens:");
        col = new int[n];
        queen(-1,n);
        int nodeTotal = ((int)(Math.pow(n, n+1))-1)/(n-1)-1;
        for(int k = 0; k<1000000; k++){
            Random r = new Random();
            long monteE = estimate(n, 0, r);
            //System.out.println(monteE);
            //mceSum = mceSum + ((long)(Math.pow(monteE, monteE))-1)/(monteE-1)-1;
            mceSum = mceSum + ((long)(Math.pow(n, monteE+1))-1)/(n-1);
            //counter++;
            
        }
        System.out.println("Monte Carlo Estimate: " + mceSum/1000000);
        
        
        //System.out.println("Monte Carlo Estimate: " + monteE);
        System.out.println("Combos: " + combos);
        System.out.println("Nodes visisted: " + visited);
        System.out.println("Total Nodes: " + nodeTotal);
    }
    
    public static void queen(int i, int n){
        int j;
        if(promising(i)){
            visited++;
            if(i==n-1){
                //cout << col[1] through col[n];
                combos++;
            }
            else{
                for(j=0; j<n; j++){
                    col[i+1] = j;
                    queen(i+1, n);
                }
            }
        }
    }
    
    public static boolean promising(int i){
        boolean switching = true;
        //switching = true;
        int k = 0;
        while (k < i && switching){
            if ( (col[i] == col[k]) || (Math.abs(col[i] - col[k])) == i-k){
                switching = false;
            }
            k++;
        }
        return switching;
    
    }
    
    /*
    public static int estimate_n_queens(int n){
        int i = 0;
        int j;
        int numnodes = 1;
        int m = 1;
        int mprod = 1;
        List<Integer> promChildren = new ArrayList<Integer>();
        
        while (m != 0 && i !=n){
            mprod = mprod * m;
            numnodes = numnodes +mprod *n;
            i++;
            m = 0;
            promChildren.clear();
            for(j = 0; j<n; j++){
                col[i] = j;
                if(promising(i)){
                    m++;
                    promChildren.add(j);
                }
            }
            if(m != 0){
                Random r = new Random();
                j = r.nextInt(promChildren.size());
                col[i] = j;
            }
        }
        return numnodes;
    }
    */
    
    public static long estimate(int n, int row, Random r){
        
        int j = r.nextInt(n);
        
        col[row] = j;
        if(promising(row)){
            if(row == n-1){
                return row;
            }
            else{
                long value = estimate(n, row+1, r);
                return value;
            }
        }
        return row;
    }
    
    static public void main(String[] args){
        calling(4);
        calling(5);
        calling(6);
        calling(7);
        calling(8);
        calling(9);
        calling(10);
    }
}