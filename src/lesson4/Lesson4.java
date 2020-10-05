package lesson4;

public class Lesson4 {
    public static void main(String[] args) {

        /*
        Наслідування
         */

        // створити клас Тварина
        // створити клас Собака
        // унаслідувати клас собака від класу тварини

//        Dog dog = new Dog();
//        System.out.println(dog);

        // додати тварині змінну вага
//        System.out.println("Weight: " + dog.weight);

        // показати що вона є і у класу собака
//        Animal animal = new Animal();
//        System.out.println(animal.weight);

        // додати до класу тварина ще три змінні, з різними рівнями доступу (ріст, висота, ширина)

        System.out.println("=========ANIMAL=========");

//        System.out.println(animal.weight);
//        System.out.println(animal.height);
////        System.out.println(animal.width);
//        System.out.println(animal.getWidth());
//        System.out.println(animal.paws);


//        System.out.println("=========DOG=========");
//        System.out.println(dog.weight);
//        System.out.println(dog.height);
////        System.out.println(dog.width);
//        System.out.println(dog.getWidth());
//        System.out.println(dog.paws);


        // додати до класу тварини 2 конс1труктори (без параметрів і який приймає ріст)
        System.out.println();
        Animal animal2 = new Animal(70);
        System.out.println(animal2);

        System.out.println();
        Dog dog2 = new Dog(45);
        System.out.println(dog2);





        // видалити конструктор з параметрами
        // ключове слово super

        // super виклик перекритих змінних
        // додати до класу собака два конструктори

        // ініціалізувати собаку через обидва конструктори
        Dog dog3 = new Dog("Rex", 60);
        System.out.println(dog3);

        // переписати безпарамертний конструктор, щоб викликати параметризований

        // додати методи до класу тварина (їсти, спати)

        // додати метод до класу собака, показати його виклик
        dog3.eat();
        dog3.sleep();
        dog3.bark();
        dog3.sleep(true);



        // додати приватний метод до тварини
        dog3.swim();

        // додати клас кіт

        Cat cat = new Cat(20);
        System.out.println(cat);
        cat.sleep();
        cat.eat();
//        cat.swim()


        // перевизначити / перектрити метод спати в обох класах


        // додати метод кусати
        // додати клас Бульдог

        Bulldog bulldog = new Bulldog();
        System.out.println(bulldog);


        // перекрити метод кусати
        bulldog.bite();


        // super виклик перекритих методів



        /*
        Агрегація
         */
        // створити класи людина і гаманець
        // доступ до методів агрегованого класу

        System.out.println();
        Human human = new Human();
        System.out.println(human);

        System.out.println();
        human.setWallet(new Wallet(1000));

        System.out.println(human);


        /*
        Композиція
         */
        // створити класи людина і мозок
        //



        // приватний конструктор - Сінглтон



        // створити класи Людина, Чоловік, Жінка
        // додати по одному методу в кожен клас, методи приймають об'єкт типу тварину на вхід
        // показати доступ до цих методів в залежності від типу змінної яка посилається на об'єкти
        Animal chicken = new Animal(20);
        Man man = new Man();
        Woman woman = new Woman();
        man.hunt(chicken);
        woman.cook(chicken);

        man.eat(chicken);
        woman.eat(chicken);


        // показати явне приведення

        Human human1 = new Man();
        Human human2 = new Woman();

//        if(human1 instanceof Man){
//            ((Man)human1).hunt(chicken);
//        } else {
//            ((Woman)human1).cook(chicken);
//        }

        if (human1.getClass().getSimpleName().equals("Man")) {
            ((Man)human1).hunt(chicken);
        } else {
            ((Woman)human1).cook(chicken);
        }

        // помилка при приведенні
        // instanceof

        // Singleton example
        System.out.println();
        for(int i = 0; i < 5; i++){
            President pre = President.getInstance();
        }
    }
}
