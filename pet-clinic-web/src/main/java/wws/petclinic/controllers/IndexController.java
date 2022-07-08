package wws.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping({"", "/"})
@Controller
public class IndexController {

    @RequestMapping({"index", "index.html"})
    public String index() {
        return "index";
    }
}
