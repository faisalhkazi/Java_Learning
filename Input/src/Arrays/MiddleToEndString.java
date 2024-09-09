public class MiddleToEndString {

    public static void main(String[] args) {
        String word = "Manchester United";
        int length = word.length();

        // Calculate the midpoint of the string
        int mid = length / 2;

        // Calculate the maximum length of the string for alignment
        int maxLength = length;

        // Print characters starting from the midpoint to the end
        for (int i = mid; i < length; i++) {
            // Calculate the number of spaces to add for center alignment
            int spaces = (maxLength - (i - mid + 1)) / 2;
            
            // Print leading spaces
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }

            // Print characters from the midpoint up to the current position
            for (int j = mid; j <= i; j++) {
                System.out.print(word.charAt(j));
            }

            System.out.println(); // Move to the next line after each iteration
        }
    }
}