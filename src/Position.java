public class Position {
    public int getC(){
        return column;
    }

    public void setColumn(int column){
        this.column = column;
    }

    public int getR(){
        return row;
    }

    public void setRow(int column){
        this.row = row;
    }

    int column;
    int row;

    public Position(int row, int column){
        this.column = column;
        this.row = row;
    }
}
