package orientedObject;

public class Doctor extends Person implements Specialist, DutyOfficer{

    private String document = "";
    private String name = "";
    private String genre = "";
    private int idade = 0;
    private String specialization = "";
    private String maritalStatus = "";

    public Doctor(String doc, String n, String g, int i){
        this.document = doc;
        this.name = n;
        this.genre = g;
        this.idade = i;
    }
    public Doctor(){}

    @Override
    public void setDocument(String doc) {
        if(doc.equals(this.document)){
            this.document = doc;
        }
    }
    public void setDocument(String doc, int password) {
        if(password == 123){
            this.document = doc;
        }
    }
    @Override
    public String getDocument() {
        return this.document;
    }

    @Override
    public void setName(String n) {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setGenre(String g) {

    }

    @Override
    public String getGenre() {
        return null;
    }

    @Override
    public void setAge(int a) {

    }

    @Override
    public int getAge() {
        return 0;
    }

    @Override
    public String getMaritalStatus() {
        return this.maritalStatus;
    }

    @Override
    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    @Override
    public String getSpecialization() {
        return this.specialization;
    }
    public String getSpecialization(int code){
        return switch(code){
            case 1 -> Specialization.CARDIOLOGIST.toString();
            case 2 -> Specialization.CLINIC.toString();
            case 3 -> Specialization.GYNECOLOGIST.toString();
            case 4 -> Specialization.NEUROLOGIST.toString();
            case 5 -> Specialization.OBSTETRICIAN.toString();
            case 6 -> Specialization.PEDIATRIC.toString();
            case 7 -> Specialization.PSYCHIATRIST.toString();
            default -> "ERROR: Ivalid code!";
        };
    }

    @Override
    public Boolean getDutyOfficer() {
        return true;
    }
}
