package com.bdm.factory;

import com.bdm.dao.OrderDao;
import com.bdm.dao.impl.OrderDaoImpl;

/**
 * @code Description
 * @code author 本当迷
 * @code date 2022/7/30-10:02
 */
public class OrderDaoFactory {
    public static OrderDao getOrderDao(){
        return new OrderDaoImpl();
    }
}
