package br.com.sebastiaojunior.repository;

import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.sebastiaojunior.model.User;

public class UserRepository {

	private static final Logger log = Logger.getLogger(UserRepository.class.getSimpleName());
	
	public void save(User customer) {
		log.log(Level.INFO, "Persisting customer: {0}", customer.getName());
	}
}
