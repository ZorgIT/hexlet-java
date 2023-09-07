    public static boolean isContinuousSequence(int[] numbers) {
        var numLength = numbers.length;
        if (numLength <= 1) {
            return false;
        }
        for (var i = 0; i < numLength - 1; i++) {
            if (numbers[i] + 1 != numbers[i + 1]) {
                return false;
            }
        }
        return true;
    }