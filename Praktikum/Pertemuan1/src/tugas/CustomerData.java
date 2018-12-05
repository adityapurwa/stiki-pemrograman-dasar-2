package tugas;

import java.util.Date;

public class CustomerData {
    private String name;
    private String address;
    private Date birthdate;
    private String occupation;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public CustomerData(String name, String address, Date birthdate, String occupation, double salary) {
        this.name = name;
        this.address = address;
        this.birthdate = birthdate;
        this.occupation = occupation;
        this.salary = salary;
    }

    public CustomerData() {
    }

    @Override
    public String toString() {
        return String.format(
                "Nama: %s\nAlamat: %s\nTanggal Lahir: %s\nPekerjaan: %s\nGaji: %s",
                this.getName(),
                this.getAddress(),
                this.getBirthdate().toString(),
                this.getOccupation(),
                this.getSalary()
        );
    }
}
