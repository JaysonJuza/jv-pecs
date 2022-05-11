package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProduser implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer firstBulldozer = new Bulldozer("Cat", "Yellow", "C3.6");
        Bulldozer secondBulldozer = new Bulldozer("Cat", "Yellow", "C27");
        Bulldozer thirdBulldozer = new Bulldozer("Cat", "Yellow", "C32");
        return List.of(firstBulldozer, secondBulldozer, thirdBulldozer);
    }
}
