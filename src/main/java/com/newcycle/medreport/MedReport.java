package com.newcycle.medreport;

import com.formdev.flatlaf.FlatIntelliJLaf;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.UIManager;

public class MedReport {
        
    final static String users = "CREATE TABLE IF NOT EXISTS users (\n" +
"    user_id   INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
"    username  TEXT,\n" +
"    password  TEXT,\n" +
"    name      TEXT,\n" +
"    specialty TEXT\n" +
");";
    final static String patients = "CREATE TABLE IF NOT EXISTS patient_info ("
            + "    id                 INTEGER   PRIMARY KEY AUTOINCREMENT,"
            + "    name               TEXT (40),"
            + "    surname            TEXT (40),"
            + "    patronymic         TEXT (40),"
            + "    gender             TEXT (10),"
            + "    birth              TEXT (20),"
            + "    med_book           TEXT (20),"
            + "    military_rank      TEXT,"
            + "    contingent         TEXT,"
            + "            service            TEXT,"
            + "    address_live       TEXT,"
            + "            phone_number       TEXT (20),"
            + "    address_work       TEXT,"
            + "    confidant          TEXT,"
            + "    policy             TEXT,"
            + "    past_illness       TEXT,"
            + "    allergic_anamnesis TEXT"
            + ");";
    final static String exams = "CREATE TABLE IF NOT EXISTS examination (\n" +
"    id                   INTEGER   PRIMARY KEY AUTOINCREMENT,\n" +
"    patient_id           INTEGER   REFERENCES patient_info (id) ON DELETE CASCADE\n" +
"                                                                ON UPDATE NO ACTION\n" +
"                                                                MATCH SIMPLE,\n" +
"    exam_date             TEXT (20),\n" +
"    ref_doc_surname       TEXT (20),\n" +
"    ref_doc_position      TEXT (20),\n" +
"    disease_onset         TEXT (20),\n" +
"    admission_date        TEXT (20),\n" +
"    discharge_date        TEXT (20),\n" +
"    history               TEXT,\n" +
"    side_effect           TEXT,\n" +
"    days                  TEXT,\n" +
"    time                  TEXT,\n" +
"    emergency             TEXT,\n" +
"    termination           TEXT (10),\n" +
"    result                TEXT (30),\n" +
"    ref_diagnosis_code    TEXT,\n" +
"    ref_diagnosis_info    TEXT,\n" +
"    admis_diagnosis_code  TEXT,\n" +
"    admis_diagnosis_info  TEXT,\n" +
"    provis_diagnosis_code TEXT,\n" +
"    provis_diagnosis_info TEXT,\n" +
"    main_diagnosis_code   TEXT,\n" +
"    main_diagnosis_info   TEXT,\n" +
"    compl_diagnosis_code  TEXT,\n" +
"    compl_diagnosis_info  TEXT,\n" +
"    comorbidity_code      TEXT,\n" +
"    comorbidity_info      TEXT,\n" +
"    complaints            TEXT,\n" +
"    anamnesis_of_disease  TEXT,\n" +
"    anamnesis_of_life     TEXT,\n" +
"    heredity              TEXT,\n" +
"    habits                TEXT,\n" +
"    height                TEXT,\n" +
"    weight                TEXT,\n" +
"    imt                   TEXT,\n" +
"    state                 TEXT,\n" +
"    fiz_raz               TEXT,\n" +
"    def_raz               TEXT,\n" +
"    telo                  TEXT,\n" +
"    pitanie               TEXT,\n" +
"    pokrovy               TEXT,\n" +
"    limf_syst             TEXT,\n" +
"    mish_syst             TEXT,\n" +
"    svyaz_sust            TEXT,\n" +
"    serd_sosud            TEXT,\n" +
"    leg_dih               TEXT,\n" +
"    pischevarenie         TEXT,\n" +
"    mochepolovaya_syst    TEXT,\n" +
"    nerv_syst             TEXT,\n" +
"    organi_chuvstv        TEXT,\n" +
"    sekrecia              TEXT,\n" +
"    examination_results   TEXT,\n" +
"    proc_type1            TEXT,\n" +
"    proc_amount1          TEXT (10),\n" +
"    proc1                 TEXT,\n" +
"    proc_type2            TEXT,\n" +
"    proc_amount2          TEXT (10),\n" +
"    proc2                 TEXT,\n" +
"    proc_type3            TEXT,\n" +
"    proc_amount3          TEXT (10),\n" +
"    proc3                 TEXT,\n" +
"    proc_type4            TEXT,\n" +
"    proc_amount4          TEXT (10),\n" +
"    proc4                 TEXT,\n" +
"    proc_type5            TEXT,\n" +
"    proc_amount5          TEXT (10),\n" +
"    proc5                 TEXT,\n" +
"    compl_epik            TEXT,\n" +
"    outcome               TEXT,\n" +
"    recommendations       TEXT,\n" +
"    obj_status            TEXT\n" +
");";
    final static String proc = "CREATE TABLE IF NOT EXISTS procedure (\n" +
"    id               INTEGER   PRIMARY KEY AUTOINCREMENT,\n" +
"    date             TEXT (20),\n" +
"    exam_id          TEXT (20) REFERENCES examination (id) ON DELETE CASCADE,\n" +
"    proc_type1       TEXT,\n" +
"    proc1            TEXT,\n" +
"    proc_type2       TEXT,\n" +
"    proc2            TEXT,\n" +
"    proc_type3       TEXT,\n" +
"    proc3            TEXT,\n" +
"    proc_type4       TEXT,\n" +
"    proc4            TEXT,\n" +
"    proc_type5       TEXT,\n" +
"    proc5            TEXT,\n" +
"    time_start       TEXT,\n" +
"    time_end         TEXT,\n" +
"    complaints_diary TEXT,\n" +
"    status           TEXT,\n" +
"    temperature      TEXT,\n" +
"    breath           TEXT,\n" +
"    heart            TEXT,\n" +
"    pressure         TEXT,\n" +
"    pulse            TEXT,\n" +
"    diary            TEXT,\n" +
"    diary_add        TEXT,\n" +
"    skin             TEXT\n" +
");";
    public static void main(String[] args) throws ClassNotFoundException {
        try(Connection c = DBConnection.connectDB(); Statement stmt = c.createStatement();){
            stmt.executeUpdate(users);
            stmt.executeUpdate(patients);
            stmt.executeUpdate(exams);
            stmt.executeUpdate(proc);
        } catch(SQLException e){
           e.printStackTrace(); 
        }
        try {
            UIManager.setLookAndFeel(new FlatIntelliJLaf());
        } catch(Exception e){
            e.printStackTrace();
        }

        MainFrame f = new MainFrame();
        f.setVisible(true);
    }
}
