package string;

public class MaxRepeatingSubString {
    public static void main(String[] args) {
        String sequence = "aaabaaaabaaabaaaabaaaabaaaabaaaaba";
        String word = "aaaba";
        int count = 0;

        StringBuilder str = new StringBuilder(word);
        while(sequence.contains(str)){
            count++;
            str.append(word);
        }
        System.out.println(count);
    }
}
