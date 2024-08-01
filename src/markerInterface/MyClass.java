package markerInterface;

import java.io.Serializable;

public class MyClass implements Serializable{

	private String data;
	
	public MyClass(String data) {
		this.data=data;
	}
	
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data=data;
	}
}
