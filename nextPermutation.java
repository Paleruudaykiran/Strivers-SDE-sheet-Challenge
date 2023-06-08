public class nextPermutation {
    public static void swap(ArrayList<Integer> nums,int i,int j) {
		int temp = nums.get(i);
		nums.set(i,nums.get(j));
		nums.set(j,temp);
	}
	public static void reverse(ArrayList<Integer> nums,int i,int j) {
		while(i < j) { 
			swap(nums,i,j);
			i++;
			j--;
		}
	} 
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) 
	{
		int length = permutation.size();
		int i;
		for(i=length-2;i>=0;i--) {
			if(permutation.get(i) < permutation.get(i+1)) break;
		}
		if(i==-1) reverse(permutation,0,length-1);
		else {
			int pi = i;
			for(i=length-1;i>pi;i--){
				if(permutation.get(i) > permutation.get(pi)) break;
			}
			int extra = i;
			swap(permutation,pi,extra);
			reverse(permutation,pi+1,length-1);
		}
		return permutation;
	}
}
