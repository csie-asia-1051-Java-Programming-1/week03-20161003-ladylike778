package ex;
/*
 * Topic: 輸入一個字元，轉換其大小寫輸出 (大寫 ->小寫，小寫->大寫)
 * Date: 2016/10/03
 * Author: 105021037 林建宏
 */
import java.util.*;
public class ex03_105021037 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		char n1=scn.next().charAt(0);
		int v1=n1-'A';
		if (v1>=0 && v1<26){
			 int a= v1+'a';
			System.out.print((char)a);
		}else {
			v1=n1-'a';
			if (v1>=0 && v1<26){
			  int a=v1+'A';
			  System.out.print((char)a);
			
			}
			
		}
		

	}

}
