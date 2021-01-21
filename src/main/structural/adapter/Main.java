package main.structural.adapter;

import main.creational.singleton.A;

public class Main {

    public static void main(String[] args) {
        Android android = new Android();
        IPhone iPhone = new IPhone();

        System.out.println("Recharging android with MicroUsb");
        android.useMicroUsb();
        android.recharge();

        System.out.println("Recharging iPhone with Lightning");
        iPhone.useLightning();
        iPhone.recharge();

        System.out.println("Recharging iPhone with MicroUsb");
        Adapter adapter = new Adapter(iPhone);
        adapter.useMicroUsb();
        adapter.recharge();


    }
}
