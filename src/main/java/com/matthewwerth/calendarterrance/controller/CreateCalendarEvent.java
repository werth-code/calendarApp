package com.matthewwerth.calendarterrance.controller;

import com.matthewwerth.calendarterrance.calendar.Appointment;
import com.matthewwerth.calendarterrance.calendar.CalendarApp;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@Controller
public class CreateCalendarEvent {

    private final CalendarApp calendarApp;

    public CreateCalendarEvent(CalendarApp calendarApp) {
        this.calendarApp = calendarApp;
    }

    @PostMapping("/createEvent")
    public String createEvent(@ModelAttribute Appointment appointment) {
        calendarApp.addAllDayAppointment(appointment.getDescription(), appointment.getStartDateTime(), appointment.getReminderDateTime());
        return "redirect:/success";
    }

    @GetMapping("/createAppointment")
    public String showCreateAppointmentForm(Model model) {
        Appointment appointment = new Appointment("", LocalDateTime.now(), LocalDateTime.now());
        model.addAttribute("appointment", appointment);
        return "createAppointment";
    }

    @GetMapping("/success")
    public String showSuccessPage() {
        return "success";
    }

}
