class TestCatch {
	public static class MyException extends RuntimeException {
		String message;
		public MyException(String msg) {
			message = msg;
		}
		public String getMessage() {
			return message;
		}
	}

	public static void main(String args[]) {
		try {
			throw new MyException("Error!");
		} catch(MyException e) {
			System.out.println("In MyException");
			throw new RuntimeException();
		} catch(RuntimeException e) {
			System.out.println("In RuntimeException");
			throw new RuntimeException();
		} catch(Exception e) {
			System.out.println("In Exception");
		}
	}
}