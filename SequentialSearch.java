package sequentialSearch;

import java.util.Scanner;

public class SequentialSearch {
	public static void main(String[] args){
		String[] str = {"張三","李四","王五","趙六"};
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		
		for (int i=0;i<str.length;i++){
			if (tmp.equals(str[i])){
				System.out.println("find it");
				return;
			}
		}
		
		System.out.println("data not found");
		
		//sequentialSearch is the way searching data from head to end sequentially
		//though it's simple to design, but not efficient for large arrays
	}
}
