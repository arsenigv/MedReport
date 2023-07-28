package com.newcycle.medreport.models;

import com.newcycle.medreport.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Patient {
    
    private int id;
    private String name;
    private String surname;
    private String patronymic;
    private String gender;
    private String birthday;
    private String medBook;
    private String militaryRank;
    private String contingent;
    private String service;
    private String addressLive;
    private String addressWork;
    private String phoneNumber;
    private String confidant;
    private String policy;
    private String pastIllness;
    private String allergicAnamnesis;
    
    private List<Examination> examinationsList;
    private Examination currentExamination;

    private Connection connection;
    

    public Patient(int id, Connection connection) {
        this.id = id;
        this.connection = connection;
    }
    
    public Patient(String name, String surname, String patronymic, String gender){
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.gender = gender;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getMedBook() {
        return medBook;
    }

    public void setMedBook(String medBook) {
        this.medBook = medBook;
    }

    public String getMilitaryRank() {
        return militaryRank;
    }

    public void setMilitaryRank(String militaryRank) {
        this.militaryRank = militaryRank;
    }

    public String getContingent() {
        return contingent;
    }

    public void setContingent(String contingent) {
        this.contingent = contingent;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getAddressLive() {
        return addressLive;
    }

    public void setAddressLive(String addressLive) {
        this.addressLive = addressLive;
    }

    public String getAddressWork() {
        return addressWork;
    }

    public void setAddressWork(String addressWork) {
        this.addressWork = addressWork;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getConfidant() {
        return confidant;
    }

    public void setConfidant(String confidant) {
        this.confidant = confidant;
    }

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public String getPastIllness() {
        return pastIllness;
    }

    public void setPastIllness(String pastIllness) {
        this.pastIllness = pastIllness;
    }

    public String getAllergicAnamnesis() {
        return allergicAnamnesis;
    }

    public void setAllergicAnamnesis(String allergicAnamnesis) {
        this.allergicAnamnesis = allergicAnamnesis;
    }

    public List<Examination> getExaminationsList() {
        return examinationsList;
    }

    public void setExaminationsList(List<Examination> examinationsList) {
        this.examinationsList = examinationsList;
    }

    public Examination getExamination() {
        return currentExamination;
    }

    public void setExamination(Examination examination) {
        this.currentExamination = examination;
    }
    
    public Examination getCurrentExamination() {
        return currentExamination;
    }

    public void setCurrentExamination(Examination currentExamination) {
        this.currentExamination = currentExamination;
    }
    
    
//    public static void main(String[] args) throws ClassNotFoundException{
//        Connection c = DBConnection.connectDB();
//        
//        Patient p = new Patient(0, c);
//        List<Patient> l = p.findAll();
//        System.out.println(l);
//    }

    @Override
    public String toString() {
        return surname + " " + name + " " + patronymic;
    }
    
    public void getAllExaminations(){
        String sqlExamDates = "select id, exam_date from examination where patient_id = " + id;
        examinationsList = new ArrayList<>();
        try (PreparedStatement ps = connection.prepareStatement(sqlExamDates); ResultSet r = ps.executeQuery();){
            while(r.next()){
                Examination e = new Examination();
                e.setId(r.getInt("id"));
                e.setPatientId(id);
                e.setExamDate(r.getString("exam_date"));
                e.getAllProcedures(connection);
                examinationsList.add(e);
            }
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null, exception);
            exception.printStackTrace();
        }
    }
    
    public void loadData() {
        String sqlInfo = "select * from patient_info where id = " + id;

        try (PreparedStatement ps = connection.prepareStatement(sqlInfo); ResultSet r = ps.executeQuery();) {

            while (r.next()) {
                this.setGender(r.getString("gender"));
                this.setBirthday(r.getString("birth"));
                this.setMedBook(r.getString("med_book"));
                this.setMilitaryRank(r.getString("military_rank"));
                this.setContingent(r.getString("contingent"));
                this.setService(r.getString("service"));
                this.setPhoneNumber(r.getString("phone_number"));
                this.setConfidant(r.getString("confidant"));
                this.setPolicy(r.getString("policy"));
                this.setAddressLive(r.getString("address_live"));
                this.setAddressWork(r.getString("address_work"));
                this.setPastIllness(r.getString("past_illness"));
                this.setAllergicAnamnesis(r.getString("allergic_anamnesis"));
            }

        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null, exception);
            exception.printStackTrace();
        }
    }
}
