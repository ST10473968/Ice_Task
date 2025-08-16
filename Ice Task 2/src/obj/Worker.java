public class Worker extends Employee {

    private float _salary;
    private float _overtime;
    private float _overtimeRate;

    public Worker(String name, String surname, String jobTitle, float salary, float overtimeRate) {
    super();
    _name = name;
    _surname = surname;
    _jobTitle = jobTitle;
    _salary = salary;
    _overtimeRate = overtimeRate;
    }

    public float getSalary(){
        return _salary;
    }
    public void setSalary(float salary){
        _salary = salary;
    }
    public float getOvertime(){
        return _overtime;
    }
    public void setOvertime(float overtime){
        _overtime = overtime;
    }
    public float getOvertimeRate(){
        return _overtimeRate;
    }
    public void setOvertimeRate(float overtimeRate){
        _overtimeRate = overtimeRate;
    }
    public float calculateHourlyRate(){
        return _salary / (4f * 5f * 8f);
    }
}