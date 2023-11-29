package com.matchezmoi.sitederencontre_springboot.repos;

import com.matchezmoi.sitederencontre_springboot.entities.Passion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassionRepository extends CrudRepository<Passion, Integer> {
}
