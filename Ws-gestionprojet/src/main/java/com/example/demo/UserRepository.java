package com.example.demo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
List<User> findByIduser(int iduser);
/*List<User> findByIdusere(String nomuser, String pwuser);*/
User findByNomuserAndPwuserAllIgnoreCase(String nomuser, String pwuser);
	Iterable<User> findAll();
	
}