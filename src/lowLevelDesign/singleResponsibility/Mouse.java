package lowLevelDesign.singleResponsibility;

public class Mouse {
	
	private String mouseColor;
	private String mouseMechanical;
	private String scorlling;
	private String leftClick;
	private String rightClick;
	private String rightThumbClick;
	
	private Computers computer;
	
	public Mouse(Computers computer) {
		super();
		this.computer=computer;
	}
	@Override
	public String toString() {
		return "Mouse [mouseColor=" + mouseColor + ", mouseMechanical=" + mouseMechanical + ", Scorlling=" + scorlling
				+ ", leftClick=" + leftClick + ", rightClick=" + rightClick + ", rightThumbClick=" + rightThumbClick
				+ "]";
	}
	public void propertiesOfMouse(String mouseColor, String mouseMechanical, String scorlling, String leftClick, String rightClick,
			String rightThumbClick) {
		this.mouseColor = mouseColor;
		this.mouseMechanical = mouseMechanical;
		this.scorlling = scorlling;
		this.leftClick = leftClick;
		this.rightClick = rightClick;
		this.rightThumbClick = rightThumbClick;
	}
	
	 
	

}
