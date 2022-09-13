package br.com.criacionais.abstractfactory.apple.factory;

import br.com.criacionais.abstractfactory.apple.factory.abstractfactory.CountryRulesAbstractFactory;
import br.com.criacionais.abstractfactory.apple.model.iphone.Iphone;
import br.com.criacionais.abstractfactory.apple.model.iphone.IphoneX;
import br.com.criacionais.abstractfactory.apple.model.iphone.IphoneXsMax;

public class IphoneXfactory extends IphoneFactory {

    public IphoneXfactory(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    @Override
    public Iphone createIphone(String level) {
        if ("standard".equals(level)) {
            return new IphoneX(rules);
        } else if ("highEnd".equals(level)) {
            return new IphoneXsMax(rules);
        } else {
            return null;
        }
    }

}
