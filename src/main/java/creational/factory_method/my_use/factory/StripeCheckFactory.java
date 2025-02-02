package creational.factory_method.my_use.factory;

import creational.factory_method.my_use.Check;
import creational.factory_method.my_use.CheckFactory;
import creational.factory_method.my_use.model.StripeCheck;

public class StripeCheckFactory extends CheckFactory {
    @Override
    public Check createCheck() {
        return new StripeCheck();
    }
}
