package br.com.compdevbooks.model.payment;

import java.util.Set;

public class Payment{
    
    private PaymentType paymantType;
    private PaymentStatus paymentStatus;
    private Set<PaymentInstallment> installmentList;
}
