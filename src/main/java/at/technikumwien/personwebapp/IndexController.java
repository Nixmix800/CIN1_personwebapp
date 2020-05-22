package at.technikumwien.personwebapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @Autowired
    private PersonRepository personRepository;

    @RequestMapping
    public String index(Model model) {
        var persons = personRepository.findAllByActiveTrue();

        model.addAttribute("persons", persons);

        return  "index";
    }
}
