package patterns.structural.adapter;

import java.util.HashMap;
import java.util.Map;

public class CovidAPINewImpl implements CovidNewAPI{


	@Override
	public Map<String, String> getData() {
		Map<String,String> newAPIResponse=new HashMap<>();
		newAPIResponse.put("data", "Response From New API");//Dummy Data
		System.out.println("New API returning data in a different format: newAPIResponse=> "+newAPIResponse);
		return newAPIResponse;
	}

}
