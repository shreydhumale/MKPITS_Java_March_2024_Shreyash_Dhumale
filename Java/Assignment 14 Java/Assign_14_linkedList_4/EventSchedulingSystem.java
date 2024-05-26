package Assign_14_linkedList_4;

import java.util.Iterator;
import java.util.LinkedList;

public class EventSchedulingSystem {
		LinkedList<Event> events;
		public EventSchedulingSystem() {
			events=new LinkedList<Event>();
		}
		
		public void addEvent(Event event) {
			events.add(event);
		}
		public void removeEvent(String id) {
			Iterator<Event>iterator=events.iterator();
			while(iterator.hasNext()){
				Event event=(Event)iterator.next();
				if(event.getEventIdString().equals(id)) {
					iterator.remove();
					System.out.println("Event removed");
				}
			}
		}
		public void searchEvent(String id) {
			Iterator<Event>iterator=events.iterator();
			while(iterator.hasNext()) {
				Event event=(Event) iterator.next();
				if(event.getEventNameString()==(id)) {
					System.out.println(event);
				}
			}
		}
		public void display() {
			Iterator<Event>iterator=events.iterator();
			while(iterator.hasNext()) {
				Event event=(Event)iterator.next();
				System.out.println(event);
			}
		}
		public static void main(String[] args) {
			EventSchedulingSystem e1=new EventSchedulingSystem();
			e1.addEvent(new Event("10","birthday","location1","20th","evening"));
			e1.addEvent(new Event("20","birthday","location2","22th","morning"));
			e1.display();
			//e1.removeEvent("10");
			e1.searchEvent("20");
			e1.display();
		}
	}
