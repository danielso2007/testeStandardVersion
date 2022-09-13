package br.com.criacionais.abstractfactory.apple.factory;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import br.com.criacionais.abstractfactory.apple.factory.abstractfactory.CountryRulesAbstractFactory;
import br.com.criacionais.abstractfactory.apple.model.certificate.Certificate;
import br.com.criacionais.abstractfactory.apple.model.iphone.Iphone;
import br.com.criacionais.abstractfactory.apple.model.iphone.IphoneX;
import br.com.criacionais.abstractfactory.apple.model.iphone.IphoneXsMax;
import br.com.criacionais.abstractfactory.apple.model.packing.Packing;

@ExtendWith(MockitoExtension.class)
public class IphoneXfactoryTest {

    public static final String STANDARD = "standard";
    public static final String HIGH_END = "highEnd";
    
    private IphoneXfactory iphoneXfactory;
    
    @Mock
    private CountryRulesAbstractFactory rules;
    
    @Mock
    private Certificate certificate;

    @Mock
    private Packing packing;

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
    public void testCreateIphoneStandard() {
        iphoneXfactory = new IphoneXfactory(rules);
        Iphone iphone = iphoneXfactory.createIphone(STANDARD);
        assertTrue(iphone instanceof IphoneX);
    }
    
    @Test
    public void testCreateIphoneHighEnd() {
        iphoneXfactory = new IphoneXfactory(rules);
        Iphone iphone = iphoneXfactory.createIphone(HIGH_END);
        assertTrue(iphone instanceof IphoneXsMax);
    }
    
    @Test
    public void testCreateIphoneLevel() {
        iphoneXfactory = new IphoneXfactory(rules);
        Iphone iphone = iphoneXfactory.createIphone("x");
        assertNull(iphone);
    }

    @Test
    public void testIphoneXfactory() {
        iphoneXfactory = new IphoneXfactory(rules);
        assertNotNull(iphoneXfactory);
    }

    @Test
    public void testIphoneFactory() {
        IphoneFactory factory = new IphoneXfactory(rules);
        assertNotNull(factory);
        assertTrue(factory instanceof IphoneXfactory);
    }

    @Test
    public void testOrderIphone() {
        doReturn(certificate).when(rules).getCertificates();
        doReturn("ok").when(certificate).applyCertification();
        doReturn(packing).when(rules).getPacking();
        doReturn("1.0.0").when(packing).pack();
        iphoneXfactory = new IphoneXfactory(rules);
        Iphone iphone = iphoneXfactory.orderIphone(STANDARD);
        assertTrue(iphone instanceof IphoneX);
    }

}
