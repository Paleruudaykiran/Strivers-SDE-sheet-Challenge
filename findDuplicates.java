import java.util.ArrayList;
class Solution{
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        // Write your code here.
        int[] freq = new int[n];
        for(Integer x:arr) {
            freq[x]++;
        }
        //System.out.println(Arrays.toString(freq));
        for(int i=0;i<freq.length;i++) {
            if(freq[i] > 1) {
                return i;
            }
        }
        return 1;
    }
}

