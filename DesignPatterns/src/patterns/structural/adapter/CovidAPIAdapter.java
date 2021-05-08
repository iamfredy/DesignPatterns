package patterns.structural.adapter;

public class CovidAPIAdapter implements CovidOldAPI {

	private CovidNewAPI newAPI;
	public CovidAPIAdapter(CovidNewAPI newAPI) {
		this.newAPI=newAPI;
	}
	@Override
	public String data() {
		System.out.println("Adapter Getting the Data via New API, Converting it in to Old API format");
		return newAPI.getData().get("data");
	}

}
