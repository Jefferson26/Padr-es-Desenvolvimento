package src;

import java.util.Random;

public class PrevisaoTempo{

	Random random;
	
	public boolean isWeatherGood(){
		random = new Random();
		System.out.println("Tower: is weather good?");
		boolean isAllowed = random.nextBoolean();
		if (isAllowed) {
			System.out.println("Weather Forecast: Weather is good.\n");
		}else{
			System.out.println("Weather Forecast: Weather is terrible.\n");
		}
	    return isAllowed;
	}

}
