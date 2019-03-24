package Adapter;

public class EmployeeObjectAdapter implements Customer {
    private Employee empObj; // adopting the functionality of Existing class(Adoptee)  for new customer

    public EmployeeObjectAdapter(Employee empObj) {
        this.empObj = empObj;
    }

    @Override
    public String getName() {

        return empObj.getFullName();
    }

    @Override
    public String getAddress() {

        return empObj.getOfficeLocation();
    }

    @Override
    public String getDesignation() {

        return empObj.getJobTitle();
    }

}
