import java.util.ArrayList;
import java.util.List;

public class Clinic {

    private int patientsCount;
    private static int patientNumber;
    private static double totalTemperature;
    private static int finePatientsCount;
    private static List<Patient> list = new ArrayList<>();

    public void placePatients(int patientsCount) {
        this.patientsCount = patientsCount;

        for (int i = 0; i < patientsCount; i++) {
            list.add(new Patient());
            patientNumber++;

            if (list.get(i).isFine()) {
                finePatientsCount++;
            }

            totalTemperature += list.get(i).getTemperature();

//            System.out.printf("Пациент № %d, тем-ра %.1f%c\n", patientNumber, list.get(i).getTemperature(), '℃');
        }
    }

    public int getFinePatientsCount() {
        return finePatientsCount;
    }

    public double getMediumTemperature() {
        return totalTemperature / patientsCount;
    }
}



