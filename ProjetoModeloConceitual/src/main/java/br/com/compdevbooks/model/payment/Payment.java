package br.com.compdevbooks.model.payment;

import java.util.Set;

public class Payment{
    
    private PaymentMethod paymantMethod;
    private PaymentStatus paymentStatus;
    private Set<InstallmentPayment> installmentPayments;
}
