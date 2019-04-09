package com.learn.array;

/**
 * 数三退一
 * @author Admin
 *
 */
public class Count3Quit {

	public static void main(String[] args) {
		boolean[] arr = new boolean[500];
		for(int i=0;i< arr.length;i++) {
			arr[i] = true;
		}
		
		//现在圈里剩下的人数
		int leftCount = arr.length;
		//计数器，看到一个人，数+1
		int countNum = 0;
		//数到第几个人
		int index = 0;
		
		while(leftCount > 1) {
			if(arr[index] == true) {
				countNum ++;
				if(countNum == 3) {
					countNum = 0;
					arr[index] = false;
					leftCount --;
				}
			}
			
			index++;
			
			if(index == arr.length) {
				index = 0;
			}
		}
		
		//查看剩下那个人的位置
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == true) {
				System.out.println(i);
			}
		}
	}
}
