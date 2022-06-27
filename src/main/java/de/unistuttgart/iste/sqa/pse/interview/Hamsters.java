package de.unistuttgart.iste.sqa.pse.interview;

import de.hamstersimulator.objectsfirst.external.model.Hamster;

/**
 * Hamster which is really hungry
 */
class HungryHamster extends Hamster {
    @Override
    public void pickGrain() {
        super.pickGrain();
        super.pickGrain();
    }
}

/**
 * Hamster which talks while eating
 */
class ChattyHamster extends Hamster { 
    @Override
    public void pickGrain() {
        super.write("I'm eating...");
        super.pickGrain();
        super.write("Ouch, I bit my tongue.");
    };
}
