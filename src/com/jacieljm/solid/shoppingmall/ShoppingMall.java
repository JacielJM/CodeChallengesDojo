package com.jacieljm.solid.shoppingmall;

public class ShoppingMall {
    private final PaymentMethod paymentMethod; //interfaces can be part of class dependencies

    public ShoppingMall(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void doPayment(Object order, int amount){
        paymentMethod.doTransaction(amount);
    }

}
