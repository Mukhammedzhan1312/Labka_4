
abstract class DiscountStrategy {
    public abstract double calculateDiscount(double amount);
}

class RegularDiscount extends DiscountStrategy {
    @Override
    public double calculateDiscount(double amount) {
        return amount;
    }
}

class SilverDiscount extends DiscountStrategy {
    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.9;
    }
}

class GoldDiscount extends DiscountStrategy {
    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.8;
    }
}

class DiscountCalculator {
    public double calculateDiscount(DiscountStrategy strategy, double amount) {
        return strategy.calculateDiscount(amount);
    }
}


public class Main {
    public static void main(String[] args) {
        DiscountCalculator discountCalculator = new DiscountCalculator();

        double originalAmount = 100.0;


        DiscountStrategy regular = new RegularDiscount();
        DiscountStrategy silver = new SilverDiscount();
        DiscountStrategy gold = new GoldDiscount();

        double regularAmount = discountCalculator.calculateDiscount(regular, originalAmount);
        double silverAmount = discountCalculator.calculateDiscount(silver, originalAmount);
        double goldAmount = discountCalculator.calculateDiscount(gold, originalAmount);

        System.out.printf("Итоговая сумма (без скидки): $%.2f%n", regularAmount);
        System.out.printf("Итоговая сумма (с серебряной скидкой): $%.2f%n", silverAmount);
        System.out.printf("Итоговая сумма (с золотой скидкой): $%.2f%n", goldAmount);
    }
}
