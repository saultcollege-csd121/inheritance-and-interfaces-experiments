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
public class Super {
    private String privateString = "This is private";
    protected String protectedString = "This is protected";
    String packageString = "This is package-private";  // default access is 'package-private'
    public String publicString = "This is public";
    
    public void tryAccessingStuff() {

        // From inside the same class...
        this.privateString = "we can";    // this is fine
        this.protectedString = "have";    // this is ok
        this.packageString = "it";        // this is too
        this.publicString = "all";        // so is this
    }
}
