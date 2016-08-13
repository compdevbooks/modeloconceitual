package br.com.compdevbooks.model.sale;

import br.com.compdevbooks.model.person.Seller;
import java.util.Date;
import java.util.Set;

public class Commission{

    private Date saleDate;
    private Sale sale;
    private Seller seller;
    private Set<CommissionInstallment> commissionInstallmentList;
}
