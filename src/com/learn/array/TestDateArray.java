package com.learn.array;

public class TestDateArray {

	public static void main(String[] args) {
		Date[] daysArray = new Date[5];
		daysArray[0] = new Date(2006, 5, 4);
		daysArray[1] = new Date(2006, 7, 4);
		daysArray[2] = new Date(2004, 5, 9);
		daysArray[3] = new Date(2004, 5, 4);
		daysArray[4] = new Date(2008, 5, 4);
		bubbleSort(daysArray);
		for(int i=0; i<daysArray.length; i++) {
			System.out.println(daysArray[i]);
		}
	}

	private static Date[] bubbleSort(Date[] a) {
		int len = a.length;
		for(int i=len-1;i>=1; i--) {
			for(int j=0; j<=i-1;j++) {
				if(a[j].compareDate(a[j+1]) > 0) {
					Date temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		return a;
		
	}
}



class Date {
	int year, month, day;

	Date(int y, int m, int d) {
		year = y;
		month = m;
		day = d;
	}

	public int compareDate(Date date) {
		return year > date.year ? 1
				: year < date.year ? -1
						: month > date.month ? 1
								: month < date.month ? -1 : day > date.day ? 1 : day < date.day ? -1 : 0;
	}
}
