package org.perscholas.gladiatorarena;

public class Main {
    public static void main(String[] args) {
        Gladiator wonder = new Gladiator("wonder", "woman", "spear");
        Gladiator flash = new Gladiator("flash", "flash","speed");
        Arena accra = new Arena( "Accra");

        accra.addGladiator(wonder);
        accra.addGladiator(flash);
        System.out.println(accra.gladiatorsArray);
        System.out.println(accra.pickwinner());
        System.out.println(accra.name);//refer to this.name in arena class





    }
}
