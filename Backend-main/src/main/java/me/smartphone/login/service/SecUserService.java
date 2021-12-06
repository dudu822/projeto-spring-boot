package me.smartphone.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.smartphone.login.model.SecUser;
import me.smartphone.login.repository.SecUserRepository;

@Service
public class SecUserService {
	
	@Autowired
    private SecUserRepository secUserRepository;
	
	public SecUser findByUsername(String username) {
        return secUserRepository.findByUsername(username);
    }
	
	public SecUser save(SecUser secUser) {
        return secUserRepository.save(secUser);
    }

}
