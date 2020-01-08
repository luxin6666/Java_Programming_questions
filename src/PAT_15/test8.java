package PAT_15;

import java.util.Scanner;

/*
 * 求符合给定条件的整数集 （15 分）
给定不超过6的正整数A，考虑从A开始的连续4个数字。请输出所有由它们组成的无重复数字的3位数。

输入格式：
输入在一行中给出A。

输出格式：
输出满足条件的的3位数，要求从小到大，每行6个整数。整数间以空格分隔，但行末不能有多余空格。

输入样例：
2
输出样例：
234 235 243 245 253 254
324 325 342 345 352 354
423 425 432 435 452 453
523 524 532 534 542 543
 */
public class test8 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = a+1;
		int c = a+2;
		int d = a+3;
		int n = 0;
		for(int i=a; i<a+4; i++){
			for(int j=a; j<a+4; j++){
				for(int k=a; k<a+4; k++){
					if(i!=j && i!=k && j!=k){
						//System.out.printf("%d%d%d",i,j,k);
						System.out.print(i+""+j+""+k);
						n++;
						if(n%6 == 0){
							System.out.println();
						}else{
							System.out.print(" ");
						}
					}
				}
			}
		}
	}

}