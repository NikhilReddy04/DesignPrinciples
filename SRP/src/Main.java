//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Report report=new Report("New tax regiment");
    report.generateReport();

    PrintReport printReport=new PrintReport();
    printReport.printReport(report);

    SaveReport saveReport=new SaveReport();
    saveReport.saveReportToDatabase(report);

    }
}