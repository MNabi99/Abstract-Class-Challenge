package fullcode;

public class Printer {
    private int tonerLevel;
    private int numOfPagesPrinted = 0;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.duplex = duplex;
    }
    public void fillToner(int fill){
        int newTonerLevel = tonerLevel +fill;
        if(newTonerLevel > 0 && newTonerLevel <= 100){
            tonerLevel = newTonerLevel;
            System.out.println("It filled now " + fill + "of toner. "
            + " The filled level is " + tonerLevel);
        }
        else {
            System.out.println("fill the correct level " + " the filled up level is"
                     + tonerLevel);
        }
    }
    public void pagesPrinted(int pages, boolean duplex){
        if(duplex){
            pages = (pages / 2) + (pages % 2);
            numOfPagesPrinted += pages;
            System.out.println("Duplex Mode is on");
        }
        else {
            numOfPagesPrinted += pages;
            System.out.println(" Duplex mode is off");
        }
        System.out.println("The total number of page you printed is "
        + numOfPagesPrinted);
    }
}
