package View;

import Model.Doctor;
import Model.DoctorModel;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import javax.swing.DefaultListModel;


public class MedicalView1 extends javax.swing.JPanel
            implements Observer{
    public MedicalView1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jListStudents = new javax.swing.JList<String>();

        jListStudents.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jListStudents);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> jListStudents;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        DefaultListModel<String> aDefaultListModel=
                new DefaultListModel<String>();
        aDefaultListModel.addElement("Name -- id -- Spesilez");
        aDefaultListModel.addElement("====================");
        List<Doctor> Credits = ((DoctorModel) o).getCredits();
        //Sort students based on grade
        
        for(Doctor aCredit: Credits){
            String row = aCredit.getName();
            row += " -- " + aCredit.getId();
            row += " -- " + aCredit.getSpecial();
            aDefaultListModel.addElement(row);
        }
        jListStudents.setModel(aDefaultListModel);
    }
}
