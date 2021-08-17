package br.com.sebastiaojunior.solution;

import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.sebastiaojunior.model.Notification;

public class NotificationService {

	private static final Logger log = Logger.getLogger(NotificationService.class.getSimpleName());

	public void sendNotification(Notification notification) {
		log.log(Level.INFO, "Notifying with message: {0}", notification.getMessage());
	}
}
