import sys.EmpManager;
import util.KeyGenerator;

public class Employee {
    protected String _name;
    protected String _surname;
    protected String _jobTitle;
    protected boolean _isTemp;
    protected long _ID;
    protected float _income;

    public Employee(){
        _ID = KeyGenerator.generatePK();
        EmpManager._count++;
    }
    public String getName(){
        return _name;
    }
    public void setName(String name){
        _name = name;
    }
    public String getSurname(){
        return _surname;
    }
    public void setSurname(String surname){
        _surname = surname;
    }
    public String getJobTitle(){
        return _jobTitle;
    }
    public void setJobTitle(String jobTitle){
        _jobTitle = jobTitle;
    }
    public boolean isTemp(){
        return _isTemp;
    }
    public void setIsTemp(boolean isTemp){
        _isTemp = isTemp;
    }
    public long getID(){
        return _ID;
    }
    public float getIncome(){
        return _income;
    }
    public void setIncome(float income){
        _income = income;
    }
    public float calculateIncome(){
        return _income;
    }
}