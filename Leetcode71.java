public class Leetcode71 {
    public int numSteps(String s) {
        int count = 0;
        int carry = 0; // To track the carry when adding 1
        for (int i = s.length() - 1; i > 0; i--) {
            int digit = s.charAt(i) - '0' + carry;
            if (digit == 1) {
                carry = 1;
                count += 2; // Adding 1 and then right shift (equivalent to multiply by 2)
            } else {
                count++; // Right shift (equivalent to divide by 2)
            }
        }
        // If there's a carry left at the end, one more step is needed
        return count + carry;
    }
}

