package com.hichem.ecomback.web;

import lombok.Data;
import com.hichem.ecomback.entities.Client;
import java.util.ArrayList;
import java.util.List;
@Data
public class OrderForm {
    private Client client=new Client();
    private List<OrderProduct> products=new ArrayList<>();
}
@Data
class OrderProduct{
    private Long id;
    private int quantity;
}
