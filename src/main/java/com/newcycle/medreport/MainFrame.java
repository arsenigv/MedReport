package com.newcycle.medreport;

import com.github.lgooddatepicker.components.DatePicker;
import com.github.lgooddatepicker.components.DatePickerSettings;
import com.newcycle.medreport.models.Examination;
import com.newcycle.medreport.models.Patient;
import com.newcycle.medreport.models.Procedure;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRPrintPage;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.type.OrientationEnum;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

public class MainFrame extends javax.swing.JFrame {

    Connection connection = null;

    public MainFrame() throws ClassNotFoundException {
//        toDay();
        initComponents();
        connection = DBConnection.connectDB();
        fillPatientList();
        setPatientFieldsEnabled(false);
        setExamFieldsEnabled(false);
        setProcFieldsEnabled(false);
    }

    public MainFrame(String newName, String newSurname) throws ClassNotFoundException {
        initComponents();
        connection = DBConnection.connectDB();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane30 = new javax.swing.JScrollPane();
        MainContentPanel = new javax.swing.JPanel();
        panel_PersonalData = new javax.swing.JPanel();
        label_name = new javax.swing.JLabel();
        label_gender = new javax.swing.JLabel();
        label_surname = new javax.swing.JLabel();
        rb_male = new javax.swing.JRadioButton();
        rb_female = new javax.swing.JRadioButton();
        cb_contingent = new javax.swing.JComboBox<>();
        label_addressWork = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        label_allergicAnamnesis = new javax.swing.JLabel();
        label_patronymic = new javax.swing.JLabel();
        label_birth = new javax.swing.JLabel();
        txt_surname = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtArea_allergicAnamnesis = new javax.swing.JTextArea();
        cb_rank = new javax.swing.JComboBox<>();
        label_pastIllness = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtArea_pastIllness = new javax.swing.JTextArea();
        label_contingent = new javax.swing.JLabel();
        txt_patronymic = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        label_rank = new javax.swing.JLabel();
        label_addressLive = new javax.swing.JLabel();
        txt_addressLive = new javax.swing.JTextField();
        txt_addressWork = new javax.swing.JTextField();
        label_medbook = new javax.swing.JLabel();
        txt_medbook = new javax.swing.JTextField();
        label_phone = new javax.swing.JLabel();
        txt_phone = new javax.swing.JTextField();
        label_confidant = new javax.swing.JLabel();
        txt_confidant = new javax.swing.JTextField();
        txt_policy = new javax.swing.JTextField();
        label_service = new javax.swing.JLabel();
        cb_service = new javax.swing.JComboBox<>();
        label_policy = new javax.swing.JLabel();
        btn_AddPastIllness = new javax.swing.JButton();
        btn_AddAllergy = new javax.swing.JButton();
        date_birth = new com.github.lgooddatepicker.components.DatePicker();
        panel_Examination = new javax.swing.JPanel();
        panel_Tab = new javax.swing.JPanel();
        tabbedPane = new javax.swing.JTabbedPane();
        panel_General = new javax.swing.JPanel();
        label_Ref = new javax.swing.JLabel();
        txt_refSurname = new javax.swing.JTextField();
        btn_refSurname = new javax.swing.JButton();
        btn_refPos = new javax.swing.JButton();
        txt_refPos = new javax.swing.JTextField();
        label_DiseaseOnset = new javax.swing.JLabel();
        label_AdmissionDate = new javax.swing.JLabel();
        label_DischargeDate = new javax.swing.JLabel();
        label_historyNum = new javax.swing.JLabel();
        txt_historyNum = new javax.swing.JTextField();
        label_SideEffect = new javax.swing.JLabel();
        txt_sideEffect = new javax.swing.JTextField();
        check_Emergency = new javax.swing.JCheckBox();
        label_Days = new javax.swing.JLabel();
        txt_days = new javax.swing.JTextField();
        check_Termination = new javax.swing.JCheckBox();
        label_Result = new javax.swing.JLabel();
        cb_Result = new javax.swing.JComboBox<>();
        btn_noSideEffects = new javax.swing.JButton();
        btn_days = new javax.swing.JButton();
        label_Ref1 = new javax.swing.JLabel();
        label_Days1 = new javax.swing.JLabel();
        txt_timeAdmis = new javax.swing.JTextField();
        date_diseaseOnset = new com.github.lgooddatepicker.components.DatePicker();
        date_admission = new com.github.lgooddatepicker.components.DatePicker();
        date_discharge = new com.github.lgooddatepicker.components.DatePicker();
        panel_Diagnosis = new javax.swing.JPanel();
        txt_Comorbidity = new javax.swing.JTextField();
        txt_ComplDiagnosisCode = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtArea_Comorbidity = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtArea_MainDiagnosis = new javax.swing.JTextArea();
        txt_MainDiagnosisCode = new javax.swing.JTextField();
        label_MainDiagnosis = new javax.swing.JLabel();
        label_ComplDiagnosis = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtArea_ComplDiagnosis = new javax.swing.JTextArea();
        label_Comorbidity = new javax.swing.JLabel();
        label_MainDiagnosis1 = new javax.swing.JLabel();
        txt_RefDiagnosisCode = new javax.swing.JTextField();
        jScrollPane14 = new javax.swing.JScrollPane();
        txtArea_AdmisDiagnosis = new javax.swing.JTextArea();
        label_ProvisDiagnosis = new javax.swing.JLabel();
        label_AdmisDiagnosis = new javax.swing.JLabel();
        jScrollPane23 = new javax.swing.JScrollPane();
        txtArea_RefDiagnosis = new javax.swing.JTextArea();
        jScrollPane24 = new javax.swing.JScrollPane();
        txtArea_ProvisDiagnosis = new javax.swing.JTextArea();
        txt_ProvisDiagnosisCode = new javax.swing.JTextField();
        txt_AdmisDiagnosisCode = new javax.swing.JTextField();
        btn_copyMainDiag = new javax.swing.JButton();
        btn_addRefDiag = new javax.swing.JButton();
        btn_addAdmisDiag = new javax.swing.JButton();
        btn_addProvisDiag = new javax.swing.JButton();
        btn_addMainDiag = new javax.swing.JButton();
        btn_addComplDiag = new javax.swing.JButton();
        btn_addComor = new javax.swing.JButton();
        panel_ProtocolTab = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        txtArea_AnamnesisDis = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        txtArea_Complaints = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        txtArea_AnamnesisLife = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        txt_heredity = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txt_habits = new javax.swing.JTextField();
        btn_AddAnamDis = new javax.swing.JButton();
        btn_AddAnamLife = new javax.swing.JButton();
        btn_AddComplaints = new javax.swing.JButton();
        btn_AddHeredity = new javax.swing.JButton();
        btn_AddHabits = new javax.swing.JButton();
        label_examinationResults = new javax.swing.JLabel();
        btn_AddFlur = new javax.swing.JButton();
        btn_AddEKG = new javax.swing.JButton();
        btn_AddOAK = new javax.swing.JButton();
        jScrollPane13 = new javax.swing.JScrollPane();
        txtArea_ExaminationResults = new javax.swing.JTextArea();
        btn_AddOAM = new javax.swing.JButton();
        btn_AddBHA = new javax.swing.JButton();
        btn_AddUziOBP = new javax.swing.JButton();
        btn_AddUZDG_BCA = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        panel_ExaminationTab = new javax.swing.JPanel();
        label_fizRaz = new javax.swing.JLabel();
        label_defRaz = new javax.swing.JLabel();
        label_telo = new javax.swing.JLabel();
        label_pitanie = new javax.swing.JLabel();
        label_pokrovy = new javax.swing.JLabel();
        label_limfSyst = new javax.swing.JLabel();
        label_mishSyst = new javax.swing.JLabel();
        label_svyazSust = new javax.swing.JLabel();
        label_serdSosud = new javax.swing.JLabel();
        label_pischevarenie = new javax.swing.JLabel();
        label_mochepolovayaSyst = new javax.swing.JLabel();
        label_nervSyst = new javax.swing.JLabel();
        label_organiChuvstv = new javax.swing.JLabel();
        label_sekrecia = new javax.swing.JLabel();
        txt_fizRaz = new javax.swing.JTextField();
        txt_defRaz = new javax.swing.JTextField();
        txt_telo = new javax.swing.JTextField();
        txt_pitanie = new javax.swing.JTextField();
        txt_pokrovy = new javax.swing.JTextField();
        txt_limfSyst = new javax.swing.JTextField();
        txt_mishSyst = new javax.swing.JTextField();
        txt_svyazSust = new javax.swing.JTextField();
        txt_serdSosud = new javax.swing.JTextField();
        txt_pischevarenie = new javax.swing.JTextField();
        txt_mochepolovayaSyst = new javax.swing.JTextField();
        txt_nervSyst = new javax.swing.JTextField();
        txt_organiChuvstv = new javax.swing.JTextField();
        txt_sekrecia = new javax.swing.JTextField();
        label_height = new javax.swing.JLabel();
        txt_weight = new javax.swing.JTextField();
        label_weight = new javax.swing.JLabel();
        txt_height = new javax.swing.JTextField();
        label_imt = new javax.swing.JLabel();
        txt_imt = new javax.swing.JTextField();
        btn_imt = new javax.swing.JButton();
        btn_AddFizRaz = new javax.swing.JButton();
        btn_AddDefRaz = new javax.swing.JButton();
        btn_AddTelo = new javax.swing.JButton();
        btn_AddPitanie = new javax.swing.JButton();
        btn_AddPokrovy = new javax.swing.JButton();
        btn_AddLimfSyst = new javax.swing.JButton();
        btn_AddMishSyst = new javax.swing.JButton();
        btn_AddSvyazSust = new javax.swing.JButton();
        btn_AddSerdSosud = new javax.swing.JButton();
        btn_AddPischevarenie = new javax.swing.JButton();
        btn_AddMochepolovayaSyst = new javax.swing.JButton();
        btn_AddNervSyst = new javax.swing.JButton();
        btn_AddOrgani = new javax.swing.JButton();
        btn_AddSekrecia = new javax.swing.JButton();
        label_serdSosud1 = new javax.swing.JLabel();
        txt_legDih = new javax.swing.JTextField();
        btn_AddLegDih = new javax.swing.JButton();
        label_state = new javax.swing.JLabel();
        txt_state = new javax.swing.JTextField();
        btn_AddState = new javax.swing.JButton();
        panel_TreatmentTab = new javax.swing.JPanel();
        label_procedure1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea_Procedure2 = new javax.swing.JTextArea();
        label_ProcedureNum1 = new javax.swing.JLabel();
        txt_ProcedureNum2 = new javax.swing.JTextField();
        sep_Procedure1 = new javax.swing.JSeparator();
        label_procedure2 = new javax.swing.JLabel();
        label_ProcedureNum2 = new javax.swing.JLabel();
        txt_ProcedureNum1 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtArea_Procedure1 = new javax.swing.JTextArea();
        btn_Procedure2 = new javax.swing.JButton();
        label_procedure3 = new javax.swing.JLabel();
        label_ProcedureNum3 = new javax.swing.JLabel();
        txt_ProcedureNum3 = new javax.swing.JTextField();
        jScrollPane15 = new javax.swing.JScrollPane();
        txtArea_Procedure3 = new javax.swing.JTextArea();
        btn_Procedure3 = new javax.swing.JButton();
        label_procedure4 = new javax.swing.JLabel();
        label_ProcedureNum4 = new javax.swing.JLabel();
        txt_ProcedureNum4 = new javax.swing.JTextField();
        jScrollPane16 = new javax.swing.JScrollPane();
        txtArea_Procedure4 = new javax.swing.JTextArea();
        btn_Procedure4 = new javax.swing.JButton();
        sep_Procedure2 = new javax.swing.JSeparator();
        sep_Procedure3 = new javax.swing.JSeparator();
        sep_Procedure4 = new javax.swing.JSeparator();
        label_procedure5 = new javax.swing.JLabel();
        label_ProcedureNum5 = new javax.swing.JLabel();
        txt_ProcedureNum5 = new javax.swing.JTextField();
        btn_Procedure5 = new javax.swing.JButton();
        jScrollPane22 = new javax.swing.JScrollPane();
        txtArea_Procedure5 = new javax.swing.JTextArea();
        txt_proc1 = new javax.swing.JTextField();
        txt_proc2 = new javax.swing.JTextField();
        txt_proc3 = new javax.swing.JTextField();
        txt_proc4 = new javax.swing.JTextField();
        txt_proc5 = new javax.swing.JTextField();
        btn_Procedure1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        label_ComplaintsEpik = new javax.swing.JLabel();
        jScrollPane25 = new javax.swing.JScrollPane();
        txtArea_ComplaintsEpik = new javax.swing.JTextArea();
        btn_AddComplaints1 = new javax.swing.JButton();
        label_ComplaintsEpik1 = new javax.swing.JLabel();
        jScrollPane26 = new javax.swing.JScrollPane();
        txtArea_Outcome = new javax.swing.JTextArea();
        btn_AddOutcome = new javax.swing.JButton();
        label_ComplaintsEpik2 = new javax.swing.JLabel();
        jScrollPane27 = new javax.swing.JScrollPane();
        txtArea_Recommedations = new javax.swing.JTextArea();
        btn_AddRecommendations = new javax.swing.JButton();
        jScrollPane28 = new javax.swing.JScrollPane();
        txtArea_ObjStatus = new javax.swing.JTextArea();
        label_ComplaintsEpik3 = new javax.swing.JLabel();
        btn_AddRecommendations1 = new javax.swing.JButton();
        panel_ExamToolbar = new javax.swing.JPanel();
        cb_visitDate = new javax.swing.JComboBox<>();
        btn_AddExamination = new javax.swing.JButton();
        btn_DeleteExamination = new javax.swing.JButton();
        label_currentExamId = new javax.swing.JLabel();
        panel_PatList = new javax.swing.JPanel();
        jScrollPane21 = new javax.swing.JScrollPane();
        list_patients = new javax.swing.JList<>();
        txt_search = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        panel_FrameToolbar = new javax.swing.JPanel();
        tool_id = new javax.swing.JLabel();
        tool_Delete = new javax.swing.JButton();
        tool_Save = new javax.swing.JButton();
        tool_New = new javax.swing.JButton();
        tool_Refresh = new javax.swing.JButton();
        panel_Proc = new javax.swing.JPanel();
        panel_ProcToolbar = new javax.swing.JPanel();
        cb_proc = new javax.swing.JComboBox<>();
        btnTool_RegProcedureAdd = new javax.swing.JButton();
        btnTool_RegProcedureDelete = new javax.swing.JButton();
        label_currentProcId = new javax.swing.JLabel();
        panel_procedure = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtArea_RegProcedure1 = new javax.swing.JTextArea();
        jScrollPane20 = new javax.swing.JScrollPane();
        txtArea_RegProcedure5 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sep_Procedure5 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        sep_Procedure6 = new javax.swing.JSeparator();
        sep_Procedure7 = new javax.swing.JSeparator();
        sep_Procedure8 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txt_RegProcedure1 = new javax.swing.JTextField();
        jScrollPane17 = new javax.swing.JScrollPane();
        txtArea_RegProcedure2 = new javax.swing.JTextArea();
        jScrollPane18 = new javax.swing.JScrollPane();
        txtArea_RegProcedure3 = new javax.swing.JTextArea();
        jScrollPane19 = new javax.swing.JScrollPane();
        txtArea_RegProcedure4 = new javax.swing.JTextArea();
        txt_RegProcedure2 = new javax.swing.JTextField();
        txt_RegProcedure3 = new javax.swing.JTextField();
        txt_RegProcedure4 = new javax.swing.JTextField();
        txt_RegProcedure5 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtArea_DiaryAdditional = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txt_RegComplaints = new javax.swing.JTextField();
        txt_RegStatus = new javax.swing.JTextField();
        txt_RegTemperature = new javax.swing.JTextField();
        txt_RegBreath = new javax.swing.JTextField();
        txt_RegPressure = new javax.swing.JTextField();
        txt_RegHeart = new javax.swing.JTextField();
        txt_RegPulse = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txt_timeStart = new javax.swing.JTextField();
        txt_timeEnd = new javax.swing.JTextField();
        btn_AddComplaintsReg = new javax.swing.JButton();
        btn_AddStatusReg = new javax.swing.JButton();
        btn_AddTemperatureReg = new javax.swing.JButton();
        btn_AddBreathReg = new javax.swing.JButton();
        btn_AddHeartReg = new javax.swing.JButton();
        btn_AddPressureReg = new javax.swing.JButton();
        btn_AddPulseReg = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane29 = new javax.swing.JScrollPane();
        txtArea_Diary = new javax.swing.JTextArea();
        btn_CreateDiary = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        txt_RegSkin = new javax.swing.JTextField();
        btn_AddSkinReg = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_File = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuFileItem_Exit = new javax.swing.JMenuItem();
        menu_Print = new javax.swing.JMenu();
        menuPrintItem_History = new javax.swing.JMenuItem();
        menuPrintItem_Soglasia = new javax.swing.JMenuItem();
        menuPrintItem_Uchet = new javax.swing.JMenuItem();
        menu_Help = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MedReport");

        panel_PersonalData.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        label_name.setText("Имя:");

        label_gender.setText("Пол:");

        label_surname.setText("Фамилия");

        buttonGroup1.add(rb_male);
        rb_male.setText("Мужской");
        rb_male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_maleActionPerformed(evt);
            }
        });

        buttonGroup1.add(rb_female);
        rb_female.setText("Женский");
        rb_female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_femaleActionPerformed(evt);
            }
        });

        cb_contingent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ВС-П", "ВС-О", "ВС-С", "ВС-Ж", "ЧС-ВС", "ОЗ", "ЧС-ОЗ", "Д18", "ГП", "ПР" }));

        label_addressWork.setText("Адрес (место работы/службы):");

        label_allergicAnamnesis.setText("Аллергологический анамнез:");

        label_patronymic.setText("Отчество:");

        label_birth.setText("Дата рождения:");

        txtArea_allergicAnamnesis.setColumns(20);
        txtArea_allergicAnamnesis.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtArea_allergicAnamnesis.setLineWrap(true);
        txtArea_allergicAnamnesis.setRows(5);
        txtArea_allergicAnamnesis.setWrapStyleWord(true);
        jScrollPane2.setViewportView(txtArea_allergicAnamnesis);

        cb_rank.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "мл. лейтенант", "лейтенант", "ст. лейтенант", "капитан", "майор", "подполковник", "полковник", "капитан л-нт", "капитан 1 р", "капитан 2 р", "капитан 3р", "адмирал", "генерал-майор", "генерал-лейтенант", "генерал-полковник", "рядовой", "мичман", "ефрейтор", "мл. сержант", "сержант", "ст. сержант", "старшина", "прапорщик", "ст. прапорщик" }));
        cb_rank.setSelectedIndex(-1);

        label_pastIllness.setText("Перенесенные заболевания:");

        txtArea_pastIllness.setColumns(20);
        txtArea_pastIllness.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtArea_pastIllness.setLineWrap(true);
        txtArea_pastIllness.setRows(5);
        txtArea_pastIllness.setWrapStyleWord(true);
        jScrollPane4.setViewportView(txtArea_pastIllness);

        label_contingent.setText("Контингент:");

        label_rank.setText("Воинское звание:");

        label_addressLive.setText("Адрес (место жительства):");

        txt_addressLive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_addressLiveActionPerformed(evt);
            }
        });

        txt_addressWork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_addressWorkActionPerformed(evt);
            }
        });

        label_medbook.setText("Мед. книжка (№):");

        label_phone.setText("Моб. телефон:");

        label_confidant.setText("Доверенное лицо:");

        txt_policy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_policyActionPerformed(evt);
            }
        });

        label_service.setText("Вид обслуживания:");

        cb_service.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Бюджет", "Платные услуги", "ДМС" }));
        cb_service.setSelectedIndex(-1);

        label_policy.setText("Серия, № полиса:");

        btn_AddPastIllness.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Amitjakhu-Drip-Plus.16.png"))); // NOI18N
        btn_AddPastIllness.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddPastIllnessActionPerformed(evt);
            }
        });

        btn_AddAllergy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Amitjakhu-Drip-Plus.16.png"))); // NOI18N
        btn_AddAllergy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddAllergyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_PersonalDataLayout = new javax.swing.GroupLayout(panel_PersonalData);
        panel_PersonalData.setLayout(panel_PersonalDataLayout);
        panel_PersonalDataLayout.setHorizontalGroup(
            panel_PersonalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_PersonalDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_PersonalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_PersonalDataLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_PersonalDataLayout.createSequentialGroup()
                        .addGroup(panel_PersonalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_allergicAnamnesis)
                            .addComponent(label_pastIllness)
                            .addComponent(label_addressWork)
                            .addComponent(label_addressLive)
                            .addGroup(panel_PersonalDataLayout.createSequentialGroup()
                                .addGroup(panel_PersonalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_PersonalDataLayout.createSequentialGroup()
                                        .addGroup(panel_PersonalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(label_name)
                                            .addComponent(label_surname)
                                            .addComponent(label_gender)
                                            .addComponent(label_patronymic))
                                        .addGroup(panel_PersonalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panel_PersonalDataLayout.createSequentialGroup()
                                                .addGap(23, 23, 23)
                                                .addGroup(panel_PersonalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(panel_PersonalDataLayout.createSequentialGroup()
                                                        .addComponent(rb_male)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(rb_female))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_PersonalDataLayout.createSequentialGroup()
                                                        .addGap(0, 0, Short.MAX_VALUE)
                                                        .addComponent(txt_patronymic, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_PersonalDataLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(panel_PersonalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txt_surname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txt_name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_PersonalDataLayout.createSequentialGroup()
                                        .addGroup(panel_PersonalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(label_medbook)
                                            .addComponent(label_birth))
                                        .addGroup(panel_PersonalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panel_PersonalDataLayout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addComponent(txt_medbook))
                                            .addGroup(panel_PersonalDataLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(date_birth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel_PersonalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_PersonalDataLayout.createSequentialGroup()
                                        .addGroup(panel_PersonalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(label_rank)
                                            .addComponent(label_contingent))
                                        .addGap(23, 23, 23)
                                        .addGroup(panel_PersonalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cb_contingent, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cb_rank, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(panel_PersonalDataLayout.createSequentialGroup()
                                        .addGroup(panel_PersonalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(label_service)
                                            .addComponent(label_phone))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(panel_PersonalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cb_service, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(panel_PersonalDataLayout.createSequentialGroup()
                                        .addGroup(panel_PersonalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(label_confidant)
                                            .addComponent(label_policy))
                                        .addGap(18, 18, 18)
                                        .addGroup(panel_PersonalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_policy, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_confidant, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(txt_addressWork, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panel_PersonalDataLayout.createSequentialGroup()
                        .addGroup(panel_PersonalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_addressLive, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_PersonalDataLayout.createSequentialGroup()
                                .addGroup(panel_PersonalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane2)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel_PersonalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_AddPastIllness)
                                    .addComponent(btn_AddAllergy))))
                        .addContainerGap())))
        );
        panel_PersonalDataLayout.setVerticalGroup(
            panel_PersonalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_PersonalDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_PersonalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_name, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_rank, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_rank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_PersonalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_surname, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_surname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_contingent, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_contingent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_PersonalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_patronymic, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_patronymic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_service, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_service, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_PersonalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_gender, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rb_male)
                    .addComponent(rb_female)
                    .addComponent(txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_phone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_PersonalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_birth, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_confidant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_confidant)
                    .addComponent(date_birth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_PersonalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_medbook)
                    .addComponent(txt_medbook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_policy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_policy))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_addressLive)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_addressLive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_addressWork)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_addressWork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_pastIllness)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_PersonalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_AddPastIllness)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_allergicAnamnesis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_PersonalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_AddAllergy))
                .addGap(113, 113, 113))
        );

        panel_Examination.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        label_Ref.setText("Кем направлен (фамилия):");

        txt_refSurname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_refSurname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_refSurnameActionPerformed(evt);
            }
        });

        btn_refSurname.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Amitjakhu-Drip-Plus.16.png"))); // NOI18N
        btn_refSurname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refSurnameActionPerformed(evt);
            }
        });

        btn_refPos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Amitjakhu-Drip-Plus.16.png"))); // NOI18N
        btn_refPos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refPosActionPerformed(evt);
            }
        });

        txt_refPos.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        label_DiseaseOnset.setText("Начало заболевания:");

        label_AdmissionDate.setText("Дата поступления:");

        label_DischargeDate.setText("Дата выписки:");

        label_historyNum.setText("История болезни (№):");

        txt_historyNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_historyNumActionPerformed(evt);
            }
        });

        label_SideEffect.setText("Побочное действие лекарств:");

        txt_sideEffect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sideEffectActionPerformed(evt);
            }
        });

        check_Emergency.setText("Срочно");

        label_Days.setText("Дней лечения:");

        txt_days.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_daysActionPerformed(evt);
            }
        });

        check_Termination.setText("Прекращение курса (досрочное)");
        check_Termination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_TerminationActionPerformed(evt);
            }
        });

        label_Result.setText("Результат:");

        cb_Result.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Улучшение", "Отн. улучшение", "Без изменений", "Отн. ухудшение", "Ухудшение" }));
        cb_Result.setSelectedIndex(-1);

        btn_noSideEffects.setText("нет");
        btn_noSideEffects.setToolTipText("");
        btn_noSideEffects.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_noSideEffectsActionPerformed(evt);
            }
        });

        btn_days.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Bootstrap-Bootstrap-Bootstrap-calculator-fill.16.png"))); // NOI18N
        btn_days.setToolTipText("Количество дней посещений (кол-во записей о процедурах)");
        btn_days.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_daysActionPerformed(evt);
            }
        });

        label_Ref1.setText("Кем направлен (специальность):");

        label_Days1.setText("Время (помещение в отделение):");

        txt_timeAdmis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_timeAdmisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_GeneralLayout = new javax.swing.GroupLayout(panel_General);
        panel_General.setLayout(panel_GeneralLayout);
        panel_GeneralLayout.setHorizontalGroup(
            panel_GeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_GeneralLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panel_GeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_GeneralLayout.createSequentialGroup()
                        .addGroup(panel_GeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_SideEffect)
                            .addComponent(label_Days)
                            .addComponent(label_Days1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel_GeneralLayout.createSequentialGroup()
                        .addGroup(panel_GeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_GeneralLayout.createSequentialGroup()
                                .addGroup(panel_GeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_historyNum)
                                    .addComponent(label_DischargeDate)
                                    .addComponent(label_AdmissionDate)
                                    .addComponent(label_DiseaseOnset)
                                    .addComponent(label_Ref1))
                                .addGap(33, 33, 33)
                                .addGroup(panel_GeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_historyNum, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_timeAdmis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panel_GeneralLayout.createSequentialGroup()
                                        .addComponent(txt_days, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn_days))
                                    .addGroup(panel_GeneralLayout.createSequentialGroup()
                                        .addComponent(txt_sideEffect, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn_noSideEffects, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel_GeneralLayout.createSequentialGroup()
                                        .addGroup(panel_GeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(date_admission, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(panel_GeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txt_refPos, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txt_refSurname, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(panel_GeneralLayout.createSequentialGroup()
                                                    .addGap(6, 6, 6)
                                                    .addComponent(date_diseaseOnset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                            .addComponent(date_discharge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(panel_GeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn_refSurname)
                                            .addComponent(btn_refPos)))))
                            .addComponent(label_Ref)
                            .addGroup(panel_GeneralLayout.createSequentialGroup()
                                .addComponent(check_Emergency)
                                .addGap(18, 18, 18)
                                .addComponent(check_Termination))
                            .addGroup(panel_GeneralLayout.createSequentialGroup()
                                .addComponent(label_Result)
                                .addGap(18, 18, 18)
                                .addComponent(cb_Result, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 46, Short.MAX_VALUE))))
        );
        panel_GeneralLayout.setVerticalGroup(
            panel_GeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_GeneralLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panel_GeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_GeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(label_Ref)
                        .addComponent(txt_refSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_refSurname))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_GeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_GeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_refPos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(label_Ref1))
                    .addComponent(btn_refPos))
                .addGap(13, 13, 13)
                .addGroup(panel_GeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_DiseaseOnset)
                    .addComponent(date_diseaseOnset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panel_GeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_AdmissionDate)
                    .addComponent(date_admission, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_GeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_DischargeDate)
                    .addComponent(date_discharge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_GeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_historyNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_historyNum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_GeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_SideEffect)
                    .addGroup(panel_GeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_noSideEffects)
                        .addComponent(txt_sideEffect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_GeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_Days)
                    .addComponent(btn_days)
                    .addComponent(txt_days, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_GeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_Days1)
                    .addComponent(txt_timeAdmis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_GeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(check_Termination)
                    .addComponent(check_Emergency))
                .addGap(18, 18, 18)
                .addGroup(panel_GeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_Result)
                    .addComponent(cb_Result, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(376, Short.MAX_VALUE))
        );

        tabbedPane.addTab("Общее", panel_General);

        txt_Comorbidity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ComorbidityActionPerformed(evt);
            }
        });

        txt_ComplDiagnosisCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ComplDiagnosisCodeActionPerformed(evt);
            }
        });

        txtArea_Comorbidity.setColumns(20);
        txtArea_Comorbidity.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtArea_Comorbidity.setLineWrap(true);
        txtArea_Comorbidity.setRows(5);
        txtArea_Comorbidity.setWrapStyleWord(true);
        jScrollPane8.setViewportView(txtArea_Comorbidity);

        txtArea_MainDiagnosis.setColumns(20);
        txtArea_MainDiagnosis.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtArea_MainDiagnosis.setLineWrap(true);
        txtArea_MainDiagnosis.setRows(5);
        txtArea_MainDiagnosis.setWrapStyleWord(true);
        jScrollPane7.setViewportView(txtArea_MainDiagnosis);

        txt_MainDiagnosisCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_MainDiagnosisCodeActionPerformed(evt);
            }
        });

        label_MainDiagnosis.setText("Основной:");

        label_ComplDiagnosis.setText("Осложнение:");

        txtArea_ComplDiagnosis.setColumns(20);
        txtArea_ComplDiagnosis.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtArea_ComplDiagnosis.setLineWrap(true);
        txtArea_ComplDiagnosis.setRows(5);
        txtArea_ComplDiagnosis.setToolTipText("");
        txtArea_ComplDiagnosis.setWrapStyleWord(true);
        jScrollPane9.setViewportView(txtArea_ComplDiagnosis);

        label_Comorbidity.setText("Сопутствующий:");

        label_MainDiagnosis1.setText("Направительный:");

        txt_RefDiagnosisCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_RefDiagnosisCodeActionPerformed(evt);
            }
        });

        txtArea_AdmisDiagnosis.setColumns(20);
        txtArea_AdmisDiagnosis.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtArea_AdmisDiagnosis.setLineWrap(true);
        txtArea_AdmisDiagnosis.setRows(5);
        txtArea_AdmisDiagnosis.setWrapStyleWord(true);
        jScrollPane14.setViewportView(txtArea_AdmisDiagnosis);

        label_ProvisDiagnosis.setText("Предварительный:");

        label_AdmisDiagnosis.setText("При поступлении:");

        txtArea_RefDiagnosis.setColumns(20);
        txtArea_RefDiagnosis.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtArea_RefDiagnosis.setLineWrap(true);
        txtArea_RefDiagnosis.setRows(5);
        txtArea_RefDiagnosis.setWrapStyleWord(true);
        jScrollPane23.setViewportView(txtArea_RefDiagnosis);

        txtArea_ProvisDiagnosis.setColumns(20);
        txtArea_ProvisDiagnosis.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtArea_ProvisDiagnosis.setLineWrap(true);
        txtArea_ProvisDiagnosis.setRows(5);
        txtArea_ProvisDiagnosis.setWrapStyleWord(true);
        jScrollPane24.setViewportView(txtArea_ProvisDiagnosis);

        txt_ProvisDiagnosisCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ProvisDiagnosisCodeActionPerformed(evt);
            }
        });

        txt_AdmisDiagnosisCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_AdmisDiagnosisCodeActionPerformed(evt);
            }
        });

        btn_copyMainDiag.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Amitjakhu-Drip-Arrow-thin-up.16.png"))); // NOI18N
        btn_copyMainDiag.setToolTipText("Дублировать значения в поля выше");
        btn_copyMainDiag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_copyMainDiagActionPerformed(evt);
            }
        });

        btn_addRefDiag.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Amitjakhu-Drip-Plus.16.png"))); // NOI18N
        btn_addRefDiag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addRefDiagActionPerformed(evt);
            }
        });

        btn_addAdmisDiag.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Amitjakhu-Drip-Plus.16.png"))); // NOI18N
        btn_addAdmisDiag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addAdmisDiagActionPerformed(evt);
            }
        });

        btn_addProvisDiag.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Amitjakhu-Drip-Plus.16.png"))); // NOI18N
        btn_addProvisDiag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addProvisDiagActionPerformed(evt);
            }
        });

        btn_addMainDiag.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Amitjakhu-Drip-Plus.16.png"))); // NOI18N
        btn_addMainDiag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addMainDiagActionPerformed(evt);
            }
        });

        btn_addComplDiag.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Amitjakhu-Drip-Plus.16.png"))); // NOI18N
        btn_addComplDiag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addComplDiagActionPerformed(evt);
            }
        });

        btn_addComor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Amitjakhu-Drip-Plus.16.png"))); // NOI18N
        btn_addComor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addComorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_DiagnosisLayout = new javax.swing.GroupLayout(panel_Diagnosis);
        panel_Diagnosis.setLayout(panel_DiagnosisLayout);
        panel_DiagnosisLayout.setHorizontalGroup(
            panel_DiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_DiagnosisLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panel_DiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_DiagnosisLayout.createSequentialGroup()
                        .addGroup(panel_DiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_Comorbidity, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_DiagnosisLayout.createSequentialGroup()
                                .addComponent(txt_Comorbidity, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_addComor)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panel_DiagnosisLayout.createSequentialGroup()
                        .addGroup(panel_DiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_DiagnosisLayout.createSequentialGroup()
                                .addComponent(txt_RefDiagnosisCode, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_addRefDiag))
                            .addComponent(label_MainDiagnosis1)
                            .addGroup(panel_DiagnosisLayout.createSequentialGroup()
                                .addComponent(txt_AdmisDiagnosisCode, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_addAdmisDiag))
                            .addGroup(panel_DiagnosisLayout.createSequentialGroup()
                                .addComponent(txt_MainDiagnosisCode, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_addMainDiag)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_copyMainDiag))
                            .addComponent(label_ComplDiagnosis)
                            .addComponent(label_MainDiagnosis, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_ProvisDiagnosis)
                            .addComponent(label_AdmisDiagnosis)
                            .addGroup(panel_DiagnosisLayout.createSequentialGroup()
                                .addComponent(txt_ProvisDiagnosisCode, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_addProvisDiag))
                            .addGroup(panel_DiagnosisLayout.createSequentialGroup()
                                .addComponent(txt_ComplDiagnosisCode, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_addComplDiag)))
                        .addContainerGap(21, Short.MAX_VALUE))))
        );
        panel_DiagnosisLayout.setVerticalGroup(
            panel_DiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_DiagnosisLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(label_MainDiagnosis1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_DiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_RefDiagnosisCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_addRefDiag))
                .addGap(18, 18, 18)
                .addComponent(label_AdmisDiagnosis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_DiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_AdmisDiagnosisCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_addAdmisDiag))
                .addGap(18, 18, 18)
                .addComponent(label_ProvisDiagnosis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_DiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_ProvisDiagnosisCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_addProvisDiag))
                .addGap(18, 18, 18)
                .addComponent(label_MainDiagnosis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_DiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_MainDiagnosisCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_addMainDiag)
                    .addComponent(btn_copyMainDiag))
                .addGap(18, 18, 18)
                .addComponent(label_ComplDiagnosis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_DiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_ComplDiagnosisCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_addComplDiag))
                .addGap(18, 18, 18)
                .addComponent(label_Comorbidity)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_DiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_Comorbidity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_addComor))
                .addGap(67, 67, 67))
        );

        tabbedPane.addTab("Диагнозы", panel_Diagnosis);

        jLabel10.setText("Жалобы при первичном осмотре:");

        txtArea_AnamnesisDis.setColumns(20);
        txtArea_AnamnesisDis.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtArea_AnamnesisDis.setLineWrap(true);
        txtArea_AnamnesisDis.setRows(5);
        txtArea_AnamnesisDis.setWrapStyleWord(true);
        jScrollPane10.setViewportView(txtArea_AnamnesisDis);

        jLabel11.setText("Анамнез заболевания:");

        txtArea_Complaints.setColumns(20);
        txtArea_Complaints.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtArea_Complaints.setLineWrap(true);
        txtArea_Complaints.setRows(5);
        txtArea_Complaints.setWrapStyleWord(true);
        jScrollPane11.setViewportView(txtArea_Complaints);

        jLabel12.setText("Анамнез жизни:");

        txtArea_AnamnesisLife.setColumns(20);
        txtArea_AnamnesisLife.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtArea_AnamnesisLife.setLineWrap(true);
        txtArea_AnamnesisLife.setRows(5);
        txtArea_AnamnesisLife.setWrapStyleWord(true);
        jScrollPane12.setViewportView(txtArea_AnamnesisLife);

        jLabel14.setText("Наследственность:");

        jLabel15.setText("Привычки:");

        btn_AddAnamDis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Amitjakhu-Drip-Plus.16.png"))); // NOI18N
        btn_AddAnamDis.setOpaque(true);
        btn_AddAnamDis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddAnamDisActionPerformed(evt);
            }
        });

        btn_AddAnamLife.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Amitjakhu-Drip-Plus.16.png"))); // NOI18N
        btn_AddAnamLife.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddAnamLifeActionPerformed(evt);
            }
        });

        btn_AddComplaints.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Amitjakhu-Drip-Plus.16.png"))); // NOI18N
        btn_AddComplaints.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddComplaintsActionPerformed(evt);
            }
        });

        btn_AddHeredity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Amitjakhu-Drip-Plus.16.png"))); // NOI18N
        btn_AddHeredity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddHeredityActionPerformed(evt);
            }
        });

        btn_AddHabits.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Amitjakhu-Drip-Plus.16.png"))); // NOI18N
        btn_AddHabits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddHabitsActionPerformed(evt);
            }
        });

        label_examinationResults.setText("Результаты обследований:");

        btn_AddFlur.setText("ФОГК");
        btn_AddFlur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddFlurActionPerformed(evt);
            }
        });

        btn_AddEKG.setText("ЭКГ");
        btn_AddEKG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddEKGActionPerformed(evt);
            }
        });

        btn_AddOAK.setText("ОАК");
        btn_AddOAK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddOAKActionPerformed(evt);
            }
        });

        txtArea_ExaminationResults.setColumns(20);
        txtArea_ExaminationResults.setLineWrap(true);
        txtArea_ExaminationResults.setRows(5);
        txtArea_ExaminationResults.setText("                                ");
        txtArea_ExaminationResults.setWrapStyleWord(true);
        jScrollPane13.setViewportView(txtArea_ExaminationResults);

        btn_AddOAM.setText("ОАМ");
        btn_AddOAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddOAMActionPerformed(evt);
            }
        });

        btn_AddBHA.setText("БХА");
        btn_AddBHA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddBHAActionPerformed(evt);
            }
        });

        btn_AddUziOBP.setText("УЗИ ОБП");
        btn_AddUziOBP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddUziOBPActionPerformed(evt);
            }
        });

        btn_AddUZDG_BCA.setText("УЗДГ БЦА");
        btn_AddUZDG_BCA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddUZDG_BCAActionPerformed(evt);
            }
        });

        jLabel13.setText(" Не удаляйте теги <b> </b>! ");
        jLabel13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));

        javax.swing.GroupLayout panel_ProtocolTabLayout = new javax.swing.GroupLayout(panel_ProtocolTab);
        panel_ProtocolTab.setLayout(panel_ProtocolTabLayout);
        panel_ProtocolTabLayout.setHorizontalGroup(
            panel_ProtocolTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ProtocolTabLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panel_ProtocolTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_ProtocolTabLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel_ProtocolTabLayout.createSequentialGroup()
                        .addGroup(panel_ProtocolTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(panel_ProtocolTabLayout.createSequentialGroup()
                                .addGroup(panel_ProtocolTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addGroup(panel_ProtocolTabLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(panel_ProtocolTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane12)
                                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel_ProtocolTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_AddAnamDis)
                                    .addComponent(btn_AddAnamLife)))
                            .addGroup(panel_ProtocolTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(panel_ProtocolTabLayout.createSequentialGroup()
                                    .addComponent(label_examinationResults)
                                    .addGap(287, 287, 287))
                                .addGroup(panel_ProtocolTabLayout.createSequentialGroup()
                                    .addGroup(panel_ProtocolTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(panel_ProtocolTabLayout.createSequentialGroup()
                                            .addComponent(jLabel15)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txt_habits, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panel_ProtocolTabLayout.createSequentialGroup()
                                            .addComponent(jLabel14)
                                            .addGap(18, 18, 18)
                                            .addComponent(txt_heredity, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(18, 18, 18)
                                    .addGroup(panel_ProtocolTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn_AddHeredity)
                                        .addComponent(btn_AddHabits))))
                            .addGroup(panel_ProtocolTabLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(panel_ProtocolTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_ProtocolTabLayout.createSequentialGroup()
                                        .addComponent(btn_AddUziOBP)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_AddUZDG_BCA)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel13))
                                    .addGroup(panel_ProtocolTabLayout.createSequentialGroup()
                                        .addComponent(btn_AddFlur)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn_AddEKG)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn_AddOAK)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_AddOAM)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_AddBHA))
                                    .addGroup(panel_ProtocolTabLayout.createSequentialGroup()
                                        .addComponent(jScrollPane13)
                                        .addGap(29, 29, 29))
                                    .addGroup(panel_ProtocolTabLayout.createSequentialGroup()
                                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn_AddComplaints)))))
                        .addGap(13, 13, 13))))
        );
        panel_ProtocolTabLayout.setVerticalGroup(
            panel_ProtocolTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ProtocolTabLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panel_ProtocolTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_AddHabits)
                    .addGroup(panel_ProtocolTabLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_ProtocolTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(btn_AddComplaints))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_ProtocolTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel_ProtocolTabLayout.createSequentialGroup()
                                .addGroup(panel_ProtocolTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_ProtocolTabLayout.createSequentialGroup()
                                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel12))
                                    .addComponent(btn_AddAnamDis))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel_ProtocolTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                    .addComponent(btn_AddAnamLife))
                                .addGap(18, 18, 18)
                                .addGroup(panel_ProtocolTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(txt_heredity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btn_AddHeredity))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_ProtocolTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(txt_habits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_examinationResults)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_ProtocolTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_AddFlur)
                    .addComponent(btn_AddEKG)
                    .addComponent(btn_AddOAK)
                    .addComponent(btn_AddOAM)
                    .addComponent(btn_AddBHA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_ProtocolTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_AddUziOBP)
                    .addComponent(btn_AddUZDG_BCA)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabbedPane.addTab("Протокол", panel_ProtocolTab);

        label_fizRaz.setText("Физическое развитие:");

        label_defRaz.setText("Дефекты развития:");

        label_telo.setText("Телосложение:");

        label_pitanie.setText("Питание:");

        label_pokrovy.setText("Покровы тела:");

        label_limfSyst.setText("Лимфатическая система:");

        label_mishSyst.setText("Мышечная система:");

        label_svyazSust.setText("Связочно-суставной аппарат:");

        label_serdSosud.setText("Сердечно-сосудистая система:");

        label_pischevarenie.setText("Органы пищеварения:");

        label_mochepolovayaSyst.setText("Мочеполовая система:");

        label_nervSyst.setText("Нервная система:");

        label_organiChuvstv.setText("Органы чувств:");

        label_sekrecia.setText("Железы внутренней секреции:");

        label_height.setText("Рост (см):");

        label_weight.setText("Масса (кг):");

        label_imt.setText("ИМТ (кг/м2):");

        btn_imt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Bootstrap-Bootstrap-Bootstrap-calculator-fill.16.png"))); // NOI18N
        btn_imt.setToolTipText("Рассчитать Индекс массы тела");
        btn_imt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_imtActionPerformed(evt);
            }
        });

        btn_AddFizRaz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Amitjakhu-Drip-Plus.16.png"))); // NOI18N
        btn_AddFizRaz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddFizRazActionPerformed(evt);
            }
        });

        btn_AddDefRaz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Amitjakhu-Drip-Plus.16.png"))); // NOI18N
        btn_AddDefRaz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddDefRazActionPerformed(evt);
            }
        });

        btn_AddTelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Amitjakhu-Drip-Plus.16.png"))); // NOI18N
        btn_AddTelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddTeloActionPerformed(evt);
            }
        });

        btn_AddPitanie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Amitjakhu-Drip-Plus.16.png"))); // NOI18N
        btn_AddPitanie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddPitanieActionPerformed(evt);
            }
        });

        btn_AddPokrovy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Amitjakhu-Drip-Plus.16.png"))); // NOI18N
        btn_AddPokrovy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddPokrovyActionPerformed(evt);
            }
        });

        btn_AddLimfSyst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Amitjakhu-Drip-Plus.16.png"))); // NOI18N
        btn_AddLimfSyst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddLimfSystActionPerformed(evt);
            }
        });

        btn_AddMishSyst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Amitjakhu-Drip-Plus.16.png"))); // NOI18N
        btn_AddMishSyst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddMishSystActionPerformed(evt);
            }
        });

        btn_AddSvyazSust.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Amitjakhu-Drip-Plus.16.png"))); // NOI18N
        btn_AddSvyazSust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddSvyazSustActionPerformed(evt);
            }
        });

        btn_AddSerdSosud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Amitjakhu-Drip-Plus.16.png"))); // NOI18N
        btn_AddSerdSosud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddSerdSosudActionPerformed(evt);
            }
        });

        btn_AddPischevarenie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Amitjakhu-Drip-Plus.16.png"))); // NOI18N
        btn_AddPischevarenie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddPischevarenieActionPerformed(evt);
            }
        });

        btn_AddMochepolovayaSyst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Amitjakhu-Drip-Plus.16.png"))); // NOI18N
        btn_AddMochepolovayaSyst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddMochepolovayaSystActionPerformed(evt);
            }
        });

        btn_AddNervSyst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Amitjakhu-Drip-Plus.16.png"))); // NOI18N
        btn_AddNervSyst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddNervSystActionPerformed(evt);
            }
        });

        btn_AddOrgani.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Amitjakhu-Drip-Plus.16.png"))); // NOI18N
        btn_AddOrgani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddOrganiActionPerformed(evt);
            }
        });

        btn_AddSekrecia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Amitjakhu-Drip-Plus.16.png"))); // NOI18N
        btn_AddSekrecia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddSekreciaActionPerformed(evt);
            }
        });

        label_serdSosud1.setText("Лёгочно-дыхательный аппарат:");

        btn_AddLegDih.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Amitjakhu-Drip-Plus.16.png"))); // NOI18N
        btn_AddLegDih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddLegDihActionPerformed(evt);
            }
        });

        label_state.setText("Общее состояние:");

        btn_AddState.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Amitjakhu-Drip-Plus.16.png"))); // NOI18N
        btn_AddState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddStateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_ExaminationTabLayout = new javax.swing.GroupLayout(panel_ExaminationTab);
        panel_ExaminationTab.setLayout(panel_ExaminationTabLayout);
        panel_ExaminationTabLayout.setHorizontalGroup(
            panel_ExaminationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ExaminationTabLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panel_ExaminationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_ExaminationTabLayout.createSequentialGroup()
                        .addComponent(label_serdSosud1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_legDih, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_AddLegDih))
                    .addGroup(panel_ExaminationTabLayout.createSequentialGroup()
                        .addComponent(label_height)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_height, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(label_weight)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_weight, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(label_imt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_imt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_imt))
                    .addGroup(panel_ExaminationTabLayout.createSequentialGroup()
                        .addGroup(panel_ExaminationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_sekrecia)
                            .addComponent(label_organiChuvstv)
                            .addComponent(label_nervSyst)
                            .addComponent(label_mochepolovayaSyst)
                            .addComponent(label_serdSosud)
                            .addComponent(label_svyazSust)
                            .addComponent(label_mishSyst)
                            .addComponent(label_limfSyst)
                            .addComponent(label_pokrovy)
                            .addComponent(label_pitanie)
                            .addComponent(label_telo)
                            .addComponent(label_defRaz)
                            .addComponent(label_fizRaz)
                            .addComponent(label_pischevarenie)
                            .addComponent(label_state))
                        .addGap(18, 18, 18)
                        .addGroup(panel_ExaminationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_ExaminationTabLayout.createSequentialGroup()
                                .addComponent(txt_state, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_AddState))
                            .addGroup(panel_ExaminationTabLayout.createSequentialGroup()
                                .addComponent(txt_pischevarenie, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_AddPischevarenie))
                            .addGroup(panel_ExaminationTabLayout.createSequentialGroup()
                                .addComponent(txt_serdSosud, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_AddSerdSosud))
                            .addGroup(panel_ExaminationTabLayout.createSequentialGroup()
                                .addComponent(txt_svyazSust, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_AddSvyazSust))
                            .addGroup(panel_ExaminationTabLayout.createSequentialGroup()
                                .addComponent(txt_mishSyst, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_AddMishSyst))
                            .addGroup(panel_ExaminationTabLayout.createSequentialGroup()
                                .addComponent(txt_limfSyst, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_AddLimfSyst))
                            .addGroup(panel_ExaminationTabLayout.createSequentialGroup()
                                .addComponent(txt_pokrovy, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_AddPokrovy))
                            .addGroup(panel_ExaminationTabLayout.createSequentialGroup()
                                .addComponent(txt_pitanie, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_AddPitanie))
                            .addGroup(panel_ExaminationTabLayout.createSequentialGroup()
                                .addComponent(txt_telo, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_AddTelo))
                            .addGroup(panel_ExaminationTabLayout.createSequentialGroup()
                                .addComponent(txt_defRaz, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_AddDefRaz))
                            .addGroup(panel_ExaminationTabLayout.createSequentialGroup()
                                .addComponent(txt_fizRaz, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_AddFizRaz))
                            .addGroup(panel_ExaminationTabLayout.createSequentialGroup()
                                .addComponent(txt_mochepolovayaSyst, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_AddMochepolovayaSyst))
                            .addGroup(panel_ExaminationTabLayout.createSequentialGroup()
                                .addComponent(txt_nervSyst, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_AddNervSyst))
                            .addGroup(panel_ExaminationTabLayout.createSequentialGroup()
                                .addComponent(txt_organiChuvstv, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_AddOrgani))
                            .addGroup(panel_ExaminationTabLayout.createSequentialGroup()
                                .addComponent(txt_sekrecia, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_AddSekrecia)))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        panel_ExaminationTabLayout.setVerticalGroup(
            panel_ExaminationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_ExaminationTabLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panel_ExaminationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_ExaminationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(label_height)
                        .addComponent(txt_weight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(label_weight)
                        .addComponent(txt_height, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(label_imt)
                        .addComponent(txt_imt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_imt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_ExaminationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_state)
                    .addComponent(txt_state, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_AddState))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_ExaminationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_ExaminationTabLayout.createSequentialGroup()
                        .addGroup(panel_ExaminationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel_ExaminationTabLayout.createSequentialGroup()
                                .addGroup(panel_ExaminationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_ExaminationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(label_fizRaz)
                                        .addComponent(txt_fizRaz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btn_AddFizRaz))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel_ExaminationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_ExaminationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(label_defRaz)
                                        .addComponent(txt_defRaz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btn_AddDefRaz))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel_ExaminationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label_telo)
                                    .addComponent(txt_telo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btn_AddTelo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_ExaminationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_pitanie)
                            .addComponent(txt_pitanie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btn_AddPitanie))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_ExaminationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_ExaminationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(label_pokrovy)
                        .addComponent(txt_pokrovy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_AddPokrovy))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_ExaminationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_ExaminationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(label_limfSyst)
                        .addComponent(txt_limfSyst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_AddLimfSyst))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_ExaminationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_ExaminationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(label_mishSyst)
                        .addComponent(txt_mishSyst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_AddMishSyst))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_ExaminationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_ExaminationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(label_svyazSust)
                        .addComponent(txt_svyazSust, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_AddSvyazSust))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_ExaminationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_ExaminationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(label_serdSosud)
                        .addComponent(txt_serdSosud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_AddSerdSosud))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_ExaminationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_ExaminationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(label_serdSosud1)
                        .addComponent(txt_legDih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_AddLegDih))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_ExaminationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_ExaminationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(label_pischevarenie)
                        .addComponent(txt_pischevarenie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_AddPischevarenie))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_ExaminationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_ExaminationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(label_mochepolovayaSyst)
                        .addComponent(txt_mochepolovayaSyst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_AddMochepolovayaSyst))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_ExaminationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_ExaminationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(label_nervSyst)
                        .addComponent(txt_nervSyst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_AddNervSyst))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_ExaminationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_ExaminationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(label_organiChuvstv)
                        .addComponent(txt_organiChuvstv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_AddOrgani))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_ExaminationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_ExaminationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(label_sekrecia)
                        .addComponent(txt_sekrecia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_AddSekrecia))
                .addContainerGap(162, Short.MAX_VALUE))
        );

        tabbedPane.addTab("Осмотр", panel_ExaminationTab);

        label_procedure1.setText("Процедура 1:");

        txtArea_Procedure2.setColumns(20);
        txtArea_Procedure2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtArea_Procedure2.setLineWrap(true);
        txtArea_Procedure2.setRows(4);
        txtArea_Procedure2.setWrapStyleWord(true);
        txtArea_Procedure2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtArea_Procedure2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(txtArea_Procedure2);

        label_ProcedureNum1.setText("Кол-во:");

        label_procedure2.setText("Процедура 2:");

        label_ProcedureNum2.setText("Кол-во:");

        txtArea_Procedure1.setColumns(20);
        txtArea_Procedure1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtArea_Procedure1.setLineWrap(true);
        txtArea_Procedure1.setRows(4);
        txtArea_Procedure1.setWrapStyleWord(true);
        txtArea_Procedure1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtArea_Procedure1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(txtArea_Procedure1);

        btn_Procedure2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Amitjakhu-Drip-Export.16.png"))); // NOI18N
        btn_Procedure2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Procedure2ActionPerformed(evt);
            }
        });

        label_procedure3.setText("Процедура 3:");

        label_ProcedureNum3.setText("Кол-во:");

        txtArea_Procedure3.setColumns(20);
        txtArea_Procedure3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtArea_Procedure3.setLineWrap(true);
        txtArea_Procedure3.setRows(4);
        txtArea_Procedure3.setWrapStyleWord(true);
        txtArea_Procedure3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtArea_Procedure3MouseClicked(evt);
            }
        });
        jScrollPane15.setViewportView(txtArea_Procedure3);

        btn_Procedure3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Amitjakhu-Drip-Export.16.png"))); // NOI18N
        btn_Procedure3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Procedure3ActionPerformed(evt);
            }
        });

        label_procedure4.setText("Процедура 4:");

        label_ProcedureNum4.setText("Кол-во:");

        txtArea_Procedure4.setColumns(20);
        txtArea_Procedure4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtArea_Procedure4.setLineWrap(true);
        txtArea_Procedure4.setRows(4);
        txtArea_Procedure4.setWrapStyleWord(true);
        txtArea_Procedure4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtArea_Procedure4MouseClicked(evt);
            }
        });
        jScrollPane16.setViewportView(txtArea_Procedure4);

        btn_Procedure4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Amitjakhu-Drip-Export.16.png"))); // NOI18N
        btn_Procedure4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Procedure4ActionPerformed(evt);
            }
        });

        label_procedure5.setText("Процедура 5:");

        label_ProcedureNum5.setText("Кол-во:");

        btn_Procedure5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Amitjakhu-Drip-Export.16.png"))); // NOI18N
        btn_Procedure5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Procedure5ActionPerformed(evt);
            }
        });

        txtArea_Procedure5.setColumns(20);
        txtArea_Procedure5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtArea_Procedure5.setLineWrap(true);
        txtArea_Procedure5.setRows(4);
        txtArea_Procedure5.setWrapStyleWord(true);
        txtArea_Procedure5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtArea_Procedure5MouseClicked(evt);
            }
        });
        jScrollPane22.setViewportView(txtArea_Procedure5);

        txt_proc1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_proc1MouseClicked(evt);
            }
        });
        txt_proc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_proc1ActionPerformed(evt);
            }
        });

        txt_proc2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_proc2MouseClicked(evt);
            }
        });

        txt_proc3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_proc3MouseClicked(evt);
            }
        });
        txt_proc3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_proc3ActionPerformed(evt);
            }
        });

        txt_proc4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_proc4MouseClicked(evt);
            }
        });
        txt_proc4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_proc4ActionPerformed(evt);
            }
        });

        txt_proc5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_proc5MouseClicked(evt);
            }
        });

        btn_Procedure1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Amitjakhu-Drip-Export.16.png"))); // NOI18N
        btn_Procedure1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Procedure1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_TreatmentTabLayout = new javax.swing.GroupLayout(panel_TreatmentTab);
        panel_TreatmentTab.setLayout(panel_TreatmentTabLayout);
        panel_TreatmentTabLayout.setHorizontalGroup(
            panel_TreatmentTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_TreatmentTabLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panel_TreatmentTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_TreatmentTabLayout.createSequentialGroup()
                        .addGroup(panel_TreatmentTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sep_Procedure3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sep_Procedure1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sep_Procedure2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel_TreatmentTabLayout.createSequentialGroup()
                                .addGroup(panel_TreatmentTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_TreatmentTabLayout.createSequentialGroup()
                                        .addComponent(label_procedure3)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_proc3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(label_ProcedureNum3)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_ProcedureNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel_TreatmentTabLayout.createSequentialGroup()
                                        .addComponent(label_procedure1)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_proc1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(label_ProcedureNum1)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_ProcedureNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel_TreatmentTabLayout.createSequentialGroup()
                                        .addComponent(label_procedure4)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_proc4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(label_ProcedureNum4)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_ProcedureNum4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel_TreatmentTabLayout.createSequentialGroup()
                                        .addComponent(label_procedure5)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_proc5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(17, 17, 17)
                                        .addComponent(label_ProcedureNum5)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_ProcedureNum5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel_TreatmentTabLayout.createSequentialGroup()
                                        .addComponent(label_procedure2)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_proc2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(label_ProcedureNum2)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_ProcedureNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel_TreatmentTabLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jScrollPane3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn_Procedure1))
                                    .addComponent(sep_Procedure4, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)))
                        .addGap(12, 12, 12))
                    .addGroup(panel_TreatmentTabLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(panel_TreatmentTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_TreatmentTabLayout.createSequentialGroup()
                                .addComponent(jScrollPane16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_Procedure4))
                            .addGroup(panel_TreatmentTabLayout.createSequentialGroup()
                                .addComponent(jScrollPane1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_Procedure2))
                            .addGroup(panel_TreatmentTabLayout.createSequentialGroup()
                                .addComponent(jScrollPane15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_Procedure3))
                            .addGroup(panel_TreatmentTabLayout.createSequentialGroup()
                                .addComponent(jScrollPane22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_Procedure5)))
                        .addGap(13, 13, 13))))
        );
        panel_TreatmentTabLayout.setVerticalGroup(
            panel_TreatmentTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_TreatmentTabLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panel_TreatmentTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_procedure1)
                    .addComponent(label_ProcedureNum1)
                    .addComponent(txt_ProcedureNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_proc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(panel_TreatmentTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_TreatmentTabLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sep_Procedure1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_Procedure1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_TreatmentTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_ProcedureNum2)
                    .addComponent(txt_ProcedureNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_procedure2)
                    .addComponent(txt_proc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(panel_TreatmentTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_TreatmentTabLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sep_Procedure2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_Procedure2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_TreatmentTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_procedure3)
                    .addComponent(label_ProcedureNum3)
                    .addComponent(txt_ProcedureNum3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_proc3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(panel_TreatmentTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_TreatmentTabLayout.createSequentialGroup()
                        .addComponent(jScrollPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sep_Procedure3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_Procedure3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_TreatmentTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_procedure4)
                    .addComponent(label_ProcedureNum4)
                    .addComponent(txt_ProcedureNum4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_proc4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(panel_TreatmentTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_TreatmentTabLayout.createSequentialGroup()
                        .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sep_Procedure4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_TreatmentTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_procedure5)
                            .addComponent(label_ProcedureNum5)
                            .addComponent(txt_ProcedureNum5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_proc5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btn_Procedure4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_TreatmentTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane22, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                    .addComponent(btn_Procedure5))
                .addGap(86, 86, 86))
        );

        tabbedPane.addTab("План лечения", panel_TreatmentTab);

        label_ComplaintsEpik.setText("Жалобы:");

        txtArea_ComplaintsEpik.setColumns(20);
        txtArea_ComplaintsEpik.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtArea_ComplaintsEpik.setLineWrap(true);
        txtArea_ComplaintsEpik.setRows(5);
        txtArea_ComplaintsEpik.setWrapStyleWord(true);
        jScrollPane25.setViewportView(txtArea_ComplaintsEpik);

        btn_AddComplaints1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Amitjakhu-Drip-Plus.16.png"))); // NOI18N
        btn_AddComplaints1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddComplaints1ActionPerformed(evt);
            }
        });

        label_ComplaintsEpik1.setText("Исход, динамика основных симптомов:");

        txtArea_Outcome.setColumns(20);
        txtArea_Outcome.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtArea_Outcome.setLineWrap(true);
        txtArea_Outcome.setRows(5);
        txtArea_Outcome.setWrapStyleWord(true);
        jScrollPane26.setViewportView(txtArea_Outcome);

        btn_AddOutcome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Amitjakhu-Drip-Plus.16.png"))); // NOI18N
        btn_AddOutcome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddOutcomeActionPerformed(evt);
            }
        });

        label_ComplaintsEpik2.setText("Рекомендации:");

        txtArea_Recommedations.setColumns(20);
        txtArea_Recommedations.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtArea_Recommedations.setLineWrap(true);
        txtArea_Recommedations.setRows(5);
        txtArea_Recommedations.setWrapStyleWord(true);
        jScrollPane27.setViewportView(txtArea_Recommedations);

        btn_AddRecommendations.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Amitjakhu-Drip-Plus.16.png"))); // NOI18N
        btn_AddRecommendations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddRecommendationsActionPerformed(evt);
            }
        });

        txtArea_ObjStatus.setColumns(20);
        txtArea_ObjStatus.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtArea_ObjStatus.setLineWrap(true);
        txtArea_ObjStatus.setRows(5);
        txtArea_ObjStatus.setWrapStyleWord(true);
        jScrollPane28.setViewportView(txtArea_ObjStatus);

        label_ComplaintsEpik3.setText("Объективные данные:");

        btn_AddRecommendations1.setText("Перенести из дневника");
        btn_AddRecommendations1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddRecommendations1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_ComplaintsEpik2)
                    .addComponent(label_ComplaintsEpik1)
                    .addComponent(label_ComplaintsEpik)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane28)
                                .addGap(34, 34, 34))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane25, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_AddComplaints1))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(label_ComplaintsEpik3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_AddRecommendations1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane27)
                                    .addComponent(jScrollPane26))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_AddOutcome)
                            .addComponent(btn_AddRecommendations))))
                .addGap(13, 13, 13))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(label_ComplaintsEpik)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane25, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    .addComponent(btn_AddComplaints1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_ComplaintsEpik1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_AddOutcome)
                    .addComponent(jScrollPane26, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_ComplaintsEpik2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane27, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(btn_AddRecommendations))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_AddRecommendations1)
                    .addComponent(label_ComplaintsEpik3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane28, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                .addGap(64, 64, 64))
        );

        tabbedPane.addTab("Эпикриз", jPanel1);

        javax.swing.GroupLayout panel_TabLayout = new javax.swing.GroupLayout(panel_Tab);
        panel_Tab.setLayout(panel_TabLayout);
        panel_TabLayout.setHorizontalGroup(
            panel_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_TabLayout.createSequentialGroup()
                .addComponent(tabbedPane)
                .addGap(0, 0, 0))
        );
        panel_TabLayout.setVerticalGroup(
            panel_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_TabLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(tabbedPane)
                .addGap(0, 0, 0))
        );

        cb_visitDate.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cb_visitDatePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        btn_AddExamination.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        btn_AddExamination.setFocusPainted(false);
        btn_AddExamination.setToolTipText("Добавить новый курс лечения");
        btn_AddExamination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddExaminationActionPerformed(evt);
            }
        });

        btn_DeleteExamination.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        btn_DeleteExamination.setToolTipText("Удалить выбранный курс лечения");
        btn_DeleteExamination.setFocusPainted(false);
        btn_DeleteExamination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteExaminationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_ExamToolbarLayout = new javax.swing.GroupLayout(panel_ExamToolbar);
        panel_ExamToolbar.setLayout(panel_ExamToolbarLayout);
        panel_ExamToolbarLayout.setHorizontalGroup(
            panel_ExamToolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ExamToolbarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cb_visitDate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_AddExamination)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_DeleteExamination)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_currentExamId, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_ExamToolbarLayout.setVerticalGroup(
            panel_ExamToolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ExamToolbarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_ExamToolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_currentExamId, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_DeleteExamination)
                    .addComponent(btn_AddExamination)
                    .addComponent(cb_visitDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_ExaminationLayout = new javax.swing.GroupLayout(panel_Examination);
        panel_Examination.setLayout(panel_ExaminationLayout);
        panel_ExaminationLayout.setHorizontalGroup(
            panel_ExaminationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Tab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_ExamToolbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel_ExaminationLayout.setVerticalGroup(
            panel_ExaminationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ExaminationLayout.createSequentialGroup()
                .addComponent(panel_ExamToolbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panel_Tab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        list_patients.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        list_patients.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                list_patientsValueChanged(evt);
            }
        });
        jScrollPane21.setViewportView(list_patients);

        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/patient_search_toolbar.png"))); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panel_PatListLayout = new javax.swing.GroupLayout(panel_PatList);
        panel_PatList.setLayout(panel_PatListLayout);
        panel_PatListLayout.setHorizontalGroup(
            panel_PatListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_PatListLayout.createSequentialGroup()
                .addGroup(panel_PatListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_PatListLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_search))
                    .addGroup(panel_PatListLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane21)))
                .addContainerGap())
        );
        panel_PatListLayout.setVerticalGroup(
            panel_PatListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_PatListLayout.createSequentialGroup()
                .addGroup(panel_PatListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panel_FrameToolbar.setOpaque(false);

        tool_Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete_toolbar.png"))); // NOI18N
        tool_Delete.setToolTipText("Удалить текущего пациента");
        tool_Delete.setFocusPainted(false);
        tool_Delete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tool_Delete.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tool_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tool_DeleteActionPerformed(evt);
            }
        });

        tool_Save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save_toolbar.png"))); // NOI18N
        tool_Save.setToolTipText("Сохранить");
        tool_Save.setFocusPainted(false);
        tool_Save.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tool_Save.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tool_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tool_SaveActionPerformed(evt);
            }
        });

        tool_New.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add_patient_toolbar.png"))); // NOI18N
        tool_New.setToolTipText("Добавить нового пациента");
        tool_New.setFocusPainted(false);
        tool_New.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tool_New.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tool_New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tool_NewActionPerformed(evt);
            }
        });

        tool_Refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fatcow-Farm-Fresh-Update.16.png"))); // NOI18N
        tool_Refresh.setToolTipText("Обновить данные");
        tool_Refresh.setFocusPainted(false);
        tool_Refresh.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tool_Refresh.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tool_Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tool_RefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_FrameToolbarLayout = new javax.swing.GroupLayout(panel_FrameToolbar);
        panel_FrameToolbar.setLayout(panel_FrameToolbarLayout);
        panel_FrameToolbarLayout.setHorizontalGroup(
            panel_FrameToolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_FrameToolbarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tool_New)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tool_Refresh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tool_Delete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tool_Save)
                .addGap(18, 18, 18)
                .addComponent(tool_id, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_FrameToolbarLayout.setVerticalGroup(
            panel_FrameToolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_FrameToolbarLayout.createSequentialGroup()
                .addGroup(panel_FrameToolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_FrameToolbarLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(tool_Delete))
                    .addComponent(tool_New, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tool_Refresh, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_FrameToolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(tool_id, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tool_Save)))
                .addContainerGap())
        );

        panel_Proc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        cb_proc.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cb_procPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        btnTool_RegProcedureAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        btnTool_RegProcedureAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnTool_RegProcedureAdd.setFocusPainted(false);
        btnTool_RegProcedureAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTool_RegProcedureAdd.setToolTipText("Добавить посещение");
        btnTool_RegProcedureAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTool_RegProcedureAddActionPerformed(evt);
            }
        });

        btnTool_RegProcedureDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        btnTool_RegProcedureDelete.setToolTipText("Удалить запись о посещении");
        btnTool_RegProcedureDelete.setFocusPainted(false);
        btnTool_RegProcedureDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTool_RegProcedureDelete.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTool_RegProcedureDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTool_RegProcedureDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_ProcToolbarLayout = new javax.swing.GroupLayout(panel_ProcToolbar);
        panel_ProcToolbar.setLayout(panel_ProcToolbarLayout);
        panel_ProcToolbarLayout.setHorizontalGroup(
            panel_ProcToolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ProcToolbarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cb_proc, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTool_RegProcedureAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTool_RegProcedureDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_currentProcId, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_ProcToolbarLayout.setVerticalGroup(
            panel_ProcToolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ProcToolbarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_ProcToolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnTool_RegProcedureAdd)
                    .addComponent(cb_proc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTool_RegProcedureDelete)
                    .addComponent(label_currentProcId, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtArea_RegProcedure1.setColumns(20);
        txtArea_RegProcedure1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtArea_RegProcedure1.setLineWrap(true);
        txtArea_RegProcedure1.setRows(5);
        txtArea_RegProcedure1.setWrapStyleWord(true);
        jScrollPane6.setViewportView(txtArea_RegProcedure1);

        txtArea_RegProcedure5.setColumns(20);
        txtArea_RegProcedure5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtArea_RegProcedure5.setLineWrap(true);
        txtArea_RegProcedure5.setRows(5);
        txtArea_RegProcedure5.setWrapStyleWord(true);
        jScrollPane20.setViewportView(txtArea_RegProcedure5);

        jLabel1.setText("Процедура 1:");

        jLabel2.setText("Процедура 2:");

        jLabel3.setText("Процедура 3:");

        jLabel4.setText("Процедура 4:");

        jLabel5.setText("Процедура 5:");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Amitjakhu-Drip-Trash.16.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Amitjakhu-Drip-Trash.16.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Amitjakhu-Drip-Trash.16.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Amitjakhu-Drip-Trash.16.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Amitjakhu-Drip-Trash.16.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        txtArea_RegProcedure2.setColumns(20);
        txtArea_RegProcedure2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtArea_RegProcedure2.setLineWrap(true);
        txtArea_RegProcedure2.setRows(5);
        txtArea_RegProcedure2.setWrapStyleWord(true);
        jScrollPane17.setViewportView(txtArea_RegProcedure2);

        txtArea_RegProcedure3.setColumns(20);
        txtArea_RegProcedure3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtArea_RegProcedure3.setLineWrap(true);
        txtArea_RegProcedure3.setRows(5);
        txtArea_RegProcedure3.setWrapStyleWord(true);
        jScrollPane18.setViewportView(txtArea_RegProcedure3);

        txtArea_RegProcedure4.setColumns(20);
        txtArea_RegProcedure4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtArea_RegProcedure4.setLineWrap(true);
        txtArea_RegProcedure4.setRows(5);
        txtArea_RegProcedure4.setWrapStyleWord(true);
        jScrollPane19.setViewportView(txtArea_RegProcedure4);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sep_Procedure8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sep_Procedure7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sep_Procedure5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sep_Procedure6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_RegProcedure4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_RegProcedure5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_RegProcedure3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txt_RegProcedure2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txt_RegProcedure1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton2))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton3))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton4))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton5))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton1)))))
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_RegProcedure1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sep_Procedure6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_RegProcedure2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sep_Procedure5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_RegProcedure3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sep_Procedure7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_RegProcedure4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sep_Procedure8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_RegProcedure5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Процедуры", jPanel3);

        txtArea_DiaryAdditional.setColumns(20);
        txtArea_DiaryAdditional.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtArea_DiaryAdditional.setLineWrap(true);
        txtArea_DiaryAdditional.setRows(5);
        txtArea_DiaryAdditional.setWrapStyleWord(true);
        jScrollPane5.setViewportView(txtArea_DiaryAdditional);

        jLabel7.setText("Жалобы:");

        jLabel8.setText("Состояние:");

        jLabel9.setText("Температура тела:");

        jLabel16.setText("Дыхание:");

        jLabel17.setText("Тоны сердца:");

        jLabel18.setText("Давление:");

        jLabel19.setText("Пульс:");

        jLabel20.setText("Дополнительно:");

        jLabel21.setText("Время начала:");

        jLabel22.setText("Время ухода:");

        txt_timeStart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_timeStartMouseClicked(evt);
            }
        });

        txt_timeEnd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_timeEndMouseClicked(evt);
            }
        });

        btn_AddComplaintsReg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Amitjakhu-Drip-Plus.16.png"))); // NOI18N
        btn_AddComplaintsReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddComplaintsRegActionPerformed(evt);
            }
        });

        btn_AddStatusReg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Amitjakhu-Drip-Plus.16.png"))); // NOI18N
        btn_AddStatusReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddStatusRegActionPerformed(evt);
            }
        });

        btn_AddTemperatureReg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Amitjakhu-Drip-Plus.16.png"))); // NOI18N
        btn_AddTemperatureReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddTemperatureRegActionPerformed(evt);
            }
        });

        btn_AddBreathReg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Amitjakhu-Drip-Plus.16.png"))); // NOI18N
        btn_AddBreathReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddBreathRegActionPerformed(evt);
            }
        });

        btn_AddHeartReg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Amitjakhu-Drip-Plus.16.png"))); // NOI18N
        btn_AddHeartReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddHeartRegActionPerformed(evt);
            }
        });

        btn_AddPressureReg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Amitjakhu-Drip-Plus.16.png"))); // NOI18N
        btn_AddPressureReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddPressureRegActionPerformed(evt);
            }
        });

        btn_AddPulseReg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Amitjakhu-Drip-Plus.16.png"))); // NOI18N
        btn_AddPulseReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddPulseRegActionPerformed(evt);
            }
        });

        jLabel23.setText("Итоговый текст дневника:");

        txtArea_Diary.setColumns(20);
        txtArea_Diary.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtArea_Diary.setLineWrap(true);
        txtArea_Diary.setRows(5);
        txtArea_Diary.setWrapStyleWord(true);
        jScrollPane29.setViewportView(txtArea_Diary);

        btn_CreateDiary.setText("Сформировать");
        btn_CreateDiary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CreateDiaryActionPerformed(evt);
            }
        });

        jLabel24.setText("Кожные покровы:");

        btn_AddSkinReg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Amitjakhu-Drip-Plus.16.png"))); // NOI18N
        btn_AddSkinReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddSkinRegActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane5)
                                .addComponent(jScrollPane29, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGap(20, 20, 20))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel24)
                                    .addGap(18, 18, 18)
                                    .addComponent(txt_RegSkin, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btn_AddSkinReg))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_RegTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn_AddTemperatureReg))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(57, 57, 57)
                                        .addComponent(txt_RegStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn_AddStatusReg))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addGap(67, 67, 67)
                                        .addComponent(txt_RegBreath, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn_AddBreathReg))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addGap(46, 46, 46)
                                        .addComponent(txt_RegHeart, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn_AddHeartReg))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel18)
                                        .addGap(63, 63, 63)
                                        .addComponent(txt_RegPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn_AddPressureReg))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel19)
                                        .addGap(82, 82, 82)
                                        .addComponent(txt_RegPulse, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn_AddPulseReg))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel21))
                                        .addGap(39, 39, 39)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(txt_timeStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel22)
                                                .addGap(18, 18, 18)
                                                .addComponent(txt_timeEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(txt_RegComplaints, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btn_AddComplaintsReg))))))
                            .addGap(0, 28, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addGap(193, 193, 193)
                                .addComponent(btn_CreateDiary)))
                        .addGap(17, 17, 17))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txt_timeStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(txt_timeEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel7)
                                                .addComponent(txt_RegComplaints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(btn_AddComplaintsReg))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel8)
                                            .addComponent(txt_RegStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(btn_AddStatusReg))
                                .addGap(13, 13, 13)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(txt_RegTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btn_AddTemperatureReg))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(txt_RegSkin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btn_AddSkinReg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel16)
                                        .addComponent(txt_RegBreath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btn_AddBreathReg))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel17)
                                        .addComponent(txt_RegHeart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btn_AddHeartReg))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18)
                                    .addComponent(txt_RegPressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btn_AddPressureReg))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(txt_RegPulse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btn_AddPulseReg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(btn_CreateDiary))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane29, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Дневник", jPanel2);

        javax.swing.GroupLayout panel_procedureLayout = new javax.swing.GroupLayout(panel_procedure);
        panel_procedure.setLayout(panel_procedureLayout);
        panel_procedureLayout.setHorizontalGroup(
            panel_procedureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_procedureLayout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addGap(0, 0, 0))
        );
        panel_procedureLayout.setVerticalGroup(
            panel_procedureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        javax.swing.GroupLayout panel_ProcLayout = new javax.swing.GroupLayout(panel_Proc);
        panel_Proc.setLayout(panel_ProcLayout);
        panel_ProcLayout.setHorizontalGroup(
            panel_ProcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_procedure, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_ProcToolbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel_ProcLayout.setVerticalGroup(
            panel_ProcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ProcLayout.createSequentialGroup()
                .addComponent(panel_ProcToolbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_procedure, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout MainContentPanelLayout = new javax.swing.GroupLayout(MainContentPanel);
        MainContentPanel.setLayout(MainContentPanelLayout);
        MainContentPanelLayout.setHorizontalGroup(
            MainContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainContentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainContentPanelLayout.createSequentialGroup()
                        .addGroup(MainContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel_PersonalData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panel_PatList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel_Examination, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel_Proc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(panel_FrameToolbar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        MainContentPanelLayout.setVerticalGroup(
            MainContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainContentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_FrameToolbar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panel_Examination, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(MainContentPanelLayout.createSequentialGroup()
                        .addComponent(panel_PatList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel_PersonalData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(panel_Proc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jScrollPane30.setViewportView(MainContentPanel);

        menu_File.setText("Файл");
        menu_File.add(jSeparator1);

        menuFileItem_Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Amitjakhu-Drip-Exit.16.png"))); // NOI18N
        menuFileItem_Exit.setText("Выход");
        menuFileItem_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFileItem_ExitActionPerformed(evt);
            }
        });
        menu_File.add(menuFileItem_Exit);

        jMenuBar1.add(menu_File);

        menu_Print.setText("Печать");

        menuPrintItem_History.setText("История болезни");
        menuPrintItem_History.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPrintItem_HistoryActionPerformed(evt);
            }
        });
        menu_Print.add(menuPrintItem_History);

        menuPrintItem_Soglasia.setText("Инф. согласие + перс. данные");
        menuPrintItem_Soglasia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPrintItem_SoglasiaActionPerformed(evt);
            }
        });
        menu_Print.add(menuPrintItem_Soglasia);

        menuPrintItem_Uchet.setText("Протокол учета врачебных назначений");
        menuPrintItem_Uchet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPrintItem_UchetActionPerformed(evt);
            }
        });
        menu_Print.add(menuPrintItem_Uchet);

        jMenuBar1.add(menu_Print);

        menu_Help.setText("Справка");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fatcow-Farm-Fresh-Information.16.png"))); // NOI18N
        jMenuItem1.setText("Изменение содержимого всплывающих окон");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menu_Help.add(jMenuItem1);

        jMenuBar1.add(menu_Help);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane30, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 872, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void menuFileItem_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFileItem_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuFileItem_ExitActionPerformed

    private void tool_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tool_SaveActionPerformed
        if(currentPatient == null){
            JOptionPane.showMessageDialog(null, "Пациент не выбран!", "Ошибка", JOptionPane.ERROR_MESSAGE);
        } else{
            saveAllData();
        }
    }//GEN-LAST:event_tool_SaveActionPerformed

    private void txt_addressWorkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_addressWorkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_addressWorkActionPerformed

    private void txt_addressLiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_addressLiveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_addressLiveActionPerformed

    private void txt_ComplDiagnosisCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ComplDiagnosisCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ComplDiagnosisCodeActionPerformed

    private void rb_maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_maleActionPerformed
        currentPatient.setGender("мужской");
    }//GEN-LAST:event_rb_maleActionPerformed

    private void rb_femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_femaleActionPerformed
        currentPatient.setGender("женский");
    }//GEN-LAST:event_rb_femaleActionPerformed

    private void menuPrintItem_HistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPrintItem_HistoryActionPerformed
        if (cb_visitDate.isEnabled()) {
            generateHistory();
        } else {
            JOptionPane.showMessageDialog(null, "Отсутствует запись о Курсе лечения", "Ошибка", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_menuPrintItem_HistoryActionPerformed

    private void txt_policyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_policyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_policyActionPerformed

    private void btn_Procedure5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Procedure5ActionPerformed
        if (cb_proc.getItemCount() == 0) {
            btnTool_RegProcedureAdd.doClick();
        }
        moveProcedure(5);
    }//GEN-LAST:event_btn_Procedure5ActionPerformed

    private void btn_Procedure4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Procedure4ActionPerformed
        if (cb_proc.getItemCount() == 0) {
            btnTool_RegProcedureAdd.doClick();
        }
        moveProcedure(4);
    }//GEN-LAST:event_btn_Procedure4ActionPerformed

    private void btn_Procedure3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Procedure3ActionPerformed
        if (cb_proc.getItemCount() == 0) {
            btnTool_RegProcedureAdd.doClick();
        }
        moveProcedure(3);
    }//GEN-LAST:event_btn_Procedure3ActionPerformed

    private void btn_Procedure2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Procedure2ActionPerformed
        if (cb_proc.getItemCount() == 0) {
            btnTool_RegProcedureAdd.doClick();
        }
        moveProcedure(2);
    }//GEN-LAST:event_btn_Procedure2ActionPerformed

    private void btn_Procedure1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Procedure1ActionPerformed
        if (cb_proc.getItemCount() == 0) {
            btnTool_RegProcedureAdd.doClick();
        }
        moveProcedure(1);
    }//GEN-LAST:event_btn_Procedure1ActionPerformed

    private void btn_AddAnamLifeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddAnamLifeActionPerformed
        String str = "";
        PopupList pl = new PopupList(this, true, "Анамнез жизни", getClass().getResourceAsStream("/txt/3_anamnesis_life.txt"), 2);
        pl.setVisible(true);
        if (pl.getSb() != null) {
            str = pl.getSb().toString();
            txtArea_AnamnesisLife.append(str);
        }
    }//GEN-LAST:event_btn_AddAnamLifeActionPerformed

    private void btn_AddAnamDisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddAnamDisActionPerformed
        String str = "";
        PopupList pl = new PopupList(this, true, "Анамнез заболевания", getClass().getResourceAsStream("/txt/2_anamnesis_dis.txt"), 2);
        pl.setVisible(true);
        if (pl.getSb() != null) {
            str = pl.getSb().toString();
            txtArea_AnamnesisDis.append(str);
        }
    }//GEN-LAST:event_btn_AddAnamDisActionPerformed

    private void btn_AddComplaintsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddComplaintsActionPerformed
        String str = "";
        PopupList pl = new PopupList(this, true, "Жалобы", getClass().getResourceAsStream("/txt/1_complaints.txt"), 2);
        pl.setVisible(true);
        if (pl.getSb() != null) {
            str = pl.getSb().toString();
            txtArea_Complaints.append(str);
        }
    }//GEN-LAST:event_btn_AddComplaintsActionPerformed

    private void check_TerminationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_TerminationActionPerformed

    }//GEN-LAST:event_check_TerminationActionPerformed

    private void txt_proc3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_proc3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_proc3ActionPerformed

    private void txt_proc4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_proc4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_proc4ActionPerformed

    private void btn_AddExaminationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddExaminationActionPerformed

        if(currentPatient.getExaminationsList() == null){
            currentPatient.setExaminationsList(new ArrayList<Examination>());
        }
        NewExamination dialog = new NewExamination(this, true);
        dialog.setVisible(true);
        
        LocalDate date = dialog.getNewExaminationDate();
        if(date != null){
            addExamination(date);
        }
            
    }//GEN-LAST:event_btn_AddExaminationActionPerformed

    private void txt_refSurnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_refSurnameActionPerformed

    }//GEN-LAST:event_txt_refSurnameActionPerformed

    private void btn_refSurnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refSurnameActionPerformed
        String str = "";
        PopupList pl = new PopupList(this, true, "Кем направлен - фамилия", getClass().getResourceAsStream("/txt/7_doctor.txt"), 0);
        pl.setVisible(true);
        if (pl.getStr() != null) {
            str = pl.getStr();
            txt_refSurname.setText(str);
        }
    }//GEN-LAST:event_btn_refSurnameActionPerformed

    private void btn_refPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refPosActionPerformed
        String str = "";
        PopupList pl = new PopupList(this, true, "Кем направлен - специальность", getClass().getResourceAsStream("/txt/8_doc_specialty.txt"), 0);
        pl.setVisible(true);
        if (pl.getStr() != null) {
            str = pl.getStr();
            txt_refPos.setText(str);
        }
    }//GEN-LAST:event_btn_refPosActionPerformed

    private void txt_MainDiagnosisCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_MainDiagnosisCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_MainDiagnosisCodeActionPerformed

    private void txt_ComorbidityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ComorbidityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ComorbidityActionPerformed

    private void txt_proc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_proc1ActionPerformed

    }//GEN-LAST:event_txt_proc1ActionPerformed

    private void txt_proc1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_proc1MouseClicked
        chooseProcedureType(1);
    }//GEN-LAST:event_txt_proc1MouseClicked

    private void txt_proc2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_proc2MouseClicked
        chooseProcedureType(2);
    }//GEN-LAST:event_txt_proc2MouseClicked

    private void txt_proc3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_proc3MouseClicked
        chooseProcedureType(3);
    }//GEN-LAST:event_txt_proc3MouseClicked

    private void txt_proc4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_proc4MouseClicked
        chooseProcedureType(4);
    }//GEN-LAST:event_txt_proc4MouseClicked

    private void txt_proc5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_proc5MouseClicked
        chooseProcedureType(5);
    }//GEN-LAST:event_txt_proc5MouseClicked

    private void txtArea_Procedure1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtArea_Procedure1MouseClicked
        chooseProcedure(1);
    }//GEN-LAST:event_txtArea_Procedure1MouseClicked

    private void txtArea_Procedure2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtArea_Procedure2MouseClicked
        chooseProcedure(2);
    }//GEN-LAST:event_txtArea_Procedure2MouseClicked

    private void txtArea_Procedure3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtArea_Procedure3MouseClicked
        chooseProcedure(3);
    }//GEN-LAST:event_txtArea_Procedure3MouseClicked

    private void txtArea_Procedure4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtArea_Procedure4MouseClicked
        chooseProcedure(4);
    }//GEN-LAST:event_txtArea_Procedure4MouseClicked

    private void txtArea_Procedure5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtArea_Procedure5MouseClicked
        chooseProcedure(5);
    }//GEN-LAST:event_txtArea_Procedure5MouseClicked

    private void cb_visitDatePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cb_visitDatePopupMenuWillBecomeInvisible
        Examination tmp = (Examination) cb_visitDate.getSelectedItem();
        if (tmp != null) {
            if (!tmp.equals(currentExamination)) {
                chooseCurrentExamination(tmp);
            }
        }
    }//GEN-LAST:event_cb_visitDatePopupMenuWillBecomeInvisible

    private void btnTool_RegProcedureAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTool_RegProcedureAddActionPerformed
        if(currentExamination.getProceduresList() == null){
            currentExamination.setProceduresList(new ArrayList<Procedure>());
        }
        NewProcedure dialog = new NewProcedure(this, true);
        dialog.setVisible(true);
        
        LocalDate date = dialog.getNewProcedureDate();
        if(date != null){
            addProcedure(date);
        }
    }//GEN-LAST:event_btnTool_RegProcedureAddActionPerformed

    private void cb_procPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cb_procPopupMenuWillBecomeInvisible
        Procedure tmp = (Procedure) cb_proc.getSelectedItem();
        if (tmp != null) {
            if (!tmp.equals(currentProcedure)) {
                chooseCurrentProcedure(tmp);

            }
        }
    }//GEN-LAST:event_cb_procPopupMenuWillBecomeInvisible

    private void tool_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tool_DeleteActionPerformed
        deletePatient();
    }//GEN-LAST:event_tool_DeleteActionPerformed

    private void btn_DeleteExaminationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteExaminationActionPerformed
        deleteExamination();
    }//GEN-LAST:event_btn_DeleteExaminationActionPerformed

    private void btnTool_RegProcedureDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTool_RegProcedureDeleteActionPerformed
        deleteProcedure();
    }//GEN-LAST:event_btnTool_RegProcedureDeleteActionPerformed

    private void tool_NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tool_NewActionPerformed
        try {
            NewPatient n = new NewPatient(this, true, connection);
            n.setVisible(true);
            if (n.getPatient() != null) {
                currentPatient = n.getPatient();

                clearFields(0);

                fillPatientList();
                fillPatientFields();

                setPatientFieldsEnabled(true);
                setExamFieldsEnabled(false);
                setProcFieldsEnabled(false);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NewPatient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tool_NewActionPerformed

    private void txt_historyNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_historyNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_historyNumActionPerformed

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
        searchFilter(txt_search.getText());
    }//GEN-LAST:event_txt_searchKeyReleased

    private void menuPrintItem_SoglasiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPrintItem_SoglasiaActionPerformed
        if (cb_visitDate.isEnabled()) {
            generateSoglasia();
        } else {
            JOptionPane.showMessageDialog(null, "Отсутствует запись о Курсе лечения", "Ошибка", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_menuPrintItem_SoglasiaActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        txt_RegProcedure5.setText("");
        txtArea_RegProcedure5.setText("");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        txt_RegProcedure4.setText("");
        txtArea_RegProcedure4.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        txt_RegProcedure3.setText("");
        txtArea_RegProcedure3.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        txt_RegProcedure2.setText("");
        txtArea_RegProcedure2.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txt_RegProcedure1.setText("");
        txtArea_RegProcedure1.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void menuPrintItem_UchetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPrintItem_UchetActionPerformed
        if (cb_visitDate.isEnabled()) {
            generateProtocol();
        } else {
            JOptionPane.showMessageDialog(null, "Отсутствует запись о Курсе лечения", "Ошибка", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_menuPrintItem_UchetActionPerformed

    private void txt_sideEffectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sideEffectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_sideEffectActionPerformed

    private void txt_daysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_daysActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_daysActionPerformed

    private void txt_RefDiagnosisCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_RefDiagnosisCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_RefDiagnosisCodeActionPerformed

    private void btn_noSideEffectsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_noSideEffectsActionPerformed
        txt_sideEffect.setText("отрицает");
    }//GEN-LAST:event_btn_noSideEffectsActionPerformed

    private void txt_ProvisDiagnosisCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ProvisDiagnosisCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ProvisDiagnosisCodeActionPerformed

    private void txt_AdmisDiagnosisCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_AdmisDiagnosisCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_AdmisDiagnosisCodeActionPerformed

    private void btn_copyMainDiagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_copyMainDiagActionPerformed
        txt_RefDiagnosisCode.setText(txt_MainDiagnosisCode.getText());
        txtArea_RefDiagnosis.setText(txtArea_MainDiagnosis.getText());
        txt_AdmisDiagnosisCode.setText(txt_MainDiagnosisCode.getText());
        txtArea_AdmisDiagnosis.setText(txtArea_MainDiagnosis.getText());
        txt_ProvisDiagnosisCode.setText(txt_MainDiagnosisCode.getText());
        txtArea_ProvisDiagnosis.setText(txtArea_MainDiagnosis.getText());
    }//GEN-LAST:event_btn_copyMainDiagActionPerformed

    private void btn_addRefDiagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addRefDiagActionPerformed
        chooseDiagnosis(0);
    }//GEN-LAST:event_btn_addRefDiagActionPerformed

    private void btn_addAdmisDiagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addAdmisDiagActionPerformed
        chooseDiagnosis(1);
    }//GEN-LAST:event_btn_addAdmisDiagActionPerformed

    private void btn_addProvisDiagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addProvisDiagActionPerformed
        chooseDiagnosis(2);
    }//GEN-LAST:event_btn_addProvisDiagActionPerformed

    private void btn_addMainDiagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addMainDiagActionPerformed
        chooseDiagnosis(3);
    }//GEN-LAST:event_btn_addMainDiagActionPerformed

    private void btn_addComplDiagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addComplDiagActionPerformed
        chooseDiagnosis(4);
    }//GEN-LAST:event_btn_addComplDiagActionPerformed

    private void btn_addComorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addComorActionPerformed
        chooseDiagnosis(5);
    }//GEN-LAST:event_btn_addComorActionPerformed

    private void btn_imtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_imtActionPerformed
        if (!txt_height.getText().equals("") && !txt_weight.getText().equals("")) {
            try {
                Double h = Double.parseDouble(txt_height.getText()) / 100;
                Double w = Double.parseDouble(txt_weight.getText());
                Double r = w / (h * h);
                String result = String.format("%.1f", r);
                txt_imt.setText(result);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Неверно введены значения Рост / Вес", "Ошибка", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_imtActionPerformed

    private void btn_AddPastIllnessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddPastIllnessActionPerformed
        String str = "";
        PopupList pl = new PopupList(this, true, "Перенесенные заболевания", getClass().getResourceAsStream("/txt/illness.txt"), 2);
        pl.setVisible(true);
        if (pl.getSb() != null) {
            str = pl.getSb().toString();
            txtArea_pastIllness.append(str);
        }
    }//GEN-LAST:event_btn_AddPastIllnessActionPerformed

    private void btn_AddAllergyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddAllergyActionPerformed
        String str = "";
        PopupList pl = new PopupList(this, true, "Аллергологический анамнез", getClass().getResourceAsStream("/txt/allergy.txt"), 2);
        pl.setVisible(true);
        if (pl.getSb() != null) {
            str = pl.getSb().toString();
            txtArea_allergicAnamnesis.append(str);
        }
    }//GEN-LAST:event_btn_AddAllergyActionPerformed

    private void btn_AddFizRazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddFizRazActionPerformed
        String str = "";
        PopupList pl = new PopupList(this, true, "Физическое развитие", getClass().getResourceAsStream("/txt/osmotr/fiz_raz.txt"), 2);
        pl.setVisible(true);
        if (pl.getStr() != null) {
            str = pl.getStr();
            txt_fizRaz.setText(str);
        }
    }//GEN-LAST:event_btn_AddFizRazActionPerformed

    private void btn_AddDefRazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddDefRazActionPerformed
        String str = "";
        PopupList pl = new PopupList(this, true, "Дефекты развития", getClass().getResourceAsStream("/txt/osmotr/def_raz.txt"), 2);
        pl.setVisible(true);
        if (pl.getStr() != null) {
            str = pl.getStr();
            txt_defRaz.setText(str);
        }
    }//GEN-LAST:event_btn_AddDefRazActionPerformed

    private void btn_AddTeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddTeloActionPerformed
        String str = "";
        PopupList pl = new PopupList(this, true, "Телосложение", getClass().getResourceAsStream("/txt/osmotr/telo.txt"), 2);
        pl.setVisible(true);
        if (pl.getStr() != null) {
            str = pl.getStr();
            txt_telo.setText(str);
        }
    }//GEN-LAST:event_btn_AddTeloActionPerformed

    private void btn_AddPitanieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddPitanieActionPerformed
        String str = "";
        PopupList pl = new PopupList(this, true, "Питание", getClass().getResourceAsStream("/txt/osmotr/pitanie.txt"), 2);
        pl.setVisible(true);
        if (pl.getStr() != null) {
            str = pl.getStr();
            txt_pitanie.setText(str);
        }
    }//GEN-LAST:event_btn_AddPitanieActionPerformed

    private void btn_AddPokrovyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddPokrovyActionPerformed
        String str = "";
        PopupList pl = new PopupList(this, true, "Покровы тела", getClass().getResourceAsStream("/txt/osmotr/pokrovy.txt"), 2);
        pl.setVisible(true);
        if (pl.getStr() != null) {
            str = pl.getStr();
            txt_pokrovy.setText(str);
        }
    }//GEN-LAST:event_btn_AddPokrovyActionPerformed

    private void btn_AddLimfSystActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddLimfSystActionPerformed
        String str = "";
        PopupList pl = new PopupList(this, true, "Лимфатическая система", getClass().getResourceAsStream("/txt/osmotr/limf_syst.txt"), 2);
        pl.setVisible(true);
        if (pl.getStr() != null) {
            str = pl.getStr();
            txt_limfSyst.setText(str);
        }
    }//GEN-LAST:event_btn_AddLimfSystActionPerformed

    private void btn_AddMishSystActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddMishSystActionPerformed
        String str = "";
        PopupList pl = new PopupList(this, true, "Мышечная система", getClass().getResourceAsStream("/txt/osmotr/mish_syst.txt"), 2);
        pl.setVisible(true);
        if (pl.getStr() != null) {
            str = pl.getStr();
            txt_mishSyst.setText(str);
        }
    }//GEN-LAST:event_btn_AddMishSystActionPerformed

    private void btn_AddSvyazSustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddSvyazSustActionPerformed
        String str = "";
        PopupList pl = new PopupList(this, true, "Связочно-суставной аппарат", getClass().getResourceAsStream("/txt/osmotr/svyaz_sust.txt"), 2);
        pl.setVisible(true);
        if (pl.getStr() != null) {
            str = pl.getStr();
            txt_svyazSust.setText(str);
        }
    }//GEN-LAST:event_btn_AddSvyazSustActionPerformed

    private void btn_AddSerdSosudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddSerdSosudActionPerformed
        String str = "";
        PopupList pl = new PopupList(this, true, "Сердечно-сосудистая система", getClass().getResourceAsStream("/txt/osmotr/serd_sosud.txt"), 2);
        pl.setVisible(true);
        if (pl.getSb() != null) {
            str = pl.getSb().toString();
            txt_serdSosud.setText(str);
        }
    }//GEN-LAST:event_btn_AddSerdSosudActionPerformed

    private void btn_AddPischevarenieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddPischevarenieActionPerformed
        String str = "";
        PopupList pl = new PopupList(this, true, "Органы пищеварения", getClass().getResourceAsStream("/txt/osmotr/pischevarenie.txt"), 2);
        pl.setVisible(true);
        if (pl.getStr() != null) {
            str = pl.getStr();
            txt_pischevarenie.setText(str);
        }
    }//GEN-LAST:event_btn_AddPischevarenieActionPerformed

    private void btn_AddMochepolovayaSystActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddMochepolovayaSystActionPerformed
        String str = "";
        PopupList pl = new PopupList(this, true, "Мочеполовая система", getClass().getResourceAsStream("/txt/osmotr/mochepolovaya_syst.txt"), 2);
        pl.setVisible(true);
        if (pl.getStr() != null) {
            str = pl.getStr();
            txt_mochepolovayaSyst.setText(str);
        }
    }//GEN-LAST:event_btn_AddMochepolovayaSystActionPerformed

    private void btn_AddNervSystActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddNervSystActionPerformed
        String str = "";
        PopupList pl = new PopupList(this, true, "Нервная система", getClass().getResourceAsStream("/txt/osmotr/nerv_syst.txt"), 2);
        pl.setVisible(true);
        if (pl.getStr() != null) {
            str = pl.getStr();
            txt_nervSyst.setText(str);
        }
    }//GEN-LAST:event_btn_AddNervSystActionPerformed

    private void btn_AddOrganiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddOrganiActionPerformed
        String str = "";
        PopupList pl = new PopupList(this, true, "Органы чувств:", getClass().getResourceAsStream("/txt/osmotr/organi_chuvstv.txt"), 2);
        pl.setVisible(true);
        if (pl.getStr() != null) {
            str = pl.getStr();
            txt_organiChuvstv.setText(str);
        }
    }//GEN-LAST:event_btn_AddOrganiActionPerformed

    private void btn_AddSekreciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddSekreciaActionPerformed
        String str = "";
        PopupList pl = new PopupList(this, true, "Железы внутренней секреции:", getClass().getResourceAsStream("/txt/osmotr/sekrecia.txt"), 2);
        pl.setVisible(true);
        if (pl.getStr() != null) {
            str = pl.getStr();
            txt_sekrecia.setText(str);
        }
    }//GEN-LAST:event_btn_AddSekreciaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JOptionPane.showMessageDialog(null, "Для изменения, добавления или удаления значений всплывающих окон необходимо отредактировать соответствующий текстовый документ."
                + " Расположение текстовых документов: classes/txt/ \n\nВНИМАНИЕ: Нельзя удалять, менять расположение и название самих файлов!", "Всплывающие окна", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void tool_RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tool_RefreshActionPerformed
        
        int examIndex = cb_visitDate.getSelectedIndex();
        int procIndex = cb_proc.getSelectedIndex();
               
        fillPatientList();
        
        if(currentPatient != null){
            loadPatient(currentPatient);
        }
        if(currentExamination != null){
            cb_visitDate.setSelectedIndex(examIndex);
            loadExamination(currentExamination);
        }
        if(currentProcedure != null){
           cb_proc.setSelectedItem(procIndex);
           loadProcedure(currentProcedure); 
        }
