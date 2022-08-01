package com.bdm.factory;

import com.bdm.dao.OrderDao;
import com.bdm.dao.impl.OrderDaoImpl;

/**
 * @code Description
 * @code author 本当迷
 * @code date 2022/7/30-10:12
 */
public class UserDaoFactory {
    public OrderDao getOrderDao(){
        return new OrderDaoImpl();
    }
}
