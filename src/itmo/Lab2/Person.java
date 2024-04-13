package itmo.Lab2;

/** Класс "Person" создан для упражнения 2 из лабы 2. */

public class Person
{
    private String LastName;
    private String FirstName;
    private String FatherName;
    private int Age;
    private String PhoneNumber;

    public Person(String LastName, String FirstName, String FatherName, int Age, String PhoneNumber)
    {
        this.LastName = LastName;
        this.FirstName = FirstName;
        this.FatherName = FatherName;
        this.Age = Age;
        this.PhoneNumber = PhoneNumber;
    }

    public Person(String LastName, String FirstName, int Age)
    {
        this.LastName = LastName;
        this.FirstName = FirstName;
        this.FatherName = "";
        this.Age = Age;
        this.PhoneNumber = "";
    }

    public Person(String LastName, String FirstName)
    {
        this.LastName = LastName;
        this.FirstName = FirstName;
        this.FatherName = "";
        this.Age = 0;
        this.PhoneNumber = "";
    }

    public Person()
    {
        this.LastName = "UnknownLastName";
        this.FirstName = "UnknownFirstName";
        this.FatherName = "UnknownFatherName";
        this.Age = 0;
        this.PhoneNumber = "";
    }

    public void printInfo()
    {
        System.out.println("Фамилия: " + this.LastName);
        System.out.println("Имя: " + this.FirstName);
        System.out.println("Отчество: " + this.FatherName);
        System.out.println("Возраст: " + this.Age);
        System.out.println("Номер телефона: " + this.PhoneNumber);
        System.out.println("");
    }
}
