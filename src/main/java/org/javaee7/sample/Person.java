package org.javaee7.sample;

import javax.xml.bind.annotation.XmlRootElement;
//On ajoute des trucs pour tester
//on test le branchage
// on fait le fix sur hotfix
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