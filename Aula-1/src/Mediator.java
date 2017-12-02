package src;

public interface Mediator {
	public void registerFlight(Aviao plane);
	public boolean isTakeoffAuthorized();
}
