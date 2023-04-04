/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance.access_control.sub_package;

/**
 *
 * @author rod
 */
public class Main {
    
    public static void main(String[] args) {
        
        // From a different class inside package...
        
        SubInSamePackage sub = new SubInSamePackage();
        //sub.privateString = "woops";    // won't compile
        sub.packageString = "yeah!";      // so is this
        sub.protectedString = "nope";     // this is fine
        sub.publicString = "yes!";        // so is this

    }
    
}
