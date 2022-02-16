package com.example.prueba.persistence.crud;

import com.example.prueba.persistence.entity.Citas;
import org.springframework.data.repository.CrudRepository;

public interface CitasCrudRepository extends CrudRepository<Citas, Integer> {

}
