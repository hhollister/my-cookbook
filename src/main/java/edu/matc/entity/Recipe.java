package edu.matc.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * A class to represent a recipe.
 *
 * @author Heather Hollister
 */
@Entity
@Table(name = "recipes")
public class Recipe {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id")
    private int recipeid;

    @Column(name = "user_id")
    private int user_id;

    @Column(name = "recipe_name")
    private String recipe_name;

    @Column(name = "meal_category")
    private String meal_category;

    @Column(name = "food_category")
    private String food_category;

    @Column(name = "preparation_time")
    private int preparation_time;

    @Column(name = "cook_time")
    private int cook_time;

    @Column(name = "yield")
    private int yield;

    @Column(name = "preheat_temperature")
    private int preheat_temperature;

    @Column(name = "notes")
    private String notes;

    //private int totalTime;


    //constructor
    public Recipe() {

    }

    /**
     * Instantiates a new User.
     *
     * @param user_id
     * @param recipe_name
     * @param meal_category
     * @param food_category
     * @param preparation_time
     * @param cook_time
     * @param yield
     * @param preheat_temperature
     * @param notes
     */
    public Recipe(int user_id, String recipe_name, String meal_category, String food_category, int preparation_time, int cook_time, int yield, int preheat_temperature, String notes) {
        this.user_id = user_id;
        this.recipe_name = recipe_name;
        this.meal_category = meal_category;
        this.food_category = food_category;
        this.preparation_time = preparation_time;
        this.cook_time = cook_time;
        this.yield = yield;
        this.preheat_temperature = preheat_temperature;
        this.notes = notes;
    }

    /**
     * @return user_id
     */
    public int getUser_id() {
        return user_id;
    }

    /**
     * @param user_id
     */
    public void setUser_id(int user_id) {
        this.user_id = user_id;
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
     * @return recipe_name
     */
    public String getRecipe_name() {
        return recipe_name;
    }

    /**
     * @param recipe_name
     */
    public void setRecipe_name(String recipe_name) {
        this.recipe_name = recipe_name;
    }

    /**
     * @return meal_category
     */
    public String getMeal_category() {
        return meal_category;
    }

    /**
     * @param meal_category
     */
    public void setMeal_category(String meal_category) {
        this.meal_category = meal_category;
    }

    /**
     * @return food_category
     */
    public String getFood_category() {
        return food_category;
    }

    /**
     * @param food_category
     */
    public void setFood_category(String food_category) {
        this.food_category = food_category;
    }

    /**
     * @return preparation_time
     */
    public int getPreparation_time() {
        return preparation_time;
    }

    /**
     * @param preparation_time
     */
    public void setPreparation_time(int preparation_time) {
        this.preparation_time = preparation_time;
    }

    /**
     * @return cook_time
     */
    public int getCook_time() {
        return cook_time;
    }

    /**
     * @param cook_time
     */
    public void setCook_time(int cook_time) {
        this.cook_time = cook_time;
    }

    /**
     * @return yield
     */
    public int getYield() {
        return yield;
    }

    /**
     * @param yield
     */
    public void setYield(int yield) {
        this.yield = yield;
    }

    /**
     * @return preheat_temperature
     */
    public int getPreheat_temperature() {
        return preheat_temperature;
    }

    /**
     * @param preheat_temperature
     */
    public void setPreheat_temperature(int preheat_temperature) {
        this.preheat_temperature = preheat_temperature;
    }

    /**
     * @return notes
     */
    public String getNotes() {
        return notes;
    }

    /**
     * @param notes
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }

    //public int getTotalTime() {
    //    return totalTime;
    //}

    //public void setTotalTime() {
    //    totalTime = preparation_time + cook_time;
    //}

    @Override
    public String toString() {
        return "Recipe{" +
                "recipeid=" + recipeid +
                ", user_id=" + user_id +
                ", recipe_name='" + recipe_name + '\'' +
                ", meal_category='" + meal_category + '\'' +
                ", food_category='" + food_category + '\'' +
                ", preparation_time=" + preparation_time +
                ", cook_time=" + cook_time +
                ", yield=" + yield +
                ", preheat_temperature=" + preheat_temperature +
                ", notes='" + notes + '\'' +
                '}';
    }
}
