package com.vaishu.alarmclock;

public class AlarmModel {
    private String time;
    private boolean isActive;

    public AlarmModel(String time, boolean isActive) {
        this.time = time;
        this.isActive = isActive;
    }

    public String getTime() {
        return time;
    }

    public boolean isActive() {
        return isActive;
    }
}
