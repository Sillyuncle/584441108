package homework05;


public class Demo1 {
	/*
	 * 输出一句话，输出次数100次
	 */
	public static void main(String[] args) {
		int times=0; 
		//如果去掉循环变量修改这个表达式，正常循环变成无限循环（即死循环）
		while (times<100) {
//			times=times+1;
			times++;//循环变量的修改表达式常用的格式
//			++times;
			System.out.println("第"+times+"遍写：好好学习，天天向上");
		}
	}
}
