package P12;

public class GraphMatriks06 {
    int vertex;
    int[][] matriks;

    public GraphMatriks06(int v) {
        vertex = v;
        matriks = new int[v][v];
    }

    public void makeEdge(int asal, int tujuan, int jarak) {
        matriks[asal][tujuan] = jarak;
    }

    public void removeEdge(int asal, int tujuan) {
        matriks[asal][tujuan] = 0;
        //memperbaiki dari -1 menjadi 0;

    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {

            System.out.print("Gedung " + (char) ('A' + i) + ": ");
            for (int j = 0; j < vertex; j++) {
                if (matriks[i][j] != -1) {
                    System.out.print((char) ('A' + j) + " (" + matriks[i][j] + "m), ");
                }
            }
            System.out.println();
        }
    }
    
}
