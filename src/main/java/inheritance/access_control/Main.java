package inheritance.access_control;

public class Main {
    
    public static void main(String[] args) {
        // From outside the package...
        
        SubInOtherPackage sub = new SubInOtherPackage();
        //sub.privateString = "woops";    // won't compile
        //sub.protectedString = "nope";   // won't compile
        //sub.packageString = "nah";      // won't compile
        sub.publicString = "yes!";        // this is fine
        
    }
    
}
