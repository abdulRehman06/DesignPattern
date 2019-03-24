package Adapter;

public class Clint {
    public static void main (String[] args )
    {
        /** Using Object Adapter **/
        Employee employee = new Employee(); // this is  the class(Adoptee) which functionality  we using
        populateEmployeeData(employee); // seting some value
        EmployeeObjectAdapter objectAdapter = new EmployeeObjectAdapter(employee); // passing Adoptee class object
       String card = BusinessCardDesigner.designCard(objectAdapter);
        System.out.println(card);

    }
    private static void populateEmployeeData(Employee employee) {
        employee.setFullName("Abdul ");
        employee.setJobTitle("Software Engineer");
        employee.setOfficeLocation("Karachi Ravine society ");
    }
}
