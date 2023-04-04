/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance.overriding;

public class ComplexNumber {
    
    double real;
    double imaginary;
    
    ComplexNumber(double re, double im) {
        this.real = re;
        this.imaginary = im;
    }
    
//    @Override
//    public String toString() {
//        return real + " + " + imaginary + "i";
//    }
    
//    @Override
//    public boolean equals(Object other) {
//
//        // It's for sure equal to itself
//        // (== compares reference addresses)
//        if ( other == this ) { return true; }
//
//        if ( other instanceof ComplexNumber ) {
//            ComplexNumber otherComplexNumber = (ComplexNumber)other;
//            // // As of Java 14, the above two lines can be replaced with the following shorthand, known as a "pattern variable":
//            // if ( other instanceof ComplexNumber otherComplexNumber ) {
//            // // Note the 'otherComplexNumber' after the ComplexNumber type.
//            // // This is the pattern variable.
//            // // Java automatically casts 'other' to ComplexNumber and assigns it to 'otherComplexNumber'
//
//
//            // if it's another ComplexNumber, compare the real & imaginary parts
//            // to determine equality
//            if ( otherComplexNumber.real == this.real &&
//                    otherComplexNumber.imaginary == this.imaginary ) {
//                return true;
//            }
//
//            // if the real & imaginary parts are not equal then the numbers
//            // are not equal
//            return false;
//        }
//
//        // if we get here, it's not equal
//        return false;
//    }
    
    public static void main(String[] args) {
        
        // Experiment with the toString and equals methods by
        // uncommenting the corresponding methods above.
        
        ComplexNumber c1 = new ComplexNumber(1.2, 3.9);
        ComplexNumber c2 = new ComplexNumber(1.2, 3.9);
        ComplexNumber c3 = new ComplexNumber(4.1, 5.4);
        
        // The toString method is called automatically when an object needs to
        // be converted to a String
        System.out.println(c1);  
        System.out.println(c2);
        System.out.println(c3);
        
        if ( c1.equals(c2) ) {
            System.out.println("c1 == c2");
        } else {
            System.out.println("c1 != c2");
        }
        
        if ( c1.equals(c3) ) {
            System.out.println("c1 == c3");
        } else {
            System.out.println("c1 != c3");
        }
        
    }
}
