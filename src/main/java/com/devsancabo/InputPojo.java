package com.devsancabo;

public class InputPojo {
    private String firstName;
    private String lastName;
    private Integer age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public InputPojo(){}

    public InputPojo(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return "{\n" +
                "  \"firstName\": \"" + firstName + "\",\n" +
                "  \"lastName\": \"" + lastName + "\",\n" +
                "  \"age\": \"" + age + "\"\n" +
                "}";
    }

    @Override
    public boolean equals(Object other) {
        if(!(other instanceof InputPojo)) return false;
        InputPojo inputPojoOther  = (InputPojo) other;
        if(other == null) return false;
        return isEqual(firstName,inputPojoOther.firstName)
            && isEqual(lastName,inputPojoOther.lastName)
            && isEqual(age,inputPojoOther.age);
    }

    private <T> boolean isEqual(T objectA, T objectB){
        if(objectA == null || objectB != null) return false;
        if(objectA == null && objectB == null) return true;
        return objectA.equals(objectB);
    }
}
