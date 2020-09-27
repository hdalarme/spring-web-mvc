package xyz.helbertt.springwebmvc.Repository;

import org.springframework.stereotype.Repository;
import xyz.helbertt.springwebmvc.model.Jedi;

import java.util.ArrayList;
import java.util.List;

@Repository
public class JediRepository {

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
}
