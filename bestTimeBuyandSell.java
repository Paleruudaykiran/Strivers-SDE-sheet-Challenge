import java.util.*;
public class bestTimeBuyandSell {
    public static int maximumProfit(ArrayList<Integer> prices){
        // Write your code here.
        int pf = 0;
        int mini = prices.get(0);
        for(int i=0;i<prices.size();i++) {
            if(prices.get(i)-mini > pf) {
                pf = prices.get(i)-mini;
            }
            if(prices.get(i) < mini) mini = prices.get(i);
        }
        return pf;
}
