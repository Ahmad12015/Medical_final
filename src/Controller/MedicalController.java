package Controller;

import Model.Faced;
import View.MedicalScreen;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Ahmad S.Abu Selmya
 */
public class MedicalController {

    private Faced faced;
    private MedicalScreen medicalScreen;

    public MedicalController(Faced faced, MedicalScreen medicalScreen) {
        this.faced = faced;
        this.medicalScreen = medicalScreen;
    }
    
     public class Controller implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            
        }
     
     }
}
