package br.com.sebastiaojunior.violation;

import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.sebastiaojunior.model.User;
import br.com.sebastiaojunior.model.Notification;
import br.com.sebastiaojunior.repository.UserRepository;

public class UserService {
	
	private static final Logger log = Logger.getLogger(UserService.class.getSimpleName());

	private UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}
	
	public void saveUser(User user) {
		this.userRepository.save(user);
		this.sendNotification(new Notification("Registration succesful. Name: {0}", user.getName()));
	}

	private void sendNotification(Notification notification) {
		log.log(Level.INFO, "Notifying with message: {0}", notification.getMessage());
	}
}
