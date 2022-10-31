/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Doctor;
import model.Encounter;
import model.EncounterHistory;
import model.Patient;
import model.SystemAdmin;
import model.VitalSigns;

/**
 *
 * @author doshi
 */
public class ViewVitalSignsPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewVitalSignsPanel
     */
    SystemAdmin sysAdmin;
    Doctor d;
    public ViewVitalSignsPanel(SystemAdmin sysAdmin,Doctor d) {
        initComponents();
        this.sysAdmin = sysAdmin;
        this.d = d;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVitalSigns = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtTemperature = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPulseRate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtRespirationRate = new javax.swing.JTextField();
        btnSaveVitalSign = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxPatient = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtBloodPressure = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lblSearchVitalSigns = new javax.swing.JLabel();
        txtSearchVitalSigns = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("View Vital Signs");

        tblVitalSigns.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Patient", "Blood Pressure", "Temperature", "Pulse Rate", "Respiration Rate"
            }
        ));
        jScrollPane1.setViewportView(tblVitalSigns);

        jButton1.setText("View Vitals");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Update Vitals");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Pulse rate");

        jLabel6.setText("Respiration Rate");

        btnSaveVitalSign.setText("Save");
        btnSaveVitalSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveVitalSignActionPerformed(evt);
            }
        });

        jLabel2.setText("Patient");

        jLabel3.setText("Blood Pressure");

        jLabel4.setText("Temperature");

        lblSearchVitalSigns.setText("Search Vital Signs :");

        txtSearchVitalSigns.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchVitalSignsKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jButton1)
                            .addGap(18, 18, 18)
                            .addComponent(jButton2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(371, 371, 371)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 795, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(285, 285, 285)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnSaveVitalSign)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jComboBoxPatient, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtBloodPressure)
                                            .addComponent(txtTemperature)
                                            .addComponent(txtPulseRate)
                                            .addComponent(txtRespirationRate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(lblSearchVitalSigns)
                        .addGap(18, 18, 18)
                        .addComponent(txtSearchVitalSigns, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSearchVitalSigns)
                    .addComponent(txtSearchVitalSigns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(txtPulseRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(txtRespirationRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnSaveVitalSign)
                .addGap(92, 92, 92))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveVitalSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveVitalSignActionPerformed
        // TODO add your handling code here:
        /*
        Patient p = (Patient)jComboBoxPatient.getSelectedItem();

        String date = txtEncounterDate.getText();
        String dateRegex = "^(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/[0-9]{4}$";
        Pattern datePattern = Pattern.compile(dateRegex);
        Matcher matcher = datePattern.matcher(date);
        if(matcher.matches()==false){
            JOptionPane.showMessageDialog(this, "Enter Valid Encounter Date: MM/DD/YYYY");
            return;
        }

        Encounter e = sysAdmin.getEncounterHistory().addEncounter();
        String eid =  String.valueOf(sysAdmin.getEncounterHistory().encounterCount() + Integer.parseInt("100000000"));
        e.setDoctor(d);
        e.setPatient(p);
        e.setDate(date);
        e.setEncounterId(eid);

        JOptionPane.showMessageDialog(this, "Encounter Info Saved");

        txtEncounterDate.setText("");

        jComboBoxPatient.setSelectedItem(null);
        */
        Patient p = (Patient)jComboBoxPatient.getSelectedItem();
        try{
            Double bp = Double.parseDouble(txtBloodPressure.getText());
            Double temp = Double.parseDouble(txtTemperature.getText());
            Double pr = Double.parseDouble(txtPulseRate.getText());
            Double rr = Double.parseDouble(txtRespirationRate.getText());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Enter Valid Fields: All should be in double");
            return;
        }

        if(p==null){
            JOptionPane.showMessageDialog(this, "Select All Fields");
            return;
        }

        Encounter e = sysAdmin.getEncounterHistory().getEncounterPatient(p);
        VitalSigns vs = new VitalSigns();
        vs.setBloodPressure(Double.parseDouble(txtBloodPressure.getText()));
        vs.setTemperatureInF(Double.parseDouble(txtTemperature.getText()));
        vs.setPulseRate(Double.parseDouble(txtPulseRate.getText()));
        vs.setRespirationRate(Double.parseDouble(txtRespirationRate.getText()));

        e.setVitalSign(vs);

        JOptionPane.showMessageDialog(this, "Vital Sign Updated");

        jComboBoxPatient.setSelectedItem(null);
        txtBloodPressure.setText("");
        txtPulseRate.setText("");
        txtRespirationRate.setText("");
        txtTemperature.setText("");
        populateTable();

    }//GEN-LAST:event_btnSaveVitalSignActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        /*
        int selectedrowIndex = tblEncounters.getSelectedRow();
        if(selectedrowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select row to view the details");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblEncounters.getModel();
        Encounter e = (Encounter) model.getValueAt(selectedrowIndex, 0);
        txtEncounterId.setText(e.getEncounterId());
        txtEncounterId.setEditable(false);
        jComboBoxPatient.setSelectedItem(e.getPatient());
        jComboBoxPatient.setEditable(false);
        txtEncounterDate.setText(e.getDate());
        txtEncounterDate.setEditable(false);
        */
        int selectedrowIndex = tblVitalSigns.getSelectedRow();
        if(selectedrowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select row to view the details");
        }
        DefaultTableModel model = (DefaultTableModel) tblVitalSigns.getModel();
        Encounter en = (Encounter) model.getValueAt(selectedrowIndex, 1);
        jComboBoxPatient.setSelectedItem(en.getPatient());
        jComboBoxPatient.setEditable(false);
        VitalSigns vs = en.getVitalSign();
        txtBloodPressure.setText(String.valueOf(vs.getBloodPressure()));
        txtBloodPressure.setEditable(false);
        txtTemperature.setText(String.valueOf(vs.getTemperatureInF()));
        txtTemperature.setEditable(false);
        txtPulseRate.setText(String.valueOf(vs.getPulseRate()));
        txtPulseRate.setEditable(false);
        txtRespirationRate.setText(String.valueOf(vs.getRespirationRate()));
        txtRespirationRate.setEditable(false);
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int selectedrowIndex = tblVitalSigns.getSelectedRow();
        if(selectedrowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select row to view the details");
        }
        DefaultTableModel model = (DefaultTableModel) tblVitalSigns.getModel();
        Encounter en = (Encounter) model.getValueAt(selectedrowIndex, 1);
        jComboBoxPatient.setSelectedItem(en.getPatient());
        jComboBoxPatient.setEditable(false);
        VitalSigns vs = en.getVitalSign();
        txtBloodPressure.setText(String.valueOf(vs.getBloodPressure()));
        txtBloodPressure.setEditable(true);
        txtTemperature.setText(String.valueOf(vs.getTemperatureInF()));
        txtTemperature.setEditable(true);
        txtPulseRate.setText(String.valueOf(vs.getPulseRate()));
        txtPulseRate.setEditable(true);
        txtRespirationRate.setText(String.valueOf(vs.getRespirationRate()));
        txtRespirationRate.setEditable(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtSearchVitalSignsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchVitalSignsKeyPressed
        // TODO add your handling code here:
        DefaultTableModel taleModel = (DefaultTableModel)tblVitalSigns.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(taleModel);
        tblVitalSigns.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(txtSearchVitalSigns.getText().trim()));
    }//GEN-LAST:event_txtSearchVitalSignsKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaveVitalSign;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<Object> jComboBoxPatient;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSearchVitalSigns;
    private javax.swing.JTable tblVitalSigns;
    private javax.swing.JTextField txtBloodPressure;
    private javax.swing.JTextField txtPulseRate;
    private javax.swing.JTextField txtRespirationRate;
    private javax.swing.JTextField txtSearchVitalSigns;
    private javax.swing.JTextField txtTemperature;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
       
        
        DefaultTableModel model = (DefaultTableModel) tblVitalSigns.getModel();
        model.setRowCount(0);
        EncounterHistory eh = sysAdmin.getEncounterHistory();
        List<Encounter> el = eh.getEncounterHistory();
        for(Encounter e : el){
            if(e.getDoctor().getDoctorId().equals(d.getDoctorId())){
                VitalSigns vs = e.getVitalSign();
                Object[] row = new Object[5];
                row[0] = e.getPatient();
                row[1] = vs;
                row[2] = vs.getTemperatureInF();
                row[3] = vs.getPulseRate();
                row[4] = vs.getRespirationRate();
                model.addRow(row);
            }
            
        }
        
    }
}
