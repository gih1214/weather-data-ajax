package site.metacoding.weathertour.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WeatherTourController {

    @GetMapping("/")
    public String main() {
        return "/weather";
    }
}
