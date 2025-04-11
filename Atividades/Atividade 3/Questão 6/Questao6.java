public class Questao6 {
    public static void main(String[] args) {
        System.out.println("Conversões de temperatura:");

        double celsius = 25;
        System.out.println(celsius + " °C para Fahrenheit: " + ConversorTemperatura.celsiusParaFahrenheit(celsius) + " °F");

        double fahrenheit = 77;
        System.out.println(fahrenheit + " °F para Celsius: " + ConversorTemperatura.fahrenheitParaCelsius(fahrenheit) + " °C");

        System.out.println(celsius + " °C para Kelvin: " + ConversorTemperatura.celsiusParaKelvin(celsius) + " K");

        double kelvin = 298.15;
        System.out.println(kelvin + " K para Celsius: " + ConversorTemperatura.kelvinParaCelsius(kelvin) + " °C");

        System.out.println(fahrenheit + " °F para Kelvin: " + ConversorTemperatura.fahrenheitParaKelvin(fahrenheit) + " K");

        System.out.println(kelvin + " K para Fahrenheit: " + ConversorTemperatura.kelvinParaFahrenheit(kelvin) + " °F");

        try {
            System.out.println("\nTentando instanciar a classe ConversorTemperatura...");
            ConversorTemperatura obj = new ConversorTemperatura();
        } catch (UnsupportedOperationException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}