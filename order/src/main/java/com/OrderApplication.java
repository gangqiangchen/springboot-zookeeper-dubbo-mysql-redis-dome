package com;

import com.bean.TOrder;
import com.bean.TOrderExample;
import com.mapper.TOrderDAO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OrderApplication {

  @Autowired
  TOrderDAO TOrderDao;

  public static void main(String[] args) {
    SpringApplication.run(OrderApplication.class, args);
  }

  @RequestMapping({"/", "/home"})
  String home() {

    TOrder TOrder = new TOrder();
    TOrder.setId(1L);
    TOrder.setOrderCode("abc");
    TOrder.setOrderName("订单名字");
    TOrderDao.insert(TOrder);

    TOrderExample example = new TOrderExample();
    example.createCriteria().andOrderCodeEqualTo("abc");

    List<com.bean.TOrder> TOrders = TOrderDao.selectByExample(example);

    return  TOrders.get(0).getOrderName();
  }
}
