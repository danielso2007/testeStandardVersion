package br.com.criacionais.abstractfactory.apple.factory.abstractfactory;

import br.com.criacionais.abstractfactory.apple.model.certificate.Certificate;
import br.com.criacionais.abstractfactory.apple.model.certificate.UsCertificate;
import br.com.criacionais.abstractfactory.apple.model.packing.Packing;
import br.com.criacionais.abstractfactory.apple.model.packing.UsPacking;

public class UsRulesAbstractFactory implements CountryRulesAbstractFactory {

    @Override
    public Certificate getCertificates() {
        return new UsCertificate();
    }

    @Override
    public Packing getPacking() {
        return new UsPacking();
    }

}
