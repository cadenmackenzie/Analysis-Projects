public class Coloring{
    
    private int[] colors;
    private int numOfColors;
    private int[][] graph;
    private int ver;
    
    public void graphColor(int[][] graph1, int numColors){
        ver = graph1.length;
        colors = new int[ver];
        numOfColors = numColors;
        graph = graph1;
        try{
            m_coloring(0);
        }
        catch (Exception e){
            showSolution();
        }
    }
    
    public void m_coloring (int v){
        
        for (int i = 1; i <= numOfColors; i++){
            if (promising(v, i)){
                colors[v] = i;
                m_coloring(v+1);
            }
        }
        
    }
    
    public boolean promising(int v, int c){
        
        boolean switchy;
        switchy = true;
        for (int i = 0; i<ver; i++){
            if(graph[v][i] == 1 && c == colors[i]){
                return false;
            }
        }
        return true;
    }
    
    public void showSolution(){
        System.out.println("Solution for " + ver + " vertices: ");
        for (int i = 0; i< ver; i++){
            System.out.print(colors[i] +" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args){
        
        Coloring col = new Coloring();
        int i;
        int j;
        int V = 3;
        int numColors = 10;
        
        //complete
        int[][] graph = new int[][]{
            {0, 1, 1},
            {1, 0, 1},
            {1, 1, 0}
        };
        System.out.println("Graph Matrix: ");
        for (i = 0; i<V; i++){
            for(j = 0; j<V; j++){
                System.out.print(graph[i][j]);
            }
        System.out.println();
        }
        col.graphColor(graph, numColors);

        //complete
        V = 4;
        int[][] graph2 = new int[][]{
            {0, 1, 1, 1},
            {1, 0, 1, 1},
            {1, 1, 0, 1},
            {1, 1, 1, 0}
        };
        System.out.println("Graph Matrix: ");
        for (i = 0; i<V; i++){
            for(j = 0; j<V; j++){
                System.out.print(graph2[i][j]);
            }
        System.out.println();
        }
        col.graphColor(graph2, numColors);
        
        //complete
        V = 5;
        int[][] graph3 = new int[][]{
            {0, 1, 1, 1, 1},
            {1, 0, 1, 1, 1},
            {1, 1, 0, 1, 1},
            {1, 1, 1, 0, 1},
            {1, 1, 1, 1, 0}
        };
        System.out.println("Graph Matrix: ");
        for (i = 0; i<V; i++){
            for(j = 0; j<V; j++){
                System.out.print(graph3[i][j]);
            }
        System.out.println();
        }
        col.graphColor(graph3, numColors);
        

        //complete
        V = 6;
        int[][] graph5 = new int[][]{
            {0, 1, 1, 1, 1, 1},
            {1, 0, 1, 1, 1, 1},
            {1, 1, 0, 1, 1, 1},
            {1, 1, 1, 0, 1, 1},
            {1, 1, 1, 1, 0, 1},
            {1, 1, 1, 1, 1, 0}
        };
        System.out.println("Graph Matrix: ");
        for (i = 0; i<V; i++){
            for(j = 0; j<V; j++){
                System.out.print(graph5[i][j]);
            }
        System.out.println();
        }
        col.graphColor(graph5, numColors);
        
        //complete
        V = 7;
        int[][] graph7 = new int[][]{
            {0, 1, 1, 1, 1, 1, 1},
            {1, 0, 1, 1, 1, 1, 1},
            {1, 1, 0, 1, 1, 1, 1},
            {1, 1, 1, 0, 1, 1, 1},
            {1, 1, 1, 1, 0, 1, 1},
            {1, 1, 1, 1, 1, 0, 1},
            {1, 1, 1, 1, 1, 1, 0}
        };
        System.out.println("Graph Matrix: ");
        for (i = 0; i<V; i++){
            for(j = 0; j<V; j++){
                System.out.print(graph7[i][j]);
            }
        System.out.println();
        }
        col.graphColor(graph7, numColors);
        

        
        
        
        
        
        V = 5;
        int[][] graph4 = new int[][]{
            {0, 1, 0, 0, 1},
            {1, 0, 1, 1, 0},
            {0, 1, 0, 1, 0},
            {0, 1, 1, 0, 1},
            {1, 0, 0, 1, 0}
        };
        System.out.println("Graph Matrix: ");
        for (i = 0; i<V; i++){
            for(j = 0; j<V; j++){
                System.out.print(graph4[i][j]);
            }
        System.out.println();
        }
        col.graphColor(graph4, numColors);
        
        //complete graph
        V = 6;
        int[][] graph6 = new int[][]{
            {0, 1, 0, 0, 0, 1},
            {1, 0, 1, 0, 1, 0},
            {0, 1, 0, 1, 0, 0},
            {0, 0, 1, 0, 1, 0},
            {0, 1, 0, 1, 0, 1},
            {1, 0, 0, 0, 1, 0}
        };
        System.out.println("Graph Matrix: ");
        for (i = 0; i<V; i++){
            for(j = 0; j<V; j++){
                System.out.print(graph6[i][j]);
            }
        System.out.println();
        }
        col.graphColor(graph6, numColors);
        
        V = 7;
        int[][] graph8 = new int[][]{
            {0, 1, 0, 0, 0, 0, 1},
            {1, 0, 1, 1, 0, 0, 1},
            {0, 1, 0, 1, 0, 0, 0},
            {0, 1, 1, 0, 1, 0, 1},
            {0, 0, 0, 1, 0, 1, 0},
            {0, 0, 0, 0, 1, 0, 1},
            {1, 1, 0, 1, 0, 1, 0}
        };
        System.out.println("Graph Matrix: ");
        for (i = 0; i<V; i++){
            for(j = 0; j<V; j++){
                System.out.print(graph8[i][j]);
            }
        System.out.println();
        }
        col.graphColor(graph8, numColors);
        
        //i couldnt figure out how to get the randomized
        //graphs to be even so I manually tested.
        //int[][] graph = new int[V][V];
        //System.out.println("Graph Matrix: ");
        /*
        for (int i = 0; i<V; i++){
            for(int j=0; j<V; j++){
                if(i==j){
                    graph[i][j] = 0;
                    //System.out.print(graph[i][j]);
                }
                else{
                    graph[i][j] = (int)(2*Math.random());
                    graph[j][i] = graph[i][j];
                    //System.out.print(graph[i][j]);
                }
                System.out.print(graph[i][j]);
            }
        System.out.println();
        }
        */
        
        
        

    }
}

