package calendars;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;

public class Event {
	@Id private String id;

	private String title;
	private String host;
	private Date date;
	private Date startTime;
	private Date endTime;
	private String info;
	private Date reminder;
	private List<String> guestList;

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public Date getReminder() {
		return reminder;
	}
	public void setReminder(Date reminder) {
		this.reminder = reminder;
	}
	public List<String> getGuestList() {
		return guestList;
	}
	public void setGuestList(List<String> guestList) {
		this.guestList = guestList;
	}

	
}
