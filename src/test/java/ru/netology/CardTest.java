package ru.netology;

public class CardTest {

    ChromeOptions options = new ChromeOptions();
options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--no-sandbox");
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        }