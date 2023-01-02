package student_pratham;

public class Department {
    public String departmentName;
    public Integer departmentId;
    public String major;
    public Department() {
        this.departmentName = null;
        this.departmentId = null;
    }
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public String getDepartmentName() {
        return departmentName;
    }
    public Integer getDepartmentId() {
        return departmentId;
    }
    public String getMajor() {
        return major;
    }
}