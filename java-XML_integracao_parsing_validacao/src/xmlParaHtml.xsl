<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">]
    <xsl:template match="venda">
        <h2>Venda</h2>
        <p>Forma de pagamento: <xsl:value-of select="formaDePagamento" /></p>
    </xsl:template>
    <xsl:template match="produto">
        <h3><xsl:value-of select="nome" /></h3>
        <p>R$: <xsl:value-of select="preco" /></p>
    </xsl:template>
    <hr />

</xsl:stylesheet>