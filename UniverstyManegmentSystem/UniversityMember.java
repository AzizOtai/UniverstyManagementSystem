/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UniverstyManegmentSystem;

/**
 *
 * @author otaishan
 */
public abstract class UniversityMember implements Person {
    private String name;
    private String id;

    public UniversityMember(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
    

    public abstract double calculateGPA();
}
