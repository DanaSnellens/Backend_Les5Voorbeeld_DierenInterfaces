package pack2;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Rabbit r = new Rabbit();
        r.eatPlants();

        Herbivore h  = new Rabbit();
        h.eatPlants();

        Tiger t = new Tiger();
        t.eatMeat();

        Bear b = new Bear();
        b.getWeight();

        List<Carnivore> meatLovers = new ArrayList<>();  // Je kan ook tussen de haakjes zetten: (List.of(t, b,))
        meatLovers.add(t);
        meatLovers.add(b);
        //MAG NIET meatLovers.add(r);
    }
}