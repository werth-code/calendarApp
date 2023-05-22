package com.matthewwerth.calendarterrance;

import com.matthewwerth.calendarterrance.calendar.Appointment;
import com.matthewwerth.calendarterrance.calendar.CalendarApp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
public class CalendarTerranceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalendarTerranceApplication.class, args);

//		// create a new calendar app
//		CalendarApp calendarApp = new CalendarApp();
//
//		// add some appointments
//		LocalDateTime startDateTime1 = LocalDateTime.of(2023, 5, 15, 9, 0);
//		LocalDateTime endDateTime1 = LocalDateTime.of(2023, 5, 15, 10, 0);
//		calendarApp.addAppointment("Meeting with John", startDateTime1, endDateTime1);
//
//		LocalDateTime startDateTime2 = LocalDateTime.of(2023, 5, 17, 14, 30);
//		LocalDateTime endDateTime2 = LocalDateTime.of(2023, 5, 17, 15, 30);
//		calendarApp.addAppointment("Lunch with Jane", startDateTime2, endDateTime2);
//
//		LocalDateTime allDayDateTime = LocalDateTime.of(2023, 5, 16, 0, 0);
//		calendarApp.addAllDayAppointment("All-day event", allDayDateTime);
//
//
//		LocalDateTime allDayDateTimeWithCustomReminderTime = LocalDateTime.of(2023, 5, 16, 4, 0);
//		LocalDateTime customReminderTime = LocalDateTime.of(2023, 5, 16, 3, 0);
//		calendarApp.addAllDayAppointment("All-day event", allDayDateTimeWithCustomReminderTime, customReminderTime);
//
//		// set reminders for the appointments
//		int appointmentIndex = 0; // index of the "Meeting with John" appointment
//		LocalDateTime reminderDateTime = LocalDateTime.of(2023, 5, 15, 8, 30);
//		calendarApp.setReminder(appointmentIndex, reminderDateTime);
//
//		appointmentIndex = 1; // index of the "Lunch with Jane" appointment
//		reminderDateTime = LocalDateTime.of(2023, 5, 17, 14, 0);
//		calendarApp.setReminder(appointmentIndex, reminderDateTime);
//
//		// print the list of appointments
//		List<Appointment> appointments = calendarApp.getAppointments();
//		for (Appointment appointment : appointments) {
//			System.out.println("Appointment: " + appointment.getDescription());
//			System.out.println("Start time: " + appointment.getStartDateTime());
//			System.out.println("End time: " + appointment.getEndDateTime());
//			if (appointment.getReminderDateTime() != null) {
//				System.out.println("Reminder time: " + appointment.getReminderDateTime());
//			}
//			System.out.println();
//		}
	}

}
