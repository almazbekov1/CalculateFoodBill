package moscow.calculatefoodbill;

/**
 * Hello world!
 *
 */
public class App
{

    private static final double OTHER_SUM = 2440;

    public static void main(String[] args) {
        System.out.println(calculate(FoodDinner.КУРИЦА_ПО_ВОСТОЧНОМУ));
    }

    /**
     * @param food - блюдо которые вы заказывали на вечер 12.02.2023 в заведении "Долина"
     * @field OTHER_SUM - сумма включающая в себя салаты, напитки и тд
     * @return  возвращает конечную цену за еду, салаты чай и т.д. (включая 10%)
     */
    static double calculate(FoodDinner food){
        return food.price + food.price / 10 + (OTHER_SUM + OTHER_SUM / 10) / 8;
    }

    enum FoodDinner {

        ЧУЧВАРА(270),
        ЛЮЛЯ_КЕБАБ(500),
        ЛАГМАН_ЖАРЕНЫЙ(340),
        ЖАРКОЕ_БАРИНАЫ(460),
        СТЕЙК_СЕМГИ(550),
        КУРИЦА_ПО_ВОСТОЧНОМУ(480);

        double price;

        FoodDinner(double price) {
            this.price = price;
        }
    }
}
