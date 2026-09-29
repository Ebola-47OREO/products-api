import org.springframework.web.bind.annotation.RestController;


import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;

@RestController
public class InfoController {

    @GetMapping("/info")
    public String info(){return "This task is for students who finish early. It is not collected or marked — it's practice, and a good chance to\n" +
            "try something without a numbered step-by-step.";}

}
