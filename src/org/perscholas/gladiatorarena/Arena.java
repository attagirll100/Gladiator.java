package org.perscholas.gladiatorarena;

import java.util.ArrayList;

public class Arena {
    public String name;
    public ArrayList<Gladiator> gladiatorsArray = new ArrayList<Gladiator>();// creating arraylist that will only contain gladiator objects that i created in main.java that i created from the gladitor class
//the class is not the object the object is define by the class
    public Arena ( String name) {//the world name in line 10 and line 9name refers to line 7 input but this.name is different because it is refering to the string on line 13
        this.name = name;//property name of arena class
        //they all say name but they refers to different pieces

    }
    public void addGladiator (Gladiator gladiator) {

        gladiatorsArray.add(gladiator);

    }
    public Gladiator pickwinner(){
        return gladiatorsArray.get(0);
    }

}
