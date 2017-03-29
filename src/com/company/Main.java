package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car c = new Car();

        c.make = "Chevy";
        c.model = "S-10 Blazer";
        c.milleage = 122000;
        c.used = false;
        c.color = "green";
        c.year = 1989;

        Superhero hero = new Superhero();

        hero.age = 31;
        hero.male = false;
        hero.mask = true;
        hero.partner = true;
        hero.weapon = "Numb Chucks";

        Candy cc = new Candy();

        cc.chocolate = true;
        cc.manufacturer = "Hershey's";
        cc.name = "Butterfinger";
        cc.weight = 18;
        cc.withnuts = false;

        IceCream ic = new IceCream();

        ic.chocolate = true;
        ic.manufacturer = "Bryers";
        ic.name = "Chunky Monkey";
        ic.netweight = 12;
        ic.price = 2.99;

        Restaurants r = new Restaurants();

        r.address = "1234 Roman Court";
        r.city = "Charlotte";
        r.state = "NC";
        r.zipCode = 28207;
        r.name = "Blackfinn";

        System.out.println(cc.weight);
        System.out.println(ic.chocolate);
        }
    }
