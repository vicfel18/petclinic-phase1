package com.example.petclinic.model;

import java.util.Objects;

public class Vet implements Modifiable{

    private Long id;
    private String name;
    private String specialty;

    public Vet(Long id){
        this(id, null, null);
    }

    public Vet(Long id, String name, String specialty){
        this.id = id;
        this.name = name;
        this.specialty = specialty;
    }

    @Override
    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSpecialty(){
        return specialty;
    }

    public void setSpecialty(String specialty){
        this.specialty = specialty;
    }


    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }

        if (o == null || getClass() != o.getClass()){
            return false;
        }

        Vet vet = (Vet) o;
        return id == vet.id;
    }

    @Override
    public int hashCode(){
        return Objects.hash(id);
    }

    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder("Vet{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", speciality='").append(specialty).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
