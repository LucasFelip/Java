package EnumCompo.Enum.entity;

import java.util.Date;

import EnumCompo.Enum.entity.enums.OrderStatus;

public class order {
    private Integer id;
    private Date moment;
    private OrderStatus status;

    public order() {}
    
    public order(Integer id, Date moment, OrderStatus status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }
    
    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "order [id=" + id + ", moment=" + moment + ", status=" + status + "]";
    }
}