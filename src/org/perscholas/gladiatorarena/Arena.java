package org.perscholas.gladiatorarena;

public class Arena extends Gladiator{
    public String name;

    public Arena (String firstname, String lastname, String weapon, String name) {
        super(firstname, lastname, weapon);
        this.name = name;
    }
}
