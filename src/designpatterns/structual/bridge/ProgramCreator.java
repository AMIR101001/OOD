package designpatterns.structual.bridge;

public class ProgramCreator {
    public static void main(String[] args) {
        Program [] programs = {
                new BankSystem(new JavaDeveloper()),
                new StocExchange((new CppDeveloper()))
        };

        for(Program program : programs){
            program.developProgram();
        }
    }
}
