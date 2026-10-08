package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class InfoController2 {
    @GetMapping("/info")
    public String info(){
        return "Product Api - Tutorial 1 built";
    }
}
