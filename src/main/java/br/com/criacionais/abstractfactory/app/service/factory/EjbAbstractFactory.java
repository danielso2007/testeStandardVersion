package br.com.criacionais.abstractfactory.app.service.factory;

import br.com.criacionais.abstractfactory.app.service.services.CarEjbService;
import br.com.criacionais.abstractfactory.app.service.services.CarService;
import br.com.criacionais.abstractfactory.app.service.services.UserEjbService;
import br.com.criacionais.abstractfactory.app.service.services.UserService;

public class EjbAbstractFactory implements ServicesAbstractFactory {

    @Override
    public UserService getUserService() {
        return new UserEjbService();
    }

    @Override
    public CarService getCarService() {
        return new CarEjbService();
    }

}
