public class Main {
    public static void main(String[] args) {
        int[][] matr = {{1, 2, 3}, {0, 2, 3}};
        TaskMatrix taskMatrix = new TaskMatrix(matr);

        taskMatrix.getUpdMatr();
        taskMatrix.delZeroElem();
        taskMatrix.getOneDimMatr();
        taskMatrix.writeMatrix();

        TaskText taskText = new TaskText("asdwh sawr hhh aa");
        taskText.getNumOfWord();

    }
}