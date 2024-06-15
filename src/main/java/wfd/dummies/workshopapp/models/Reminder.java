package wfd.dummies.workshopapp.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import wfd.dummies.workshopapp.ReminderDTO;

import java.util.Date;

@Entity
@Table(name = "Reminder", schema = "public")
@Getter
@Setter
public class Reminder {

    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    protected Long id;

    @Column
    protected String reminder;

    @Column(name = "reminder_user")
    protected String user;

    @Column
    protected Date date;

    public Reminder(ReminderDTO reminderDTO) {
        this.reminder = reminderDTO.getReminder();
        this.user = reminderDTO.getUser();
        this.date = reminderDTO.getDate();
    }

    public Reminder() {

    }
}
