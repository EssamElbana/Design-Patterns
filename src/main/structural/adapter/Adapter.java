package main.structural.adapter;

public class Adapter implements MicroUsbPhone {
    private final LightingPhone lightingPhone;

    Adapter(LightingPhone lightingPhone) {
        this.lightingPhone = lightingPhone;
    }

    @Override
    public void recharge() {
        lightingPhone.recharge();
    }

    @Override
    public void useMicroUsb() {
        System.out.println("MicroUsb connected");
        lightingPhone.useLightning();
    }
}
