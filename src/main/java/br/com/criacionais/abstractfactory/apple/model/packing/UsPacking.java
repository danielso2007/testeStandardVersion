package br.com.criacionais.abstractfactory.apple.model.packing;

public class UsPacking implements Packing {

    @Override
    public String pack() {
        return "\t- Packing in English";
    }

}
