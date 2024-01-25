package src.main.java.org.launchcode.controllers;

import org.springframework.stereotype.Controller;
import src.main.java.org.launchcode.data.Planets;

@Controller()
public class PlanetController {
    @GetMapping()
    public String displayIndex(Model model) {
        model.addAttribute("planets", Planets.values());
        return "index";
    }
}
