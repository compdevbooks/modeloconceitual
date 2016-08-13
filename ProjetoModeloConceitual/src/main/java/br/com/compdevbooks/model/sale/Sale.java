package br.com.compdevbooks.model.sale;

import br.com.compdevbooks.model.payment.Payment;
import br.com.compdevbooks.model.person.Client;
import java.util.Date;
import java.util.Set;

public class Sale{

    private Date registrationDate; //data do registro
    private Date receivedDate; //data do recebimento
    private Date approvalDate; //data da aprovação
    private Date processingDate; //data do processamento
    private SaleStatus status;
    private Set<SaleItem> saleItemList;
    private Client client;
    private Payment payment;
}