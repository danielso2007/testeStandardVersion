package br.com.criacionais.abstractfactory.apple.model.certificate;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class BrazilianCertificateTest {

    private BrazilianCertificate brazilianCertificate;
    
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
    public void testApplyCertification() {
        brazilianCertificate = new BrazilianCertificate();
        assertEquals("\t- Calibrating Brasilian rules\n\t- Applying Anatel's Stamp", brazilianCertificate.applyCertification());
    }

}
