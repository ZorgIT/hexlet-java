    public static String[][] chunk(String[] words, int chunkSize) {
        int numOfChunks = (int) Math.ceil((double) words.length / chunkSize);
        String[][] chunks = new String[numOfChunks][];

        for (var i = 0; i < numOfChunks; i++) {
            var start = i * chunkSize;
            var length = Math.min(words.length - start, chunkSize);
            chunks[i] = Arrays.copyOfRange(words, start, start + length);
        }
        return chunks;
    }