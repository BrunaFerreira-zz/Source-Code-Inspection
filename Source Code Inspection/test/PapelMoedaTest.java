/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.calebe.ticketmachine.core.PapelMoeda;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 31596861
 */
public class PapelMoedaTest {
    
    public PapelMoedaTest() {
    }
    
    @Test
    public void obterValorPapelMoedaTest() {
        PapelMoeda dinheiro = new PapelMoeda(20,5);
        assertEquals(20, dinheiro.getValor());
        assertEquals(5,dinheiro.getQuantidade());
        dinheiro.setQuantidade(8);
        assertEquals(8, dinheiro.getQuantidade());
        assertEquals(20,dinheiro.getValor());
    }
  
}
