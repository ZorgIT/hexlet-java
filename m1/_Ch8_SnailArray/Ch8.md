    public static int[] buildSnailPath(int[][] matrix) {
        var wideBound = matrix.length;
        if (wideBound == 0) {
            return new int[0];
        }
        var heightBound = matrix[0].length;
        var elementCounts = wideBound * heightBound;
        int[] result = new int[elementCounts];
        var k = 0;

        var leftBound = 0;
        var rightBound = heightBound - 1;
        var upperBound = 0;
        var lowerBound = wideBound - 1;

        while (k < elementCounts) {
            // Move right
            for (int j = leftBound; j <= rightBound && k < elementCounts; j++) {
                result[k++] = matrix[upperBound][j];
            }
            upperBound++;

            // Move down
            for (int i = upperBound; i <= lowerBound && k < elementCounts; i++) {
                result[k++] = matrix[i][rightBound];
            }
            rightBound--;

            // Move left
            for (int j = rightBound; j >= leftBound && k < elementCounts; j--) {
                result[k++] = matrix[lowerBound][j];
            }
            lowerBound--;

            // Move up
            for (int i = lowerBound; i >= upperBound && k < elementCounts; i--) {
                result[k++] = matrix[i][leftBound];
            }
            leftBound++;
        }

        return result;
    }