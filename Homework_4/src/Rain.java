/*
 * 3.	�T���}�C���m��-Rain
��J�@�r��A�r�ꬰ��all�� ��ܭp��60�Ӥ몺�`�������B�q�A��year���B��season���M��month�����O��ܭp��Y�~�B�Y�u�άY�몺�������B�q�C�Y����T�̡A�A��J�@�ӥ���ƪ�ܨ��@�~�B���@�u�Ψ��@��C
�����G5�~12�Ӥ몺���B�q�H�T���}�C�Φ��ƥ����n60�ӯB�I��
�ݰ��~���B�z�G
a.	��J���F��all���B��year���B��season���M��month���H�~���r��
b.	�Y��J��year���A�ӥ���ƿ�J1��5�H�~���Ʀr
c.	�Y��J��season���A�ӥ���ƿ�J1��4�H�~���Ʀr
d.	�Y��J��month���A�ӥ���ƿ�J1��12�H�~���Ʀr
*/
import java.util.Scanner;

public class Rain {
	
	static int all(int[][][] rain) { // all rainfall
		int rainfall = 0;
		for(int[][] i : rain)
			for(int[] j : i)
				for(int k : j) rainfall += k;
		return rainfall;
	} // all rainfall

	static int year(int[][] rain) { // year rainfall
		int rainfall = 0;
		for(int[] i : rain)
			for(int j : i) rainfall += j;		
		return rainfall;
	} // year rainfall
	
	static int season(int[] rain) { // season rainfall 
		int rainfall = 0;
		for(int i : rain) rainfall += i;
		return rainfall;
	} // season rainfall
	
	static int month(int[][] rain, int month) { // month rainfall
		int rainfall = 0;
		month += (month == 1 ? 10 : (-2));
		rainfall = rain[month/3][month%3];
		return rainfall;
	} // month rainfall
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int[][][] rain =	{	// rein[x][y][z] x for year, y for season, z for month
								{	{233, 315, 400},	{560, 675, 750},	{686, 545, 445},	{386, 323, 310}},
								{	{223, 318, 412},	{575, 611, 777},	{645, 544, 474},	{345, 353, 328}},
								{	{243, 368, 512},	{544, 656, 719},	{666, 564, 441},	{319, 319, 390}},
								{	{222, 344, 412},	{549, 646, 746},	{695, 555, 462},	{376, 344, 315}},
								{	{245, 323, 419},	{512, 678, 756},	{694, 512, 429},	{372, 345, 300}}
									//2		3	4		5		6	7			8	9	10		11		12	1 month
		};
		String[] sn = {"spring", "summer", "autumn", "winter"};
		int year, season, month;
		String input;
		
		while(true) {
			
			System.out.println("Enter commands 'all', 'year', 'season', 'month'.");
			input = scanner.next();
			input = input.toLowerCase();
			
			while((input.equals("all")==false && input.equals("year")==false && input.equals("season")==false && input.equals("month")==false)
					&& input.equals("q")==false) {
					System.out.println("Please input correct command.");
					input = scanner.next();
					input = input.toLowerCase();
					if(input.equals("q")) break;
			} // while
			
			if(input.equals("q")) break;
			
			if(input.equals("all")) { // all
				System.out.println("The total rainfall of all of the five year is " + all(rain) + " mm."); // all
			}else if(input.equals("year")) { // year
				System.out.println("Which year information do you want to know ? Please enter 1~5.");
				year = scanner.nextInt();
				while(year < 1 | year > 5) {
					System.out.println("Please enter 1~5.");
					year = scanner.nextInt();
				} // while
				System.out.println("The total rainfall of year " + year + " is " + year(rain[year-1]) + "."); // year
			}else if(input.equals("season")) { // season
				System.out.println("Which year information do you want to know ? Please enter 1~5."); // enter year
				year = scanner.nextInt();
				while(year < 1 | year > 5) {
					System.out.println("Please enter 1~5.");
					year = scanner.nextInt();
				} // enter year
				System.out.println("Which season information do you want to know ? Please enter"); // enter season in a year
				System.out.println(" 1. Spring  2. Summer  3. Autumn  4. Winter");
				season = scanner.nextInt();
				while(season < 1 | season > 4) {
					System.out.println("Please enter 1~4.");
					season = scanner.nextInt();
				} // enter season in a year
				System.out.println("The total rainfall of year " + year + " " + sn[season-1] + " is " + season(rain[year-1][season-1]) + "."); // season
			}else if(input.equals("month")) {
				System.out.println("Which year information do you want to know ? Please enter 1~5."); // enter year
				year = scanner.nextInt();
				while(year < 1 | year > 5) {
					System.out.println("Please enter 1~5.");
					year = scanner.nextInt();
				} // enter year
				System.out.println("Which month information do you want to know ? Please enter 1~12."); // enter season in a year
				month = scanner.nextInt();
				while(month < 1 | month > 12) {
					System.out.println("Please enter 1~12.");
					month = scanner.nextInt();
				} // enter month in the season
				System.out.println("The total rainfall of month " + month + " in year " + year + " is " + month(rain[year-1], month) + ".");
			} //
			
			System.out.println("\n-------------------------------------\n");
			
		} //while true
		
		scanner.close();
		
	}

}
