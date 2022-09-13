package br.com.criacionais.abstractfactory.apple.factory;

import br.com.criacionais.abstractfactory.apple.factory.abstractfactory.CountryRulesAbstractFactory;
import br.com.criacionais.abstractfactory.apple.model.iphone.Iphone;
import br.com.criacionais.abstractfactory.apple.model.iphone.Iphone11;
import br.com.criacionais.abstractfactory.apple.model.iphone.Iphone11Pro;

public class Iphone11Factory extends IphoneFactory {

    public Iphone11Factory(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    @Override
    public Iphone createIphone(String level) {
        if ("standard".equals(level)) {
            return new Iphone11(rules);
        } else if ("highEnd".equals(level)) {
            return new Iphone11Pro(rules);
        } else {
            return null;
        }
    }

}
