package br.com.massoni.philosophers.quotes.orm;

import javax.persistence.*;

@Entity
@Table(name = "philosophers")
public class Philosophers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private String quote;

//    public Philosophers(String name, String quote) {
//        this.name = name;
//        this.quote = quote;
//    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
}
