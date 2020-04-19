package cn.edu.cqu.Recommend.Utils;

public class MyJson {

	private boolean success;
	private Object message;
	private long timestamp;
	
	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public Object getMessage() {
		return message;
	}

	public void setMessage(Object message) {
		this.message = message;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public MyJson(boolean success, Object message, long timestamp) {
		super();
		this.success = success;
		this.message = message;
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "StaticJson [success=" + success + ", message=" + message + ", timestamp=" + timestamp + "]";
	}

}
