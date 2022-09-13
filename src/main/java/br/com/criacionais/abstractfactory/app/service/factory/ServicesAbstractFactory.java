package br.com.criacionais.abstractfactory.app.service.factory;

import br.com.criacionais.abstractfactory.app.service.services.CarService;
import br.com.criacionais.abstractfactory.app.service.services.UserService;

public interface ServicesAbstractFactory {

    UserService getUserService();

    CarService getCarService();
}
