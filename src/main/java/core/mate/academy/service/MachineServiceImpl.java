package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl<T> implements MachineService<T> {
    @Override
    public List<T> getAll(Class<? extends Machine> type) {
        if (type == Bulldozer.class) {
            return (List<T>) new Bulldozer().get();
        }
        if (type == Truck.class) {
            return (List<T>) new Truck().get();
        }
        if (type == Excavator.class) {
            return (List<T>) new Excavator().get();
        } else {
            return new ArrayList<>();
        }
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        int size = machines.size();
        for (int i = 0; i < size; i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> list) {

    }
}
