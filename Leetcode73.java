public class Leetcode73 {
    public int[] singleNumber(int[] nums) {
        int[] nums1 = new int[2];
        int count=0;
        for(int i=0;i<nums.length;i++){
            boolean element = false;
            for(int j=0;j<nums.length;j++){
                  if(i!=j && nums[i]==nums[j]){
                    element = true;
                    break;
                }
            }
            if(!element){
                nums1[count] = nums[i];
                count++;
            }
        }
        return nums1;
    }
}
