package br.com.criacionais.abstractfactory.apple.factory.abstractfactory;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import br.com.criacionais.abstractfactory.apple.model.certificate.Certificate;
import br.com.criacionais.abstractfactory.apple.model.certificate.UsCertificate;
import br.com.criacionais.abstractfactory.apple.model.packing.Packing;
import br.com.criacionais.abstractfactory.apple.model.packing.UsPacking;

@ExtendWith(MockitoExtension.class)
public class UsRulesAbstractFactoryTest {

    private UsRulesAbstractFactory usRulesAbstractFactory;
    
    @BeforeAll
    static void setUpBeforeClass() throws Exception {
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
    }

    @BeforeEach
    void setUp() throws Exception {
        usRulesAbstractFactory = new UsRulesAbstractFactory();
    }

    @AfterEach
    void tearDown() throws Exception {
    }

    @Test
    public void testGetCertificates() {
        Certificate certificate = usRulesAbstractFactory.getCertificates();
        assertNotNull(certificate);
        assertTrue(certificate instanceof UsCertificate);
    }

    @Test
    public void testGetPacking() {
        Packing packing = usRulesAbstractFactory.getPacking();
        assertNotNull(packing);
        assertTrue(packing instanceof UsPacking);
    }

}
