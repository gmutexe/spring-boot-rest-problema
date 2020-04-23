package br.com.gabrielpaz.spring.main.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.gabrielpaz.spring.main.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}