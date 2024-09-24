public class HomeInterface {
    private Light light;
    private TV tv;
    private AirConditioning airConditioning;

    public HomeInterface() {
        light = new Light();
        tv = new TV();
        airConditioning = new AirConditioning();
    }

    public void turnOnAll() {
        System.out.println("Turning on all home services:");
        light.turnOn();
        tv.turnOn();
        airConditioning.turnOn();
    }

    public void turnOffAll() {
        System.out.println("Turning off all home services:");
        light.turnOff();
        tv.turnOff();
        airConditioning.turnOff();
    }
}
