package com.compdevbooks.model.sale;

import com.compdevbooks.model.payment.InstallmentPayment;

import java.util.Date;

public class InstallmentCommission {

    private Date dueDate; //data do vencimento
    private Date paymentDate; //data do pagamento
    private float installmentValue; //valor da parcela
    private InstallmentPayment installmentPayment;
}

