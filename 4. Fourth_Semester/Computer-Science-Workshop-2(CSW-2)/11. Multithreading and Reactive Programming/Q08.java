/**
 * Ques 8 : Develop a Java program that analyzes real-time weather data using reactive programming.
The program should fetch weather data from a weather API asynchronously and perform analysis
(e.g., temperature trends, rainfall predictions). Use a reactive approach to handle the asynchronous
nature of weather data updates. Use reactive operators (e.g., map, filter) to process and analyze the
weather data stream.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class WeatherData {
    private double temperature;

    public WeatherData(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }
}

public class Q08 {
    private static Future<WeatherData> fetchWeatherDataAsync(ExecutorService executor) {
        return executor.submit(() -> {
            double temperature = Math.random() * 100;
            Thread.sleep(1000);
            return new WeatherData(temperature);
        });
    }

    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();

        List<Future<WeatherData>> weatherDataFutures = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            weatherDataFutures.add(fetchWeatherDataAsync(executor));
        }

        weatherDataFutures.forEach(future -> {
            try {
                WeatherData weatherData = future.get();
                analyzeTemperatureTrend(weatherData);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        executor.shutdown();
    }

    private static void analyzeTemperatureTrend(WeatherData weatherData) {
        double temperature = weatherData.getTemperature();
        System.out.println("Received temperature data: " + temperature);
    }
}

/**
 * OUTPUT
 *
 * Received temperature data: 69.17185208817124
 * Received temperature data: 82.39348269866242
 * Received temperature data: 56.274881886827586
 * Received temperature data: 18.1525461941913
 * Received temperature data: 56.23219206409008
 * Received temperature data: 67.17984176594388
 * Received temperature data: 17.622021230737516
 * Received temperature data: 60.42506478437855
 * Received temperature data: 93.23024293494254
 * Received temperature data: 84.57802388287715
 */