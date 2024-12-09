package be.ucll.craftsmanship.cleanarchitecture.controllers.request;

import java.util.ArrayList;
import java.util.HashSet;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class OrderRequest {
    private String customerName;
    private HashSet<OrderRequestLine> orderlines;
}
