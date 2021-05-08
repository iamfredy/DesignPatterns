package patterns.structural.adapter;

public class CovidAPIOldImpl implements CovidOldAPI {

	@Override
	public String data() {
		System.out.println("This is a Legacy API returning data as plain text");
		return "Response from Old API";
	}

}
