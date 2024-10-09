public class Successors {

    public static Position findPosition(int c, int[][] arr){
        int column = 0;
        int row = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if (c == arr[i][j]){
                    column = j;
                    row = i;
                    Position position = new Position(row, column);
                    return position;
                }
            }
        }
        return null;
    }
    public static Position[][] getSuccessorArray(int [][] arr) {
        Position[][] positions = new Position[arr.length][arr[1].length];
        for(int i=0; i<arr.length;i++) {
            for (int j = 0; j < arr[0].length; j++) {
                int f = arr[i][j] +1;
                Position pos = findPosition(f,arr);
                positions[i][j] = pos;
            }
        }

        return positions;

    }
}
