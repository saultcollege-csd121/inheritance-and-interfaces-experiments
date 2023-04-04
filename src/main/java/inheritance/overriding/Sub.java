/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance.overriding;

/**
 *
 * @author rod
 */
public class Sub extends Super {
    
    @Override
    public void theMethod() {
        
        // What happens when this line is uncommented?
        // super.theMethod();
        
        // What happens when this line is uncommented?
        // theMethod();
        
        System.out.println("Hello from Sub");
    }
    
    public static void main(String[] args) {

        // Since s1 is a Super, the Super theMethod() method is called
        Super s1 = new Super();
        s1.theMethod();

        // Since s2 is a Sub, the Sub theMethod() method is called
        Sub s2 = new Sub();
        s2.theMethod();

        // Note that the TYPE of s3 is Super but the OBJECT is a Sub
        // Thus at run-time the Sub theMethod() method is called
        Super s3 = new Sub();
        s3.theMethod();

    }
}
