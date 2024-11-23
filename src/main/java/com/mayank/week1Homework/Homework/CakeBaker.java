package com.mayank.week1Homework.Homework;

public class CakeBaker {

	private final Frosting frosting;
    private final Syrup syrup;

    // Constructor for Dependency Injection
    public CakeBaker(Frosting frosting, Syrup syrup) {
        this.frosting = frosting;
        this.syrup = syrup;
    }

    // bakeCake Method
    public void bakeCake() {
        System.out.println("Baking a cake with " + frosting.getFrostingType() + " and " + syrup.getSyrupType());
    }
}
