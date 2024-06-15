package wfd.dummies.workshopapp.controllers;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import wfd.dummies.workshopapp.ReminderDTO;
import wfd.dummies.workshopapp.models.Reminder;
import wfd.dummies.workshopapp.repositories.ReminderRepository;

import java.util.List;

@RestController
@RequestMapping("/reminders")
public class ReminderController {

    private final ReminderRepository reminderRepository;

    public ReminderController(ReminderRepository reminderRepository) {
        this.reminderRepository = reminderRepository;
    }

    @GetMapping ResponseEntity<List<Reminder>> getReminders(){
        return new ResponseEntity<>(reminderRepository.findAll(), HttpStatus.ACCEPTED);
    }

    @PostMapping ResponseEntity<Reminder> saveReminder(@RequestBody ReminderDTO reminderDTO){
        return new ResponseEntity<>(reminderRepository.save(new Reminder(reminderDTO)), HttpStatus.ACCEPTED);
    }
}
