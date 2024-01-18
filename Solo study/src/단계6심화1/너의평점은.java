package 단계6심화1;

import java.util.Scanner;

public class 너의평점은 {

	public static void main(String[] args) {
		// 백준 25206 
		Scanner sc = new Scanner(System.in);
		double sumrating = 0;
		double sumgrade = 0;
		
		for(int i=0; i<20; i++) {
			String subject = sc.next();
			double grade = sc.nextDouble();
			String rating = sc.next();
			
			double ratings = 0.0;
			
			sumgrade += grade;
			
			switch (rating) {
				case "A+":
					ratings = grade * 4.5;
					sumrating += ratings;
					break;
				case "A0":
					ratings = grade * 4.0;
					sumrating += ratings;
					break;
				case "B+":
					ratings = grade * 3.5;
					sumrating += ratings;
					break;
				case "B0":
					ratings = grade * 3.0;
					sumrating += ratings;
					break;
				case "C+":
					ratings = grade * 2.5;
					sumrating += ratings;
					break;
				case "C0":
					ratings = grade * 2.0;
					sumrating += ratings;
					break;
				case "D+":
					ratings = grade * 1.5;
					sumrating += ratings;
					break;
				case "D0":
					ratings = grade * 1.0;
					sumrating += ratings;
					break;
				case "F":
					sumrating += ratings;
					break;
				case "P":
					sumgrade -= grade;
					
			}
			
			
		}
		sc.close();
		
		System.out.println(sumrating / sumgrade);
		

	}

}
