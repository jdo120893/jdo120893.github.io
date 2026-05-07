package streamexam;

import java.util.*;
import java.util.stream.Collectors;

public class OrderProcessor {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order("ORD001", "Alice", 150.0, "COMPLETED"),
                new Order("ORD002", "Bob", 200.0, "PENDING"),
                new Order("ORD003", "Charlie", 75.0, "COMPLETED"),
                new Order("ORD004", "Alice", 300.0, "COMPLETED"),
                new Order("ORD005", "Bob", 125.0, "CANCELLED")
        );

        // 완료된 주문의 총 금액
        double totalCompleted = orders.stream()
                .filter(order -> "COMPLETED".equals(order.getStatus()))
                .mapToDouble(Order::getAmount)
                .sum();

        System.out.println("완료된 주문 총액: $" + totalCompleted);

        // 고객별 주문 금액 합계
        Map<String, Double> customerTotals = orders.stream()
                .filter(order -> !"CANCELLED".equals(order.getStatus()))
                .collect(Collectors.groupingBy(
                        Order::getCustomer,
                        Collectors.summingDouble(Order::getAmount)
                ));

        System.out.println("\n고객별 주문 총액:");
        customerTotals.forEach((customer, total) ->
                System.out.println(customer + ": $" + total)
        );

        // 가장 큰 주문
        Optional<Order> largestOrder = orders.stream()
                .max(Comparator.comparingDouble(Order::getAmount));

        largestOrder.ifPresent(order ->
                System.out.println("\n최고액 주문: " + order.getOrderId() +
                        " ($" + order.getAmount() + ")")
        );
    }

    static class Order {
        private String orderId;
        private String customer;
        private double amount;
        private String status;

        public Order(String orderId, String customer, double amount, String status) {
            this.orderId = orderId;
            this.customer = customer;
            this.amount = amount;
            this.status = status;
        }

        public String getOrderId() { return orderId; }
        public String getCustomer() { return customer; }
        public double getAmount() { return amount; }
        public String getStatus() { return status; }
    }
}