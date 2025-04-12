/*
Type conversion and type casting

boolean
short
char
long
int
float
double
String
*/

class Converter {
	public static void main(String[] args) {
		boolean bo = true;
		byte by = 100;
		short sh = 45;
		char ch = 'a';
		long lo = 452654789325412l;
		int in = 456;
		float fl = 3.14f;
		double db = 78.25465;
		String st = "Hi";

		lo = by ;
		sh = (short)lo;
		fl = in;
		in = (int)db;
		in = ch;

		System.out.println("Value of boolean is " + bo);
		System.out.println("Value of byte is " + by);
		System.out.println("Value of short is " + sh);
		System.out.println("Value of char is " + ch);
		System.out.println("Value of long is " + lo);
		System.out.println("Value of int is " + in);
		System.out.println("Value of float is " + fl);
		System.out.println("Value of double is " + db);
		System.out.println("Value of string is " + st);
	}
}