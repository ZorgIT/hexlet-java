    public static int[][] multiply(int[][] matrixA, int[][] matrixB) {
        var rowCountA = matrixA.length;
        var colCountA = matrixA[0].length;
        var colCountB = matrixB[0].length;
        if (rowCountA != colCountB) {
            return new int[0][0];
        }

        var result = new int[rowCountA][colCountB];

        for (var i = 0; i < rowCountA; i++) {
            for (var j = 0; j < colCountB; j++) {
                for (var k = 0; k < colCountA; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }


            }
        }
        return result;
    }