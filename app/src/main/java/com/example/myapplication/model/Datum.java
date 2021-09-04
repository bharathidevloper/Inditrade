
package com.example.myapplication.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum {

    @SerializedName("EmpId")
    @Expose
    private Long empId;
    @SerializedName("EmpName")
    @Expose
    private String empName;
    @SerializedName("Email")
    @Expose
    private String email;
    @SerializedName("Designation")
    @Expose
    private String designation;
    @SerializedName("Salary")
    @Expose
    private Float salary;
    @SerializedName("PhotoUrl")
    @Expose
    private String photoUrl;

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Datum.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("empId");
        sb.append('=');
        sb.append(((this.empId == null)?"<null>":this.empId));
        sb.append(',');
        sb.append("empName");
        sb.append('=');
        sb.append(((this.empName == null)?"<null>":this.empName));
        sb.append(',');
        sb.append("email");
        sb.append('=');
        sb.append(((this.email == null)?"<null>":this.email));
        sb.append(',');
        sb.append("designation");
        sb.append('=');
        sb.append(((this.designation == null)?"<null>":this.designation));
        sb.append(',');
        sb.append("salary");
        sb.append('=');
        sb.append(((this.salary == null)?"<null>":this.salary));
        sb.append(',');
        sb.append("photoUrl");
        sb.append('=');
        sb.append(((this.photoUrl == null)?"<null>":this.photoUrl));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
