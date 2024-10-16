package org.example;

public class ChickenMealDecorator extends MealDecorator {

    public ChickenMealDecorator(Meal meal) {
        super(meal);
    }

    @Override
    public void prepareMeal() {
        meal.prepareMeal();
        addChciken();
    }

    private void addChciken() {
        System.out.println("Dodaję kurczaka do dania.");
    }

}
