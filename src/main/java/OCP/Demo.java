package OCP;

import OCP.After.AndSpecification;
import OCP.After.BetterFilter;
import OCP.After.ColorSpecification;
import OCP.After.SizeSpecification;
import OCP.Before.ProductFilter;

import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Product apple = new Product("Apple", Color.RED, Size.SMALL);
        Product house = new Product("House", Color.BLUE, Size.LARGE);
        Product car = new Product("Car", Color.GREEN, Size.MEDIUM);

        List<Product> products = Arrays.asList(apple, house, car);

        ProductFilter pf = new ProductFilter();
        System.out.println("Green products (old): ");
        pf.filterByColor(products, Color.GREEN)
                .forEach(p -> System.out.println(" - " + p.name + " is green"));

        BetterFilter bf = new BetterFilter();
        System.out.println("Green products (new): ");
        bf.filter(products, new ColorSpecification(Color.GREEN))
                .forEach(p -> System.out.println(" - " + p.name + " is green"));

        System.out.println("Large Blue products: ");
        bf.filter(products, new AndSpecification<>(
                new ColorSpecification(Color.BLUE),
                new SizeSpecification(Size.LARGE)
        )).forEach(p -> System.out.println(" - " + p.name + " is large and blue"));
    }
}
