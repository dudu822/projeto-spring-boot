package me.smartphone.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.smartphone.login.model.SecUser;

public interface SecUserRepository extends JpaRepository<SecUser, Long> {
	
	SecUser findByUsername(String username);
	
}
