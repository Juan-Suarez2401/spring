package com.example.prueba.persistence;

import com.example.prueba.persistence.crud.CitasCrudRepository;
import com.example.prueba.persistence.entity.Citas;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository

public class CitasRepository {
    private CitasCrudRepository citasCrudRepository;

    public List<Citas> getAll(){
        return (List<Citas>) citasCrudRepository.findAll();
    }

    public Optional<Citas> getCitas(int id){
        return citasCrudRepository.findById(id);
    }

    public Citas save(Citas citas){
        return citasCrudRepository.save(citas);
    }

    public void delete(int Id){
        citasCrudRepository.deleteById(Id);
    }
}
