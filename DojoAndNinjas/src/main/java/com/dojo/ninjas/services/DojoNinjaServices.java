package com.dojo.ninjas.services;

import com.dojo.ninjas.models.Dojo;
import com.dojo.ninjas.models.Ninja;
import com.dojo.ninjas.repositories.DojoRepository;
import com.dojo.ninjas.repositories.NinjaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DojoNinjaServices {
    private final DojoRepository dojoRepository;
    private final NinjaRepository ninjaRepository;

    public DojoNinjaServices(DojoRepository dojoRepository, NinjaRepository ninjaRepository) {
        this.dojoRepository = dojoRepository;
        this.ninjaRepository = ninjaRepository;
    }

    public void createDojo(Dojo dojo){
        dojoRepository.save(dojo);
    }

    public List<Dojo> getAllDojo(){
        return dojoRepository.findAll();
    }

    public Dojo getOne(Long id) {
        Optional<Dojo> optionalDojo = dojoRepository.findById(id);
        if(optionalDojo.isPresent()) {
            return optionalDojo.get();
        } else {
            return null;
        }
    }

    public void createNinja(Ninja ninja) {
        ninjaRepository.save(ninja);
    }

    public List<Ninja> getAllNinjas() {
        return (List<Ninja>) ninjaRepository.findAll();
    }
}
