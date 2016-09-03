package com.compdevbooks.model.person;

import java.util.Set;
import com.compdevbooks.model.address.City;

public class Seller extends NaturalPerson {

    private Set<City> cityList;
    private Set<Client> clientList;
}
