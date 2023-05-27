package AddressBook.model;

public class Name {
    private String fName;
    private String lName;

    public Name(){
        
    }

    public Name(String fName, String lName){
        this.fName = fName;
        this.lName = lName;
    }

    public String getFName(){
        return this.fName;
    }

    public String getLName(){
        return this.lName;
    }

    public void setFName(String fName){
        this.fName = fName;
    }

    public void setLName(String lName){
        this.lName = lName;
    }

    


}
