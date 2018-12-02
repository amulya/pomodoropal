import java.util.*;
import java.lang.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PomodoroPal{
	// GOAL: sort tasks by due date, difficulty rating, and time needed to complete task.
	// returns a .txt with a sample Pomodoro schedule
	// option for program to stay online and give live notifications
	
	static ArrayList<Task> tasks = new ArrayList<Task>(); // all tasks (sorted in a specific way? Like by due date?)
	static int numTasks;

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello! Ready to get productive?");
		System.out.println("How many tasks do you have to complete today?");

		numTasks = sc.nextInt();
		sc.nextLine();

		DateTimeFormatter df = DateTimeFormatter.ofPattern("MM/dd/yyyy");

		System.out.println("Great! Now let's enter some information on each of your tasks.");
		for(int i = 0; i < numTasks; i++){ // read in all tasks
			String name = "", data = "";
			int rating = 0;
			LocalDate dueDate = null;

			// name
			System.out.println("Task " + (i + 1) + " name: ");
			name = sc.nextLine();
			
			// due date
			System.out.println("Due date (Format: mm/dd/yyy): ");
			data = sc.nextLine();
			// parse into LocalDate object
			while(dueDate == null){
				try{
					dueDate = LocalDate.parse(data, df);
				}catch(Exception e){
					System.out.println("Invalid format. Try again: ");
					data = sc.nextLine();
				}
			}

			// rating
			System.out.println("Difficulty rating (on a scale of 1 - 6): ");
			rating = sc.nextInt(); 
			
			sc.nextLine();
			tasks.add(new Task(name, rating, dueDate));
			System.out.println();
		}

		System.out.println("Awesome! Here are your tasks: ");
		for(int i = 0; i < tasks.size(); i++){
			System.out.println("\t- "+tasks.get(i).name + " | Rating: " + tasks.get(i).rating + " | Due " + tasks.get(i).dueDate.format(df));
		}
		

	}
}