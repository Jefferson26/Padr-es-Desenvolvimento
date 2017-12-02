package src;

public class Main {
	public static void main(String[] args) {
		TorreControle mediator = new TorreControle();
		 
	    Aviao planeA = new Aviao(mediator, "Tam");
	    Aviao planeB = new Aviao(mediator, "Gol");
	    Aviao planeC = new Aviao(mediator, "Condor");
	    Aviao planeD = new Aviao(mediator, "Avianca");

	    mediator.registerFlight(planeA);
	    mediator.registerFlight(planeB);
	    mediator.registerFlight(planeC);
	    mediator.registerFlight(planeD);

	    planeA.takeOff();
	    planeB.takeOff();
	    planeC.takeOff();
	    planeD.takeOff();

	}
}
