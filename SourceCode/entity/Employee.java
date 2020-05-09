package SourceCode.entity;

public class Employee{
    private int id;
    private String firstName;
    private String lastName;
    private String mobileNo;
    private String email;
    private String address;
    private int salaryType;


    public Employee(int id,String firstName, String lastName,String address ,String mobileNo,String email,int salaryType){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNo = mobileNo;
        this.email = email;
        this.address = address;
        this.salaryType = salaryType;
    }
    public int getId(){
        return this.id;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public String getFirstName(){
        return this.firstName;
    }

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setLastName(String lastName){
        this.lastName=lastName;
    }

    public String getMobileNo(){
        return this.mobileNo;
    }

    public void setMobileNo(String mobileNo){
        this.mobileNo=mobileNo;
    }

    public String getAddress(){
        return this.address;
    }

    public void setAddress(String address){
        this.address=address;
    }

    public int getSalaryType(){
        return this.salaryType;
    }

    public void setSalaryType(int salaryType){
        this.salaryType=salaryType;
    }
}