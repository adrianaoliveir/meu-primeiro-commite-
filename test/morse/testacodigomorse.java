package morse;

import morse.Morse;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;


public class testacodigomorse {
private Morse morse;

@Before
public void inicializa(){
morse = new Morse();


}
@Test 
public void testaSOS(){
    morse.setMensagem("SOS");
    assertEquals("*** --- ***", morse.codifica());

}
@Test
public void testadry(){
morse.setMensagem("dry");
 assertEquals("-** *-* -*--", morse.codifica());
}
@Test
public void testaaniversario(){
morse.setMensagem("14 01 2000");
 assertEquals("*---- ****-  ----- *----  **--- ----- ----- -----", morse.codifica());
}
}
