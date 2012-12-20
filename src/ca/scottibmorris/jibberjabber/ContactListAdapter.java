package ca.scottibmorris.jibberjabber;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ContactListAdapter extends BaseAdapter {

	private ArrayList<ContactCell> mArray;;

	private Context mContext;

	public ContactListAdapter(Context context, ArrayList<ContactCell> listItems) {
		mArray = listItems;
		mContext = context;
	}

	@Override
	public int getCount() {
		return mArray.size();
	}

	@Override
	public Object getItem(int position) {
		return mArray.get(position);
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// If the view doesn't exist, create a new one
		if (convertView == null) {
			LayoutInflater inflater = (LayoutInflater) mContext
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			convertView = inflater.inflate(R.layout.contact_cell, null);
		}

		ContactCell cell = mArray.get(position);

		TextView nameText = (TextView) convertView
				.findViewById(R.id.contactName);
		TextView messageText = (TextView) convertView
				.findViewById(R.id.contactMessage);

		nameText.setText(cell.getName());
		messageText.setText(cell.getMessage());

		return convertView;
	}

}