package bradfordMock;

public interface WordTool {
	 /**
     * The countLetters method should count the number of times a given character
     * exists with a STring and return the result
     *
     * @param word the String to be searched
     * @param c the character to be found within the String
     * @return the number of times c exists within word
     */ 
    public int countLetters(String word, char c);

    /**
     * The sameLength method should check if two Strings have the same length
     *
     * @param x the first String
     * @param y the second String
     * @return true if the Strings have the same length, false otherwise
     */
    public boolean sameLength(String x, String y);
}
