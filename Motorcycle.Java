public class Motorcycle
{
	private String colour;
	private Engine engine;
	
	//constructor
public Motorcycle (String colour) {
	this.colour = colour;
	engine = new Engine();
}
public void setColour(String colour){
	this.colour = colour;
}
}
