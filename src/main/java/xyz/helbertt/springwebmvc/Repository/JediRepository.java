package xyz.helbertt.springwebmvc.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xyz.helbertt.springwebmvc.model.Jedi;

import java.util.List;

@Repository
public interface JediRepository extends JpaRepository<Jedi, Long> {

    List<Jedi> findByNameContainingIgnoreCase(final String name);
/*
    private List<Jedi> jedi;

    public JediRepository (){
        jedi = new ArrayList<>();
        jedi.add(new Jedi("Luke", "Skywlker"));
        jedi.add(new Jedi("Helbertt", "Dalarme"));
    }

    public List<Jedi> getAllJedi(){
        return this.jedi;
    }

    public void add(Jedi jedi) {
        this.jedi.add(jedi);
    }
 */
}
