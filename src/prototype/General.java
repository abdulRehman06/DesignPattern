package prototype;

//Doesn't support cloning
public class General extends GameUnit{

	private String state = "idle";
	
	public void boostMorale() {
		this.state = "MoralBoost";
	}
	
	@Override
	public String toString() {
		return "General "+state+" @ "+getPosition();
	}

	public GameUnit clone() throws CloneNotSupportedException
	{
		throw  new CloneNotSupportedException("General no support cloneing");
	}
	public void reset()  {
		throw  new UnsupportedOperationException( "reset is not allow" );
	}
}
