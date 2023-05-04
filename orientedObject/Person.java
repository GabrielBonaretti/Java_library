package orientedObject;

public abstract class Person {
    public abstract void setDocument(String doc);
    public abstract String getDocument();
    public abstract void setName(String n);
    public abstract String getName();
    public abstract void setGenre(String g);
    public abstract String getGenre();
    public abstract void setAge(int a);
    public abstract int getAge();
    public void setMaritalStatus(String ms){}
    public String getMaritalStatus(){
        return null;
    }

}
