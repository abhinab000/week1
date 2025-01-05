package week4;

public class CelsiusToFarenheitTest {
    public static void main(String[] args) {
        CelsiusToFarenheit ctf = new CelsiusToFarenheit();

        System.out.println("Testing Celsius to Fahrenheit:");
        System.out.println("0°C -> " + ctf.calc1(0) + "°F (Expected: 32.0°F)");
        System.out.println("100°C -> " + ctf.calc1(100) + "°F (Expected: 212.0°F)");
        System.out.println("37°C -> " + ctf.calc1(37) + "°F (Expected: 98.6°F)");
        System.out.println("-40°C -> " + ctf.calc1(-40) + "°F (Expected: -40.0°F)");

        System.out.println("\nTesting Fahrenheit to Celsius:");
        System.out.println("32°F -> " + ctf.calc2(32) + "°C (Expected: 0.0°C)");
        System.out.println("212°F -> " + ctf.calc2(212) + "°C (Expected: 100.0°C)");
        System.out.println("98.6°F -> " + ctf.calc2(98.6) + "°C (Expected: 37.0°C)");
        System.out.println("-40°F -> " + ctf.calc2(-40) + "°C (Expected: -40.0°C)");
    }
}
