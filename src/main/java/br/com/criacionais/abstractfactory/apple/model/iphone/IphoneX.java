package br.com.criacionais.abstractfactory.apple.model.iphone;

import br.com.criacionais.abstractfactory.apple.factory.abstractfactory.CountryRulesAbstractFactory;

public class IphoneX extends Iphone {

    public IphoneX(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    @Override
    public void getHardware() {
        System.out.println("Hardware list");
        System.out.println("\t- 5.8in Screen");
        System.out.println("\t- A11 Chipset");
        System.out.println("\t- 3Gb RAM");
        System.out.println("\t- 256Gb Memory");
    }
}
