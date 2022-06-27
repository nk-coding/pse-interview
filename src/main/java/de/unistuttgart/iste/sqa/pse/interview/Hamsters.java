package de.unistuttgart.iste.sqa.pse.interview;

import de.hamstersimulator.objectsfirst.datatypes.Direction;
import de.hamstersimulator.objectsfirst.datatypes.Location;
import de.hamstersimulator.objectsfirst.external.model.Hamster;
import de.hamstersimulator.objectsfirst.external.model.Territory;
import de.hamstersimulator.objectsfirst.external.simple.game.SimpleHamsterGame;

/**
 * Hamster which is really hungry
 */
class HungryHamster extends Hamster {

    HungryHamster(final Territory territory, final Location location, final Direction direction, final int grainCount) {
        super(territory, location, direction, grainCount);
    }

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

    ChattyHamster(final Territory territory, final Location location, final Direction direction, final int grainCount) {
        super(territory, location, direction, grainCount);
    }

    @Override
    public void pickGrain() {
        super.write("I'm eating...");
        super.pickGrain();
        super.write("Ouch, I bit my tongue.");
    };
}

/**
 * Sample SimpleHamsterGame demonstrating HungryHamster and ChattyHamster
 */
class ExampleHamsterGame extends SimpleHamsterGame {

    @Override
    protected void run() {
    
        final Hamster paule = new Hamster(this.game.getTerritory(), Location.from(1,1), Direction.WEST, 0);
        final HungryHamster hungryPaule = new HungryHamster(this.game.getTerritory(), Location.from(1,1), Direction.WEST, 0);
        final ChattyHamster chattyPaule = new ChattyHamster(this.game.getTerritory(), Location.from(1,1), Direction.WEST, 0);
        
        final Hamster h1 = paule;
        final Hamster h2 = hungryPaule;
        final Hamster h3 = Math.random() < 0.5 ? hungryPaule : chattyPaule;
        
        h1.move();
        h2.move();
        h3.move();
    }

}