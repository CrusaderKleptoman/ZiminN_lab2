import java.util.Scanner;

public class TaskMatrix {

    private int[][] matrix;

    TaskMatrix()
    {
        this.matrix = new int[1][1];
    }
    TaskMatrix(int rows, int columns) {this.matrix = new int[rows][columns];}
    TaskMatrix(int[][] matrix) {this.matrix = matrix;}

    public void setElemMatrix(int elemMatrix, int rows, int columns) {this.matrix[rows][columns] = elemMatrix;}

    private int getRow(){return matrix.length;}
    private int getColumns(int n){return matrix[n].length;}
    private int getElem(int n, int m){return matrix[n][m];}

    public void writeMatrix()
    {
        for (int i = 0; i < getRow(); i++) {
            for (int j = 0; j < getColumns(i); j++) {
                System.out.print(getElem(i, j) + "\t");
            }
            System.out.println();
        }
    }

    public void getUpdMatr() {
        int sum = 0;

        for (int i = 0; i < getRow(); i++) {
            for (int j = 0; j < getColumns(i); j++) {
                sum += getElem(i, j);
            }
        }

        for (int i = 0; i < getRow(); i++) {
            for (int j = 0; j < getColumns(i); j++) {
                this.matrix[i][j] = getElem(i, j) * sum;
            }
        }
    }

    public void delZeroElem() {
        int[][] newMatrix = new int[getRow()][];
        int count;
        for (int i = 0; i < getRow(); i++) {
            count = 0;
            for (int j = 0; j < getColumns(i); j++) {
                if (this.matrix[i][j] != 0) {
                    count++;
                }
            }
            newMatrix[i] = new int[count];
        }

        for (int i = 0; i < getRow(); i++) {
            count = 0;
            for (int j = 0; j < getColumns(i); j++) {
                if (this.matrix[i][j] != 0) {
                    newMatrix[i][count] = matrix[i][j];
                    count++;
                }

            }
        }

        this.matrix = newMatrix;
    }

    public void getOneDimMatr() {
        int count = 0;
        for (int i = 0; i < getRow(); i++) {
            for (int j = 0; j < getColumns(i); j++) {
                count++;
            }
        }

        int[][] oneDimensionMatrix = new int[1][count];

        count = 0;
        for (int i = 0; i < getRow(); i++) {
            for (int j = 0; j < getColumns(i); j++) {
                oneDimensionMatrix[0][count] = this.matrix[i][j];
                count++;
            }
        }
        for (int i = 0; i < oneDimensionMatrix[0].length - 1; i++) {
            for (int j = oneDimensionMatrix[0].length - 1; j > i; j--) {
                if (oneDimensionMatrix[0][j - 1] > oneDimensionMatrix[0][j])
                {
                    int swap = oneDimensionMatrix[0][j - 1];
                    oneDimensionMatrix[0][j - 1] = oneDimensionMatrix[0][j];
                    oneDimensionMatrix[0][j] = swap;
                }
            }
        }


        this.matrix = oneDimensionMatrix;
    }
}
