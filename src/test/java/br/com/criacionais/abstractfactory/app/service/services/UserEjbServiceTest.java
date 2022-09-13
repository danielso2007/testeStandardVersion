package br.com.criacionais.abstractfactory.app.service.services;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;
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
public class UserEjbServiceTest {

    private static final int ID = 12;
    private static final String MODEL = "model";

    @Mock
    private UserEjbService userEjbService;

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
        doNothing().when(userEjbService).save(MODEL);
        userEjbService.save(MODEL);
        verify(userEjbService, times(1)).save(MODEL);
    }

    @Test
    public void testDelete() {
        doReturn(Boolean.TRUE).when(userEjbService).delete(ID);
        assertTrue(userEjbService.delete(ID));
    }

    @Test
    public void testSaveNovoServico() {
        UserEjbService servico = new UserEjbService();
        servico.save(MODEL);
    }

    @Test
    public void testDeleteServico() {
        UserEjbService servico = new UserEjbService();
        assertTrue(servico.delete(ID));
    }

}
