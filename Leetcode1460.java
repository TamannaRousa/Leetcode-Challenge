import java.util.Arrays;

public class Leetcode1460 {
        public boolean canBeEqual(int[] target, int[] arr) {
      Arrays.sort(target);
      Arrays.sort(arr);
      for(int i=0;i<target.length;i++){
          if(arr[i]!=target[i]){
          return false; 
          }
      }
        return true;
    }

}
