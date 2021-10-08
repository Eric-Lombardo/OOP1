package com.company;

public class Main {

    public static void main(String[] args) {

        // TEST for SimpleCalculator Class
        System.out.println("-------------------- SimpleCalculator -----------------------");
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult()); // 9.0
        System.out.println("subtract= " + calculator.getSubtractionResult()); // 1.0
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult()); // 0.0
        System.out.println("divide= " + calculator.getDivisionResult()); // 0.0

        // TEST for Person Class
        System.out.println("-------------------- Person -----------------------");
        Person person = new Person();
        person.setFirstName("");   // firstName is set to empty string
        person.setLastName("");    // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");    // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());

        // TEST for BankAccount Class
        System.out.println("-------------------- BankAccount -----------------------");
        BankAccount bankAccount = new BankAccount(1234567, 2121.00,"Sparrow", "stew.katz@gmail.com",1111234);
        System.out.println(bankAccount.getAccountNumber()); // 1234567
        System.out.println(bankAccount.getBalance()); // 2121.00
        System.out.println(bankAccount.getCustomerName()); // "Sparrow"
        System.out.println(bankAccount.getEmail()); // "stew.katz@gmail.com"
        System.out.println(bankAccount.getPhoneNumber()); // 1111234
        bankAccount.withdrawFunds(21);
        System.out.println(bankAccount.getBalance()); // 2100.00
        bankAccount.depositFunds(900);
        System.out.println(bankAccount.getBalance()); // 3000.00
        bankAccount.withdrawFunds(5000);
        System.out.println(bankAccount.getBalance()); // 3000.00

        // TEST for VipCustomer Class
        System.out.println("-------------------- VipCustomer -----------------------");
        VipCustomer empty = new VipCustomer();
        System.out.println(empty.getName()); // "FirstName LastName"
        System.out.println(empty.getEmail()); // "empty@email.com"
        System.out.println(empty.getCreditLimit()); // 10000.00
        VipCustomer twoFields = new VipCustomer("Bobby", 21000.00);
        System.out.println(twoFields.getName()); // "Bobby"
        System.out.println(twoFields.getEmail()); // "default@email.com"
        System.out.println(twoFields.getCreditLimit()); // 21000.00
        VipCustomer allFields = new VipCustomer("Alpha", 9999.00, "real@email.com");
        System.out.println(allFields.getName()); // "Alpha"
        System.out.println(allFields.getEmail()); // "real@email.com"
        System.out.println(allFields.getCreditLimit()); // 9999.00

        // TEST for WallArea Class
        System.out.println("-------------------- WallArea -----------------------");
        WallArea wall = new WallArea(5,4);
        System.out.println("area= " + wall.getArea()); // 20.00
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth()); // 5.0
        System.out.println("height= " + wall.getHeight()); // 0.0
        System.out.println("area= " + wall.getArea()); // 0.0

        // TEST for Point Class
        System.out.println("-------------------- Point -----------------------");
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance()); // 7.810249675906654
        System.out.println("distance(second)= " + first.distance(second)); // 5.0
        System.out.println("distance(2,2)= " + first.distance(2, 2)); // 5.0
        Point point = new Point();
        System.out.println("distance()= " + point.distance()); // 0.0

        // TEST for Floor/Carpet/Calculator Class
        System.out.println("-------------------- Floor/Carpet/Calculator -----------------------");
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator1 = new Calculator(floor, carpet);
        System.out.println("total= " + calculator1.getTotalCost()); // 38.5
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator1 = new Calculator(floor, carpet);
        System.out.println("total= " + calculator1.getTotalCost()); // 36.45

        // TEST for ComplexNumber Class
        System.out.println("-------------------- ComplexNumber -----------------------");
        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real= " + one.getReal()); // 2.0
        System.out.println("one.imaginary= " + one.getImaginary()); // 2.0
        one.subtract(number);
        System.out.println("one.real= " + one.getReal()); // -0.5
        System.out.println("one.imaginary= " + one.getImaginary()); // 3.5
        number.subtract(one);
        System.out.println("number.real= " + number.getReal()); // 3.0
        System.out.println("number.imaginary= " + number.getImaginary()); // -5.0

        // TEST for Vehicle/Car/Mazda Class
        System.out.println("-------------------- Vehicle/Car/Mazda -----------------------");
        Mazda miata = new Mazda();
        miata.changeGear();
        miata.moving();
        miata.steerLeft();
        miata.moving();
        miata.steerRight();
        miata.doDonut();

        // TEST for Circle/Cylinder Class
        System.out.println("-------------------- Circle/Cylinder -----------------------");
        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius()); // 3.75
        System.out.println("circle.area= " + circle.getArea()); // 44.178646691106465
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius()); // 5.55
        System.out.println("cylinder.height= " + cylinder.getHeight()); // 7.25
        System.out.println("cylinder.area= " + cylinder.getArea()); // 96.76890771219959
        System.out.println("cylinder.volume= " + cylinder.getVolume()); // 701.574580913447

        // TEST for Rectangle/Cuboid Class
        System.out.println("-------------------- Rectangle/Cuboid  -----------------------");
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth()); // 5.0
        System.out.println("rectangle.length= " + rectangle.getLength()); // 10.0
        System.out.println("rectangle.area= " + rectangle.getArea()); // 50.0
        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("cuboid.width= " + cuboid.getWidth()); // 5.0
        System.out.println("cuboid.length= " + cuboid.getLength()); // 10.0
        System.out.println("cuboid.area= " + cuboid.getArea()); // 50.0
        System.out.println("cuboid.height= " + cuboid.getHeight()); // 5.0
        System.out.println("cuboid.volume= " + cuboid.getVolume()); // 250.0
    }
}
