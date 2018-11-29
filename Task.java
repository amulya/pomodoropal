public class Task{
	String name; // name of task
	//String subject; // subject of task (can use this to classiy tasks/group them together)
	//String desc; // description of task

	int rating; // difficulty of task on a scale of 1-6
	
	/* MORE VARIABLES */
	// due date!! figure out java.time
		// https://docs.oracle.com/javase/9/docs/api/java/time/LocalDateTime.html

	// time needed to complete
	// length of this session

	// constructors
	public Task(){ //default constructor? lol

	}

	public Task(String name, int rating){
		this.name = name;
		//this.subject = subject;
		//this.desc = description;
		this.rating = rating;
	}


}