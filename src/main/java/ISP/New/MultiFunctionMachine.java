package ISP.New;

import ISP.Document;

public class MultiFunctionMachine implements MultiFunctionDevice {
    private Printer printer;
    private IScanner scanner;

    public MultiFunctionMachine(Printer printer, IScanner scanner) {
        this.printer = printer;
        this.scanner = scanner;
    }

    @Override
    public void Scan(Document d) throws Exception {
        scanner.Scan(d);
    }

    @Override
    public void Print(Document d) throws Exception {
        printer.Print(d);
    }
}
