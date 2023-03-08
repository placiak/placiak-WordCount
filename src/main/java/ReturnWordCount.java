
public class ReturnWordCount {
    /**
     * @param in A String representing a sentence, with words delineated by spaces.
     * @return return the amount of words in a string.
     */
    public int count(String in){

        int counter = 0;
        char target = ' ';

        for(int i = 0; i < in.length(); i++){

            if(in.charAt(i) == target){

                counter++;

                //why can't I test...

            }

        }
        return counter + 1;
    }
}
