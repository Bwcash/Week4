
public class codingassignment {

	public static String putWordTogether(String str, int a) {
		String results = "";
		for(int i = 0; i < a; i++) {
			results += str;
		}
		return results;
	}
	public static String fullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	public static boolean isSumOfArrayGreatThan100(int[] numbers) {
		int sum = 0;
		for(int num : numbers) {
			sum += num;
			if(sum > 100) {
			return true;
			}
		}
		return false;
	}
	public static double getAverage(double[] grades) {
		double sumOfGrades = 0;
		for(double grade : grades) {
			sumOfGrades += grade;
		}
		return sumOfGrades / grades.length;
	}
	
	public static boolean doesFirstArrayHaveGreaterAverage(double[] period1, double[] period2) {
		double sumOfPeriod1 = 0;
		
		for(double grade1 : period1) {
			sumOfPeriod1 += grade1;
		}
		double averageOfPeriod1 = sumOfPeriod1 / period1.length;
		
			double sumOfPeriod2 = 0;
			for(double grade2 : period2) {
				sumOfPeriod2 += grade2;
			}
			double averageOfPeriod2 = sumOfPeriod2 / period2.length;
		
		return (averageOfPeriod1 > averageOfPeriod2);
			}
		
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if(isHotOutside == true && moneyInPocket > 10.50) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public static int perimeterOfFourSidedFence(int length1, int length2, int width1, int width2) {
		int perimeter = (length1 + length2 + width1 + width2);
		return perimeter;
//	this method takes 4 ints that are passed through, adds them together, and returns the results.
//	I created the example of someone wanting to build a fence, they can calculate the perimeter of the fence,	
//	so to see how much material they may need.
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ages = new int[9];
		ages[0] = 3;
		ages[1] = 9;
		ages[2] = 23;
		ages[3] = 64;
		ages[4] = 2;
		ages[5] = 8;
		ages[6] = 28;
		ages[7] = 93;
		ages[8] = 100;
		System.out.println(ages[ages.length -1]- ages[0] );
		 
		double sum = 0;
		for(int age: ages) {
			sum += age;
		}	
		System.out.println(sum / ages.length);
		
	
	String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	double sumOfLetter = 0;
	 
	for(String name: names) {
		sumOfLetter += name.length();
	} System.out.println(sumOfLetter/ names.length);
	
	StringBuilder namesTogether = new StringBuilder();
	for(int i = 0; i< names.length; i++) {
		namesTogether.append(" " + names[i]);	
	}
	String togetherNames = namesTogether.toString();
	System.out.println(togetherNames);
		
		int[] nameLength = new int[names.length];
		for(int i = 0; i <names.length; i++) {
			nameLength[i] = names[i].length();
		}
		double sumOfLengthOfNames = 0;
		for( int name : nameLength) {
			sumOfLengthOfNames += name;
		}
		System.out.println(sumOfLengthOfNames);

//	System.out.println(putWordTogether("Hi", 3));
//		System.out.println(fullName("Tom", "Smith"));
//	System.out.println(isSumOfArrayGreatThan100(ages));
//		double[] grades = {79.5, 34.7, 100.0, 83.2};
//	System.out.println(getAverage(grades));
//	double[] period2 = {75.9, 45.6, 98.0, 34.5};
//	System.out.println(doesFirstArrayHaveGreaterAverage(grades, period2));
//	System.out.println(willBuyDrink(true, 11.00));	
	
//	System.out.println(perimeterOfFourSidedFence(7, 9, 15, 3));
	
		}//
	}//


