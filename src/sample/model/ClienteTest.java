package sample.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    public  void testeCliente(){
        Cliente cliente = new Cliente();
        cliente.setNome("Laura");
        assertEquals("Laura", cliente.getNome());
        cliente.setCpf("000.000.000-00");
        assertEquals("000.000.000-00", cliente.getCpf());
    }

}
