package br.com.massoni.philosophers.quotes.controller;

import br.com.massoni.philosophers.quotes.orm.Philosophers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QuotesController {

    @RequestMapping("/quotes")
    @ResponseBody
    public Philosophers lista(){
        Philosophers philosophers = new Philosophers("Name: ", "Quote: ");
        return philosophers;
    }
}
