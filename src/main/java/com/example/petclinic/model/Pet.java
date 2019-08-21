package com.example.petclinic.model;
import java.util.Objects;

public class Pet implements Modifiable{

    private Long id;
    private Owner owner;
    private String name;
    private String birthday;
    private String type;


    public Pet(Long id) {

        this(id, null, null, null, null);
    }

    public Pet(Long id, Owner owner, String name, String birthday, String type){
        this.id = id;
        this.owner = owner;
        this.name = name;
        this.birthday = birthday;
        this.type = type;
    }

    @Override
    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public Owner getOwner(){
        return owner;
    }

    public void setOwner(Owner owner){
        this.owner = owner;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getBirthday(){
        return birthday;
    }

    public void setBirthday(String birthday){
        this.birthday = birthday;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }

        if (o == null || getClass() != o.getClass()){
            return false;
        }

        Pet pet = (Pet) o;
        return id == pet.id;
    }

    @Override
    public int hashCode(){
        return Objects.hash(id);
    }

    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder("Pet{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", owner='").append(owner).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append(", birthday='").append(birthday).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
