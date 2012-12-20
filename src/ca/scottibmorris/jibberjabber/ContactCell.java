package ca.scottibmorris.jibberjabber;

public class ContactCell {

	private String mName;
	private String mMessage;

	public ContactCell(String name, String message) {
		mName = name;
		mMessage = message;
	}

	public String getName() {
		return mName;
	}

	public String getMessage() {
		return mMessage;
	}
}
