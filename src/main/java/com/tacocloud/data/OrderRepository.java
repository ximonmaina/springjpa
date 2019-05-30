package com.tacocloud.data;

import com.tacocloud.Order;

public interface OrderRepository {

    Order save(Order order);
}
