package com.course.shopsystem.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.course.shopsystem.entities.Category;
import com.course.shopsystem.entities.Order;
import com.course.shopsystem.entities.Product;
import com.course.shopsystem.entities.User;
import com.course.shopsystem.entities.enums.OrderStatus;
import com.course.shopsystem.repositories.CategoryRepository;
import com.course.shopsystem.repositories.OrderRepository;
import com.course.shopsystem.repositories.ProductRepository;
import com.course.shopsystem.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        // Generate three categories
        Category c1 = new Category(null, "Electronics");
        Category c2 = new Category(null, "Books");
        Category c3 = new Category(null, "Computers");

        categoryRepository.saveAll(Arrays.asList(c1, c2, c3));

        // Generate three products
        Product p1 = new Product(null, "iPhone", "", 900.0, "");
        Product p2 = new Product(null, "Notebook", "", 1500.0, "");
        Product p3 = new Product(null, "Computador", "", 2000.0, "");

        p1.getCategories().add(c1);
        p2.getCategories().add(c1);
        p2.getCategories().add(c3);
        p3.getCategories().add(c1);
        p3.getCategories().add(c3);

        productRepository.saveAll(Arrays.asList(p1, p2, p3));

        // Generate five users
        User u1 = new User(null, "Maria Brown", "maria@gmail", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail", "977777777", "123456");
        User u3 = new User(null, "Bob Grey", "bob@gmail", "966666666", "123456");
        User u4 = new User(null, "Anna White", "anna@gmail", "955555555", "123456");
        User u5 = new User(null, "John Black", "john@gmail", "944444444", "123456");

        userRepository.saveAll(Arrays.asList(u1, u2, u3, u4, u5));

        // Generate orders for the first user
        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.WAITING_PAYMENT, u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.CANCELED, u1);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u2);
        Order o4 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u3);
        Order o5 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.PAID, u4);
        Order o6 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.SHIPPED, u5);

        orderRepository.saveAll(Arrays.asList(o1, o2, o3, o4, o5, o6));


    }
}
