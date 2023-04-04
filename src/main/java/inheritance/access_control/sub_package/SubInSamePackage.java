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
public class SubInSamePackage extends Super {
    
    public void tryAccessingStuff() {
        // From a subclass in the same package...
        
        //this.privateString = "woops";  // won't compile
        this.protectedString = "yay";    // this is ok
        this.packageString = "fine";     // this is too
        this.publicString = "fine";      // so is this
        
    }
}
