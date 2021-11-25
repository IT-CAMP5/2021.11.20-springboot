package pl.camp.it.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.camp.it.components.SimpleComponent;

@Controller
public class SimpleController {

    @Autowired
    SimpleComponent simpleComponent;

    @RequestMapping(value = "/jakisadres", method = RequestMethod.GET)
    public String cos() {
        System.out.println("Coś się odpaliło i przechwyciliśmy żądanie HTTP");
        this.simpleComponent.doSomething();
        return "jakis";
    }
}
