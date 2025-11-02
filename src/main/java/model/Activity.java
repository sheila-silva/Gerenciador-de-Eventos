package br.com.event.model;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String descricao;
    private Double preco;

    @ManyToOne
    private br.com.event.model.Category category;

    @OneToMany(mappedBy = "activity")
    private Set<br.com.event.model.Block> blocks = new HashSet<>();

    @ManyToMany
    @JoinTable(name = "tb_activity_participant",
            joinColumns = @JoinColumn(name = "activity_id"),
            inverseJoinColumns = @JoinColumn(name = "participant_id"))
    private Set<br.com.event.model.Participant> participants = new HashSet<>();


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}