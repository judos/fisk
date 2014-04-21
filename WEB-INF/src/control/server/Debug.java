package control.server;

/**
 * @since 21.04.2014
 * @author Julian Schelker
 */
public class Debug {
	private StringBuffer content;
	private static Debug instance;

	public static Debug getInstance() {
		if (instance == null)
			instance = new Debug();
		return instance;
	}

	public Debug() {
		this.content = new StringBuffer();
	}

	public static void addMsg(String msg) {
		getInstance().addMsgStr(msg);
	}

	private void addMsgStr(String msg) {
		this.content.append(msg + " <br>");
	}

	public String getAllDebugMsgs() {
		return this.content.toString();
	}
}
