package com.newcycle.medreport.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Examination {
    private int id;
    private int patientId;
    private String examDate;
    private String refDocSurname;
    private String refDocPosition;
    private String diseaseOnset;
    private String admissionDate;
    private String dischargeDate;
    private String history;
    private String sideEffect;
    private String days;
    private String time;
    private String emergency;
    private String termination;
    private String result;
    private String refDiagnosisCode;
    private String refDiagnosisInfo;
    private String admisDiagnosisCode;
    private String admisDiagnosisInfo;
    private String provisDiagnosisCode;
    private String provisDiagnosisInfo;
    private String mainDiagnosisCode;
    private String mainDiagnosisInfo;
    private String complDiagnosisCode;
    private String complDiagnosisInfo;
    private String comorbidityCode;
    private String comorbidityInfo;
    private String complaints;
    private String anamnesisOfDisease;
    private String anamnesisOfLife;
    private String heredity;
    private String habits;
    private String height;
    private String weight;
    private String imt;
    private String state;
    private String fizRaz;
    private String defRaz;
    private String telo;
    private String pitanie;
    private String pokrovy;
    private String limfSyst;
    private String mishSyst;;
    private String svyazSust;
    private String serdSosud;
    private String legDih;
    private String pischevarenie;
    private String mochepolovayaSyst;
    private String nervSyst;
    private String organiChuvstv;
    private String sekrecia;
    private String examinationResults;
    private String procType1;
    private String procAmount1;
    private String proc1;
    private String procType2;
    private String procAmount2;
    private String proc2;
    private String procType3;
    private String procAmount3;
    private String proc3;
    private String procType4;
    private String procAmount4;
    private String proc4;
    private String procType5;
    private String procAmount5;
    private String proc5;
    private String complEpik;
    private String outcome;
    private String recommendations;
    private String objStatus;

    private List<Procedure> proceduresList;
    private Procedure currentProcedure;

    public Examination(int id, int patientId, Connection connection) {
        this.id = id;
        this.patientId = patientId;
    }

    public Examination() {
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getExamDate() {
        return examDate;
    }

    public void setExamDate(String examDate) {
        this.examDate = examDate;
    }

    public String getRefDocSurname() {
        return refDocSurname;
    }

    public void setRefDocSurname(String refDocSurname) {
        this.refDocSurname = refDocSurname;
    }

    public String getRefDocPosition() {
        return refDocPosition;
    }

    public void setRefDocPosition(String refDocPosition) {
        this.refDocPosition = refDocPosition;
    }

    public String getDiseaseOnset() {
        return diseaseOnset;
    }

    public void setDiseaseOnset(String diseaseOnset) {
        this.diseaseOnset = diseaseOnset;
    }

    public String getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
    }

    public String getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(String dischargeDate) {
        this.dischargeDate = dischargeDate;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getSideEffect() {
        return sideEffect;
    }

    public void setSideEffect(String sideEffect) {
        this.sideEffect = sideEffect;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getEmergency() {
        return emergency;
    }

    public void setEmergency(String emergency) {
        this.emergency = emergency;
    }

    public String getTermination() {
        return termination;
    }

    public void setTermination(String termination) {
        this.termination = termination;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getRefDiagnosisCode() {
        return refDiagnosisCode;
    }

    public void setRefDiagnosisCode(String refDiagnosisCode) {
        this.refDiagnosisCode = refDiagnosisCode;
    }

    public String getRefDiagnosisInfo() {
        return refDiagnosisInfo;
    }

    public void setRefDiagnosisInfo(String refDiagnosisInfo) {
        this.refDiagnosisInfo = refDiagnosisInfo;
    }

    public String getAdmisDiagnosisCode() {
        return admisDiagnosisCode;
    }

    public void setAdmisDiagnosisCode(String admisDiagnosisCode) {
        this.admisDiagnosisCode = admisDiagnosisCode;
    }

    public String getAdmisDiagnosisInfo() {
        return admisDiagnosisInfo;
    }

    public void setAdmisDiagnosisInfo(String admisDiagnosisInfo) {
        this.admisDiagnosisInfo = admisDiagnosisInfo;
    }

    public String getProvisDiagnosisCode() {
        return provisDiagnosisCode;
    }

    public void setProvisDiagnosisCode(String provisDiagnosisCode) {
        this.provisDiagnosisCode = provisDiagnosisCode;
    }

    public String getProvisDiagnosisInfo() {
        return provisDiagnosisInfo;
    }

    public void setProvisDiagnosisInfo(String provisDiagnosisInfo) {
        this.provisDiagnosisInfo = provisDiagnosisInfo;
    }

    public String getMainDiagnosisCode() {
        return mainDiagnosisCode;
    }

    public void setMainDiagnosisCode(String mainDiagnosisCode) {
        this.mainDiagnosisCode = mainDiagnosisCode;
    }

    public String getMainDiagnosisInfo() {
        return mainDiagnosisInfo;
    }

    public void setMainDiagnosisInfo(String mainDiagnosisInfo) {
        this.mainDiagnosisInfo = mainDiagnosisInfo;
    }

    public String getComplDiagnosisCode() {
        return complDiagnosisCode;
    }

    public void setComplDiagnosisCode(String complDiagnosisCode) {
        this.complDiagnosisCode = complDiagnosisCode;
    }

    public String getComplDiagnosisInfo() {
        return complDiagnosisInfo;
    }

    public void setComplDiagnosisInfo(String complDiagnosisInfo) {
        this.complDiagnosisInfo = complDiagnosisInfo;
    }

    public String getComorbidityCode() {
        return comorbidityCode;
    }

    public void setComorbidityCode(String comorbidityCode) {
        this.comorbidityCode = comorbidityCode;
    }

    public String getComorbidityInfo() {
        return comorbidityInfo;
    }

    public void setComorbidityInfo(String comorbidityInfo) {
        this.comorbidityInfo = comorbidityInfo;
    }

    public String getComplaints() {
        return complaints;
    }

    public void setComplaints(String complaints) {
        this.complaints = complaints;
    }

    public String getAnamnesisOfDisease() {
        return anamnesisOfDisease;
    }

    public void setAnamnesisOfDisease(String anamnesisOfDisease) {
        this.anamnesisOfDisease = anamnesisOfDisease;
    }

    public String getAnamnesisOfLife() {
        return anamnesisOfLife;
    }

    public void setAnamnesisOfLife(String anamnesisOfLife) {
        this.anamnesisOfLife = anamnesisOfLife;
    }

    public String getHeredity() {
        return heredity;
    }

    public void setHeredity(String heredity) {
        this.heredity = heredity;
    }

    public String getHabits() {
        return habits;
    }

    public void setHabits(String habits) {
        this.habits = habits;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getImt() {
        return imt;
    }

    public void setImt(String imt) {
        this.imt = imt;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getFizRaz() {
        return fizRaz;
    }

    public void setFizRaz(String fizRaz) {
        this.fizRaz = fizRaz;
    }

    public String getDefRaz() {
        return defRaz;
    }

    public void setDefRaz(String defRaz) {
        this.defRaz = defRaz;
    }

    public String getTelo() {
        return telo;
    }

    public void setTelo(String telo) {
        this.telo = telo;
    }

    public String getPitanie() {
        return pitanie;
    }

    public void setPitanie(String pitanie) {
        this.pitanie = pitanie;
    }

    public String getPokrovy() {
        return pokrovy;
    }

    public void setPokrovy(String pokrovy) {
        this.pokrovy = pokrovy;
    }

    public String getLimfSyst() {
        return limfSyst;
    }

    public void setLimfSyst(String limfSyst) {
        this.limfSyst = limfSyst;
    }

    public String getMishSyst() {
        return mishSyst;
    }

    public void setMishSyst(String mishSyst) {
        this.mishSyst = mishSyst;
    }

    public String getSvyazSust() {
        return svyazSust;
    }

    public void setSvyazSust(String svyazSust) {
        this.svyazSust = svyazSust;
    }

    public String getSerdSosud() {
        return serdSosud;
    }

    public void setSerdSosud(String serdSosud) {
        this.serdSosud = serdSosud;
    }

    public String getLegDih() {
        return legDih;
    }

    public void setLegDih(String legDih) {
        this.legDih = legDih;
    }

    public String getPischevarenie() {
        return pischevarenie;
    }

    public void setPischevarenie(String pischevarenie) {
        this.pischevarenie = pischevarenie;
    }

    public String getMochepolovayaSyst() {
        return mochepolovayaSyst;
    }

    public void setMochepolovayaSyst(String mochepolovayaSyst) {
        this.mochepolovayaSyst = mochepolovayaSyst;
    }

    public String getNervSyst() {
        return nervSyst;
    }

    public void setNervSyst(String nervSyst) {
        this.nervSyst = nervSyst;
    }

    public String getOrganiChuvstv() {
        return organiChuvstv;
    }

    public void setOrganiChuvstv(String organiChuvstv) {
        this.organiChuvstv = organiChuvstv;
    }

    public String getSekrecia() {
        return sekrecia;
    }

    public void setSekrecia(String sekrecia) {
        this.sekrecia = sekrecia;
    }

    public String getExaminationResults() {
        return examinationResults;
    }

    public void setExaminationResults(String examinationResults) {
        this.examinationResults = examinationResults;
    }

    public String getProcType1() {
        return procType1;
    }

    public void setProcType1(String procType1) {
        this.procType1 = procType1;
    }

    public String getProcAmount1() {
        return procAmount1;
    }

    public void setProcAmount1(String procAmount1) {
        this.procAmount1 = procAmount1;
    }

    public String getProc1() {
        return proc1;
    }

    public void setProc1(String proc1) {
        this.proc1 = proc1;
    }

    public String getProcType2() {
        return procType2;
    }

    public void setProcType2(String procType2) {
        this.procType2 = procType2;
    }

    public String getProcAmount2() {
        return procAmount2;
    }

    public void setProcAmount2(String procAmount2) {
        this.procAmount2 = procAmount2;
    }

    public String getProc2() {
        return proc2;
    }

    public void setProc2(String proc2) {
        this.proc2 = proc2;
    }

    public String getProcType3() {
        return procType3;
    }

    public void setProcType3(String procType3) {
        this.procType3 = procType3;
    }

    public String getProcAmount3() {
        return procAmount3;
    }

    public void setProcAmount3(String procAmount3) {
        this.procAmount3 = procAmount3;
    }

    public String getProc3() {
        return proc3;
    }

    public void setProc3(String proc3) {
        this.proc3 = proc3;
    }

    public String getProcType4() {
        return procType4;
    }

    public void setProcType4(String procType4) {
        this.procType4 = procType4;
    }

    public String getProcAmount4() {
        return procAmount4;
    }

    public void setProcAmount4(String procAmount4) {
        this.procAmount4 = procAmount4;
    }

    public String getProc4() {
        return proc4;
    }

    public void setProc4(String proc4) {
        this.proc4 = proc4;
    }

    public String getProcType5() {
        return procType5;
    }

    public void setProcType5(String procType5) {
        this.procType5 = procType5;
    }

    public String getProcAmount5() {
        return procAmount5;
    }

    public void setProcAmount5(String procAmount5) {
        this.procAmount5 = procAmount5;
    }

    public String getProc5() {
        return proc5;
    }

    public void setProc5(String proc5) {
        this.proc5 = proc5;
    }

    public String getComplEpik() {
        return complEpik;
    }

    public void setComplEpik(String complEpik) {
        this.complEpik = complEpik;
    }

    public String getOutcome() {
        return outcome;
    }

    public void setOutcome(String outcome) {
        this.outcome = outcome;
    }

    public String getRecommendations() {
        return recommendations;
    }

    public void setRecommendations(String recommendations) {
        this.recommendations = recommendations;
    }

    public String getObjStatus() {
        return objStatus;
    }

    public void setObjStatus(String objStatus) {
        this.objStatus = objStatus;
    }

    public List<Procedure> getProceduresList() {
        return proceduresList;
    }

    public void setProceduresList(List<Procedure> proceduresList) {
        this.proceduresList = proceduresList;
    }

    public Procedure getCurrentProcedure() {
        return currentProcedure;
    }

    public void setCurrentProcedure(Procedure procedure) {
        this.currentProcedure = procedure;
    }

    @Override
    public String toString() {
        return examDate;
    }

    public void getAllProcedures(Connection connection) {
        String sql = "select id, date from procedure where exam_id = " + id;
        
        proceduresList = new ArrayList<>();
        
        try (PreparedStatement ps = connection.prepareStatement(sql); ResultSet r = ps.executeQuery();){
            while(r.next()){
                Procedure p = new Procedure();
                p.setId(r.getInt("id"));
                p.setDate(r.getString("date"));
                proceduresList.add(p);
            }
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null, exception);
            exception.printStackTrace();
        }
    }
    
    public void loadData(Examination examination, Connection connection){
        String sql = "select * from examination where id = " + examination.getId();
        
        try (PreparedStatement ps = connection.prepareStatement(sql); ResultSet r = ps.executeQuery();){
            while(r.next()){
                examination.setRefDocSurname(r.getString("ref_doc_surname"));
                examination.setRefDocPosition(r.getString("ref_doc_position"));
                examination.setDiseaseOnset(r.getString("disease_onset"));
                examination.setAdmissionDate(r.getString("admission_date"));
                examination.setDischargeDate(r.getString("discharge_date"));
                examination.setHistory(r.getString("history"));
                examination.setSideEffect(r.getString("side_effect"));
                examination.setDays(r.getString("days"));
                examination.setTime(r.getString("time"));
                examination.setRefDiagnosisCode(r.getString("ref_diagnosis_code"));
                examination.setRefDiagnosisInfo(r.getString("ref_diagnosis_info"));
                examination.setAdmisDiagnosisCode(r.getString("admis_diagnosis_code"));
                examination.setAdmisDiagnosisInfo(r.getString("admis_diagnosis_info"));
                examination.setProvisDiagnosisCode(r.getString("provis_diagnosis_code"));
                examination.setProvisDiagnosisInfo(r.getString("provis_diagnosis_info"));
                examination.setMainDiagnosisCode(r.getString("main_diagnosis_code"));
                examination.setMainDiagnosisInfo(r.getString("main_diagnosis_info"));
                examination.setComplDiagnosisCode(r.getString("compl_diagnosis_code"));
                examination.setComplDiagnosisInfo(r.getString("compl_diagnosis_info"));
                examination.setComorbidityCode(r.getString("comorbidity_code"));
                examination.setComorbidityInfo(r.getString("comorbidity_info"));
                examination.setResult(r.getString("result"));
                examination.setTermination(r.getString("termination"));
                examination.setEmergency(r.getString("emergency"));
                
                // Поля раздела Протокол
                examination.setComplaints(r.getString("complaints"));
                examination.setAnamnesisOfDisease(r.getString("anamnesis_of_disease"));
                examination.setAnamnesisOfLife(r.getString("anamnesis_of_life"));
                examination.setHeredity(r.getString("heredity"));
                examination.setHabits(r.getString("habits"));
                
                // Поля раздела Осмотр
                examination.setHeight(r.getString("height"));
                examination.setWeight(r.getString("weight"));
                examination.setImt(r.getString("imt"));
                examination.setState(r.getString("state"));
                examination.setFizRaz(r.getString("fiz_raz"));
                examination.setDefRaz(r.getString("def_raz"));
                examination.setTelo(r.getString("telo"));
                examination.setPitanie(r.getString("pitanie"));
                examination.setPokrovy(r.getString("pokrovy"));
                examination.setLimfSyst(r.getString("limf_syst"));
                examination.setMishSyst(r.getString("mish_syst"));
                examination.setSvyazSust(r.getString("svyaz_sust"));
                examination.setSerdSosud(r.getString("serd_sosud"));
                examination.setLegDih(r.getString("leg_dih"));
                examination.setPischevarenie(r.getString("pischevarenie"));
                examination.setMochepolovayaSyst(r.getString("mochepolovaya_syst"));
                examination.setNervSyst(r.getString("nerv_syst"));
                examination.setOrganiChuvstv(r.getString("organi_chuvstv"));
                examination.setSekrecia(r.getString("sekrecia"));
                examination.setExaminationResults(r.getString("examination_results"));

                // Поля раздела План лечения
                examination.setProcType1(r.getString("proc_type1"));
                examination.setProcAmount1(r.getString("proc_amount1"));
                examination.setProc1(r.getString("proc1"));
                examination.setProcType2(r.getString("proc_type2"));
                examination.setProcAmount2(r.getString("proc_amount2"));
                examination.setProc2(r.getString("proc2"));
                examination.setProcType3(r.getString("proc_type3"));
                examination.setProcAmount3(r.getString("proc_amount3"));
                examination.setProc3(r.getString("proc3"));
                examination.setProcType4(r.getString("proc_type4"));
                examination.setProcAmount4(r.getString("proc_amount4"));
                examination.setProc4(r.getString("proc4"));
                examination.setProcType5(r.getString("proc_type5"));
                examination.setProcAmount5(r.getString("proc_amount5"));
                examination.setProc5(r.getString("proc5"));
                
                // Поля раздела Эпикриз
                examination.setComplEpik(r.getString("compl_epik"));
                examination.setOutcome(r.getString("outcome"));
                examination.setRecommendations(r.getString("recommendations"));
                examination.setObjStatus(r.getString("obj_status"));
            }
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null, exception);
            exception.printStackTrace();
        }
    }
}
