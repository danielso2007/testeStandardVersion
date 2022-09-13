package br.com.criacionais.abstractfactory.apple;

import br.com.criacionais.abstractfactory.apple.factory.Iphone11Factory;
import br.com.criacionais.abstractfactory.apple.factory.IphoneFactory;
import br.com.criacionais.abstractfactory.apple.factory.IphoneXfactory;
import br.com.criacionais.abstractfactory.apple.factory.abstractfactory.BrazilianRulesAbstractFactory;
import br.com.criacionais.abstractfactory.apple.factory.abstractfactory.CountryRulesAbstractFactory;
import br.com.criacionais.abstractfactory.apple.model.iphone.Iphone;

public class Client {

    public static void main(String[] args) {
        CountryRulesAbstractFactory rules = new BrazilianRulesAbstractFactory();
        // CountryRulesAbstractFactory rules = new USRulesAbstractFactory();

        IphoneFactory genXfactory = new IphoneXfactory(rules);
        IphoneFactory gen11Factory = new Iphone11Factory(rules);

        System.out.println("### Ordering an iPhone X");
        Iphone iphone = genXfactory.orderIphone("standard");
        System.out.println(iphone);

        System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
        Iphone iphone2 = gen11Factory.orderIphone("highEnd");
        System.out.println(iphone2);
    }
}
