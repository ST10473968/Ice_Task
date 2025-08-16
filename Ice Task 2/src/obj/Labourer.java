public class Labourer extends Contractor {

    private float _wage;
    public Labourer(String name, String surname, String jobTitle, float wage) {
    super(name, surname, jobTitle, 0f);
    _wage = wage;
    }
    public float getWage(){
        return _wage;
    }
    public void setWage(float wage){ 
        _wage = wage;
    }
    public float calculateHourlyRate(){
        return _wage/(5f * 8f);
    }
}