package com.assignment.license.repositories;

import com.assignment.license.models.License;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LicenseRepository extends CrudRepository<License, Long> {
    List<License> findTopByOrderByNumberDesc();
}
