package designpatterns.creational.factoryMethod;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory =createDeveloperBySpecialty("Java");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
    }

    static DeveloperFactory createDeveloperBySpecialty(String specialty){
        if(specialty.equals("Java")){
            return new JavaDeveloperFactory();
        } else if (specialty.equals("C++")){
            return new CppDeveloperFactory();
        } else if(specialty.equals("PHP")){
            return new PhpDeveloperFactory();
        }else {
            throw new RuntimeException(specialty + " is unknown specialty.");
        }
    }
}
