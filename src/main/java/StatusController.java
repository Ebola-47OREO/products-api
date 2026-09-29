import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class StatusController {

    @GetMapping("/status")
    public String status() {
        return "API running - " + LocalDate.now().toString();
    }
}
