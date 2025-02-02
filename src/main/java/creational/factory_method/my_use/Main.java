package creational.factory_method.my_use;

import creational.factory_method.my_use.factory.PayPalCheckFactory;
import creational.factory_method.my_use.factory.StripeCheckFactory;

public class Main {
    public static void main(String[] args) {

        CheckFactory payPalFactory = new PayPalCheckFactory();
        Check payPalCheck = payPalFactory.createCheck();
        System.out.println(payPalCheck.check());


        CheckFactory stripeFactory = new StripeCheckFactory();
        Check stripeCheck = stripeFactory.createCheck();
        System.out.println(stripeCheck.check());
    }
}

