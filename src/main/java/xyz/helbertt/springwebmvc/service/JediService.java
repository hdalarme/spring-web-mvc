package xyz.helbertt.springwebmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.helbertt.springwebmvc.Repository.JediRepository;
import xyz.helbertt.springwebmvc.exception.JediNotFoundException;
import xyz.helbertt.springwebmvc.model.Jedi;

import java.util.List;
import java.util.Optional;

@Service
public class JediService {

    @Autowired
    private JediRepository repository;

    public List<Jedi> findALl() {

        return repository.findAll();

    }

    public Jedi findById(Long id) {
        final Optional<Jedi> jedi = repository.findById(id);

        if(jedi.isPresent()){
            return jedi.get();
        } else {
            throw new JediNotFoundException();
        }
    }

    public Jedi save(Jedi jedi) {
        return repository.save(jedi);
    }

    public Jedi update(Long id, Jedi dto) {
        final Optional<Jedi> jediEntity =  repository.findById(id);
        final Jedi jedi;

        if(jediEntity.isPresent()){
            jedi = jediEntity.get();
        } else {
            throw new JediNotFoundException();
        }
        jedi.setName(dto.getName());
        jedi.setLastName(dto.getLastName());

        return repository.save(jedi);
    }

    public void delete(Long id) {
        final Jedi jedi = findById(id);

        repository.delete(jedi);
    }
}
