package com.matchezmoi.sitederencontre_springboot.repos;

import com.matchezmoi.sitederencontre_springboot.entities.Passion;
import com.matchezmoi.sitederencontre_springboot.entities.Region;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionRepository extends CrudRepository<Region, Integer> {
}
