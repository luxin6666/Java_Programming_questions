package 力扣LeetCode;

import java.util.Scanner;

/*
判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。

示例 1:
输入: 121
输出: true

示例 2:
输入: -121
输出: false
解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。

示例 3:
输入: 10
输出: false
解释: 从右向左读, 为 01 。因此它不是一个回文数。
 */
public class 回文数 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(isPalindrome(n));
	}
	
    public static boolean isPalindrome(int x) {
    	String str = String.valueOf(x);
    	int len = str.length();
    	for(int i=0; i<len/2; i++){
    		if(str.charAt(i) != str.charAt(len-1-i)){
    			return false;
    		}
    	}
		return true;
    }

}
