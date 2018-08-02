public class Complex {
							
	private float real;
	private float imaginary;
	
	
	public Complex(){														//Empty constructor
		
	}
	
	
	public float getReal() {												//method to get real value
		return real;
	}
	
	
	public void setReal(float real) {										//method to set real value
		this.real = real;
	}
	
	
	public float getImaginary() {											//method to get imaginary
		return imaginary;
	}
	
	
	public void setImaginary(float imaginary) {								//method to set imaginary
		this.imaginary = imaginary;
	}
	
	
	public Complex addComplex(Complex Complex1,Complex Complex2) {			//method to add two complex numbers
		Complex complexSum = new Complex();
		complexSum.real = Complex1.getReal() + Complex2.getReal();
		complexSum.imaginary = Complex1.getImaginary() + Complex2.getImaginary();
		return complexSum;
	}
	
	
	@Override
	public String toString() {												//tostring override
		return "Complex [real=" + real + ", imaginary=" + imaginary + "]";
	}
	
}