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

    @Override
    public String toString() {
        String _ID_str = Long.toString(this._ID);
        String result = "ID: "        + _ID_str   + "\n"
                      + "Job Title: " + _jobTitle + "\n"
                      + "Temp: "      + _isTemp   + "\n"
                      + "Surname: "   + _surname  + "\n"
                      + "Name: "      + _name     + "\n"
                      + "Income: "    + _income   + "\n";
        return result;
    }
    
    @Override
    public boolean equals(Object o) {
        if(this == o){
            return true;
        }

        if(!(o instanceof Employee)){
            return false;
        }
        
        Employee e = (Employee) o;

        return this.getName().equals(e.getName())
            && this.getSurname().equals(e.getSurname())
            && (this.getID() == e.getID());
    }

}