public class powerTwo {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a value for N as a command-line argument.");
            return;
        }

        try {
            int N = Integer.parseInt(args[0]);
            if (N <= 0 || N > 31) {
                System.out.println("Enter a number between 1 and 31.");
                return;
            }
            for (int i = 0; i <= N; i++) {
                System.out.println("2^" + i + " = " + (int) Math.pow(2, i));
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide an integer value for N.");
        }
    }
}