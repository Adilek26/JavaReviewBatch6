package com.review05;

public class TwoDArray {

	public static void main(String[] args) {
		int[][]numbers=new int[3][4];
		//Lets print 3rd element in second row
		System.out.println(numbers[1][2]);
		
		//lets initialize values for first row= row index
		numbers[0][0]=9;
		numbers[0][2]=2;
		numbers[0][3]=12;
		//2nd way
		int[][] numbers2= {
				{9,6,2,8},
				{7,1,6,12},
				{3,0,8,5}
		};
		System.out.println("4th element in the 1st row"+numbers2[0][3]);
int row=numbers2.length;
System.out.println("rows = "+row);

int length0=numbers2[0].length;
int length1=numbers2[1].length;
int length2=numbers2[2].length;
System.out.println("row0= "+length0+" row1= "+length1+" row2= "+length2);





	}

}
