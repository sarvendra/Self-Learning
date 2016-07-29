public class OuterClass {
	private String greetPrefix = "hey ";

	public void printGreeting(String greetSuffix) {
		String greetMid = "man ";
		greetSuffix = "Anand";
		class GreetLocalClass {
			private String greet;
			public GreetLocalClass(String greetSuffix) {
				greet = greetPrefix + greetMid + greetSuffix;
			}

			public String getGreet() {
				return greet;
			}
		}

		GreetLocalClass greetObj = new GreetLocalClass(greetSuffix);
		System.out.println(greetObj.getGreet());
	}
}