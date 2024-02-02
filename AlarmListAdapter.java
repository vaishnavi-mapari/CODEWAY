package com.vaishu.alarmclock;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

public class AlarmListAdapter extends ArrayAdapter<AlarmModel> {

    public AlarmListAdapter(Context context, List<AlarmModel> alarms) {
        super(context, 0, alarms);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        AlarmModel alarm = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_alarm, parent, false);
        }

        TextView alarmTimeTextView = convertView.findViewById(R.id.alarmTimeTextView);
        TextView alarmStatusTextView = convertView.findViewById(R.id.alarmStatusTextView);

        alarmTimeTextView.setText(alarm.getTime());
        alarmStatusTextView.setText(alarm.isActive() ? "Active" : "Inactive");

        return convertView;
    }
}
