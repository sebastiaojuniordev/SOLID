package br.com.sebastiaojunior.violation;

import java.util.logging.Logger;

public class ShapePrinterService {

	private static final Logger log = Logger.getLogger(ShapePrinterService.class.getSimpleName());

	public void drawShape(Object shape) {
		if (shape instanceof Rectangle) {
			log.info("Drawing retangle...");
		} else if (shape instanceof Square) {
			log.info("Drawing square...");
		} else if (shape instanceof Circle) {
			log.info("Drawing circle...");
		}
	}
}