package br.com.criacionais.abstractfactory.apple.model.packing;

public class BrazilianPacking implements Packing {

    @Override
    public String pack() {
        return "\t- Empacotando em Portugues";
    }

}
