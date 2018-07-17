package sg.edu.rp.c346.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    ListView lvDate;

    ArrayList<EventItem> alDateList;

    CustomeAdapter caEvent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvDate = findViewById(R.id.ListViewDate);

        alDateList = new ArrayList<EventItem>();

        Calendar date1 = Calendar.getInstance();
        date1.set(2018,7,1);

        Calendar date2 = Calendar.getInstance();
        date2.set(2018,9,22);

        EventItem event1 = new EventItem("MSA",date1);
        EventItem event2 = new EventItem("Go for haircut",date2);

        alDateList.add(event1);
        alDateList.add(event2);

        caEvent = new CustomeAdapter(this,R.layout.event_list,alDateList);

        lvDate.setAdapter(caEvent);
    }
}
