package sample.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    @Test
    public  void testeProduto(){
        Produto produto = new Produto();
        produto.setNome("Pão Melão");
        assertEquals("Pão Melão", produto.getNome());
        produto.setTipo("Pão");
        assertEquals("Pão", produto.getTipo());
    }

}