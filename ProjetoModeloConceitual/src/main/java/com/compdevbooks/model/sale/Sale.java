package com.compdevbooks.model.sale;

import com.compdevbooks.model.payment.Payment;
import com.compdevbooks.model.person.Client;

import java.util.Date;
import java.util.Set;

public class Sale{

    private Date registrationDate; //data do registro
    private Date receivedDate; //data do recebimento
    private Date approvalDate; //data da aprovação
    private Date processedDate; //data do processamento
    private SaleStatus status;
    private Set<SaleItem> saleItems;
    private Client client;
    private Payment payment;
}
