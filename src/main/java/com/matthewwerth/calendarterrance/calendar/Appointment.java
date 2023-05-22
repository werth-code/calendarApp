package com.matthewwerth.calendarterrance.calendar;

import java.time.LocalDateTime;

public class Appointment {
    private String description;
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
    private LocalDateTime reminderDateTime;

    public Appointment(String description, LocalDateTime startDateTime, LocalDateTime endDateTime) {
        this.description = description;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
        this.reminderDateTime = null;
    }


    public String getDescription() {
        return this.description;
    }

    public LocalDateTime getStartDateTime() {
        return this.startDateTime;
    }

    public LocalDateTime getEndDateTime() {
        return this.endDateTime;
    }

    public LocalDateTime getReminderDateTime() {
        return this.reminderDateTime;
    }

    public void setReminder(LocalDateTime reminderDateTime) {
        this.reminderDateTime = reminderDateTime;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStartDateTime(LocalDateTime startDateTime) {
        this.startDateTime = startDateTime;
    }

    public void setEndDateTime(LocalDateTime endDateTime) {
        this.endDateTime = endDateTime;
    }

    public void setReminderDateTime(LocalDateTime reminderDateTime) {
        this.reminderDateTime = reminderDateTime;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "description='" + description + '\'' +
                ", startDateTime=" + startDateTime +
                ", endDateTime=" + endDateTime +
                ", reminderDateTime=" + reminderDateTime +
                '}';
    }
}

