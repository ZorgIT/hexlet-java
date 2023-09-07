    public static int[][] getMirrorMatrix(int[][] matrix) {
        var rowLen = matrix.length;
        var colLen = matrix[0].length;
        var result = matrix;
        for (var row = 0; row < rowLen; row++) {
            for (var col = 0; col < (colLen / 2); col++){
                result[row][colLen-col-1] = matrix[row][col];
            }
        }
        return result;
    }