package br.com.criacionais.abstractfactory.apple.factory;

import br.com.criacionais.abstractfactory.apple.factory.abstractfactory.CountryRulesAbstractFactory;
import br.com.criacionais.abstractfactory.apple.model.iphone.Iphone;

public abstract class IphoneFactory {

    CountryRulesAbstractFactory rules;

    public IphoneFactory(CountryRulesAbstractFactory rules) {
        this.rules = rules;
    }

    public Iphone orderIphone(String level) {
        Iphone device = null;

        device = createIphone(level);

        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;
    }

    protected abstract Iphone createIphone(String level);
}
