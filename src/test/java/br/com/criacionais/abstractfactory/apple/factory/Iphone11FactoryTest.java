package br.com.criacionais.abstractfactory.apple.factory;

import br.com.criacionais.abstractfactory.apple.factory.abstractfactory.CountryRulesAbstractFactory;
import br.com.criacionais.abstractfactory.apple.model.certificate.Certificate;
import br.com.criacionais.abstractfactory.apple.model.iphone.Iphone;
import br.com.criacionais.abstractfactory.apple.model.iphone.Iphone11;
import br.com.criacionais.abstractfactory.apple.model.iphone.Iphone11Pro;
import br.com.criacionais.abstractfactory.apple.model.packing.Packing;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.junit.jupiter.api.DisplayName;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.doReturn;

@ExtendWith(MockitoExtension.class)
public class Iphone11FactoryTest {

    public static final String STANDARD = "standard";
    public static final String HIGH_END = "highEnd";

    @Mock
    private Iphone11Factory iphone11Factory;
    
    @Mock
    private CountryRulesAbstractFactory rules;

    @Mock
    private Iphone iphone;

    @Mock
    private Certificate certificate;

    @Mock
    private Packing packing;
    
    @BeforeAll
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterAll
    public static void tearDownAfterClass() throws Exception {
    }

    @BeforeEach
    public void setUp() throws Exception {
    }

    @AfterEach
    public void tearDown() throws Exception {
    }

    @Test
    public void testCreateIphoneStandard() {
        Iphone11Factory iphone11Factory = new Iphone11Factory(rules);
        Iphone iphone = iphone11Factory.createIphone(STANDARD);
        assertTrue(iphone instanceof Iphone11);
    }
    
    @Test
    public void testCreateIphoneHighEnd() {
        Iphone11Factory iphone11Factory = new Iphone11Factory(rules);
        Iphone iphone = iphone11Factory.createIphone(HIGH_END);
        assertTrue(iphone instanceof Iphone11Pro);
    }
    
    @Test
    public void testCreateIphoneLevel() {
        Iphone11Factory iphone11Factory = new Iphone11Factory(rules);
        Iphone iphone = iphone11Factory.createIphone("x");
        assertNull(iphone);
    }

    @Test
    public void testIphone11Factory() {
        Iphone11Factory iphone11Factory = new Iphone11Factory(rules);
        assertNotNull(iphone11Factory);
    }

    @Test
    @DisplayName("Testando orderIphone de Iphone")
    public void testOrderIphone() {
        doReturn(certificate).when(rules).getCertificates();
        doReturn("ok").when(certificate).applyCertification();
        doReturn(packing).when(rules).getPacking();
        doReturn("1.0.0").when(packing).pack();
        Iphone11Factory iphone11Factory = new Iphone11Factory(rules);
        Iphone iphoneReturn = iphone11Factory.orderIphone(STANDARD);
        assertNotNull(iphoneReturn);
    }

}
