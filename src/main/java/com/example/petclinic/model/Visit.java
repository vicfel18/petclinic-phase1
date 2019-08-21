package com.example.petclinic.model;

public class Visit implements Modifiable{

    private Long id;
    private String date;
    private String description;

    public Visit(Long id){
        this(id, null, null);
    }

    public Visit (Long id, String date, String description){
        this.id = id;
        this.date = date;
        this.description = description;
    }

    @Override
    public Long getId(){

        return id;
    }

    public void setId(Long id){

        this.id = id;
    }

    public String getDate(){
        return date;
    }

    public void setDate(){
        this.date = date;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(){
        this.description = description;
    }

    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }

        if (o == null || getClass() != o.getClass()){
            return false;
        }

        Visit visit = (Visit) o;
        return id == visit.id;
    }

    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder("Visit{");
        sb.append("id=").append(id);
        sb.append(", date='").append(date).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
