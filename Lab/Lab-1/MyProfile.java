/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l1q2;

/**
 *
 * @author hafz's.
 */
public class MyProfile {
    public static class PersonalData {
        private String fullName;
        private String email;
        private String matricNumber;
        private String address;
        private String contactNumber;
        private int age;

        public PersonalData(String fullName, String email, String matricNumber, String address, String contactNumber, int age) {
            this.fullName = fullName;
            this.email = email;
            this.matricNumber = matricNumber;
            this.address = address;
            this.contactNumber = contactNumber;
            this.age = age;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public String getMatricNumber() {
            return matricNumber;
        }

        public void setMatricNumber(String matricNumber) {
            this.matricNumber = matricNumber;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getContactNumber() {
            return contactNumber;
        }

        public void setContactNumber(String contactNumber) {
            this.contactNumber = contactNumber;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
    
    public static void main(String[] args) {
        PersonalData student = new PersonalData(
                "Hafidz Muhammad Rizky", 
                "hafidz@arcanius.id",
                "24084524",
                "Persiaran TRX, Tun Razak Exchange, 55188 Kuala Lumpur, Wilayah Persekutuan Kuala Lumpur",
                "+6013xxxxxxx",
                18
        );
        
        System.out.println(".*' Personal Data '*.");
        System.out.println("Name: " + student.fullName);
        System.out.println("E-mail: " + student.email);
        System.out.println("Matric ID: " + student.matricNumber);
        System.out.println("Address: " + student.address);
        System.out.println("Phone Number: " + student.contactNumber);
        System.out.println("Age: " + student.age);
        
    }
    
}
