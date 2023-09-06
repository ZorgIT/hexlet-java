    public static int getLastWordLength(String phrase) {
        var trimPhrase = phrase.trim().split(" ");
        return trimPhrase[trimPhrase.length-1].length();
    }