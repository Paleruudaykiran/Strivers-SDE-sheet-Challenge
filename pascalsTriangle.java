public import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
                 ArrayList<ArrayList<Long>> ans = new ArrayList<ArrayList<Long>>();
				 for(int i=0;i<n;i++) {
					 ArrayList<Long> row = new ArrayList<Long>();
					 for(int j=0;j<=i;j++) {
						 if(j == 0 || j == i) row.add(Long.valueOf(1));
						 else {
                             Long p1 = ans.get(i-1).get(j-1);
							 Long p2 = ans.get(i-1).get(j); 
							 row.add(p1+p2);
						 }
					 }
					 ans.add(row);
				 }
                return ans;
	}
}
