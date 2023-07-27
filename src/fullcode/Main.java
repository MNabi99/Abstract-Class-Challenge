package fullcode;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50,true);
        printer.fillToner(10);
        printer.fillToner(5);
        printer.fillToner(1);
        printer.fillToner(20);
        printer.fillToner(10);
        printer.fillToner(10);
        printer.fillToner(10);
        printer.pagesPrinted(2,true);
        printer.pagesPrinted(22,true);
        printer.pagesPrinted(31,false);
        printer.pagesPrinted(41,true);
        printer.pagesPrinted(2,false);
    }

}
