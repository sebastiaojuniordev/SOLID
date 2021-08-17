package br.com.sebastiaojunior.solution;

import br.com.sebastiaojunior.model.User;
import br.com.sebastiaojunior.model.Notification;
import br.com.sebastiaojunior.repository.UserRepository;

public class UserService {
	
	private UserRepository userRepository;
	private NotificationService notificationService;

	public UserService(UserRepository userRepository, NotificationService notificationService) {
		super();
		this.userRepository = userRepository;
		this.notificationService = notificationService;
	}
	
	public void saveUser(User user) {
		this.userRepository.save(user);
		this.notificationService.sendNotification(new Notification("Registration succesful. Name: {0}", user.getName()));
	}
}
