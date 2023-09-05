class Complex {
    private double real;
    private double imaginary;
    private static int numOfComplexNumbers = 0;
 
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
        numOfComplexNumbers++;
    }
 
    public static int getNumOfComplexNumbers() {
        return numOfComplexNumbers;
    }
 
    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imaginary + other.imaginary);
    }
 
    public Complex subtract(Complex other) {
        return new Complex(this.real - other.real, this.imaginary - other.imaginary);
    }
 
    public Complex multiply(Complex other) {
        double newReal = this.real * other.real - this.imaginary * other.imaginary;
        double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new Complex(newReal, newImaginary);
    }
 
    public double modulus() {
        return Math.sqrt(real * real + imaginary * imaginary);
    }
 
    public Complex conjugate() {
        return new Complex(this.real, -this.imaginary);
    }
 
    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }
 
    public static void main(String[] args) {
        Complex complex1 = new Complex(3.0, 4.0);
        Complex complex2 = new Complex(1.0, -2.0);
 
        System.out.println("Number of complex numbers created: " + Complex.getNumOfComplexNumbers());
 
        Complex sum = complex1.add(complex2);
        Complex difference = complex1.subtract(complex2);
        Complex product = complex1.multiply(complex2);
 
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
 
        System.out.println("Modulus of complex1: " + complex1.modulus());
        System.out.println("Conjugate of complex2: " + complex2.conjugate());
    }
}