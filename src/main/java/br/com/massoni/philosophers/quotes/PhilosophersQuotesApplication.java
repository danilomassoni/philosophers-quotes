package br.com.massoni.philosophers.quotes;

import br.com.massoni.philosophers.quotes.orm.Philosophers;
import br.com.massoni.philosophers.quotes.repository.PhilosophersRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class PhilosophersQuotesApplication implements CommandLineRunner {

	private final PhilosophersRepository repository;

	public PhilosophersQuotesApplication(PhilosophersRepository repository) {
		this.repository = repository;
	}

	public static void main(String[] args) {
		SpringApplication.run(PhilosophersQuotesApplication.class, args);
	}



	@Override
	public void run(String... args) throws Exception {
		Philosophers name = new Philosophers();
		name.setName("Aristotle");

		Philosophers quote = new Philosophers();
		quote.setQuote("Knowing yourself is the beginning of all wisdom");

		repository.save(name);
		repository.save(quote);
	}
}
