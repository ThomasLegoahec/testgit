package org.javaee7.sample;

import javax.xml.bind.annotation.XmlRootElement;
//On ajoute des trucs pour tester
//on test le branchage
<<<<<<< HEAD
// on fait le fix sur hotfix 23
=======
//on fait des trucs sur developp 23

>>>>>>> develop
/**
 * @author arungupta
 */
@XmlRootElement
public class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}