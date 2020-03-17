package br.com.alura.maven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProdutoTest { 
	@Test
    public void verificaPrecoComImposto() {
        Produtos bala = new Produtos("juquinha", 0);
        assertEquals(0, bala.getPrecoComImposto());    
    } 
} 