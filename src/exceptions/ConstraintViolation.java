package exceptions;

public class ConstraintViolation extends Exception {
	public ConstraintViolation(String message) {
		super(message);
	}
}
