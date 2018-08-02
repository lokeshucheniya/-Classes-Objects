public class ComplexTest {

	public static void main(String[] args) {
		
		Complex Complex1 = new Complex();					//Complex objects 
		Complex Complex2 = new Complex();
		Complex Complex3 = new Complex();
		
		
		Complex1.setReal(4.5f);								//Complex 1 real outputs 
		Complex1.setImaginary(5.5f);						//Complex 1 imaginary outputs
		System.out.println(Complex1);
		
		
		Complex2.setReal(3.5f);								//Complex 1 real outputs 
		Complex2.setImaginary(6.5f);						//Complex 1 imaginary outputs
		System.out.println(Complex2);
		
		
		Complex3= Complex1.addComplex(Complex1, Complex2);	//Adding two complex numbers
		System.out.println(Complex3);
		
	}

}