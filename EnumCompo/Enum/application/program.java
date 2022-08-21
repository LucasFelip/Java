package EnumCompo.Enum.application;

import java.util.Date;

import EnumCompo.Enum.entity.order;
import EnumCompo.Enum.entity.enums.OrderStatus;

public class program {
    public static void main(String[] args) {
        order order = new order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
    
        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);
    }
}
