package com.matchezmoi.sitederencontre_springboot.repos;

import com.matchezmoi.sitederencontre_springboot.entities.Sexe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SexeRepository extends CrudRepository<Sexe, Integer> {
}
