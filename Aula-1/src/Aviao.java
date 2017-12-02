package src;

public class Aviao extends Colleague {
	
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Aviao(Mediator mediator, String name) {
		super(mediator);
		this.name = name;
		// TODO Auto-generated constructor stub
	}

	
	
	public void takeOff(){
		System.out.println("Plane "+ name +" : is takeoff authorized? ");
		if (mediator.isTakeoffAuthorized()) {
			System.out.println("Plane "+ name +" : taking-off\n");
		}else{
			System.out.println("Plane "+ name +" : waiting\n");
		}
	}
}
