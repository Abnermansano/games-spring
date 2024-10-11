package application.model;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.processing.Generated;

import jakara.persistence.Column;
import jakara.persistence.Entity;
import jakara.persistence.GeneratedValue;
import jakara.persistence.GenerationType;
import jakara.persistence.Id;
import jakara.persistence.OneToMany;
import jakara.persistence.Table;

@Entity
@Table(name = "categorias")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.INDENTITY)
    private long id;
    @Column(unique = true, nullable = false)
    private String nome;

    @OneToMany(mappedBy = "categoria")
    private Set<jogo> jogos = new HashSet<>();

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public
}