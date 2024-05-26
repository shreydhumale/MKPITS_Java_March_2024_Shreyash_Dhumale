package Assign_14_linkedList_1;


import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TaskManagementSystem {
	LinkedList<Task> linkedList;

	public TaskManagementSystem() {
		linkedList = new LinkedList<Task>();
	}

	public void addtask(Task task) {
		linkedList.add(task);
	}

	public void removeById(String id) {
		Iterator<Task> iterator = linkedList.iterator();
		while (iterator.hasNext()) {
			Task task = (Task) iterator.next();
			if (task.getTaskidString().equals(id)) {
				iterator.remove();
				System.out.println("id detail deleted");
			}
		}
	}

	public void searchById(String id) {
		Iterator<Task> iterator = linkedList.iterator();
		while (iterator.hasNext()) {
			Task task = (Task) iterator.next();
			if (task.getTaskidString().equals(id)) {

				System.out.println(task);
			}
		}
	}

	public void sort() {
		Collections.sort(linkedList, new dueDateComparator());
	}

	public void display() {
		Iterator<Task> iterator = linkedList.iterator();
		while (iterator.hasNext()) {
			Task task = (Task) iterator.next();

			System.out.println(task);

		}
	}
public static void main(String[] args) {
	TaskManagementSystem t1=new TaskManagementSystem();
	t1.addtask(new Task("10","task1","9","21"));
	t1.addtask(new Task("20","task2","8","20"));
	t1.addtask(new Task("30","task3","5","19"));
	t1.display();
	t1.searchById("20");
	t1.display();
}
}