//            
//            if (currentExamination == null) {
//                fillExaminationList();
//            } else {
//                
//                if (currentProcedure == null) {
//                    fillProcedureList();
//                } else {
//                    System.out.println("index " + procIndex);
//                    
//                }
//        }
    }//GEN-LAST:event_tool_RefreshActionPerformed

    private void btn_daysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_daysActionPerformed
        txt_days.setText(Integer.toString(cb_proc.getItemCount()));
    }//GEN-LAST:event_btn_daysActionPerformed

    private void btn_AddHeredityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddHeredityActionPerformed
        String str = "";
        PopupList pl = new PopupList(this, true, "Наследственность", getClass().getResourceAsStream("/txt/4_heredity.txt"), 2);
        pl.setVisible(true);
        if (pl.getSb() != null) {
            str = pl.getSb().toString();
            txt_heredity.setText(str);
        }
    }//GEN-LAST:event_btn_AddHeredityActionPerformed

    private void btn_AddHabitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddHabitsActionPerformed
        String str = "";
        PopupList pl = new PopupList(this, true, "Привычки", getClass().getResourceAsStream("/txt/5_habits.txt"), 2);
        pl.setVisible(true);
        if (pl.getSb() != null) {
            str = pl.getSb().toString();
            txt_habits.setText(str);
        }
    }//GEN-LAST:event_btn_AddHabitsActionPerformed

    private void btn_AddLegDihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddLegDihActionPerformed
        String str = "";
        PopupList pl = new PopupList(this, true, "Лёгочно-дыхательный аппарат", getClass().getResourceAsStream("/txt/osmotr/leg_dih.txt"), 2);
        pl.setVisible(true);
        if (pl.getStr() != null) {
            str = pl.getStr();
            txt_legDih.setText(str);
        }
    }//GEN-LAST:event_btn_AddLegDihActionPerformed

    private void btn_AddFlurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddFlurActionPerformed
        txtArea_ExaminationResults.append("<b>Флюорография ОГК:</b> На момент обследования данных за очаговые и инфильтрированные изменения не выявлено. \n");
    }//GEN-LAST:event_btn_AddFlurActionPerformed

    private void btn_AddEKGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddEKGActionPerformed
        txtArea_ExaminationResults.append("<b>ЭКГ :</b> ритм синусовый, ЧСС в мин., ЭОС. \n");
    }//GEN-LAST:event_btn_AddEKGActionPerformed

    private void btn_AddOAKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddOAKActionPerformed
        txtArea_ExaminationResults.append("<b>ОАК :</b> Hb  г\\л, L  х 10\u2079\\л, Эр х10\u00B9\u00B2\\л Тромб  х10\u2079\\л. \n");
    }//GEN-LAST:event_btn_AddOAKActionPerformed

    private void btn_AddOAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddOAMActionPerformed
        txtArea_ExaminationResults.append("<b>ОАМ :</b> уд вес  , белок  г\\л, сахар отр, лейк  , эрит  в поле зрения. \n");
    }//GEN-LAST:event_btn_AddOAMActionPerformed

    private void btn_AddBHAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddBHAActionPerformed
        txtArea_ExaminationResults.append("<b>БХА :</b> Биллирубин  мкмоль\\л, креатинин  мкмоль\\л, АСТ\\АЛТ  ЕД\\л, ХС  ммоль\\л, сахар крови  ммоль\\л. \n");
    }//GEN-LAST:event_btn_AddBHAActionPerformed

    private void btn_AddUziOBPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddUziOBPActionPerformed
        txtArea_ExaminationResults.append("<b>УЗИ ОБП  :</b> признаки диффузных изменений печени, ПЖ. \n");
    }//GEN-LAST:event_btn_AddUziOBPActionPerformed

    private void btn_AddUZDG_BCAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddUZDG_BCAActionPerformed
        txtArea_ExaminationResults.append("<b>УЗДГ БЦА  :</b> признаки диффузных изменений БЦА без гемодинамически значимых препятствий кровотоку. \n");
    }//GEN-LAST:event_btn_AddUZDG_BCAActionPerformed

    private void txt_timeStartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_timeStartMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_timeStartMouseClicked

    private void txt_timeEndMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_timeEndMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_timeEndMouseClicked

    private void txt_timeAdmisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_timeAdmisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_timeAdmisActionPerformed

    private void btn_AddComplaints1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddComplaints1ActionPerformed
        String str = "";
        PopupList pl = new PopupList(this, true, "Жалобы", getClass().getResourceAsStream("/txt/1_complaints.txt"), 2);
        pl.setVisible(true);
        if (pl.getSb() != null) {
            str = pl.getSb().toString();
            txtArea_ComplaintsEpik.append(str);
        }
    }//GEN-LAST:event_btn_AddComplaints1ActionPerformed

    private void btn_AddOutcomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddOutcomeActionPerformed
        String str = "";
        PopupList pl = new PopupList(this, true, "Исход", getClass().getResourceAsStream("/txt/11_outcome.txt"), 2);
        pl.setVisible(true);
        if (pl.getSb() != null) {
            str = pl.getSb().toString();
            txtArea_Outcome.append(str);
        }
    }//GEN-LAST:event_btn_AddOutcomeActionPerformed

    private void btn_AddRecommendationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddRecommendationsActionPerformed
        String str = "";
        PopupList pl = new PopupList(this, true, "Рекомендации", getClass().getResourceAsStream("/txt/12_recommendations.txt"), 2);
        pl.setVisible(true);
        if (pl.getSb() != null) {
            str = pl.getSb().toString();
            txtArea_Recommedations.append(str);
        }
    }//GEN-LAST:event_btn_AddRecommendationsActionPerformed

    private void btn_AddRecommendations1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddRecommendations1ActionPerformed
        String str = txtArea_Diary.getText();

        txtArea_ObjStatus.setText(str);
    }//GEN-LAST:event_btn_AddRecommendations1ActionPerformed

    private void btn_AddStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddStateActionPerformed
        String str = "";
        PopupList pl = new PopupList(this, true, "Общее состояние", getClass().getResourceAsStream("/txt/osmotr/state.txt"), 2);
        pl.setVisible(true);
        if (pl.getStr() != null) {
            str = pl.getStr();
            txt_state.setText(str);
        }
    }//GEN-LAST:event_btn_AddStateActionPerformed

    private void btn_AddComplaintsRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddComplaintsRegActionPerformed
        String str = "";
        PopupList pl = new PopupList(this, true, "Жалобы (дневник)", getClass().getResourceAsStream("/txt/diary/1_compl.txt"), 2);
        pl.setVisible(true);
        if (pl.getStr() != null) {
            str = pl.getStr();
            txt_RegComplaints.setText(str);
        }
    }//GEN-LAST:event_btn_AddComplaintsRegActionPerformed

    private void btn_AddStatusRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddStatusRegActionPerformed
        String str = "";
        PopupList pl = new PopupList(this, true, "Состояние", getClass().getResourceAsStream("/txt/diary/2_status.txt"), 2);
        pl.setVisible(true);
        if (pl.getStr() != null) {
            str = pl.getStr();
            txt_RegStatus.setText(str);
        }
    }//GEN-LAST:event_btn_AddStatusRegActionPerformed

    private void btn_AddTemperatureRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddTemperatureRegActionPerformed
        String str = "";
        PopupList pl = new PopupList(this, true, "Температура", getClass().getResourceAsStream("/txt/diary/3_temperature.txt"), 2);
        pl.setVisible(true);
        if (pl.getStr() != null) {
            str = pl.getStr();
            txt_RegTemperature.setText(str);
        }
    }//GEN-LAST:event_btn_AddTemperatureRegActionPerformed

    private void btn_AddBreathRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddBreathRegActionPerformed
        String str = "";
        PopupList pl = new PopupList(this, true, "Дыхание", getClass().getResourceAsStream("/txt/diary/4_breath.txt"), 2);
        pl.setVisible(true);
        if (pl.getStr() != null) {
            str = pl.getStr();
            txt_RegBreath.setText(str);
        }
    }//GEN-LAST:event_btn_AddBreathRegActionPerformed

    private void btn_AddHeartRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddHeartRegActionPerformed
        String str = "";
        PopupList pl = new PopupList(this, true, "Тоны сердца", getClass().getResourceAsStream("/txt/diary/5_heart.txt"), 2);
        pl.setVisible(true);
        if (pl.getStr() != null) {
            str = pl.getStr();
            txt_RegHeart.setText(str);
        }
    }//GEN-LAST:event_btn_AddHeartRegActionPerformed

    private void btn_AddPressureRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddPressureRegActionPerformed
        String str = "";
        PopupList pl = new PopupList(this, true, "Давление", getClass().getResourceAsStream("/txt/diary/6_pres.txt"), 2);
        pl.setVisible(true);
        if (pl.getStr() != null) {
            str = pl.getStr();
            txt_RegPressure.setText(str);
        }
    }//GEN-LAST:event_btn_AddPressureRegActionPerformed

    private void btn_AddPulseRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddPulseRegActionPerformed
        String str = "";
        PopupList pl = new PopupList(this, true, "Пульс", getClass().getResourceAsStream("/txt/diary/7_pulse.txt"), 2);
        pl.setVisible(true);
        if (pl.getStr() != null) {
            str = pl.getStr();
            txt_RegPulse.setText(str);
        }
    }//GEN-LAST:event_btn_AddPulseRegActionPerformed

    private void btn_CreateDiaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CreateDiaryActionPerformed
        StringBuilder sb = new StringBuilder();

        sb.append("Жалобы: " + txt_RegComplaints.getText() + " Объективные данные:");
        sb.append("Общее состояние: " + txt_RegStatus.getText() + " ");
        sb.append("Температура тела: " + txt_RegTemperature.getText() + " ");
        sb.append("Кожные покровы: " + txt_RegSkin.getText() + " ");
        sb.append(txt_RegHeart.getText() + " ");
        sb.append(txt_RegBreath.getText() + " ");
        sb.append(" Язык влажный. Живот мягкий, безболезненный. Печень, селезёнка не увеличены. Симптом поколачивания отрицательный с обеих сторон."
                + "Периферических отёков нет. Физиологические оправления в норме.");
        sb.append("\nПосле инфузии состояние удовлетворительное. Гемодинамика стабильная. Пациент(-ка) отпущен(а) домой в удовлетворительном"
                + "состоянии. Лечение продолжить в полном объеме.");

        txtArea_Diary.setText(sb.toString());
    }//GEN-LAST:event_btn_CreateDiaryActionPerformed

    private void btn_AddSkinRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddSkinRegActionPerformed
        String str = "";
        PopupList pl = new PopupList(this, true, "Покровы тела", getClass().getResourceAsStream("/txt/osmotr/pokrovy.txt"), 2);
        pl.setVisible(true);
        if (pl.getStr() != null) {
            str = pl.getStr();
            txt_RegSkin.setText(str);
        }
    }//GEN-LAST:event_btn_AddSkinRegActionPerformed

    private void list_patientsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_list_patientsValueChanged
        Patient tmp = list_patients.getSelectedValue();
        if (!evt.getValueIsAdjusting()) {
            if (tmp != null && !tmp.equals(currentPatient)) {
                currentPatient = tmp;
                clearFields(0);
                loadPatient(currentPatient);
                setPatientFieldsEnabled(true);
                setExamFieldsEnabled(false);
                setProcFieldsEnabled(false);
                fillExaminationList();
                tool_id.setText("ID: " + currentPatient.getId());
            }
        }
    }//GEN-LAST:event_list_patientsValueChanged
    private void searchFilter(String searchTerm) {
        DefaultListModel<Patient> filteredItems = new DefaultListModel<>();

        patients.stream().forEach((pat) -> {
            if (pat.getName().toLowerCase().contains(searchTerm.toLowerCase())
                    || pat.getSurname().toLowerCase().contains(searchTerm.toLowerCase())
                    || pat.getPatronymic().toLowerCase().contains(searchTerm.toLowerCase())) {
                filteredItems.addElement(pat);
            }
        });
        listModel = filteredItems;
        list_patients.setModel(listModel);
    }

    private void chooseDiagnosis(int number) {
        String code = "";
        String info = "";
        List<String[]> l;
        PopupList pl = new PopupList(this, true, "Диагнозы", getClass().getResourceAsStream("/txt/diagnoses.txt"), 3);
        pl.setVisible(true);
        if (pl.getDiagnoses() != null) {
            l = pl.getDiagnoses();
            for (String[] arr : l) {
                code += arr[0] + " ";
                info += arr[1] + " ";
            }
            switch (number) {
                case (0):
                    txt_RefDiagnosisCode.setText(code);
                    txtArea_RefDiagnosis.setText(info);
                    break;
                case (1):
                    txt_AdmisDiagnosisCode.setText(code);
                    txtArea_AdmisDiagnosis.setText(info);
                    break;
                case (2):
                    txt_ProvisDiagnosisCode.setText(code);
                    txtArea_ProvisDiagnosis.setText(info);
                    break;
                case (3):
                    txt_MainDiagnosisCode.setText(code);
                    txtArea_MainDiagnosis.setText(info);
                    break;
                case (4):
                    txt_ComplDiagnosisCode.setText(code);
                    txtArea_ComplDiagnosis.setText(info);
                    break;
                case (5):
                    txt_Comorbidity.setText(code);
                    txtArea_Comorbidity.setText(info);
                    break;
            }
        }
    }

    private void chooseProcedureType(int number) {
        String str = "";
        PopupList pl = new PopupList(this, true, "Вид процедуры", getClass().getResourceAsStream("/txt/9_procedures.txt"), 0);
        pl.setVisible(true);
        if (pl.getStr() != null) {
            str = pl.getStr();

            switch (number) {
                case (1):
                    txt_proc1.setText(str);
                    break;
                case (2):
                    txt_proc2.setText(str);
                    break;
                case (3):
                    txt_proc3.setText(str);
                    break;
                case (4):
                    txt_proc4.setText(str);
                    break;
                case (5):
                    txt_proc5.setText(str);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ошибка при добавлении процедуры: неверный номер");
                    break;
            }
        }
    }

    // Заполнение полей процедур с помощью всплывающего окна
    private void chooseProcedure(int number) {
        String str = "";
        PopupList pl = new PopupList(this, true, "Лекарственный препарат", getClass().getResourceAsStream("/txt/10_drugs.txt"), 2);
        pl.setVisible(true);
        if (pl.getSb() != null) {
            str = pl.getSb().toString();

            switch (number) {
                case (1):
                    txtArea_Procedure1.append(str);
                    break;
                case (2):
                    txtArea_Procedure2.append(str);
                    break;
                case (3):
                    txtArea_Procedure3.append(str);
                    break;
                case (4):
                    txtArea_Procedure4.append(str);
                    break;
                case (5):
                    txtArea_Procedure5.append(str);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ошибка при добавлении процедуры: неверный номер");
                    break;
            }
        }
    }

    private void deletePatient() {
        String sql = "delete from patient_info where id = ?";
        String deletePatientMessage = "Все данные о пациенте \"" + currentPatient.getSurname() + " " + currentPatient.getName() + " " + currentPatient.getPatronymic() + "\" будут удалены\nУдалить пациента?";
        String confirmDelete = "Запись о пациенте \"" + currentPatient.getSurname() + " " + currentPatient.getName() + " " + currentPatient.getPatronymic() + "\" удалена";

        Object[] options = {"Да", "Нет"};
        int opt = JOptionPane.showOptionDialog(null, deletePatientMessage, "Удаление пациента", JOptionPane.YES_NO_OPTION, 0, null, options, options[0]);
        if (opt == 0) {
            try (PreparedStatement ps = connection.prepareStatement(sql)) {
                ps.setInt(1, (int) currentPatient.getId());
                ps.execute();

                JOptionPane.showMessageDialog(null, confirmDelete, null, JOptionPane.INFORMATION_MESSAGE);

                clearFields(0);
                fillPatientList();
                cb_visitDate.removeAllItems();
                cb_proc.removeAllItems();
                cb_visitDate.setSelectedIndex(-1);
                cb_proc.setSelectedIndex(-1);
                currentPatient = null;
                currentExamination = null;
                currentProcedure = null;
                setPatientFieldsEnabled(false);
                setExamFieldsEnabled(false);
                setProcFieldsEnabled(false);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }

    private void deleteExamination() {
        String sql = "delete from examination where id = ?";
        String deleteExamMessage = "Все данные о курсе лечения " + currentExamination.getExamDate() + " будут удалены\nУдалить запись?";
        String confirmDelete = "Запись о курсе лечения " + currentExamination.getExamDate() + " удалена";

        Object[] options = {"Да", "Нет"};
        int opt = JOptionPane.showOptionDialog(null, deleteExamMessage, "Удаление курса лечения", JOptionPane.YES_NO_OPTION, 0, null, options, options[0]);
        if (opt == 0) {
            try (PreparedStatement ps = connection.prepareStatement(sql)) {
                ps.setInt(1, (int) currentExamination.getId());
                ps.execute();

                JOptionPane.showMessageDialog(null, confirmDelete, null, JOptionPane.INFORMATION_MESSAGE);

                currentPatient.getExaminationsList().remove(currentExamination);
                cb_visitDate.removeAllItems();
                cb_visitDate.setSelectedIndex(-1);
                cb_proc.setSelectedIndex(-1);
                clearFields(1);
                setExamFieldsEnabled(false);
                setProcFieldsEnabled(false);
                currentExamination = null;
                currentProcedure = null;
                fillExaminationList();
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }

    private void deleteProcedure() {
        String sql = "delete from procedure where id = ?";
        String deleteProcMessage = "Все данные о процедурах " + currentProcedure.getDate() + " будут удалены\nУдалить запись?";
        String confirmDelete = "Запись о процедурах " + currentProcedure.getDate() + " удалена";

        Object[] options = {"Да", "Нет"};
        int opt = JOptionPane.showOptionDialog(null, deleteProcMessage, "Удаление посещения", JOptionPane.YES_NO_OPTION, 0, null, options, options[0]);
        if (opt == 0) {
            try (PreparedStatement ps = connection.prepareStatement(sql)) {
                ps.setInt(1, (int) currentProcedure.getId());
                ps.execute();

                JOptionPane.showMessageDialog(null, confirmDelete, null, JOptionPane.INFORMATION_MESSAGE);

                currentExamination.getProceduresList().remove(currentProcedure);
                cb_proc.removeAllItems();
                cb_proc.setSelectedIndex(-1);
                setProcFieldsEnabled(false);
                clearFields(2);
                fillProcedureList();
                currentProcedure = null;
                

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }

    // Перенос процедуры из плана лечения в регистрацию процедур
    private void moveProcedure(int number) {
        switch (number) {
            case (1):
                txt_RegProcedure1.setText(txt_proc1.getText());
                txtArea_RegProcedure1.setText(txtArea_Procedure1.getText());
                break;
            case (2):
                txt_RegProcedure2.setText(txt_proc2.getText());
                txtArea_RegProcedure2.setText(txtArea_Procedure2.getText());
                break;
            case (3):
                txt_RegProcedure3.setText(txt_proc3.getText());
                txtArea_RegProcedure3.setText(txtArea_Procedure3.getText());
                break;
            case (4):
                txt_RegProcedure4.setText(txt_proc4.getText());
                txtArea_RegProcedure4.setText(txtArea_Procedure4.getText());
                break;
            case (5):
                txt_RegProcedure5.setText(txt_proc5.getText());
                txtArea_RegProcedure5.setText(txtArea_Procedure5.getText());
                break;
            default:
                JOptionPane.showMessageDialog(null, "Ошибка при добавлении процедуры: неверный номер");
                break;
        }
    }

    // Добавить новый осмотр(поступление) в базу данных
    private void addExamination(LocalDate date) {
        if (cb_visitDate.isEnabled() == false) {
            cb_visitDate.setEnabled(true);
        }
        String dateStr = convertDateToString(date);
        String sql = "insert into examination (patient_id, exam_date) values (?,?)";

        try (PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setString(1, Integer.toString(currentPatient.getId()));
            ps.setString(2, dateStr);
            int affectedRows = ps.executeUpdate();
            if (affectedRows == 0) {
                throw new SQLException("Ошибка при создании нового посещения.");
            }
            try (ResultSet generatedKeys = ps.getGeneratedKeys();) {
                if (generatedKeys.next()) {
                    Examination newExamination = new Examination();
                    newExamination.setId(generatedKeys.getInt(1));
                    newExamination.setExamDate(dateStr);
                    currentExamination = newExamination;
                    currentPatient.getExaminationsList().add(currentExamination);
                } else {
                    throw new SQLException("Ошибка при получении ID нового посещения");
                }
                fillExaminationList();
                clearFields(1);
                cb_visitDate.setSelectedItem(currentExamination);
                loadExamination(currentExamination);
                setExamFieldsEnabled(true);
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null, exception);
        }
    }

    private void addProcedure(LocalDate date) {
        if (cb_proc.isEnabled() == false) {
            cb_proc.setEnabled(true);
        }
        
        String dateStr = convertDateToString(date);
        String sql = "insert into procedure (date, exam_id) values(?,?)";

        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, dateStr);
            ps.setString(2, Long.toString(currentExamination.getId()));
            int affectedRows = ps.executeUpdate();
            if (affectedRows == 0) {
                throw new SQLException("Ошибка при создании новой записи о процедурах.");
            }
            Procedure p = new Procedure();
            try (ResultSet generatedKeys = ps.getGeneratedKeys();) {
                if (generatedKeys.next()) {
                    p.setId(generatedKeys.getInt(1));
                    p.setDate(dateStr);
                    currentProcedure = p;
                } else {
                    throw new SQLException("Ошибка при получении ID нового посещения");
                }
                currentExamination.getProceduresList().add(currentProcedure);
                currentExamination.setCurrentProcedure(currentProcedure);
                fillProcedureList();
                clearFields(2);
                cb_proc.setSelectedItem(currentProcedure);
                loadProcedure(currentProcedure);
                setProcFieldsEnabled(true);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void clearFields(int num) {

        // 0 - очистить все поля: patientInfo, examination, procedure
        // 1 - очистить examination & procedure
        // другие числа - procedure очищается в любом случае
        txt_RegProcedure1.setText("");
        txtArea_RegProcedure1.setText("");
        txt_RegProcedure2.setText("");
        txtArea_RegProcedure2.setText("");
        txt_RegProcedure3.setText("");
        txtArea_RegProcedure3.setText("");
        txt_RegProcedure4.setText("");
        txtArea_RegProcedure4.setText("");
        txt_RegProcedure5.setText("");
        txtArea_RegProcedure5.setText("");
        txtArea_DiaryAdditional.setText("");
        txtArea_Diary.setText("");
        txt_timeStart.setText("");
        txt_timeEnd.setText("");
        txt_RegComplaints.setText("");
        txt_RegStatus.setText("");
        txt_RegTemperature.setText("");
        txt_RegSkin.setText("");
        txt_RegBreath.setText("");
        txt_RegHeart.setText("");
        txt_RegPressure.setText("");
        txt_RegPulse.setText("");

        if (num == 0 || num == 1) {
            // Вкладка Общее
            txt_refSurname.setText("");
            txt_refPos.setText("");
            date_admission.clear();
            date_diseaseOnset.clear();
            date_discharge.clear();
            txt_historyNum.setText("");
            txt_sideEffect.setText("");
            txt_days.setText("");
            txt_timeAdmis.setText("");
            check_Termination.setSelected(false);
            check_Emergency.setSelected(false);
            cb_Result.setSelectedIndex(-1);
            // Вкладка Диагнозы
            txt_RefDiagnosisCode.setText("");
            txtArea_RefDiagnosis.setText("");
            txt_AdmisDiagnosisCode.setText("");
            txtArea_AdmisDiagnosis.setText("");
            txt_ProvisDiagnosisCode.setText("");
            txtArea_ProvisDiagnosis.setText("");
            txt_MainDiagnosisCode.setText("");
            txtArea_MainDiagnosis.setText("");
            txt_ComplDiagnosisCode.setText("");
            txtArea_ComplDiagnosis.setText("");
            txt_Comorbidity.setText("");
            txtArea_Comorbidity.setText("");
            // Вкладка Протокол
            txtArea_Complaints.setText("");
            txtArea_AnamnesisDis.setText("");
            txtArea_AnamnesisLife.setText("");
            txt_heredity.setText("");
            txt_habits.setText("");
            // Вкладка Осмотр
            txt_height.setText("");
            txt_weight.setText("");
            txt_imt.setText("");
            txt_state.setText("");
            txt_fizRaz.setText("");
            txt_defRaz.setText("");
            txt_telo.setText("");
            txt_pitanie.setText("");
            txt_pokrovy.setText("");
            txt_limfSyst.setText("");
            txt_mishSyst.setText("");
            txt_svyazSust.setText("");
            txt_serdSosud.setText("");
            txt_legDih.setText("");
            txt_pischevarenie.setText("");
            txt_mochepolovayaSyst.setText("");
            txt_nervSyst.setText("");
            txt_organiChuvstv.setText("");
            txt_sekrecia.setText("");
            txtArea_ExaminationResults.setText("");
            // Вкладка План лечения
            txt_proc1.setText("");
            txt_ProcedureNum1.setText("");
            txtArea_Procedure1.setText("");
            txt_proc2.setText("");
            txt_ProcedureNum2.setText("");
            txtArea_Procedure2.setText("");
            txt_proc3.setText("");
            txt_ProcedureNum3.setText("");
            txtArea_Procedure3.setText("");
            txt_proc4.setText("");
            txt_ProcedureNum4.setText("");
            txtArea_Procedure4.setText("");
            txt_proc5.setText("");
            txt_ProcedureNum5.setText("");
            txtArea_Procedure5.setText("");
            // Вкладка Эпикриз
            txtArea_ComplaintsEpik.setText("");
            txtArea_Outcome.setText("");
            txtArea_Recommedations.setText("");
            txtArea_ObjStatus.setText("");

            if (num == 0) {
                txt_name.setText("");
                txt_surname.setText("");
                txt_patronymic.setText("");
                buttonGroup1.clearSelection();
                date_birth.clear();
                txt_medbook.setText("");
                cb_rank.setSelectedIndex(-1);
                cb_contingent.setSelectedIndex(-1);
                cb_service.setSelectedIndex(-1);
                txt_phone.setText("");
                txt_confidant.setText("");
                txt_policy.setText("");
                txt_addressLive.setText("");
                txt_addressWork.setText("");
                txtArea_pastIllness.setText("");
                txtArea_allergicAnamnesis.setText("");
            }
        }
    }

    private void saveAllData() {

        currentPatient.setName(txt_name.getText());
        currentPatient.setSurname(txt_surname.getText());
        currentPatient.setPatronymic(txt_patronymic.getText());
        currentPatient.setBirthday(date_birth.getDate() == null ? "" : convertDateToString(date_birth.getDate()));
        currentPatient.setMedBook(txt_medbook.getText());

        currentPatient.setMilitaryRank((String) cb_rank.getSelectedItem());
        currentPatient.setContingent((String) cb_contingent.getSelectedItem());
        currentPatient.setService((String) cb_service.getSelectedItem());
        currentPatient.setPhoneNumber(txt_phone.getText());
        currentPatient.setConfidant(txt_confidant.getText());
        currentPatient.setPolicy(txt_policy.getText());

        currentPatient.setAddressLive(txt_addressLive.getText());
        currentPatient.setAddressWork(txt_addressWork.getText());
        currentPatient.setPastIllness(txtArea_pastIllness.getText());
        currentPatient.setAllergicAnamnesis(txtArea_allergicAnamnesis.getText());

        // SQL запрос персональной информации
        String savePatInfo = "update patient_info set name='" + currentPatient.getName() + "',surname='" + currentPatient.getSurname() + "',patronymic='" + currentPatient.getPatronymic()
                + "', gender='" + currentPatient.getGender() + "', birth='" + currentPatient.getBirthday() + "', med_book='" + currentPatient.getMedBook() + "', military_rank='" + currentPatient.getMilitaryRank()
                + "',contingent='" + currentPatient.getContingent() + "', service='" + currentPatient.getService() + "', phone_number='" + currentPatient.getPhoneNumber()
                + "', confidant='" + currentPatient.getConfidant() + "', policy ='" + currentPatient.getPolicy() + "', address_live='" + currentPatient.getAddressLive()
                + "',address_work='" + currentPatient.getAddressWork() + "',past_illness='" + currentPatient.getPastIllness() + "', allergic_anamnesis='" + currentPatient.getAllergicAnamnesis()
                + "' where id =" + currentPatient.getId();

        // Выполнение SQL запросов
        try (PreparedStatement ps = connection.prepareStatement(savePatInfo)) {
            ps.executeUpdate();
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null, exception);
            exception.printStackTrace();
        }
        if (currentExamination != null) {
            saveExamData();
        }

        if (currentProcedure != null) {
            saveProcData();
        }
    }

    private void saveExamData() {

        // Поля блока "Курс"
        currentExamination.setRefDocSurname(txt_refSurname.getText());
        currentExamination.setRefDocPosition(txt_refPos.getText());

        currentExamination.setDiseaseOnset(date_diseaseOnset.getDate() == null ? "" : convertDateToString(date_diseaseOnset.getDate()));
        currentExamination.setAdmissionDate(date_admission.getDate() == null ? "" : convertDateToString(date_admission.getDate()));
        currentExamination.setDischargeDate(date_discharge.getDate() == null ? "" : convertDateToString(date_discharge.getDate()));

        currentExamination.setHistory(txt_historyNum.getText());
        currentExamination.setSideEffect(txt_sideEffect.getText());
        currentExamination.setDays(txt_days.getText());
        currentExamination.setTime(txt_timeAdmis.getText());
        currentExamination.setRefDiagnosisCode(txt_RefDiagnosisCode.getText());
        currentExamination.setRefDiagnosisInfo(txtArea_RefDiagnosis.getText());
        currentExamination.setAdmisDiagnosisCode(txt_AdmisDiagnosisCode.getText());
        currentExamination.setAdmisDiagnosisInfo(txtArea_AdmisDiagnosis.getText());
        currentExamination.setProvisDiagnosisCode(txt_ProvisDiagnosisCode.getText());
        currentExamination.setProvisDiagnosisInfo(txtArea_ProvisDiagnosis.getText());
        currentExamination.setMainDiagnosisCode(txt_MainDiagnosisCode.getText());
        currentExamination.setMainDiagnosisInfo(txtArea_MainDiagnosis.getText());
        currentExamination.setComplDiagnosisCode(txt_ComplDiagnosisCode.getText());
        currentExamination.setComplDiagnosisInfo(txtArea_ComplDiagnosis.getText());
        currentExamination.setComorbidityCode(txt_Comorbidity.getText());
        currentExamination.setComorbidityInfo(txtArea_Comorbidity.getText());
        currentExamination.setResult((String) cb_Result.getSelectedItem());
        currentExamination.setTermination(check_Termination.isSelected() ? "true" : "false");
        currentExamination.setEmergency(check_Emergency.isSelected() ? "true" : "false");

        // Поля раздела "Протокол"
        currentExamination.setComplaints(txtArea_Complaints.getText());
        currentExamination.setAnamnesisOfDisease(txtArea_AnamnesisDis.getText());
        currentExamination.setAnamnesisOfLife(txtArea_AnamnesisLife.getText());
        currentExamination.setHeredity(txt_heredity.getText());
        currentExamination.setHabits(txt_habits.getText());

        // Поля раздела "Осмотр"
        currentExamination.setHeight(txt_height.getText());
        currentExamination.setWeight(txt_weight.getText());
        currentExamination.setImt(txt_imt.getText());
        currentExamination.setState(txt_state.getText());
        currentExamination.setFizRaz(txt_fizRaz.getText());
        currentExamination.setDefRaz(txt_defRaz.getText());
        currentExamination.setTelo(txt_telo.getText());
        currentExamination.setPitanie(txt_pitanie.getText());
        currentExamination.setPokrovy(txt_pokrovy.getText());
        currentExamination.setLimfSyst(txt_limfSyst.getText());
        currentExamination.setMishSyst(txt_mishSyst.getText());
        currentExamination.setSvyazSust(txt_svyazSust.getText());
        currentExamination.setSerdSosud(txt_serdSosud.getText());
        currentExamination.setLegDih(txt_legDih.getText());
        currentExamination.setPischevarenie(txt_pischevarenie.getText());
        currentExamination.setMochepolovayaSyst(txt_mochepolovayaSyst.getText());
        currentExamination.setNervSyst(txt_nervSyst.getText());
        currentExamination.setOrganiChuvstv(txt_organiChuvstv.getText());
        currentExamination.setSekrecia(txt_sekrecia.getText());
        currentExamination.setExaminationResults(txtArea_ExaminationResults.getText());

        // Поля раздела "План лечения"
        currentExamination.setProcType1(txt_proc1.getText());
        currentExamination.setProcType2(txt_proc2.getText());
        currentExamination.setProcType3(txt_proc3.getText());
        currentExamination.setProcType4(txt_proc4.getText());
        currentExamination.setProcType5(txt_proc5.getText());
        currentExamination.setProcAmount1(txt_ProcedureNum1.getText());
        currentExamination.setProcAmount2(txt_ProcedureNum2.getText());
        currentExamination.setProcAmount3(txt_ProcedureNum3.getText());
        currentExamination.setProcAmount4(txt_ProcedureNum4.getText());
        currentExamination.setProcAmount5(txt_ProcedureNum5.getText());
        currentExamination.setProc1(txtArea_Procedure1.getText());
        currentExamination.setProc2(txtArea_Procedure2.getText());
        currentExamination.setProc3(txtArea_Procedure3.getText());
        currentExamination.setProc4(txtArea_Procedure4.getText());
        currentExamination.setProc5(txtArea_Procedure5.getText());

        // Поля раздела "Эпикриз"
        currentExamination.setComplEpik(txtArea_ComplaintsEpik.getText());
        currentExamination.setOutcome(txtArea_Outcome.getText());
        currentExamination.setRecommendations(txtArea_Recommedations.getText());
        currentExamination.setObjStatus(txtArea_ObjStatus.getText());

        // SQL запрос осмотра
        String saveExamInfo = "update examination set exam_date='" + currentExamination.getExamDate() + "', ref_doc_surname='" + currentExamination.getRefDocSurname() + "', ref_doc_position='" + currentExamination.getRefDocPosition()
                + "', disease_onset='" + currentExamination.getDiseaseOnset() + "', admission_date='" + currentExamination.getAdmissionDate() + "', discharge_date='" + currentExamination.getDischargeDate()
                + "', history='" + currentExamination.getHistory() + "', side_effect='" + currentExamination.getSideEffect() + "', days='" + currentExamination.getDays() + "', time='" + currentExamination.getTime()
                + "', ref_diagnosis_code='" + currentExamination.getRefDiagnosisCode() + "', ref_diagnosis_info='" + currentExamination.getRefDiagnosisInfo() + "', admis_diagnosis_code='" + currentExamination.getAdmisDiagnosisCode()
                + "', admis_diagnosis_info='" + currentExamination.getAdmisDiagnosisInfo() + "', provis_diagnosis_code='" + currentExamination.getProvisDiagnosisCode() + "', provis_diagnosis_info='" + currentExamination.getProvisDiagnosisInfo()
                + "', main_diagnosis_code='" + currentExamination.getMainDiagnosisCode() + "', main_diagnosis_info='" + currentExamination.getMainDiagnosisInfo() + "', compl_diagnosis_code='" + currentExamination.getComplDiagnosisCode()
                + "', compl_diagnosis_info='" + currentExamination.getComplDiagnosisInfo() + "', comorbidity_code='" + currentExamination.getComorbidityCode() + "', comorbidity_info='" + currentExamination.getComorbidityInfo()
                + "', result='" + currentExamination.getResult() + "', termination='" + (check_Termination.isSelected() ? "true" : "false") + "', emergency='" + (check_Emergency.isSelected() ? "true" : "false")
                + "', complaints='" + currentExamination.getComplaints() + "', anamnesis_of_disease='" + currentExamination.getAnamnesisOfDisease() + "', anamnesis_of_life='" + currentExamination.getAnamnesisOfLife()
                + "', heredity='" + currentExamination.getHeredity() + "', habits='" + currentExamination.getHabits() + "', height='" + currentExamination.getHeight() + "', weight='" + currentExamination.getWeight()
                + "', imt='" + currentExamination.getImt() + "', state='" + currentExamination.getState() + "', fiz_raz='" + currentExamination.getFizRaz() + "', def_raz='" + currentExamination.getDefRaz()
                + "', telo='" + currentExamination.getTelo() + "', pitanie='" + currentExamination.getPitanie() + "', pokrovy='" + currentExamination.getPokrovy() + "', limf_syst='" + currentExamination.getLimfSyst()
                + "', mish_syst='" + currentExamination.getMishSyst() + "', svyaz_sust='" + currentExamination.getSvyazSust() + "', serd_sosud='" + currentExamination.getSerdSosud() + "', leg_dih='" + currentExamination.getLegDih()
                + "', pischevarenie='" + currentExamination.getPischevarenie() + "', mochepolovaya_syst='" + currentExamination.getMochepolovayaSyst() + "', nerv_syst='" + currentExamination.getNervSyst()
                + "', organi_chuvstv='" + currentExamination.getOrganiChuvstv() + "', sekrecia='" + currentExamination.getSekrecia() + "', examination_results='" + currentExamination.getExaminationResults()
                + "', proc_type1='" + currentExamination.getProcType1() + "', proc_amount1='" + currentExamination.getProcAmount1() + "', proc1='" + currentExamination.getProc1() + "', proc_type2='" + currentExamination.getProcType2()
                + "', proc_amount2='" + currentExamination.getProcAmount2() + "', proc2='" + currentExamination.getProc2() + "', proc_type3='" + currentExamination.getProcType3() + "', proc_amount3='" + currentExamination.getProcAmount3()
                + "', proc3='" + currentExamination.getProc3() + "', proc_type4='" + currentExamination.getProcType4() + "', proc_amount4='" + currentExamination.getProcAmount4() + "', proc4='" + currentExamination.getProc4()
                + "', proc_type5='" + currentExamination.getProcType5() + "', proc_amount5='" + currentExamination.getProcAmount5() + "', proc5='" + currentExamination.getProc5() + "', compl_epik='" + currentExamination.getComplEpik()
                + "', outcome='" + currentExamination.getOutcome() + "', recommendations='" + currentExamination.getRecommendations() + "', obj_status='" + currentExamination.getObjStatus() + "'"
                + " where id = " + currentExamination.getId();

        try (PreparedStatement ps = connection.prepareStatement(saveExamInfo)) {
            ps.executeUpdate();
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null, exception);
            exception.printStackTrace();
        }
    }

    private void saveProcData() {

        currentProcedure.setDiary(txtArea_Diary.getText());
        currentProcedure.setDiaryAdd(txtArea_DiaryAdditional.getText());
        currentProcedure.setComplaintDiary(txt_RegComplaints.getText());
        currentProcedure.setTimeStart(txt_timeStart.getText());
        currentProcedure.setTimeEnd(txt_timeEnd.getText());
        currentProcedure.setStatus(txt_RegStatus.getText());
        currentProcedure.setTemperature(txt_RegTemperature.getText());
        currentProcedure.setSkin(txt_RegSkin.getText());
        currentProcedure.setBreath(txt_RegBreath.getText());
        currentProcedure.setHeart(txt_RegHeart.getText());
        currentProcedure.setPressure(txt_RegPressure.getText());
        currentProcedure.setPulse(txt_RegPulse.getText());
        currentProcedure.setProcType1(txtArea_RegProcedure1.getText());
        currentProcedure.setProcType2(txtArea_RegProcedure2.getText());
        currentProcedure.setProcType3(txtArea_RegProcedure3.getText());
        currentProcedure.setProcType4(txtArea_RegProcedure4.getText());
        currentProcedure.setProcType5(txtArea_RegProcedure5.getText());
        currentProcedure.setProc1(txt_RegProcedure1.getText());
        currentProcedure.setProc2(txt_RegProcedure2.getText());
        currentProcedure.setProc3(txt_RegProcedure3.getText());
        currentProcedure.setProc4(txt_RegProcedure4.getText());
        currentProcedure.setProc5(txt_RegProcedure5.getText());

        String saveProcInfo = "update procedure set diary='" + currentProcedure.getDiary() + "', diary_add='" + currentProcedure.getDiaryAdd() + "', complaints_diary='" + currentProcedure.getComplaintDiary()
                + "', time_start='" + currentProcedure.getTimeStart() + "', time_end='" + currentProcedure.getTimeEnd() + "', status='" + currentProcedure.getStatus() + "', temperature='" + currentProcedure.getTemperature()
                + "', skin='" + currentProcedure.getSkin() + "', breath='" + currentProcedure.getBreath() + "', heart='" + currentProcedure.getHeart() + "', pressure='" + currentProcedure.getPressure()
                + "', pulse='" + currentProcedure.getPulse() + "', proc_type1='" + currentProcedure.getProcType1() + "', proc_type2='" + currentProcedure.getProcType2() + "', proc_type3='" + currentProcedure.getProcType3()
                + "', proc_type4='" + currentProcedure.getProcType4() + "', proc_type5='" + currentProcedure.getProcType5() + "',proc1='" + currentProcedure.getProc1() + "', proc2='" + currentProcedure.getProc2()
                + "', proc3='" + currentProcedure.getProc3() + "', proc4='" + currentProcedure.getProc4() + "', proc5='" + currentProcedure.getProc5()
                + "' where id = " + currentProcedure.getId();

        try (PreparedStatement ps = connection.prepareStatement(saveProcInfo)) {
            ps.executeUpdate();
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null, exception);
            exception.printStackTrace();
        }
    }

    private void fillExaminationFields() {
        label_currentExamId.setText("ID: " + currentExamination.getId());
        cb_visitDate.setSelectedItem(currentExamination.getExamDate());
        txt_refSurname.setText(currentExamination.getRefDocSurname());
        txt_refPos.setText(currentExamination.getRefDocPosition());
        date_diseaseOnset.setText(currentExamination.getDiseaseOnset());
        date_admission.setText(currentExamination.getAdmissionDate());
        date_discharge.setText(currentExamination.getDischargeDate());
        txt_historyNum.setText(currentExamination.getHistory());
        txt_sideEffect.setText(currentExamination.getSideEffect());
        txt_days.setText(currentExamination.getDays());
        txt_timeAdmis.setText(currentExamination.getTime());
        txt_RefDiagnosisCode.setText(currentExamination.getRefDiagnosisCode());
        txtArea_RefDiagnosis.setText(currentExamination.getRefDiagnosisInfo());
        txt_AdmisDiagnosisCode.setText(currentExamination.getAdmisDiagnosisCode());
        txtArea_AdmisDiagnosis.setText(currentExamination.getAdmisDiagnosisInfo());
        txt_ProvisDiagnosisCode.setText(currentExamination.getProvisDiagnosisCode());
        txtArea_ProvisDiagnosis.setText(currentExamination.getProvisDiagnosisInfo());
        txt_MainDiagnosisCode.setText(currentExamination.getMainDiagnosisCode());
        txtArea_MainDiagnosis.setText(currentExamination.getMainDiagnosisInfo());
        txt_ComplDiagnosisCode.setText(currentExamination.getComplDiagnosisCode());
        txtArea_ComplDiagnosis.setText(currentExamination.getComplDiagnosisInfo());
        txt_Comorbidity.setText(currentExamination.getComorbidityCode());
        txtArea_Comorbidity.setText(currentExamination.getComorbidityInfo());
        cb_Result.setSelectedItem(currentExamination.getResult());
        if (currentExamination.getTermination() != null && currentExamination.getTermination().equals("true")) {
            check_Termination.setSelected(true);
        }
        if (currentExamination.getEmergency() != null && currentExamination.getEmergency().equals("true")) {
            check_Emergency.setSelected(true);
        }

        // Поля раздела Протокол
        txtArea_Complaints.setText(currentExamination.getComplaints());
        txtArea_AnamnesisDis.setText(currentExamination.getAnamnesisOfDisease());
        txtArea_AnamnesisLife.setText(currentExamination.getAnamnesisOfLife());
        txt_heredity.setText(currentExamination.getHeredity());
        txt_habits.setText(currentExamination.getHabits());

        // Поля раздела Осмотр
        txt_height.setText(currentExamination.getHeight());
        txt_weight.setText(currentExamination.getWeight());
        txt_imt.setText(currentExamination.getImt());
        txt_state.setText(currentExamination.getState());
        txt_fizRaz.setText(currentExamination.getFizRaz());
        txt_defRaz.setText(currentExamination.getDefRaz());
        txt_telo.setText(currentExamination.getTelo());
        txt_pitanie.setText(currentExamination.getPitanie());
        txt_pokrovy.setText(currentExamination.getPokrovy());
        txt_limfSyst.setText(currentExamination.getLimfSyst());
        txt_mishSyst.setText(currentExamination.getMishSyst());
        txt_svyazSust.setText(currentExamination.getSvyazSust());
        txt_serdSosud.setText(currentExamination.getSerdSosud());
        txt_legDih.setText(currentExamination.getLegDih());
        txt_pischevarenie.setText(currentExamination.getPischevarenie());
        txt_mochepolovayaSyst.setText(currentExamination.getMochepolovayaSyst());
        txt_nervSyst.setText(currentExamination.getNervSyst());
        txt_organiChuvstv.setText(currentExamination.getOrganiChuvstv());
        txt_sekrecia.setText(currentExamination.getSekrecia());
        txtArea_ExaminationResults.setText(currentExamination.getExaminationResults());

        // Поля раздела План лечения
        txt_proc1.setText(currentExamination.getProcType1());
        txt_ProcedureNum1.setText(currentExamination.getProcAmount1());
        txtArea_Procedure1.setText(currentExamination.getProc1());
        txt_proc2.setText(currentExamination.getProcType2());
        txt_ProcedureNum2.setText(currentExamination.getProcAmount2());
        txtArea_Procedure2.setText(currentExamination.getProc2());
        txt_proc3.setText(currentExamination.getProcType3());
        txt_ProcedureNum3.setText(currentExamination.getProcAmount3());
        txtArea_Procedure3.setText(currentExamination.getProc3());
        txt_proc4.setText(currentExamination.getProcType4());
        txt_ProcedureNum4.setText(currentExamination.getProcAmount4());
        txtArea_Procedure4.setText(currentExamination.getProc4());
        txt_proc5.setText(currentExamination.getProcType5());
        txt_ProcedureNum5.setText(currentExamination.getProcAmount5());
        txtArea_Procedure5.setText(currentExamination.getProc5());

        // Поля раздела Эпикриз
        txtArea_ComplaintsEpik.setText(currentExamination.getComplEpik());
        txtArea_Outcome.setText(currentExamination.getOutcome());
        txtArea_Recommedations.setText(currentExamination.getRecommendations());
        txtArea_ObjStatus.setText(currentExamination.getObjStatus());
    }

    private void loadPatient(Patient p) {
        p.getAllExaminations();
        p.loadData();
        cb_visitDate.removeAllItems();
        cb_proc.removeAllItems();
        if (p.getExaminationsList() != null) {
            if (p.getExaminationsList().isEmpty()) {
                setExamFieldsEnabled(false);
            } else {
                fillExaminationList();
                cb_visitDate.setEnabled(true);
            }
        } else {
            setExamFieldsEnabled(false);
        }
        fillPatientFields();
    }

    private void loadExamination(Examination e) {
        e.getAllProcedures(connection);
        e.loadData(e, connection);
        cb_proc.removeAllItems();
        if (e.getProceduresList() != null) {
            if (e.getProceduresList().isEmpty()) {
                cb_proc.setEnabled(false);
            } else {
                fillProcedureList();
            }
        } else {
            cb_proc.setEnabled(false);
        }
        fillExaminationFields();
    }

    private void loadProcedure(Procedure p) {
        p.loadData(p, connection);
        fillProcedureFields();
    }

    private void fillPatientFields() {
        tool_id.setText("ID: " + currentPatient.getId());
        txt_name.setText(currentPatient.getName());
        txt_surname.setText(currentPatient.getSurname());
        txt_patronymic.setText(currentPatient.getPatronymic());
        if (currentPatient.getGender().equals("мужской")) {
            rb_male.setSelected(true);
        } else if (currentPatient.getGender().equals("женский")) {
            rb_female.setSelected(true);
        }
        date_birth.setText(currentPatient.getBirthday());
        txt_medbook.setText(currentPatient.getMedBook());
        cb_rank.setSelectedItem(currentPatient.getMilitaryRank());
        cb_contingent.setSelectedItem(currentPatient.getContingent());
        cb_service.setSelectedItem(currentPatient.getService());
        txt_phone.setText(currentPatient.getPhoneNumber());
        txt_confidant.setText(currentPatient.getConfidant());
        txt_policy.setText(currentPatient.getPolicy());
        txt_addressLive.setText(currentPatient.getAddressLive());
        txt_addressWork.setText(currentPatient.getAddressWork());
        txtArea_pastIllness.setText(currentPatient.getPastIllness());
        txtArea_allergicAnamnesis.setText(currentPatient.getAllergicAnamnesis());
    }

    private void fillPatientList() {
        listModel = new DefaultListModel<Patient>();
        patients = getAllPatients();
        if (!patients.isEmpty()) {
            for(Patient p : patients){
                listModel.addElement(p);
            }
            list_patients.setModel(listModel);
        }
    }

    private void fillExaminationList() {
        DefaultComboBoxModel<Examination> model = new DefaultComboBoxModel<>();
        for(Examination e : currentPatient.getExaminationsList()){
            model.addElement(e);
        }
        cb_visitDate.setModel(model);
        cb_visitDate.setEnabled(true);
    }

    private void fillProcedureList() {
        DefaultComboBoxModel<Procedure> model = new DefaultComboBoxModel<>();
        for(Procedure p : currentExamination.getProceduresList()){
            model.addElement(p);
        }
        cb_proc.setModel(model);
        cb_proc.setEnabled(true);
    }

    private void fillProcedureFields() {
        label_currentProcId.setText("ID: " + currentProcedure.getId());
        txt_RegProcedure1.setText(currentProcedure.getProcType1());
        txtArea_RegProcedure1.setText(currentProcedure.getProc1());
        txt_RegProcedure2.setText(currentProcedure.getProcType2());
        txtArea_RegProcedure2.setText(currentProcedure.getProc2());
        txt_RegProcedure3.setText(currentProcedure.getProcType3());
        txtArea_RegProcedure3.setText(currentProcedure.getProc3());
        txt_RegProcedure4.setText(currentProcedure.getProcType4());
        txtArea_RegProcedure4.setText(currentProcedure.getProc4());
        txt_RegProcedure5.setText(currentProcedure.getProcType5());
        txtArea_RegProcedure5.setText(currentProcedure.getProc5());
        txtArea_DiaryAdditional.setText(currentProcedure.getDiaryAdd());
        txtArea_Diary.setText(currentProcedure.getDiary());
        txt_timeStart.setText(currentProcedure.getTimeStart());
        txt_timeEnd.setText(currentProcedure.getTimeEnd());
        txt_RegComplaints.setText(currentProcedure.getComplaintDiary());
        txt_RegStatus.setText(currentProcedure.getStatus());
        txt_RegTemperature.setText(currentProcedure.getTemperature());
        txt_RegSkin.setText(currentProcedure.getSkin());
        txt_RegBreath.setText(currentProcedure.getBreath());
        txt_RegHeart.setText(currentProcedure.getHeart());
        txt_RegPressure.setText(currentProcedure.getPressure());
        txt_RegPulse.setText(currentProcedure.getPulse());
    }

    public List<Patient> getAllPatients() {
        String sql = "select id, name, surname, patronymic from patient_info";
        patients = new ArrayList<>();
        try (PreparedStatement ps = connection.prepareStatement(sql); ResultSet r = ps.executeQuery();) {
            while (r.next()) {
                Patient p = new Patient(r.getInt("id"), connection);
                p.setName(r.getString("name"));
                p.setSurname(r.getString("surname"));
                p.setPatronymic(r.getString("patronymic"));
                patients.add(p);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
        return patients;
    }

    public void setExamFieldsEnabled(boolean b) {
        if (b == false) {
            label_currentExamId.setText("ID: n/a");
        }
        cb_visitDate.setEnabled(b);
        txt_refSurname.setEnabled(b);
        txt_refPos.setEnabled(b);
        date_admission.setEnabled(b);
        date_diseaseOnset.setEnabled(b);
        date_discharge.setEnabled(b);
        txt_historyNum.setEnabled(b);
        txt_sideEffect.setEnabled(b);
        txt_days.setEnabled(b);
        txt_timeAdmis.setEnabled(b);
        txt_RefDiagnosisCode.setEnabled(b);
        txtArea_RefDiagnosis.setEnabled(b);
        txt_AdmisDiagnosisCode.setEnabled(b);
        txtArea_AdmisDiagnosis.setEnabled(b);
        txt_ProvisDiagnosisCode.setEnabled(b);
        txtArea_ProvisDiagnosis.setEnabled(b);
        txt_MainDiagnosisCode.setEnabled(b);
        txtArea_MainDiagnosis.setEnabled(b);
        txt_ComplDiagnosisCode.setEnabled(b);
        txtArea_ComplDiagnosis.setEnabled(b);
        txt_Comorbidity.setEnabled(b);
        txtArea_Comorbidity.setEnabled(b);
        cb_Result.setEnabled(b);
        check_Termination.setEnabled(b);
        check_Emergency.setEnabled(b);
        txtArea_Complaints.setEnabled(b);
        txtArea_AnamnesisDis.setEnabled(b);
        txtArea_AnamnesisLife.setEnabled(b);
        txt_heredity.setEnabled(b);
        txt_habits.setEnabled(b);
        txt_height.setEnabled(b);
        txt_weight.setEnabled(b);
        txt_imt.setEnabled(b);
        txt_state.setEnabled(b);
        txt_fizRaz.setEnabled(b);
        txt_defRaz.setEnabled(b);
        txt_telo.setEnabled(b);
        txt_pitanie.setEnabled(b);
        txt_pokrovy.setEnabled(b);
        txt_limfSyst.setEnabled(b);
        txt_mishSyst.setEnabled(b);
        txt_svyazSust.setEnabled(b);
        txt_serdSosud.setEnabled(b);
        txt_legDih.setEnabled(b);
        txt_pischevarenie.setEnabled(b);
        txt_mochepolovayaSyst.setEnabled(b);
        txt_nervSyst.setEnabled(b);
        txt_organiChuvstv.setEnabled(b);
        txt_sekrecia.setEnabled(b);
        txtArea_ExaminationResults.setEnabled(b);
        txt_proc1.setEnabled(b);
        txt_ProcedureNum1.setEnabled(b);
        txtArea_Procedure1.setEnabled(b);
        txt_proc2.setEnabled(b);
        txt_ProcedureNum2.setEnabled(b);
        txtArea_Procedure2.setEnabled(b);
        txt_proc3.setEnabled(b);
        txt_ProcedureNum3.setEnabled(b);
        txtArea_Procedure3.setEnabled(b);
        txt_proc4.setEnabled(b);
        txt_ProcedureNum4.setEnabled(b);
        txtArea_Procedure4.setEnabled(b);
        txt_proc5.setEnabled(b);
        txt_ProcedureNum5.setEnabled(b);
        txtArea_Procedure5.setEnabled(b);
        txtArea_ComplaintsEpik.setEnabled(b);
        txtArea_Outcome.setEnabled(b);
        txtArea_Recommedations.setEnabled(b);
        txtArea_ObjStatus.setEnabled(b);
        btn_DeleteExamination.setEnabled(b);
        btn_refSurname.setEnabled(b);
        btn_refPos.setEnabled(b);
        btn_noSideEffects.setEnabled(b);
        btn_days.setEnabled(b);
        btn_addRefDiag.setEnabled(b);
        btn_addAdmisDiag.setEnabled(b);
        btn_addProvisDiag.setEnabled(b);
        btn_addMainDiag.setEnabled(b);
        btn_copyMainDiag.setEnabled(b);
        btn_addComplDiag.setEnabled(b);
        btn_addComor.setEnabled(b);
        btn_AddComplaints.setEnabled(b);
        btn_AddAnamDis.setEnabled(b);
        btn_AddAnamLife.setEnabled(b);
        btn_AddHeredity.setEnabled(b);
        btn_AddHabits.setEnabled(b);
        btn_AddFlur.setEnabled(b);
        btn_AddEKG.setEnabled(b);
        btn_AddOAK.setEnabled(b);
        btn_AddOAM.setEnabled(b);
        btn_AddBHA.setEnabled(b);
        btn_AddUziOBP.setEnabled(b);
        btn_AddUZDG_BCA.setEnabled(b);
        btn_imt.setEnabled(b);
        btn_AddState.setEnabled(b);
        btn_AddFizRaz.setEnabled(b);
        btn_AddDefRaz.setEnabled(b);
        btn_AddTelo.setEnabled(b);
        btn_AddPitanie.setEnabled(b);
        btn_AddPokrovy.setEnabled(b);
        btn_AddLimfSyst.setEnabled(b);
        btn_AddMishSyst.setEnabled(b);
        btn_AddSvyazSust.setEnabled(b);
        btn_AddSerdSosud.setEnabled(b);
        btn_AddLegDih.setEnabled(b);
        btn_AddPischevarenie.setEnabled(b);
        btn_AddMochepolovayaSyst.setEnabled(b);
        btn_AddNervSyst.setEnabled(b);
        btn_AddOrgani.setEnabled(b);
        btn_AddSekrecia.setEnabled(b);
        btn_Procedure1.setEnabled(b);
        btn_Procedure2.setEnabled(b);
        btn_Procedure3.setEnabled(b);
        btn_Procedure4.setEnabled(b);
        btn_Procedure5.setEnabled(b);
        btn_AddComplaints1.setEnabled(b);
        btn_AddOutcome.setEnabled(b);
        btn_AddRecommendations.setEnabled(b);
        btn_AddRecommendations1.setEnabled(b);
        btnTool_RegProcedureAdd.setEnabled(b);
    }

    public void setPatientFieldsEnabled(boolean b) {
        if (b == false) {
            tool_id.setText("ID: n/a");
        }
        txt_name.setEnabled(b);
        txt_surname.setEnabled(b);
        txt_patronymic.setEnabled(b);
        rb_male.setEnabled(b);
        rb_female.setEnabled(b);
        date_birth.setEnabled(b);
        txt_medbook.setEnabled(b);
        cb_rank.setEnabled(b);
        cb_contingent.setEnabled(b);
        cb_service.setEnabled(b);
        txt_phone.setEnabled(b);
        txt_confidant.setEnabled(b);
        txt_policy.setEnabled(b);
        txt_addressLive.setEnabled(b);
        txt_addressWork.setEnabled(b);
        txtArea_pastIllness.setEnabled(b);
        txtArea_allergicAnamnesis.setEnabled(b);
        btn_AddPastIllness.setEnabled(b);
        btn_AddAllergy.setEnabled(b);
        tool_Delete.setEnabled(b);
        btn_AddExamination.setEnabled(b);
    }

    public void setProcFieldsEnabled(boolean b) {
        if (b == false) {
            label_currentProcId.setText("ID: n/a");
        }
        cb_proc.setEnabled(b);
        btnTool_RegProcedureDelete.setEnabled(b);
        jButton1.setEnabled(b);
        jButton2.setEnabled(b);
        jButton3.setEnabled(b);
        jButton4.setEnabled(b);
        jButton5.setEnabled(b);
        btn_AddComplaintsReg.setEnabled(b);
        btn_AddStatusReg.setEnabled(b);
        btn_AddTemperatureReg.setEnabled(b);
        btn_AddSkinReg.setEnabled(b);
        btn_AddBreathReg.setEnabled(b);
        btn_AddHeartReg.setEnabled(b);
        btn_AddPressureReg.setEnabled(b);
        btn_AddPulseReg.setEnabled(b);
        btn_CreateDiary.setEnabled(b);
        txt_RegProcedure1.setEnabled(b);
        txtArea_RegProcedure1.setEnabled(b);
        txt_RegProcedure2.setEnabled(b);
        txtArea_RegProcedure2.setEnabled(b);
        txt_RegProcedure3.setEnabled(b);
        txtArea_RegProcedure3.setEnabled(b);
        txt_RegProcedure4.setEnabled(b);
        txtArea_RegProcedure4.setEnabled(b);
        txt_RegProcedure5.setEnabled(b);
        txtArea_RegProcedure5.setEnabled(b);
        txtArea_DiaryAdditional.setEnabled(b);
        txtArea_Diary.setEnabled(b);
        txt_timeStart.setEnabled(b);
        txt_timeEnd.setEnabled(b);
        txt_RegComplaints.setEnabled(b);
        txt_RegStatus.setEnabled(b);
        txt_RegTemperature.setEnabled(b);
        txt_RegSkin.setEnabled(b);
        txt_RegBreath.setEnabled(b);
        txt_RegHeart.setEnabled(b);
        txt_RegPressure.setEnabled(b);
        txt_RegPulse.setEnabled(b);
    }

    // Печать истории болезни
    private void generateHistory() {
        try {

            InputStream report1 = getClass().getResourceAsStream("/reports/med_karta1.jrxml");
            InputStream report2 = getClass().getResourceAsStream("/reports/med_karta2.jrxml");
            InputStream anketa = getClass().getResourceAsStream("/reports/epidem_anketa.jrxml");
            InputStream report3 = getClass().getResourceAsStream("/reports/pervichniy_osmotr.jrxml");
            InputStream report4 = getClass().getResourceAsStream("/reports/obj_issledovanie.jrxml");
            InputStream report5 = getClass().getResourceAsStream("/reports/karta_naznacheniy.jrxml");
            InputStream report6 = getClass().getResourceAsStream("/reports/epikriz.jrxml");

            InputStream diary = getClass().getResourceAsStream("/reports/dnevnik.jrxml");

            JasperDesign jdesign1 = JRXmlLoader.load(report1);
            JasperDesign jdesign2 = JRXmlLoader.load(report2);
            JasperDesign jdAnketa = JRXmlLoader.load(anketa);
            JasperDesign jdesign3 = JRXmlLoader.load(report3);
            JasperDesign jdesign4 = JRXmlLoader.load(report4);
            JasperDesign jdesign5 = JRXmlLoader.load(report5);
            JasperDesign jdesign6 = JRXmlLoader.load(report6);

            JasperDesign jdesign8 = JRXmlLoader.load(diary);

            String queryPatient = "select * from patient_info where id=" + currentPatient.getId();
            String queryExam = "select * from examination join patient_info on patient_info.id = examination.patient_id where examination.id = " + currentExamination.getId();
            String queryDiary = "select * from procedure where exam_id = " + currentExamination.getId();

            JRDesignQuery updateQuery = new JRDesignQuery();
            updateQuery.setText(queryPatient);
            JRDesignQuery updateQuery1 = new JRDesignQuery();
            updateQuery1.setText(queryExam);
            JRDesignQuery updateQuery2 = new JRDesignQuery();
            updateQuery2.setText(queryDiary);

            jdesign1.setQuery(updateQuery1);
            jdesign2.setQuery(updateQuery);
            jdAnketa.setQuery(updateQuery);
            jdesign3.setQuery(updateQuery1);
            jdesign4.setQuery(updateQuery1);
            jdesign5.setQuery(updateQuery1);
            jdesign6.setQuery(updateQuery1);
            jdesign8.setQuery(updateQuery2);

            JasperReport jreport1 = JasperCompileManager.compileReport(jdesign1);
            JasperReport jreport2 = JasperCompileManager.compileReport(jdesign2);
            JasperReport jrAnketa = JasperCompileManager.compileReport(jdAnketa);
            JasperReport jreport3 = JasperCompileManager.compileReport(jdesign3);
            JasperReport jreport4 = JasperCompileManager.compileReport(jdesign4);
            JasperReport jreport5 = JasperCompileManager.compileReport(jdesign5);
            JasperReport jreport6 = JasperCompileManager.compileReport(jdesign6);
            JasperReport jreport8 = JasperCompileManager.compileReport(jdesign8);

            JasperPrint jprint1 = JasperFillManager.fillReport(jreport1, null, connection);
            JasperPrint jprint2 = JasperFillManager.fillReport(jreport2, null, connection);
            JasperPrint jpAnketa = JasperFillManager.fillReport(jrAnketa, null, connection);
            JasperPrint jprint3 = JasperFillManager.fillReport(jreport3, null, connection);
            JasperPrint jprint4 = JasperFillManager.fillReport(jreport4, null, connection);
            JasperPrint jprint5 = JasperFillManager.fillReport(jreport5, null, connection);
            JasperPrint jprint6 = JasperFillManager.fillReport(jreport6, null, connection);
            JasperPrint jprint8 = JasperFillManager.fillReport(jreport8, null, connection);

            List<JRPrintPage> pages = jprint2.getPages();
            pages.addAll(jpAnketa.getPages());
            pages.addAll(jprint3.getPages());
            pages.addAll(jprint4.getPages());
            pages.addAll(jprint5.getPages());
            pages.addAll(jprint6.getPages());
            pages.addAll(jprint8.getPages());
            for (int i = 0; i < pages.size(); i++) {
                JRPrintPage object = (JRPrintPage) pages.get(i);
                jprint1.addPage(object);
            }
            JasperViewer.viewReport(jprint1, false);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
    }

    // Печать дневников
    private void generateSoglasia() {
        try {
            InputStream s = getClass().getResourceAsStream("/reports/soglasia1.jrxml");
            InputStream s2 = getClass().getResourceAsStream("/reports/soglasia2.jrxml");
            String sql = "select * from examination join patient_info on patient_info.id = examination.patient_id where examination.id = " + currentExamination.getId();

            JasperDesign design = JRXmlLoader.load(s);
            JasperDesign design2 = JRXmlLoader.load(s2);

            JRDesignQuery updateQuery = new JRDesignQuery();
            updateQuery.setText(sql);

            design.setQuery(updateQuery);
            design2.setQuery(updateQuery);

            JasperReport report = JasperCompileManager.compileReport(design);
            JasperReport report2 = JasperCompileManager.compileReport(design2);
            JasperPrint print = JasperFillManager.fillReport(report, null, connection);
            JasperPrint print2 = JasperFillManager.fillReport(report2, null, connection);
            print.setOrientation(OrientationEnum.LANDSCAPE);
            print2.setOrientation(OrientationEnum.LANDSCAPE);

            JRPrintPage page = print2.getPages().get(0);
            print.addPage(page);

            JasperViewer.viewReport(print, false);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
    }

    private void generateProtocol() {
        try {
            InputStream report = getClass().getResourceAsStream("/reports/protocol_ucheta.jrxml");
            InputStream report2 = getClass().getResourceAsStream("/reports/protocol_fiz_pokaz.jrxml");
            JasperDesign jd = JRXmlLoader.load(report);
            JasperDesign jd2 = JRXmlLoader.load(report2);
            String sql = "select name, surname, patronymic, history, proc1, proc2, proc3, proc4, proc5, proc_type1, proc_type2, proc_type3, proc_type4, proc_type5, proc_amount1, proc_amount2, proc_amount3, proc_amount4, proc_amount5"
                    + " from examination join patient_info on patient_info.id = examination.patient_id "
                    + " where examination.id = " + currentExamination.getId();
            String sql2 = "select name, surname, patronymic, history"
                    + " from examination join patient_info on patient_info.id = examination.patient_id "
                    + " where examination.id = " + currentExamination.getId();
            JRDesignQuery updateQuery = new JRDesignQuery();
            JRDesignQuery updateQuery2 = new JRDesignQuery();
            updateQuery.setText(sql);
            updateQuery2.setText(sql2);
            jd.setQuery(updateQuery);
            jd2.setQuery(updateQuery2);
            JasperReport jr = JasperCompileManager.compileReport(jd);
            JasperReport jr2 = JasperCompileManager.compileReport(jd2);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, connection);
            JasperPrint jp2 = JasperFillManager.fillReport(jr2, null, connection);

            JRPrintPage page = jp2.getPages().get(0);
            jp.addPage(page);
            JasperViewer.viewReport(jp, false);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
    }

    private void generateFizPok() {
        try {
            String report = getClass().getResource("/reports/protocol_fiz_pokaz.jrxml").toString().substring(6);
            JasperDesign jd = JRXmlLoader.load(report);
            String sql = "select * from patient_info where id=" + currentPatient.getId();
            JRDesignQuery updateQuery = new JRDesignQuery();
            updateQuery.setText(sql);
            jd.setQuery(updateQuery);
            JasperReport jr = JasperCompileManager.compileReport(jd);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, connection);
            JasperViewer.viewReport(jp, false);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MainFrame().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainContentPanel;
    private javax.swing.JButton btnTool_RegProcedureAdd;
    private javax.swing.JButton btnTool_RegProcedureDelete;
    private javax.swing.JButton btn_AddAllergy;
    private javax.swing.JButton btn_AddAnamDis;
    private javax.swing.JButton btn_AddAnamLife;
    private javax.swing.JButton btn_AddBHA;
    private javax.swing.JButton btn_AddBreathReg;
    private javax.swing.JButton btn_AddComplaints;
    private javax.swing.JButton btn_AddComplaints1;
    private javax.swing.JButton btn_AddComplaintsReg;
    private javax.swing.JButton btn_AddDefRaz;
    private javax.swing.JButton btn_AddEKG;
    private javax.swing.JButton btn_AddExamination;
    private javax.swing.JButton btn_AddFizRaz;
    private javax.swing.JButton btn_AddFlur;
    private javax.swing.JButton btn_AddHabits;
    private javax.swing.JButton btn_AddHeartReg;
    private javax.swing.JButton btn_AddHeredity;
    private javax.swing.JButton btn_AddLegDih;
    private javax.swing.JButton btn_AddLimfSyst;
    private javax.swing.JButton btn_AddMishSyst;
    private javax.swing.JButton btn_AddMochepolovayaSyst;
    private javax.swing.JButton btn_AddNervSyst;
    private javax.swing.JButton btn_AddOAK;
    private javax.swing.JButton btn_AddOAM;
    private javax.swing.JButton btn_AddOrgani;
    private javax.swing.JButton btn_AddOutcome;
    private javax.swing.JButton btn_AddPastIllness;
    private javax.swing.JButton btn_AddPischevarenie;
    private javax.swing.JButton btn_AddPitanie;
    private javax.swing.JButton btn_AddPokrovy;
    private javax.swing.JButton btn_AddPressureReg;
    private javax.swing.JButton btn_AddPulseReg;
    private javax.swing.JButton btn_AddRecommendations;
    private javax.swing.JButton btn_AddRecommendations1;
    private javax.swing.JButton btn_AddSekrecia;
    private javax.swing.JButton btn_AddSerdSosud;
    private javax.swing.JButton btn_AddSkinReg;
    private javax.swing.JButton btn_AddState;
    private javax.swing.JButton btn_AddStatusReg;
    private javax.swing.JButton btn_AddSvyazSust;
    private javax.swing.JButton btn_AddTelo;
    private javax.swing.JButton btn_AddTemperatureReg;
    private javax.swing.JButton btn_AddUZDG_BCA;
    private javax.swing.JButton btn_AddUziOBP;
    private javax.swing.JButton btn_CreateDiary;
    private javax.swing.JButton btn_DeleteExamination;
    private javax.swing.JButton btn_Procedure1;
    private javax.swing.JButton btn_Procedure2;
    private javax.swing.JButton btn_Procedure3;
    private javax.swing.JButton btn_Procedure4;
    private javax.swing.JButton btn_Procedure5;
    private javax.swing.JButton btn_addAdmisDiag;
    private javax.swing.JButton btn_addComor;
    private javax.swing.JButton btn_addComplDiag;
    private javax.swing.JButton btn_addMainDiag;
    private javax.swing.JButton btn_addProvisDiag;
    private javax.swing.JButton btn_addRefDiag;
    private javax.swing.JButton btn_copyMainDiag;
    private javax.swing.JButton btn_days;
    private javax.swing.JButton btn_imt;
    private javax.swing.JButton btn_noSideEffects;
    private javax.swing.JButton btn_refPos;
    private javax.swing.JButton btn_refSurname;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cb_Result;
    private javax.swing.JComboBox<String> cb_contingent;
    private javax.swing.JComboBox<Procedure> cb_proc;
    private javax.swing.JComboBox<String> cb_rank;
    private javax.swing.JComboBox<String> cb_service;
    private javax.swing.JComboBox<Examination> cb_visitDate;
    private javax.swing.JCheckBox check_Emergency;
    private javax.swing.JCheckBox check_Termination;
    private com.github.lgooddatepicker.components.DatePicker date_admission;
    private com.github.lgooddatepicker.components.DatePicker date_birth;
    private com.github.lgooddatepicker.components.DatePicker date_discharge;
    private com.github.lgooddatepicker.components.DatePicker date_diseaseOnset;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane29;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane30;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel label_AdmisDiagnosis;
    private javax.swing.JLabel label_AdmissionDate;
    private javax.swing.JLabel label_Comorbidity;
    private javax.swing.JLabel label_ComplDiagnosis;
    private javax.swing.JLabel label_ComplaintsEpik;
    private javax.swing.JLabel label_ComplaintsEpik1;
    private javax.swing.JLabel label_ComplaintsEpik2;
    private javax.swing.JLabel label_ComplaintsEpik3;
    private javax.swing.JLabel label_Days;
    private javax.swing.JLabel label_Days1;
    private javax.swing.JLabel label_DischargeDate;
    private javax.swing.JLabel label_DiseaseOnset;
    private javax.swing.JLabel label_MainDiagnosis;
    private javax.swing.JLabel label_MainDiagnosis1;
    private javax.swing.JLabel label_ProcedureNum1;
    private javax.swing.JLabel label_ProcedureNum2;
    private javax.swing.JLabel label_ProcedureNum3;
    private javax.swing.JLabel label_ProcedureNum4;
    private javax.swing.JLabel label_ProcedureNum5;
    private javax.swing.JLabel label_ProvisDiagnosis;
    private javax.swing.JLabel label_Ref;
    private javax.swing.JLabel label_Ref1;
    private javax.swing.JLabel label_Result;
    private javax.swing.JLabel label_SideEffect;
    private javax.swing.JLabel label_addressLive;
    private javax.swing.JLabel label_addressWork;
    private javax.swing.JLabel label_allergicAnamnesis;
    private javax.swing.JLabel label_birth;
    private javax.swing.JLabel label_confidant;
    private javax.swing.JLabel label_contingent;
    private javax.swing.JLabel label_currentExamId;
    private javax.swing.JLabel label_currentProcId;
    private javax.swing.JLabel label_defRaz;
    private javax.swing.JLabel label_examinationResults;
    private javax.swing.JLabel label_fizRaz;
    private javax.swing.JLabel label_gender;
    private javax.swing.JLabel label_height;
    private javax.swing.JLabel label_historyNum;
    private javax.swing.JLabel label_imt;
    private javax.swing.JLabel label_limfSyst;
    private javax.swing.JLabel label_medbook;
    private javax.swing.JLabel label_mishSyst;
    private javax.swing.JLabel label_mochepolovayaSyst;
    private javax.swing.JLabel label_name;
    private javax.swing.JLabel label_nervSyst;
    private javax.swing.JLabel label_organiChuvstv;
    private javax.swing.JLabel label_pastIllness;
    private javax.swing.JLabel label_patronymic;
    private javax.swing.JLabel label_phone;
    private javax.swing.JLabel label_pischevarenie;
    private javax.swing.JLabel label_pitanie;
    private javax.swing.JLabel label_pokrovy;
    private javax.swing.JLabel label_policy;
    private javax.swing.JLabel label_procedure1;
    private javax.swing.JLabel label_procedure2;
    private javax.swing.JLabel label_procedure3;
    private javax.swing.JLabel label_procedure4;
    private javax.swing.JLabel label_procedure5;
    private javax.swing.JLabel label_rank;
    private javax.swing.JLabel label_sekrecia;
    private javax.swing.JLabel label_serdSosud;
    private javax.swing.JLabel label_serdSosud1;
    private javax.swing.JLabel label_service;
    private javax.swing.JLabel label_state;
    private javax.swing.JLabel label_surname;
    private javax.swing.JLabel label_svyazSust;
    private javax.swing.JLabel label_telo;
    private javax.swing.JLabel label_weight;
    private javax.swing.JList<Patient> list_patients;
    private javax.swing.JMenuItem menuFileItem_Exit;
    private javax.swing.JMenuItem menuPrintItem_History;
    private javax.swing.JMenuItem menuPrintItem_Soglasia;
    private javax.swing.JMenuItem menuPrintItem_Uchet;
    private javax.swing.JMenu menu_File;
    private javax.swing.JMenu menu_Help;
    private javax.swing.JMenu menu_Print;
    private javax.swing.JPanel panel_Diagnosis;
    private javax.swing.JPanel panel_ExamToolbar;
    private javax.swing.JPanel panel_Examination;
    private javax.swing.JPanel panel_ExaminationTab;
    private javax.swing.JPanel panel_FrameToolbar;
    private javax.swing.JPanel panel_General;
    private javax.swing.JPanel panel_PatList;
    private javax.swing.JPanel panel_PersonalData;
    private javax.swing.JPanel panel_Proc;
    private javax.swing.JPanel panel_ProcToolbar;
    private javax.swing.JPanel panel_ProtocolTab;
    private javax.swing.JPanel panel_Tab;
    private javax.swing.JPanel panel_TreatmentTab;
    private javax.swing.JPanel panel_procedure;
    private javax.swing.JRadioButton rb_female;
    private javax.swing.JRadioButton rb_male;
    private javax.swing.JSeparator sep_Procedure1;
    private javax.swing.JSeparator sep_Procedure2;
    private javax.swing.JSeparator sep_Procedure3;
    private javax.swing.JSeparator sep_Procedure4;
    private javax.swing.JSeparator sep_Procedure5;
    private javax.swing.JSeparator sep_Procedure6;
    private javax.swing.JSeparator sep_Procedure7;
    private javax.swing.JSeparator sep_Procedure8;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JButton tool_Delete;
    private javax.swing.JButton tool_New;
    private javax.swing.JButton tool_Refresh;
    private javax.swing.JButton tool_Save;
    private javax.swing.JLabel tool_id;
    private javax.swing.JTextArea txtArea_AdmisDiagnosis;
    private javax.swing.JTextArea txtArea_AnamnesisDis;
    private javax.swing.JTextArea txtArea_AnamnesisLife;
    private javax.swing.JTextArea txtArea_Comorbidity;
    private javax.swing.JTextArea txtArea_ComplDiagnosis;
    private javax.swing.JTextArea txtArea_Complaints;
    private javax.swing.JTextArea txtArea_ComplaintsEpik;
    private javax.swing.JTextArea txtArea_Diary;
    private javax.swing.JTextArea txtArea_DiaryAdditional;
    private javax.swing.JTextArea txtArea_ExaminationResults;
    private javax.swing.JTextArea txtArea_MainDiagnosis;
    private javax.swing.JTextArea txtArea_ObjStatus;
    private javax.swing.JTextArea txtArea_Outcome;
    private javax.swing.JTextArea txtArea_Procedure1;
    private javax.swing.JTextArea txtArea_Procedure2;
    private javax.swing.JTextArea txtArea_Procedure3;
    private javax.swing.JTextArea txtArea_Procedure4;
    private javax.swing.JTextArea txtArea_Procedure5;
    private javax.swing.JTextArea txtArea_ProvisDiagnosis;
    private javax.swing.JTextArea txtArea_Recommedations;
    private javax.swing.JTextArea txtArea_RefDiagnosis;
    private javax.swing.JTextArea txtArea_RegProcedure1;
    private javax.swing.JTextArea txtArea_RegProcedure2;
    private javax.swing.JTextArea txtArea_RegProcedure3;
    private javax.swing.JTextArea txtArea_RegProcedure4;
    private javax.swing.JTextArea txtArea_RegProcedure5;
    private javax.swing.JTextArea txtArea_allergicAnamnesis;
    private javax.swing.JTextArea txtArea_pastIllness;
    private javax.swing.JTextField txt_AdmisDiagnosisCode;
    private javax.swing.JTextField txt_Comorbidity;
    private javax.swing.JTextField txt_ComplDiagnosisCode;
    private javax.swing.JTextField txt_MainDiagnosisCode;
    private javax.swing.JTextField txt_ProcedureNum1;
    private javax.swing.JTextField txt_ProcedureNum2;
    private javax.swing.JTextField txt_ProcedureNum3;
    private javax.swing.JTextField txt_ProcedureNum4;
    private javax.swing.JTextField txt_ProcedureNum5;
    private javax.swing.JTextField txt_ProvisDiagnosisCode;
    private javax.swing.JTextField txt_RefDiagnosisCode;
    private javax.swing.JTextField txt_RegBreath;
    private javax.swing.JTextField txt_RegComplaints;
    private javax.swing.JTextField txt_RegHeart;
    private javax.swing.JTextField txt_RegPressure;
    private javax.swing.JTextField txt_RegProcedure1;
    private javax.swing.JTextField txt_RegProcedure2;
    private javax.swing.JTextField txt_RegProcedure3;
    private javax.swing.JTextField txt_RegProcedure4;
    private javax.swing.JTextField txt_RegProcedure5;
    private javax.swing.JTextField txt_RegPulse;
    private javax.swing.JTextField txt_RegSkin;
    private javax.swing.JTextField txt_RegStatus;
    private javax.swing.JTextField txt_RegTemperature;
    private javax.swing.JTextField txt_addressLive;
    private javax.swing.JTextField txt_addressWork;
    private javax.swing.JTextField txt_confidant;
    private javax.swing.JTextField txt_days;
    private javax.swing.JTextField txt_defRaz;
    private javax.swing.JTextField txt_fizRaz;
    private javax.swing.JTextField txt_habits;
    private javax.swing.JTextField txt_height;
    private javax.swing.JTextField txt_heredity;
    private javax.swing.JTextField txt_historyNum;
    private javax.swing.JTextField txt_imt;
    private javax.swing.JTextField txt_legDih;
    private javax.swing.JTextField txt_limfSyst;
    private javax.swing.JTextField txt_medbook;
    private javax.swing.JTextField txt_mishSyst;
    private javax.swing.JTextField txt_mochepolovayaSyst;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_nervSyst;
    private javax.swing.JTextField txt_organiChuvstv;
    private javax.swing.JTextField txt_patronymic;
    private javax.swing.JTextField txt_phone;
    private javax.swing.JTextField txt_pischevarenie;
    private javax.swing.JTextField txt_pitanie;
    private javax.swing.JTextField txt_pokrovy;
    private javax.swing.JTextField txt_policy;
    private javax.swing.JTextField txt_proc1;
    private javax.swing.JTextField txt_proc2;
    private javax.swing.JTextField txt_proc3;
    private javax.swing.JTextField txt_proc4;
    private javax.swing.JTextField txt_proc5;
    private javax.swing.JTextField txt_refPos;
    private javax.swing.JTextField txt_refSurname;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txt_sekrecia;
    private javax.swing.JTextField txt_serdSosud;
    private javax.swing.JTextField txt_sideEffect;
    private javax.swing.JTextField txt_state;
    private javax.swing.JTextField txt_surname;
    private javax.swing.JTextField txt_svyazSust;
    private javax.swing.JTextField txt_telo;
    private javax.swing.JTextField txt_timeAdmis;
    private javax.swing.JTextField txt_timeEnd;
    private javax.swing.JTextField txt_timeStart;
    private javax.swing.JTextField txt_weight;
    // End of variables declaration//GEN-END:variables

    private List<Patient> patients;
    private DefaultListModel<Patient> listModel;
    private Patient currentPatient;
    private Examination currentExamination;
    private Procedure currentProcedure;
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    private String convertDateToString(LocalDate date) {
        String dateStr = date.format(formatter);
        return dateStr;
    }

    private void chooseCurrentExamination(Examination tmp) {
        clearFields(1);
        currentExamination = tmp;
        currentPatient.setCurrentExamination(currentExamination);
        loadExamination(currentExamination);
        setExamFieldsEnabled(true);
    }

    private void chooseCurrentProcedure(Procedure tmp) {
        currentProcedure = tmp;
        clearFields(2);
        currentExamination.setCurrentProcedure(currentProcedure);
        loadProcedure(currentProcedure);
        setProcFieldsEnabled(true);
    }
}
