package be.ucll.craftsmanship.cleanarchitecture.controllers;

public interface Mapper <TDomain, TRequest>{
    TRequest map(TDomain domain);
}
