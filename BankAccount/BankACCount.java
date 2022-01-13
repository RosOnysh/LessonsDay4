package BankAccount;

public class BankACCount {    // ссылочный тип данных.референс тип данных
    int id;
    String name;
    double balance;

    // референсная переменная bA содержит в себе ссылку на обьект.

     /*   BankACCount bA = new BankACCount();    после new следует вызов конкструктора.Создаеться новый обьект класса  BankACCount обьект носит имя bA
         тип данных переменной имя переменной  = вызов конструктора - создание обьектов
        bA это ссылка
*/
}

class BankACCountTest {
    public static void main(String[] args) {
        BankACCount MyAccount = new BankACCount();
        BankACCount YourAccount = new BankACCount();
        BankACCount HisAccount = new BankACCount();

        MyAccount.id = 00345071;
        MyAccount.name = "James Pindos";
        MyAccount.balance = 134.34;

        YourAccount.id = 143200456;
        YourAccount.name = "Mike Amogus";
        YourAccount.balance = 12.35;


        HisAccount.id = 03571305;
        HisAccount.name = "Abeme Nikolaevich";
        HisAccount.balance = 2.35;


        System.out.println(MyAccount.id + " " + MyAccount.name + " " + MyAccount.balance);
    }
}