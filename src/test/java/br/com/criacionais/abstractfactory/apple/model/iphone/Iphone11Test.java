package br.com.criacionais.abstractfactory.apple.model.iphone;

import static org.junit.jupiter.api.Assertions.assertNotNull;
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
import br.com.criacionais.abstractfactory.apple.factory.abstractfactory.CountryRulesAbstractFactory;

@ExtendWith(MockitoExtension.class)
public class Iphone11Test {

    @Mock
    private Iphone11 phone;
    
    @Mock
    private CountryRulesAbstractFactory rules;
    
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
    public void testGetHardware() {
        doNothing().when(phone).getHardware();
        phone.getHardware();
        verify(phone, times(1)).getHardware();
    }

    @Test
    public void testIphone11() {
        phone = new Iphone11(rules);
        phone.getHardware();
        assertNotNull(phone);
    }

}
