# Appium Android UI tests

UI-тесты учебного Android-приложения на Appium.

**Stack:** `Java` · `Appium Java Client` · `Selenium` · `UiAutomator2` · `JUnit 5` · `Gradle`

## Что проверяется

| Тест | Сценарий | Ожидаемый результат |
|------|----------|---------------------|
| `testEmptyInput` | нажать кнопку изменения текста при пустом поле ввода | текст на экране остаётся «Hello UiAutomator!» |
| `testOpenNewActivity` | ввести текст и нажать кнопку открытия нового экрана | на новом экране отображается введённый текст |

## Структура

```
src/test/java/
├── Config.java              настройка AndroidDriver и capabilities
├── UiAutomatorObjects.java  элементы экрана с ожиданием их появления
└── UiAutomatorTest.java     тестовые сценарии
```

## Запуск

Предварительно нужно:

1. Запустить Android-эмулятор (`emulator-5554`).
2. Установить на него тестируемое приложение `ru.netology.testing.uiautomator`.
3. Запустить Appium Server на `http://127.0.0.1:4723` с драйвером UiAutomator2.

Запуск тестов:

```
./gradlew clean test
```
