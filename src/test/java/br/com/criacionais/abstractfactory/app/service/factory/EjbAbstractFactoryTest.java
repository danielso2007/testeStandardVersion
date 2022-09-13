package br.com.criacionais.abstractfactory.app.service.factory;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import br.com.criacionais.abstractfactory.app.service.services.CarEjbService;
import br.com.criacionais.abstractfactory.app.service.services.CarService;
import br.com.criacionais.abstractfactory.app.service.services.UserEjbService;
import br.com.criacionais.abstractfactory.app.service.services.UserService;

@ExtendWith(MockitoExtension.class)
public class EjbAbstractFactoryTest {

    private EjbAbstractFactory ejbAbstractFactory;
    
    @BeforeAll
    static void setUpBeforeClass() throws Exception {
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
    }

    @BeforeEach
    void setUp() throws Exception {
        ejbAbstractFactory = new EjbAbstractFactory();
    }

    @AfterEach
    void tearDown() throws Exception {
    }

    @Test
    public void testGetUserService() {
        UserService service = ejbAbstractFactory.getUserService();
        assertTrue(service instanceof UserEjbService);
    }

    @Test
    public void testGetCarService() {
        CarService service = ejbAbstractFactory.getCarService();
        assertTrue(service instanceof CarEjbService);
    }

}
