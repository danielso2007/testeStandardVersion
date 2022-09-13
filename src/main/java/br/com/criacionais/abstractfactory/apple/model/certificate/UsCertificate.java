package br.com.criacionais.abstractfactory.apple.model.certificate;

public class UsCertificate implements Certificate {

    @Override
    public String applyCertification() {
        return "\t- Calibrating US rules";
    }

}
