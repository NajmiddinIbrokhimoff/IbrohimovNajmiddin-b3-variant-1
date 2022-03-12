package uz.ibrokhimoff.controllers;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import uz.ibrokhimoff.annotations.MvcController;

@MvcController
@RequestMapping
public class HomeController {

    @RequestMapping(value = {"/", "/home"})
    public String homePage() {
        return "home";
    }


}
