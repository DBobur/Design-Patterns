package creational.factory_method.my_use.factory;

import creational.factory_method.my_use.Check;
import creational.factory_method.my_use.CheckFactory;
import creational.factory_method.my_use.model.SquareCheck;

public class SquareCheckFactory extends CheckFactory {
    @Override
    public Check createCheck() {
        return new SquareCheck();
    }
}
