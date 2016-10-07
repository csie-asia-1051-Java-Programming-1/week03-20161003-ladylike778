package hw;
/*
 * Topic: 讓使用者輸入一正整數n，用while迴圈計算n!後輸出。
 * Date: 2016/10/03
 * Author: 105021037 林建宏
 */
import java.util.*;
public class hw04_105021037 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("請輸入一正整數");
		int n =scn.nextInt();
		int a=1;int sum=1;
		while(a<=n){
			sum=sum*a;
			a++;
			
		}
		System.out.print(sum);

	}

}
