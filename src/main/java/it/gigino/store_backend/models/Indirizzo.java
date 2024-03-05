package it.gigino.store_backend.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "indirizzo_utente")
public class Indirizzo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "indirizzo", nullable = false)
    private String indirizzo;

    @Column(name = "indirizzo_2", nullable = false)
    private String indirizzo2;

    @Column(name = "citta", nullable = false)
    private String citta;

    @Column(name = "paese", nullable = false)
    private String paese;

    @Column(name = "cap", nullable = false)
    private String Cap;

}
