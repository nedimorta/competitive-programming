import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	static ArrayList<ArrayList<Integer>> tree = new ArrayList<ArrayList<Integer>>();
	static boolean [] isMarked;
	static int result = 0;
	
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        int M = cin.nextInt();
        isMarked = new boolean[N];
        
        for(int counter = 0; counter < N; counter++){
        	tree.add(new ArrayList<Integer>());
        }
        
        for(int counter = 0; counter < M; counter++){
        	int v = cin.nextInt();
        	int w = cin.nextInt();
        	
        	tree.get(v - 1).add(w - 1);
        	tree.get(w - 1).add(v - 1);
        }
        
        dfsCount(0);
        System.out.println(result);
    }
    
    
    public static int dfsCount(int vertex){
    	isMarked[vertex] = true;
    	int total = 1;
    	
    	for(int v : tree.get(vertex)){
    		if(!isMarked[v]){
    			int subTree = dfsCount(v);
    			
    			if(subTree % 2 == 0){
    				result++;
    			}
    			
    			total += subTree;
    		}
    	}
    	
    	return total;
    }
    
}
