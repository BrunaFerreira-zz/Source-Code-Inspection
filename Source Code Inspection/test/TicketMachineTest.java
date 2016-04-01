/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.calebe.ticketmachine.core.TicketMachine;
import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 31596861
 */
public class TicketMachineTest {
    
    public TicketMachineTest() {
    }
    @Test
    public void inserirValorPapelMoedaTest() throws PapelMoedaInvalidaException {
        TicketMachine nota = new TicketMachine(100);
        nota.inserir(100);
        assertEquals(100,nota.getSaldo());
    }
}
