package br.com.criacionais.abstractfactory.apple.factory.abstractfactory;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import br.com.criacionais.abstractfactory.apple.model.certificate.BrazilianCertificate;
import br.com.criacionais.abstractfactory.apple.model.certificate.Certificate;
import br.com.criacionais.abstractfactory.apple.model.packing.BrazilianPacking;
import br.com.criacionais.abstractfactory.apple.model.packing.Packing;

@ExtendWith(MockitoExtension.class)
public class BrazilianRulesAbstractFactoryTest {

    private BrazilianRulesAbstractFactory brazilianRulesAbstractFactory;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
    }

    @BeforeEach
    void setUp() throws Exception {
        brazilianRulesAbstractFactory = new BrazilianRulesAbstractFactory();
    }

    @AfterEach
    void tearDown() throws Exception {
    }

    @Test
    @DisplayName("Testando classe BrazilianCertificate")
    public void testGetCertificates() {
        Certificate certificate = brazilianRulesAbstractFactory.getCertificates();
        assertNotNull(certificate);
        assertTrue(certificate instanceof BrazilianCertificate);
    }

    @Test
    @DisplayName("Testando classe BrazilianPacking")
    public void testGetPacking() {
        Packing packing = brazilianRulesAbstractFactory.getPacking();
        assertNotNull(packing);
        assertTrue(packing instanceof BrazilianPacking);
    }

}
