package src.test.java;

import org.junit.jupiter.api.*;

public class FirstLesson {

    @BeforeAll //выполняет действие перед всеми тестами
    static void beforeAll() {
        System.out.println("### @BeforeAll ");
    }
    @BeforeEach //выполняет действие перед каждым тестом
    void beforeEach() {
        System.out.println("### @BeforeEach ");
    }


    @AfterEach //выполняет действие после каждого теста
    void afterEach (){
        System.out.println("###  @AfterEach");
    }


    @AfterAll //выполняет действие после всех тестов
    static void afterAll(){
        System.out.println("###  @AfterAll");
    }

    @Test // выполянет тест, позволяет запускать его
    void  firstTest (){ //название метода и переменные
        System.out.println("###  firstTest");
        Assertions.assertTrue( 3 > 2);
    }

    @Test
    void  secondTest (){
        System.out.println("###  secondTest");
        Assertions.assertTrue( 4 + 1 == 5);
    }


}
