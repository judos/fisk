package myeclipse;

public class MyHelloWorldBean {

	String strMyMessage;

	public MyHelloWorldBean() {
		reset();
	}

	public void setStrMyMessage(String strSet) {
		strMyMessage = strSet;
	}

	public String getStrMyMessage() {
		return strMyMessage;
	}

	public void reset() {
		setStrMyMessage("Hello World - Hi");
	}

}
