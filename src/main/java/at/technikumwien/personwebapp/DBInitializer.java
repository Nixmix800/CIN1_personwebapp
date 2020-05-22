package at.technikumwien.personwebapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

import java.time.LocalDate;

@Configuration
public class DBInitializer {

    @Autowired
    private PersonRepository personRepository;

    @EventListener(ApplicationReadyEvent.class)
    public void handleApplicationEvent() {
        var person = new Person(
                null,
                Sex.MALE,
                "Markus",
                "Mustermann",
                LocalDate.of(1990, 1, 1),
                true
        );

        personRepository.save(person);
    }
}
