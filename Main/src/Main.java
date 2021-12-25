public class Main {

    public static void main(String[] args) {

        Clinic clinic = new Clinic();
        clinic.placePatients(100);
        System.out.printf("Средняя температура по больнице : %.1f  \nКоличество здоровых пациентов : %d",
                clinic.getMediumTemperature(), clinic.getFinePatientsCount());
    }
}
