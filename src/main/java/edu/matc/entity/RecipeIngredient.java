package edu.matc.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * A class to represent a recipe.
 *
 * @author Heather Hollister
 */
@Entity
@Table(name = "recipe_ingredient")
public class RecipeIngredient {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id")
    private int ingredientid;

    @Column(name = "recipe_id")
    private int recipeid;

    @Column(name = "ingredient")
    private String ingredient;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "units_measurement")
    private String units_measurement;

    //constructor
    public RecipeIngredient() {

    }

    /**
     * Instantiates a new User.
     *
     * @param recipeid
     * @param ingredient
     * @param quantity
     * @param units_measurement
     */
    public RecipeIngredient(int recipeid, String ingredient, int quantity, String units_measurement) {
        this.recipeid = recipeid;
        this.ingredient = ingredient;
        this.quantity = quantity;
        this.units_measurement = units_measurement;
    }

    /**
     * @return ingredientid
     */
    public int getIngredientid() {
        return ingredientid;
    }

    /**
     * @param ingredientid
     */
    public void setIngredientid(int ingredientid) {
        this.ingredientid = ingredientid;
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
     * @return ingredient
     */
    public String getIngredient() {
        return ingredient;
    }

    /**
     * @param ingredient
     */
    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    /**
     * @return quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return units_measurement
     */
    public String getUnits_measurement() {
        return units_measurement;
    }

    /**
     * @param units_measurement
     */
    public void setUnits_measurement(String units_measurement) {
        this.units_measurement = units_measurement;
    }

    @Override
    public String toString() {
        return "RecipeIngredient{" +
                "ingredientid=" + ingredientid +
                ", recipeid=" + recipeid +
                ", ingredient='" + ingredient + '\'' +
                ", quantity=" + quantity +
                ", units_measurement='" + units_measurement + '\'' +
                '}';
    }
}
