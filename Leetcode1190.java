import java.util.*;
public class Leetcode1190 {
        public String reverseParentheses(String s) {
            Stack<Integer> myStack = new Stack<>();
            StringBuilder result = new StringBuilder();
            
            for(char currChar : s.toCharArray()) {
                if(currChar == '('){
                    //Store as starting index/ush
                     int start = myStack.push(result.length());
                }
                else if(currChar == ')'){
                    //pop elements upto ) at recent top of stack
                     int start = myStack.pop();
                    //reverse
                    reverse(result, start, result.length() - 1);
                }
                else{
                    //append chars
                    result.append(currChar);
                }
            }
            return result.toString();
        }
    
    public void reverse(StringBuilder sb, int start, int end){
        while(start < end){
           char temp = sb.charAt(start);
           sb.setCharAt(start++, sb.charAt(end));
            sb.setCharAt(end--, temp);
        }
      }
    }
