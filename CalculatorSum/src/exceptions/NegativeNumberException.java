package exceptions;

public class NegativeNumberException extends Exception{
	public NegativeNumberException() {
		super("negatives not allowed");
	}
}
