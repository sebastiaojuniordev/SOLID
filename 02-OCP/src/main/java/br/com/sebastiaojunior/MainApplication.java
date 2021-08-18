package br.com.sebastiaojunior;

import br.com.sebastiaojunior.violation.ShapePrinterService;

public class MainApplication {

	public static void main(String[] args) {
		// Violation
		br.com.sebastiaojunior.violation.Circle circleViolation = new br.com.sebastiaojunior.violation.Circle();
		circleViolation.setRadius(10);
		new ShapePrinterService().drawShape(circleViolation);
		
		// Solution
		br.com.sebastiaojunior.solution.Circle circleSolution = new br.com.sebastiaojunior.solution.Circle();
		circleSolution.setRadius(10);
		circleSolution.draw();
	}
}
