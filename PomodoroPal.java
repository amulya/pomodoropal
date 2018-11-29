import java.util.*;

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

		System.out.println("Great! Now let's enter some information on each of your tasks.");
		for(int i = 0; i < numTasks; i++){ // read in all tasks
			String name = "";
			int rating = 0;
			System.out.println("Task name: ");
			name = sc.nextLine();
			/*
			while(!subject.equals("0")){
				subject = sc.nextLine();
			}
			while(!desc.equals("0")){
				desc = sc.nextLine();
			}
			*/
			System.out.println("Difficulty rating: ");
			rating = sc.nextInt(); // if rating is set to 0, they don't want to use it
			
			sc.nextLine();
			tasks.add(new Task(name, rating));
		}

		System.out.println("Awesome! Here are your tasks: ");
		for(int i = 0; i < tasks.size(); i++){
			System.out.println("\t- "+tasks.get(i).name + " | Rating: " + tasks.get(i).rating);
		}

	}
}