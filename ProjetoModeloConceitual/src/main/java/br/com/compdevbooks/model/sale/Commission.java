package br.com.compdevbooks.model.sale;

import br.com.compdevbooks.model.person.Seller;
import java.util.Date;
import java.util.Set;

public class Commission{

    private Sale sale;
    private Set<InstallmentCommission> installmentCommissions;
}
