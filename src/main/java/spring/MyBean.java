package spring;

import java.util.Calendar;
import java.util.Date;

public class MyBean {

	private Date date;
	private String message;
	
	public MyBean() {
		super();
		this.date = Calendar.getInstance().getTime();
	}
	public MyBean(String message) {
		this();
		this.message = message;
	}
	public MyBean(String message , String message2) {
		this();
		this.message = message;
		this.message += message2;
	}
	public Date getDate() {
		return date;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "MyBean [date=" + date + ", message=" + message + "]";
	}
	
}
