package ru.shotin.groovy.basic

class HelloWorld {
    static Integer value = (int) System.currentTimeMillis() % 1000
    static void main(String... args){
        String greeting = "Hello World!"
        var message = "${greeting} value=${value}"
        Class<?> messageClass = message.getClass()
        println(message)
        println("messageClas=${messageClass}")

        println greeting.getClass().getClassLoader()
        println message.getClass().getClassLoader()
        println java.sql.DriverManager.class.getClassLoader()
        println HelloWorld.class.getClassLoader()
    }
}