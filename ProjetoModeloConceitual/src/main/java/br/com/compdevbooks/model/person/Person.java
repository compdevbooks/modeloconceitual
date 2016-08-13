package br.com.compdevbooks.model.person;

import br.com.compdevbooks.model.address.Address;
import br.com.compdevbooks.model.address.Phone;
import java.util.Set;

public abstract class Person {

    protected String name;
    protected Address address;
    private Set<Phone> phoneList;
    
}
