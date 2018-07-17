package sg.edu.rp.c346.todolist;

import java.util.Calendar;

/**
 * Created by 17042739 on 17/7/2018.
 */

public class EventItem {
    private String eventName;
    private Calendar date;

    public EventItem(String eventName, Calendar date) {
        this.eventName = eventName;
        this.date = date;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public String getDateString(){
        String str = date.get(Calendar.DAY_OF_MONTH)+"/"+date.get(Calendar.MONTH)+"/"+date.get(Calendar.YEAR);
        return str;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

