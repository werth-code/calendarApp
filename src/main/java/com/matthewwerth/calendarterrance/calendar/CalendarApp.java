package com.matthewwerth.calendarterrance.calendar;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Component
public class CalendarApp {
    private List<Appointment> appointments;

    public CalendarApp() {
        this.appointments = new ArrayList<>();
    }

    public void addAppointment(String description, LocalDateTime startDateTime, LocalDateTime endDateTime) {
        Appointment appointment = new Appointment(description, startDateTime, endDateTime);
        System.out.println(appointment);
        this.appointments.add(appointment);
    }

    // Default Reminder Time
    public void addAllDayAppointment(String description, LocalDateTime startDateTime) {
        LocalDateTime endDateTime = startDateTime.withHour(23).withMinute(59).withSecond(59);
        Appointment appointment = new Appointment(description, startDateTime, endDateTime);

        // Set reminder for 7pm on the previous day // TODO: 5/12/23 Add user controlled functionality to reminders.
        LocalDateTime reminderDateTime = startDateTime.minusDays(1).withHour(19).withMinute(0).withSecond(0);
        appointment.setReminder(reminderDateTime);

        System.out.println(appointment);

        this.appointments.add(appointment);
    }

    // User Provided Time
    public void addAllDayAppointment(String description, LocalDateTime startDateTime, LocalDateTime userProvidedReminderTime) {
        LocalDateTime endDateTime = startDateTime.withHour(23).withMinute(59).withSecond(59);
        Appointment appointment = new Appointment(description, startDateTime, endDateTime);

        appointment.setReminder(userProvidedReminderTime);

        System.out.println(appointment);

        this.appointments.add(appointment);
    }
    
    public void setReminder(int appointmentIndex, LocalDateTime reminderDateTime) {
        Appointment appointment = this.appointments.get(appointmentIndex);
        appointment.setReminder(reminderDateTime);
    }

    public List<Appointment> getAppointments() {
        return this.appointments;
    }
}

