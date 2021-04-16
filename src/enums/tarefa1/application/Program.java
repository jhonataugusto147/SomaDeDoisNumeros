package enums.tarefa1.application;

import enums.tarefa1.entities.entity.Order;
import enums.tarefa1.entities.enums.OrderStatus;
import java.util.Date;

import java.util.Date;

public class Program {
    public static void main(String[] args){
        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
        System.out.println(order.toString());

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
        System.out.println(os1);
        System.out.println(os2);

    }
}
