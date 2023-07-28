package com.newcycle.medreport.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Procedure {
    private int id;
    private String date;
    private int examId ;
    private String procType1;
    private String proc1;
    private String procType2;
    private String proc2;
    private String procType3;
    private String proc3;
    private String procType4;
    private String proc4;
    private String procType5;
    private String proc5;
    private String timeStart;
    private String timeEnd;
    private String complaintDiary;
    private String status;
    private String temperature;
    private String breath;
    private String heart;
    private String pressure;
    private String pulse;
    private String diary;
    private String diaryAdd;
    private String skin;
    

    public Procedure(int id, int examId) {
        this.id = id;
        this.examId = examId;
    }   

    public Procedure() {
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public long getExamId() {
        return examId;
    }

    public void setExamId(int examId) {
        this.examId = examId;
    }

    public String getProcType1() {
        return procType1;
    }

    public void setProcType1(String procType1) {
        this.procType1 = procType1;
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

    public String getProc5() {
        return proc5;
    }

    public void setProc5(String proc5) {
        this.proc5 = proc5;
    }

    public String getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart;
    }

    public String getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd;
    }

    public String getComplaintDiary() {
        return complaintDiary;
    }

    public void setComplaintDiary(String complaintDiary) {
        this.complaintDiary = complaintDiary;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getBreath() {
        return breath;
    }

    public void setBreath(String breath) {
        this.breath = breath;
    }

    public String getHeart() {
        return heart;
    }

    public void setHeart(String heart) {
        this.heart = heart;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public String getPulse() {
        return pulse;
    }

    public void setPulse(String pulse) {
        this.pulse = pulse;
    }

    public String getDiary() {
        return diary;
    }

    public void setDiary(String diary) {
        this.diary = diary;
    }

    public String getDiaryAdd() {
        return diaryAdd;
    }

    public void setDiaryAdd(String diaryAdd) {
        this.diaryAdd = diaryAdd;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    @Override
    public String toString() {
        return date;
    }
    
    public void loadData(Procedure procedure, Connection connection){

        String sql = "select * from procedure where id = " + procedure.getId();

        try (PreparedStatement ps = connection.prepareStatement(sql); ResultSet r = ps.executeQuery();) {
            while (r.next()) {
                procedure.setDate(r.getString("date"));
                procedure.setProcType1(r.getString("proc_type1"));
                procedure.setProc1(r.getString("proc1"));
                procedure.setProcType2(r.getString("proc_type2"));
                procedure.setProc2(r.getString("proc2"));
                procedure.setProcType3(r.getString("proc_type3"));
                procedure.setProc3(r.getString("proc3"));
                procedure.setProcType4(r.getString("proc_type4"));
                procedure.setProc4(r.getString("proc4"));
                procedure.setProcType5(r.getString("proc_type5"));
                procedure.setProc5(r.getString("proc5"));
                procedure.setDiaryAdd(r.getString("diary_add"));
                procedure.setDiary(r.getString("diary"));
                procedure.setTimeStart(r.getString("time_start"));
                procedure.setTimeEnd(r.getString("time_end"));
                procedure.setComplaintDiary(r.getString("complaints_diary"));
                procedure.setStatus(r.getString("status"));
                procedure.setTemperature(r.getString("temperature"));
                procedure.setSkin(r.getString("skin"));
                procedure.setBreath(r.getString("breath"));
                procedure.setHeart(r.getString("heart"));
                procedure.setPressure(r.getString("pressure"));
                procedure.setPulse(r.getString("pulse"));
            }
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null, exception);
            exception.printStackTrace();
        }
    }
}
