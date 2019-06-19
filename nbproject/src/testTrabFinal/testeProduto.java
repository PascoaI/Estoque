import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import TrabFinal.Produto;

public class testeProduto {
	Produto PO;

	void setUp() throws Exception {
	}

	@Test
	public void Produto1() {
		PO = new Produto();
                PO.setQtdProduto(15);
                assertEquals(15, PO.getQtdProduto());
		}
        
        @Test
        public void testVerifyQtd() {
            PO = new Produto();
            assertTrue(PO.verificaQtdProd(12));
        }
}

