public class Report {
    private String report;

    public Report(String report) {
        this.report = report;
    }

    public void generateReport(){
        System.out.println("Generating report....");
    }

    public String getReport() {
        return report;
    }
}
