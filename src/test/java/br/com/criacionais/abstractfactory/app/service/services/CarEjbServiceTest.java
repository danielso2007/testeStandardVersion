package br.com.criacionais.abstractfactory.app.service.services;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CarEjbServiceTest {

    private static final String NEW_MODEL = "newModel";
    private static final String MODEL = "model";

    @Mock
    private CarEjbService service;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
    }

    @BeforeEach
    void setUp() throws Exception {
    }

    @AfterEach
    void tearDown() throws Exception {
    }

    @Test
    public void testSave() {
        doNothing().when(service).save(MODEL);
        service.save(MODEL);
        verify(service, times(1)).save(MODEL);
    }

    @Test
    public void testUpdate() {
        doNothing().when(service).update(NEW_MODEL);
        service.update(NEW_MODEL);
        verify(service, times(1)).update(NEW_MODEL);
    }
    
    @Test
    public void testSaveNovoServico() {
        CarEjbService servico = new CarEjbService();
        servico.save(MODEL);
    }

    @Test
    public void testUpdateServico() {
        CarEjbService servico = new CarEjbService();
        servico.update(NEW_MODEL);
    }

}
