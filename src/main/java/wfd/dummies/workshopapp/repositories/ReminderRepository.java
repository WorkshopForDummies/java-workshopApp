package wfd.dummies.workshopapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import wfd.dummies.workshopapp.models.Reminder;

public interface ReminderRepository extends JpaRepository<Reminder, Long> {
}
