package br.com.compdevbooks.model.payment;

import java.util.Date;

public class PaymentInstallment{
    
    private PaymentDocument paymentDocument; //documento de pagamento
    private Date operationDate; //data da operacao
    private Date dueDate; //data do vencimento
    private Date paymentDate; //data do pagamento
    private double originalValue; //valor original
    private double discountValue; //valor do desconto
    private double interestValue; //valor de juro
    private double fineValue; //valor de multa
    private double paidValue; //valor pago
}
