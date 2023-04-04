package inheritance.access_control;

import inheritance.access_control.sub_package.Super;
public class SubInOtherPackage extends Super {
    public void tryAccessingStuff() {
        // From a subclass in a different package...

        //this.privateString = "woops";  // won't compile
        //this.packageString = "fine";   // won't compile
        this.protectedString = "yay";    // this is ok
        this.publicString = "fine";      // so is this

    }
}
