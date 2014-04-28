package in.technoscience.finalasconstant.After;

public class FinalAsConstant {
	public static class BetterCircleTool{
		
		// value of pi
		public static final double pi=3.14;
		
		public double getCircleArea(final double radius){
			return (Math.pow(radius, 2)*pi);
		}
		
		public double getCircumfere(final double radius){
			return ((radius*2)*pi);
		}
		
		public double getVolume(final double radius, final double height){
			return ((radius*2*height)*pi);
		}
	}

}
