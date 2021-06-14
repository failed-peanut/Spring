package com.failedpeanut.springboot.webapplication;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	UserRepository userRepo;

	public List<UserEntity> getAllUsers() {
		return userRepo.findAll();
	}

	public UserEntity getUser(int userId) {
		Optional<UserEntity> user = Optional.of(new UserEntity());
		user = userRepo.findById(userId);
		return user.get();

	}

	public void saveUser(UserEntity user) {
		userRepo.save(user);
	}

	public void deleteUser(UserEntity user) {
		userRepo.delete(user);
	}
}
