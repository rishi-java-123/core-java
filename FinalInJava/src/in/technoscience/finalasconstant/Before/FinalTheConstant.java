package in.technoscience.finalasconstant.Before;

public class FinalTheConstant {
	
	public static class ToolsForCircle{
		
		public double getCircleArea(final double radius){
			return (Math.pow(radius, 2)*3.141);
		}
		
		public double getCircumfere(final double radius){
			return ((radius*2)*3.14);
		}
		
		public double getVolume(final double radius, final double height){
			return ((radius*2*height)*3.141);
		}
	}

}
