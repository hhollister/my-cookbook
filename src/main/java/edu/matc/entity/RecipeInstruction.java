package edu.matc.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * A class to represent a recipe.
 *
 * @author Heather Hollister
 */
@Entity
@Table(name = "recipe_instructions")
public class RecipeInstruction {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id")
    private int instructionsid;

    @Column(name = "recipe_id")
    private int recipeid;

    @Column(name = "instruction")
    private String instruction;

    //constructor
    public RecipeInstruction() {

    }

    /**
     * Instantiates a new User.
     *
     * @param recipeid
     * @param instruction
     */
    public RecipeInstruction(int recipeid, String instruction) {
        this.recipeid = recipeid;
        this.instruction = instruction;
    }

    /**
     * @return instructionsid
     */
    public int getInstructionsid() {
        return instructionsid;
    }

    /**
     * @param instructionsid
     */
    public void setInstructionsid(int instructionsid) {
        this.instructionsid = instructionsid;
    }

    /**
     * @return recipeid
     */
    public int getRecipeid() {
        return recipeid;
    }

    /**
     * @param recipeid
     */
    public void setRecipeid(int recipeid) {
        this.recipeid = recipeid;
    }

    /**
     * @return instruction
     */
    public String getInstruction() {
        return instruction;
    }

    /**
     * @param instruction
     */
    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    @Override
    public String toString() {
        return "RecipeInstruction{" +
                "instructionsid=" + instructionsid +
                ", recipeid=" + recipeid +
                ", instruction='" + instruction + '\'' +
                '}';
    }
}
