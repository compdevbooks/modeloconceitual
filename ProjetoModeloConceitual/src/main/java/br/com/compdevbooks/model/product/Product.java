package br.com.compdevbooks.model.product;

import br.com.compdevbooks.model.person.Supplier;
import java.util.Set;

public class Product{

    private String name;
    private String description;
    private String image;
    private float profitMarginPerc; // percentual de margem de lucro
    private float promotionPerc; //percentual de promocao
    private float sellerCommissionPerc; //percentual de comissao
    private float purchaseValue; //valor de compra
    private float saleValue; //valor de venda
    private int minimumStock; // estoque minimo
    private int maximumStock; // estoque maximo
    private Category category; 
    private Set<Supplier> suppliers; //lista de fornecedores
    private Set<LotStock> lotSock;
}

