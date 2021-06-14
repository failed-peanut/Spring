package com.failedpeanut.springboot.webapplication;

import org.springframework.data.jpa.repository.JpaRepository;

/*Repository class which does database transactions*/
public interface UserRepository extends JpaRepository<UserEntity, Integer>
{

}
