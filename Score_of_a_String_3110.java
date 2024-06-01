public class Score_of_a_String_3110 {
        public static int scoreOfString(String s) {
            int score = 0;
            for (int i = 1; i < s.length(); i++) {
                score += Math.abs(s.charAt(i) - s.charAt(i - 1));
            }
            return score;
        }
    }

