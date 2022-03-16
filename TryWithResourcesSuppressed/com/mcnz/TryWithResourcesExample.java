package com.mcnz;


class SwingException extends Exception {}
class CloseException extends Exception {}

class Door implements AutoCloseable {
	
	public void swing() throws SwingException {
		System.out.println("The door is swinging off it's hinge! ");
		throw new SwingException();
	}

	@Override
	public void close() throws CloseException {
		System.out.println("Now the door is closed. ");
		throw new CloseException();
	}
}
public class TryWithResourcesExample {
	public static void main(String[] args) {

			try (Door door = new Door()) {
				door.swing();
				throw new RuntimeException();
			}
			catch (Exception e) {
				System.out.println(e.getClass());
				System.out.println(e.getSuppressed()[0]);
			}
			finally {}
	}
}
