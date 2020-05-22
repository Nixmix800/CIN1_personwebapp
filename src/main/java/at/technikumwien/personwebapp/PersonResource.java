package at.technikumwien.personwebapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//see localhost:8081/resources/persons

@RestController
@RequestMapping("/resources/persons")
public class PersonResource {
    @Autowired
    private PersonRepository personRepository;

    @GetMapping
    public List<Person> retrieveAll() {
        return personRepository.findAllByActiveTrue();
    }
}
