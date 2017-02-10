package lab6;

import java.util.Scanner;

public class Lab6 {

	public static void main(String[] args) {
		int k=0,sum=0,max=0,min=0,j=0,temp=j;
		System.out.println("Input an array size: ");
		Scanner input1 = new Scanner(System.in);
		int size = input1.nextInt();
		System.out.println("Now please enter " + size + " numbers");
		int[] nums = new int[size];
		for (k = 0; k < nums.length; k++) {
			System.out.print("Input a number into your array: ");
			int newinput = input1.nextInt();
			nums[k]= newinput;
			sum= sum+nums[k];
		}
		System.out.println("Here are all the numbers in your array:");
		//average and sum
		for (j=0; j<nums.length;j++){
			System.out.println(nums[j]);
		 }
	System.out.println("The sum of all the values is: " + sum);
	System.out.println("The average of all the values is: "+ sum/2);
	
	//Min&max
	max=nums[nums.length-1];
	min=nums[nums.length-1];
	for (k=0;k<(nums.length)-1;k++)
	{
		if (nums[k]>max)
		{
			max=nums[k];
		}
		if (nums[k]<min){
			min=nums[k];
		}
	}
	
	//for(temp=0;temp<=nums.length-1;temp++){
		//if (nums[temp]>=nums[j]){
			//max=nums[temp];
		//}
		//if(nums[temp]<=nums[j]){
			//max=nums[j];
	//}
	
	System.out.println("The largest value is: "+ max);
	System.out.println("The smallest value is: "+ min);
	//}
}
}
