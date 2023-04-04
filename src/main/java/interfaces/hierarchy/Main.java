/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces.hierarchy;

import java.util.ArrayList;
/**
 *
 * @author rod
 */
public class Main {
 
    public static void main(String[] args) {
        
        Ape harambe = new Ape();
        NonSinger willHung = new NonSinger();
        Parrot polly = new Parrot();
        AstleySinger rickAstley = new AstleySinger();
        
        ArrayList<CanMakeSound> noiseMakers = new ArrayList<>();
        noiseMakers.add(harambe);
        noiseMakers.add(willHung);
        noiseMakers.add(polly);
        noiseMakers.add(rickAstley);
        
        ArrayList<CanSayWords> speakers = new ArrayList<>();
        // Won't compile - ape doesn't implement CanSayWords
        // speakers.add(ape);  
        speakers.add(willHung);
        speakers.add(polly);
        speakers.add(rickAstley);
        
        ArrayList<CanMakeMelody> melodizers = new ArrayList<>();
        // Won't compile - ape & willHung don't implement CanMakeMelody
//        melodizers.add(ape);
//        melodizers.add(willHung);
        melodizers.add(polly);
        melodizers.add(rickAstley);
        
        ArrayList<CanSingSong> singers = new ArrayList<>();
        // Won't compile - ape & willHung don't implement CanSingSong
//        singers.add(ape);
//        singers.add(willHung);
        singers.add(polly);
        singers.add(rickAstley);
        
        for ( CanMakeSound noiseMaker : noiseMakers ) {
            noiseMaker.makeSound();
        }
        
        for ( CanSayWords speaker : speakers ) {
            speaker.sayWords();
        }
        
        for ( CanMakeMelody melodizer : melodizers ) {
            melodizer.makeMelody();
        }
        
        for ( CanSingSong singer : singers ) {
            singer.singSong();
        }
    }
}
