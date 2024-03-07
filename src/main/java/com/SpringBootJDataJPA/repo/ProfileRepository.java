package com.SpringBootJDataJPA.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBootJDataJPA.model.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Integer> {

}
