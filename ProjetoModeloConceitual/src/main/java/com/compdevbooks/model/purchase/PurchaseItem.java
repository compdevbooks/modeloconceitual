package com.compdevbooks.model.purchase;

import com.compdevbooks.model.product.LotStock;
import com.compdevbooks.model.product.Product;

import java.util.Set;

public class PurchaseItem {

    private int amountRequested;
    private int amountReceived;
    private Product product;
    private Set<LotStock> lots;
}

