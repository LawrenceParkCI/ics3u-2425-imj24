package unit1;

public class AboutMe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hi, my name is Jonas Im");
		System.out.println("I am a 15 year old boy in grade 11");
		System.out.println("I was born on October 28, 2008");
		System.out.println("My teacher is awesome and her name is Ms. Kemp");
		System.out.println("I go to Lawrence Park Collegiate Institute in Toronto, Canada");
		System.out.println("\"GO LPCI PANTHERS!");
		System.out.println("Jonas Im");

		System.out.println("");
		System.out.println("Timetable ");

		System.out.println("Week of september 23rd");
		System.out.format("+----------------------+----------------------+----------------------+----------------------+----------------------+\n");
        System.out.format("| %-20s | %-20s | %-20s | %-20s | %-20s |\n", 
                          "Day", "Period 1", "Period 2", "Period 3", "Period 4");
        System.out.format("+----------------------+----------------------+----------------------+----------------------+----------------------+\n");

        // Print rows for Monday (Day 1) with left alignment and string formatting
        System.out.format("| %-20s | %-20s | %-20s | %-20s | %-20s |\n", 
                          "Monday (Day 1)", 
                          "9:00 AM - 10:15 AM", 
                          "10:20 AM - 11:40 AM", 
                          "12:40 PM - 1:55 PM", 
                          "2:00 PM - 3:15 PM");
        System.out.format("| %-20s | %-20s | %-20s | %-20s | %-20s |\n", 
                          "", "(Computer Science)", "(Cooking)", "(English)", "(Functions)");

        System.out.format("+----------------------+----------------------+----------------------+----------------------+----------------------+\n");

        // Print rows for Tuesday (Day 2)
        System.out.format("| %-20s | %-20s | %-20s | %-20s | %-20s |\n", 
                          "Tuesday (Day 2)", 
                          "9:00 AM - 10:15 AM", 
                          "10:20 AM - 11:40 AM", 
                          "12:40 PM - 1:55 PM", 
                          "2:00 PM - 3:15 PM");
        System.out.format("| %-20s | %-20s | %-20s | %-20s | %-20s |\n", 
                          "", "(Cooking)", "(Computer Science)", "(Functions)", "(English)");

        System.out.format("+----------------------+----------------------+----------------------+----------------------+----------------------+\n");

        // Print rows for Wednesday (Late Start)
        System.out.format("| %-20s | %-20s | %-20s | %-20s | %-20s |\n", 
                          "Wednesday (Late)", 
                          "9:55 AM - 10:55 AM", 
                          "11:00 AM - 12:05 PM", 
                          "1:05 PM - 2:10 PM", 
                          "2:15 PM - 3:15 PM");
        System.out.format("| %-20s | %-20s | %-20s | %-20s | %-20s |\n", 
                          "", "(Computer Science)", "(Cooking)", "(English)", "(Functions)");

        System.out.format("+----------------------+----------------------+----------------------+----------------------+----------------------+\n");

        // Print rows for Thursday (Day 2)
        System.out.format("| %-20s | %-20s | %-20s | %-20s | %-20s |\n", 
                          "Thursday (Day 2)", 
                          "9:00 AM - 10:15 AM", 
                          "10:20 AM - 11:40 AM", 
                          "12:40 PM - 1:55 PM", 
                          "2:00 PM - 3:15 PM");
        System.out.format("| %-20s | %-20s | %-20s | %-20s | %-20s |\n", 
                          "", "(Cooking)", "(Computer Science)", "(Functions)", "(English)");

        System.out.format("+----------------------+----------------------+----------------------+----------------------+----------------------+\n");

        // Print rows for Friday (Day 1)
        System.out.format("| %-20s | %-20s | %-20s | %-20s | %-20s |\n", 
                          "Friday (Day 1)", 
                          "9:00 AM - 10:15 AM", 
                          "10:20 AM - 11:40 AM", 
                          "12:40 PM - 1:55 PM", 
                          "2:00 PM - 3:15 PM");
        System.out.format("| %-20s | %-20s | %-20s | %-20s | %-20s |\n", 
                          "", "(Computer Science)", "(Cooking)", "(English)", "(Functions)");

        System.out.format("+----------------------+----------------------+----------------------+----------------------+----------------------+\n");
    
		
		BingoCard bingocard = new BingoCard();
		
		bingocard.print();		
	}
}
