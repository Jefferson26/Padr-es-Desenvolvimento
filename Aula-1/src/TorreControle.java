package src;

import java.util.ArrayList;
import java.util.List;

public class TorreControle implements Mediator{
	protected List<Colleague> colleagues;
	boolean takeoffAllowed = true;
	private PrevisaoTempo weatherForecast = new PrevisaoTempo();
	private boolean weatherOK = weatherForecast.isWeatherGood();
	
	public TorreControle() {
		colleagues = new ArrayList<Colleague>();
	}

	@Override
	public boolean isTakeoffAuthorized() {
		// TODO Auto-generated method stub
		if (weatherOK){
			if(takeoffAllowed){
				takeoffAllowed = false;
				System.out.println("Tower: takeoff authorized.");
				return true;
			}else{
				System.out.println("Tower: takeoff not authorized. Another plane is taking off.");
				return false;
			}
		}else{
			System.out.println("Tower: takeoff not authorized due to the bad weather.");
			return false;
		}
	}

	@Override
	public void registerFlight(Aviao plane) {
		colleagues.add(plane);		
	}

}
