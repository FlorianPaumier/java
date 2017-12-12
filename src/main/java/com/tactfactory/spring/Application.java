package com.tactfactory.spring;

import com.tactfactory.spring.entity.Order;
import com.tactfactory.spring.entity.OrderProduct;
import com.tactfactory.spring.entity.Product;
import com.tactfactory.spring.repository.OrderProductRepository;
import com.tactfactory.spring.repository.OrderRepository;
import com.tactfactory.spring.repository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.tactfactory.spring.entity.Customer;
import com.tactfactory.spring.repository.CustomerRepository;

@SpringBootApplication
public class Application {

    private static final Logger log =
            LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner demo(CustomerRepository customerRepository,
                                  OrderRepository orderRepository,
                                  ProductRepository productRepository,
                                  OrderProductRepository orderProductRepository) {
        return (args) -> {
            customerRepository.deleteAll();
            orderRepository.deleteAll();
            productRepository.deleteAll();
            orderProductRepository.deleteAll();

            Customer customer = new Customer("Mickael", "Gaillard");

            Order order1 =  new Order(100, customer);
            Order order2 =  new Order(100, customer);
            Order order3 =  new Order(100, customer);
            Order order4 =  new Order(100, customer);
            Order order5 =  new Order(100, customer);

            Product product = new Product("lait", "plouf", 2, false,
                    20,"blabal");
            Product product1 = new Product("lait", "plouf", 2, false,
                    20,"blabal");
            Product product2 = new Product("lait", "plouf", 2, false,
                    20,"blabal");
            Product product3 = new Product("lait", "plouf", 2, false,
                    20,"blabal");
            Product product4 = new Product("lait", "plouf", 2, false,
                    20,"blabal");
            Product product5 = new Product("lait", "plouf", 2, false,
                    20,"blabal");
            Product product6 = new Product("lait", "plouf", 2, false,
                    20,"blabal");


            OrderProduct orderProduct = new OrderProduct(order1,product6);
            OrderProduct orderProduct2 = new OrderProduct(order2,product2);
            OrderProduct orderProduct3 = new OrderProduct(order3,product);

            customerRepository.save(customer);

            customerRepository.save(new Customer("Jack", "Bauer"));
            customerRepository.save(new Customer("Chloe", "O'Brian"));
            customerRepository.save(new Customer("Kim", "Bauer"));
            customerRepository.save(new Customer("David", "Palmer"));
            customerRepository.save(new Customer("Michelle", "Dessler"));

            orderRepository.save(order1);
            orderRepository.save(order2);
            orderRepository.save(order3);
            orderRepository.save(order4);
            orderRepository.save(order5);


            productRepository.save(product);
            productRepository.save(product1);
            productRepository.save(product2);
            productRepository.save(product3);
            productRepository.save(product4);
            productRepository.save(product5);
            productRepository.save(product6);


            orderProductRepository.save(orderProduct);
            orderProductRepository.save(orderProduct2);
            orderProductRepository.save(orderProduct3);


            log.info("Customers found with findAll():");
            log.info("-------------------------------");
            for (Customer cus : customerRepository.findAll()) {
                log.info(cus.toString());
            }
            log.info("");

            log.info("Customer found with findOne(1L):");
            log.info("--------------------------------");
            customer = customerRepository.findOne(1L);
            log.info(customer.toString());
            log.info("");

            log.info("Customer found with findByLastName('Bauer'):");
            log.info("--------------------------------------------");
            for (Customer bauer : customerRepository.findByLastName("Bauer")) {
                log.info(bauer.toString());
            }

        };

    }

}
