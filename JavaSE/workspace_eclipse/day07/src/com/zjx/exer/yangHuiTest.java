package com.zjx.exer;
/*
 * 二维数组打印10行杨辉三角
 * 
 * 第一行有1个元素，第n行有n个元素
 * 每一行的第一个元素和最后一个元素都是1
 * 从第三行开始，对于非第一个元素和最后一个元素，即：
 * yangHui[i][j] = yangHui[i-1][j-1] + yangHui[i-1][j]
 * 
 */
public class yangHuiTest {
	
	public static void main(String[] args) {
		//声明
		int[][] yangHui = new int[10][];
		//初始化
		for(int i = 0; i < yangHui.length; i++) {
			yangHui[i] = new int[i + 1];
		}
		
		for(int i = 0; i < yangHui.length; i++) {
			
			//第一个是1
			yangHui[i][0] = 1;
			
			//最后一个也是1
			yangHui[i][i] = 1;
			
			
			//从第三行开始
			if(i > 1) {
				//每一行的第二个开始到倒数第二个结束
				for(int j = 1; j < yangHui[i].length - 1; j++) {
					yangHui[i][j] = yangHui[i-1][j-1] + yangHui[i-1][j];
				}
			}
			
		}
		
		for(int i = 0; i < yangHui.length; i++) {
			for(int j = 0; j < yangHui[i].length; j++) {
				System.out.print(yangHui[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}










