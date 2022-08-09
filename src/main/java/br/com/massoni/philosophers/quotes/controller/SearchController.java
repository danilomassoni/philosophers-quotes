package br.com.massoni.philosophers.quotes.controller;

import br.com.massoni.philosophers.quotes.orm.Philosophers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SearchController {

    @RequestMapping("/")
    @ResponseBody
    public Philosophers name(){
//        Philosophers name = new Philosophers();
//        name.setName("Aristotle");
//        return name;
        return null;
    }
}
