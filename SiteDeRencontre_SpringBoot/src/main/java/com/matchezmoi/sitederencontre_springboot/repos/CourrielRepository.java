package com.matchezmoi.sitederencontre_springboot.repos;

import com.matchezmoi.sitederencontre_springboot.entities.Courriel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourrielRepository extends CrudRepository<Courriel, Integer> {
}
