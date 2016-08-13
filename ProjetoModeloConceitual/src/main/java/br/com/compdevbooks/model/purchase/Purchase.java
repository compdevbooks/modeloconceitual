
package br.com.compdevbooks.model.purchase;

import br.com.compdevbooks.model.payment.Payment;
import br.com.compdevbooks.model.person.Supplier;
import java.util.Date;
import java.util.Set;

public class Purchase{

    private Date registrationDate; //data do registro
    private Date sendDate; //data do envio
    private Date receivedDate; //data do recebimento
    private Date processingDate; //data do processamento
    private PurchaseStatus status; 
    private Set<PurchaseItem> purchaseItemList;
    private Supplier provider;
    private Payment payment;
}
