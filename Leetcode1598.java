public class Leetcode1598 {
        public int minOperations(String[] logs) {
            int folderDepth = 0;
            
            for(String currentOperation : logs){
                if(currentOperation.equals("../")){
                   folderDepth = Math.max(0,folderDepth-1);
                }
                //not remian in same folder or wanna move towards
                else if(!currentOperation.equals("./")){
                    folderDepth++;
                }
            }
            return folderDepth;
        }
    }
