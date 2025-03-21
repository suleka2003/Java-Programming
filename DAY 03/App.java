import IT.* ;
import IT.Hons.*;
import AMC.* ;

class App {
	public static void main (String[]ar) {
		IT.FirstYear IFY = new IT.FirstYear();
		AMC.FirstYear AFY = new AMC.FirstYear();
		SecondYear SY = new SecondYear();
		FourthYear ITHons = new FourthYear();

		IFY.display() ;
		AFY.display();
		SY.display();
		ITHons.display();
	}
}