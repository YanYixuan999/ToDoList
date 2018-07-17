package sg.edu.rp.c346.todolist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 17042739 on 17/7/2018.
 */

public class CustomeAdapter extends ArrayAdapter{

    Context parent_context;
    int layout_id;
    ArrayList<EventItem> eventList;

    public CustomeAdapter(@NonNull Context context, int resource, @NonNull ArrayList<EventItem> objects) {
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        eventList = objects;
    }



    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent,false);

        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvDate = rowView.findViewById(R.id.textViewDate);

        EventItem currentItem = eventList.get(position);

        String name = currentItem.getEventName();
        String date = currentItem.getDateString();
        tvName.setText(name);
        tvDate.setText(date);

        return rowView;

    }
}
