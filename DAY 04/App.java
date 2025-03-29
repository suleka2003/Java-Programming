import A.* ;
import B.* ;

class App {
    public static void main(String[] args) {
        A.Test T1 = new A.Test() ;
        B.Test T2 = new B.Test() ;
	B.Test T3 = new B.Test() ;
	    
        T1.display();
        T2.display();
	T3.print();
    }
}
