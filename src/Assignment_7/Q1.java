package Assignment_7;

public class Q1 {
    public static void main(String[] args) {
        Complex c=new Complex(3,4);
        c.printComplex();
        System.out.println(c);
    }
}

class Complex{
    private int real;
    private int imag;

    Complex(int real,int imag){
        this.real=real;
        this.imag=imag;
    }
    public void setReal(int real){
        this.real=real;
    }
    public void setImag(int imag){
        this.imag=imag;
    }
    int getReal(){
        return real;
    }
    public int getImag() {
        return imag;
    }
    public void printComplex(){
        System.out.println(real+" + "+imag+"i");
    }
    @Override
    public String toString(){
        return "Complex{real="+real+", imag="+imag+'}';
    }
}
