class smart_device{
    String model;
    String brand;
    boolean isOn=false;

    smart_device(String model,String brand)
    {
        this.model=model;
        this.brand=brand;
    }
    void turnOn()
    {
        isOn=true;
        System.out.println(model+" is turned on.");
    }
    void turnOff()
    {
        isOn=false;
        System.out.println(model+" is turned off.");
    }
}

class smartlight extends smart_device
{
    int brightness;

    smartlight(String model,String brand,int brightness)
    {
        super(model,brand);
        this.brightness=brightness;
    }
    void setBrightness(int brightness)
    {
        this.brightness=brightness;
        System.out.println("Brightness of "+model+" is set to "+brightness);
    }
}

class smartthermostat extends smart_device
{
    int temperature;

    smartthermostat(String model,String brand,int temperature)
    {
        super(model,brand);
        this.temperature=temperature;
    }
    void setTemperature(int temperature)
    {
        this.temperature=temperature;
        System.out.println("Temperature of "+model+" is set to "+temperature);
    }
}

public class main_smart_device {
    public static void main(String[] args)
    {
        smartlight light=new smartlight("Smart Light","Philips",50);
        light.turnOn();
        light.setBrightness(80);
        light.turnOff();

        smartthermostat thermostat=new smartthermostat("Smart Thermostat","Nest",22);
        thermostat.turnOn();
        thermostat.setTemperature(25);
        thermostat.turnOff();
    }
}

