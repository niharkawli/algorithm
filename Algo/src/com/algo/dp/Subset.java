package com.algo.dp;
import java.util.ArrayList;
import java.util.Scanner;

public class Subset {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] a = new int[N];
        for(int i =0; i<N; i++){
        	a[i] = s.nextInt();
        }
        ArrayList<ArrayList<Integer>> subsets = subsets(a,0);
        for(ArrayList<Integer> list: subsets){
        	for(int i : list){
        		System.out.print(i+" ");
        	}
        	System.out.println();
        }
        s.close();
    }

	private static ArrayList<ArrayList<Integer>> subsets(int[] a, int index) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> returnSubset = new ArrayList<>();
		if(a.length == index){
			returnSubset.add(new ArrayList<Integer>());
		}else{
			
			ArrayList<ArrayList<Integer>> newSubset = subsets(a, index+1);
			returnSubset.addAll(newSubset);
				for(ArrayList<Integer> set: newSubset){
					ArrayList<Integer> newSet = new ArrayList<>(set);
					newSet.add(a[index]);
					returnSubset.add(newSet);
			}
		}
		
		return returnSubset;
	}

}