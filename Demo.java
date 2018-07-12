package com.hpit.demo;

public class Demo {
	public static void main(String[] args) {
		for(int i=1;i<10;i++){
			//排除不是偶数的情况
			if(i%2!=0){
				continue;//跳过循环后面的代码不执行，循环直接进入下一次
			}			
			//剩下数字都是偶数
			System.out.println(i);
			
			
			/*if (i%2==0) {
				//打印1-10之间所有的偶数
				System.out.println(i);
				//如果偶数大于4，自增
				if(i>4){
					i++;
				}
			}*/
		}
	}
}
