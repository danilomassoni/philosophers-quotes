package br.com.massoni.philosophers.quotes.controller;

import br.com.massoni.philosophers.quotes.orm.Philosophers;
import br.com.massoni.philosophers.quotes.repository.PhilosophersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class QuotesController {

    @Autowired
    private PhilosophersRepository philosophersRepository;

    @GetMapping(value = "/quotes")
    public List<Philosophers> getPhilosopher() {
        return philosophersRepository.findAll();
    }

    @PostMapping(value = "/save")
    public String savePhilopher(@RequestBody Philosophers philosophers){
        philosophersRepository.save(philosophers);
        return "Saved.....";
    }

    @PutMapping(value = "update/{id}")
    public String updatePhilosopher(@PathVariable int id, @RequestBody Philosophers philosophers){
        Philosophers updatePhilosopher = philosophersRepository.findById(id).get();
        updatePhilosopher.setName(philosophers.getName());
        updatePhilosopher.setQuote(philosophers.getQuote());
        philosophersRepository.save(updatePhilosopher);
        return "Update.....";
    }

    @DeleteMapping(value = "/delete/{id}")
    public String deletePhilopher(@PathVariable int id){
        Philosophers deletePhilosopher = philosophersRepository.findById(id).get();
        philosophersRepository.delete(deletePhilosopher);
        return "Id Philosopher deleted: " + id;
    }

}
