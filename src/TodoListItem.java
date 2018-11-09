
public class TodoListItem {
	private String description;
	private int priority;
	private boolean isdone;

	public TodoListItem(String description, int priority) {
		this.description = description;
		this.priority = priority;
				
		// TODO Auto-generated constructor stub
	}

	public Object getPriority() {
		// TODO Auto-generated method stub
		return this.priority;
	}

	public Object getDescription() {
		return description;
	}

	public boolean isDone() {
		// TODO Auto-generated method stub
		return false;
	}

	public void markDone() {
		// TODO Auto-generated method stub
		
	}

}
