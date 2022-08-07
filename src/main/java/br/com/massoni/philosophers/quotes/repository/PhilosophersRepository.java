package br.com.massoni.philosophers.quotes.repository;

import br.com.massoni.philosophers.quotes.orm.Philosophers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PhilosophersRepository extends CrudRepository<Philosophers, Integer> {


}
