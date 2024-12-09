package be.ucll.craftsmanship.cleanarchitecture.controllers.request;

public record OrderRequestLine (
        String name,
        double price,
        int quantity){}
