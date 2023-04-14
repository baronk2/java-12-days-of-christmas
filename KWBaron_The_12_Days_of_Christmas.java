/*
Kevin Baron
10/8/12
The 12 Days of Christmas*/


//Print all 12 verses of the 12 Days of Christmas
public class KWBaron_The_12_Days_of_Christmas{

	public static void main(String[] args) {
		
		// Print the first verse, then the second verse, and so on until the twelfth verse
		for (int i = 1; i <=12; i++) {
			//on this day of christmas
			System.out.print("On the " + i);
			// There is a difference between 1ST, 2ND, 3RD, and the rest (TH). Refer to method suffix().
			suffix(i);
			//Finish out the first line that every verse has in common.
			System.out.println(" day of Christmas,");
			//Print out the second line which is universal to all verses.
			System.out.println("My true love gave to me");
			//Because what is given is different for each verse, refer to the method whatGiven.
			whatGiven(i);
			//make a line break between the current verse and the next verse, unless it is the last verse.
			if (i < 12) {
				System.out.println();
				System.out.println();
			}//eoIf
		}//eoFor
		
	}//eoMain
	
	//whatGiven takes the day and tells you what you will receive for that day
	public static void whatGiven(int day) {
		
		//whatGiven starts by telling you the newest thing you have received and then recites all the
			//other things you have received by repeating the process with a decremented day. This
			//process stops when it gets down to 2 turtle doves because the last line with the partridge
			//in a pear tree is special.
		for (int i = day; i >= 2; i--) {
			// on day i you receive i items.
			System.out.print(i);
			//items returns the text of what you will get. Refer to the method items().
			items(i);
			//As long as there is a list of three or more sets of items, you will grammatically need a
				//comma at the end of each line to separate the list. If you only have 2 turtle doves and
				//a partridge a pear tree, though, no comma is needed.
			if (day > 2) {
				System.out.println(",");
			//...In which case, just go to a new line without a comma
			} else {
				System.out.println();
			}//eoIf/else
		}//eoFor
		
		//The last line, whether it is "A partridge in a pear tree." or "And a partridge in a pear tree."
			//, starts with a capital A.
		System.out.print("A");
		
		//Only on day 1, when a partridge in a pear tree is the only thing you receive, does the line begin
			//with just "A". In all other cases, it is the last thing of a number of things, so grammatically
			//we begin with "And a". We already have the "A" no matter what, so just add "nd a".
		if (day > 1) {
			System.out.print("nd a");
		}//eoIf
		
		//Don't forget to put the item ("partridge in a pear tree."). Refer to items for details.
		items(1);
	
	}//eoWhatGiven
	
	//First translates to "1st" not "1th" so this method deals with what suffix to put after a number,
		//based on whatever that number is.
	public static void suffix(int day) {
		
		//1 should give you st.
		if (day == 1) {
			System.out.print("st");
		}//eoIf
		
		//2 should give you nd.
		if (day == 2) {
			System.out.print("nd");
		}//eoIf
		
		//3 should give you rd.
		if (day == 3) {
			System.out.print("rd");
		}//eoIf
		
		//Anything more should give you th.
		if (day > 3) {
			System.out.print("th");
		}//eoIf
	
	}//eoSuffix
	
	//items takes in a number (quantity) of items received and returns a string of which items those are.
	public static void items(int quantity) {
		
		//First it prints a space to separate the printed number from the printed text.
		System.out.print(" ");
		
		//Then it gives you the printed text.
		if (quantity == 1) {
			System.out.print("partridge in a pear tree.");
		}//eoIf
		
		if (quantity == 2) {
			System.out.print("turtle doves");
		}//eoIf
		
		if (quantity == 3) {
			System.out.print("French hens");
		}//eoIf
		
		if (quantity == 4) {
			System.out.print("calling birds");
		}//eoIf
		
		if (quantity == 5) {
			System.out.print("gooooolden rings");
		}//eoIf
		
		if (quantity == 6) {
			System.out.print("geese a-laying");
		}//eoIf
		
		if (quantity == 7) {
			System.out.print("swans a-swimming");
		}//eoIf
		
		if (quantity == 8) {
			System.out.print("maids a-milking");
		}//eoIf
		
		if (quantity == 9) {
			System.out.print("ladies dancing");
		}//eoIf
		
		if (quantity == 10) {
			System.out.print("lords a-leaping");
		}//eoIf
		
		if (quantity == 11) {
			System.out.print("pipers piping");
		}//eoIf
		
		if (quantity == 12) {
			System.out.print("drummers drumming");
		}//eoIf
	
	}//eoItems

}//eoClass