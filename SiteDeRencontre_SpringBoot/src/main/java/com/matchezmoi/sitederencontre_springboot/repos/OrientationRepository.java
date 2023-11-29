package com.matchezmoi.sitederencontre_springboot.repos;

import com.matchezmoi.sitederencontre_springboot.entities.Orientation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrientationRepository extends CrudRepository<Orientation, Integer> {
}
