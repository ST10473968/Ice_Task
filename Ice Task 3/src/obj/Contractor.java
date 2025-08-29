public class Contractor extends Employee{

    private float _rate;
    private float _hours;

    public Contractor(String name, String surname, String jobTitle, float rate) {
    super();
    _name = name;
    _surname = surname;
    _jobTitle = jobTitle;
    _rate = rate;
    }
    public float getRate(){ 
        return _rate;
    }
    public void setRate(float rate){ 
        _rate = rate;
    }
    public float getHours(){
        return _hours;
    }
    public void setHours(float hours){
        _hours = hours;
    }
}