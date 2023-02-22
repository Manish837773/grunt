class Employee{
    private int point;

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
    
}

class PerformanceRating{
    private static final int OUTSTADING = 5;
    private static final int GOOD = 4;
    private static final int AVERAGE = 3;
    private static final int POOR = 2;

   public static int calculatePerformace(Employee employee){
        if(employee.getPoint() >= 80 && employee.getPoint() <= 100){
            return OUTSTADING;
        }
        else if (employee.getPoint() >= 60 && employee.getPoint() <= 79){
            return GOOD;
        }
        else if (employee.getPoint() >= 50 && employee.getPoint() <= 69){
            return AVERAGE;
        }
        else if (employee.getPoint() >= 1 && employee.getPoint() <= 49){
            return POOR;
        }
        else
            return 0;
    }


    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();

        e1.setPoint(34);
        e2.setPoint(85);
        e3.setPoint(92);

        System.out.println(PerformanceRating.calculatePerformace(e1));
        System.out.println(PerformanceRating.calculatePerformace(e2));
        System.out.println(PerformanceRating.calculatePerformace(e3));

    }

}