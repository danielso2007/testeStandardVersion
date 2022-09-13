package br.com.criacionais.abstractfactory.app.service.factory;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import br.com.criacionais.abstractfactory.app.service.services.CarRestApiService;
import br.com.criacionais.abstractfactory.app.service.services.CarService;
import br.com.criacionais.abstractfactory.app.service.services.UserRestApiService;
import br.com.criacionais.abstractfactory.app.service.services.UserService;

@ExtendWith(MockitoExtension.class)
public class RestAbstractFactoryTest {

    private RestAbstractFactory restAbstractFactory;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
    }

    @BeforeEach
    void setUp() throws Exception {
        restAbstractFactory = new RestAbstractFactory();
    }

    @AfterEach
    void tearDown() throws Exception {
    }

    @Test
    public void testGetUserService() {
        UserService service = restAbstractFactory.getUserService();
        assertTrue(service instanceof UserRestApiService);
    }

    @Test
    public void testGetCarService() {
        CarService service = restAbstractFactory.getCarService();
        assertTrue(service instanceof CarRestApiService);
    }

}
