package sec.project.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sec.project.repository.EventRepository;

@Controller
public class EventController {

    @Autowired
    private EventRepository eventRepository;

    @RequestMapping(value = "/events", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("events", eventRepository.findAll());
        return "events";
    }
}
