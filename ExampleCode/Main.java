import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {

        //Создаем оригинальный объект
        Man man = new Man("Вася", 30, "Санкт-Петербуркг", "Россия");

        //Получаем загрузчик класса у оригинального объекта
        ClassLoader manClassLoader = man.getClass().getClassLoader();
//Получаем все интерфейсы, которые реализует оригинальный объект
        Class[] interfaces = man.getClass().getInterfaces();

        //Создаем прокси нашего объекта man
        Person proxyMan = (Person) Proxy.newProxyInstance(manClassLoader, interfaces, new PersonInvocationHandler(man));

        proxyMan.introduce(man.getName());

    }
}
