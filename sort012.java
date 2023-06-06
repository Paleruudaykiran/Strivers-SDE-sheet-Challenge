class Solution 
{
    public static void sort012(int[] arr)
    {
        int z,o,t,i;
        z=o=t=0;
        for(int x:arr){
            if(x == 0) z++;
            if(x == 1) o++;
            if(x == 2) t++;
        }
        i=0;
        for(int j=0;j<z;j++) arr[i++] = 0;
        for(int j=0;j<o;j++) arr[i++] = 1;
        for(int j=0;j<t;j++) arr[i++] = 2;
    }
}
