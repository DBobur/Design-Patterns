package creational.factory_method.my_use.model;

import creational.factory_method.my_use.Check;

public class PayPalCheck implements Check {
    @Override
    public String check() {
        return "PayPal Check";
    }
}
