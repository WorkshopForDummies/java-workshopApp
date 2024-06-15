CREATE TABLE Reminder
(
    id SERIAL,
    reminder varchar(100) NOT NULL,
    reminder_user varchar(100) NOT NULL,
    date timestamp NOT NULL
)