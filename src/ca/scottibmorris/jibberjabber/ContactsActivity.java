package ca.scottibmorris.jibberjabber;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;

public class ContactsActivity extends Activity {

	ListView mContactList;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_contacts);

		mContactList = (ListView) findViewById(R.id.contact_listView);

		ArrayList<ContactCell> contacts = new ArrayList<ContactCell>();
		contacts.add(new ContactCell("Scott Morris", "This is a test message"));
		contacts.add(new ContactCell("Bob Smith", "This is a test message 2"));
		ContactListAdapter adapter = new ContactListAdapter(this, contacts);
		mContactList.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_contacts, menu);
		return true;
	}

}
