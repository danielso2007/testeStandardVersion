package br.com.criacionais.abstractfactory.apple.model.iphone;

import br.com.criacionais.abstractfactory.apple.factory.abstractfactory.CountryRulesAbstractFactory;

public class Iphone11 extends Iphone {
    
    public Iphone11(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    @Override
    public void getHardware() {
        System.out.println("Hardware list");
        System.out.println("\t- 6.1in Screen");
        System.out.println("\t- A13 Chipset");
        System.out.println("\t- 4Gb RAM");
        System.out.println("\t- 256Gb Memory");
    }
}
