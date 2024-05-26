package Assign_14_linkedList_4;

public class Event {
	private String eventIdString;
	private String eventNameString;
	private String eventLocationString;
	private String eventDateString;
	private String eventTimeString;
	public String getEventIdString() {
		return eventIdString;
	}
	public void setEventIdString(String eventIdString) {
		this.eventIdString = eventIdString;
	}
	public String getEventNameString() {
		return eventNameString;
	}
	public void setEventNameString(String eventNameString) {
		this.eventNameString = eventNameString;
	}
	public String getEventLocationString() {
		return eventLocationString;
	}
	public void setEventLocationString(String eventLocationString) {
		this.eventLocationString = eventLocationString;
	}
	public String getEventDateString() {
		return eventDateString;
	}
	public void setEventDateString(String eventDateString) {
		this.eventDateString = eventDateString;
	}
	public String getEventTimeString() {
		return eventTimeString;
	}
	public void setEventTimeString(String eventTimeString) {
		this.eventTimeString = eventTimeString;
	}
	public Event(String eventIdString, String eventNameString, String eventLocationString,
			String eventDateString, String eventTimeString) {
		super();
		this.eventIdString = eventIdString;
		this.eventNameString = eventNameString;
		this.eventLocationString = eventLocationString;
		this.eventDateString = eventDateString;
		this.eventTimeString = eventTimeString;
	}
	@Override
	public String toString() {
		return "EventSchedulingSystem [eventIdString=" + eventIdString + ", eventNameString=" + eventNameString
				+ ", eventLocationString=" + eventLocationString + ", eventDateString=" + eventDateString
				+ ", eventTimeString=" + eventTimeString + "]";
	}
}
