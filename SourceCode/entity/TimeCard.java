package SourceCode.entity;

public class TimeCard {
    /* Employee ID    Date    Hours Worked
    */
    private int empId ;
    private String date;
    private int hoursWorked;

    public TimeCard(int id,String date,int hoursWorked)
    {
        this.date = date;
        this.empId = id;
        this.hoursWorked = hoursWorked;
    }

    public TimeCard() {

    }

    public int getId(){
        return this.empId;
    }
    public String getDate(){
        return this.date;
    }
    public int getHoursWorked(){
        return this.hoursWorked;
    }

    public void setEmpId(int empId){
        this.empId=empId;
    }
    public void setDate(String date){
        this.date=date;
    }
    public void setHoursWorked(int hoursWorked){
        this.hoursWorked=hoursWorked;
    }
}
