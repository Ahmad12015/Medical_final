package Model;

/**
 *
 * @author Ahmad S.Abu Selmya
 */
public class Faced {

        private Disease disease;
        private Doctor doctor;
        private DoctorModel doctorModel;
        private Employee employee;
        private EmployeeStatatistic employeeStatatistic;
        private Patient patient;
        private Room room;
        private RoomType roomType;

        private static Faced INSTANCE;
        
    public Faced() {
        disease = new Disease();
        doctor = new Doctor();
        doctorModel = new DoctorModel();
        employee = new Employee();
        employeeStatatistic = new EmployeeStatatistic();
        patient = new Patient();
        room = new Room();
        roomType = new RoomType();
    }
        
        
        public void lkjsdf(){
            
        }
        
        public static Faced getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Faced();
        }
        return INSTANCE;

    }
    
}
