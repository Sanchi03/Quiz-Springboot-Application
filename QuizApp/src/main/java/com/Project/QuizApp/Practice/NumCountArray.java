package com.Project.QuizApp.Practice;

public class NumCountArray {

	public static void main(String[] args) {
		

		int [] nums= {1,1,1,1,1,2,2,2,2,3,3,3,4,4,5};
		
		int n=nums.length;
		
		boolean [] counted=new boolean[n];
		
		for(int i=0;i<n;i++) {
			if(!counted[i]) {
				int count = 1;
			
			for(int j=i+1;j<n;j++) {
				if(nums[i]==nums[j]) {
					count++;
					counted[j]=true;
				}
			}
			System.out.println(nums[i]+"="+count);
		}
		}
	}

}
