package com.FinalCodeGravityProject.dataLayer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RepositoryOfUser extends JpaRepository<User, Long> {
}