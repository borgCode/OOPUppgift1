import javax.swing.*;
import java.util.Arrays;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        Main mainProgram = new Main();
    }
    public Main() {
        
        List<Plant> plantList = initPlantList();

        while (true) {
            String plantNameInput = JOptionPane.showInputDialog("Skriv in namnet på växten som ska få vätska." +
                    "\nKlicka på cancel för att avbryta programmet.");
            
            if (plantNameInput == null) {
                JOptionPane.showMessageDialog(null, "Programmet avslutas.");
                break;
            }
            if (plantNameInput.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Du har inte skrivit något i textrutan, försök igen.");
                continue;
            }
            
            findPlant(plantNameInput, plantList);
            
        }

    }

    private List<Plant> initPlantList() {
        //Olika växter skapas av samma referenstyp för att använda polymorphism
        Plant cactus = new Cactus("Igge", 0.2);
        Plant palm1 = new Palm("Laura", 5);
        Plant palm2 = new Palm("Olof", 1);
        Plant carnivorous = new Carnivorous("Meatloaf", 0.7);
        return Arrays.asList(cactus, palm1, palm2, carnivorous);
    }

    private void findPlant(String plantName, List<Plant> plantList) {
        //Boolean för att veta om en växt har hittats i for-loopen
        boolean plantFound = false;

        //Polymorphism används för att hitta växten och utföra vattenberäkningar
        for (Plant plant : plantList) {
            if (plantName.trim().equalsIgnoreCase(plant.getName())) {
                JOptionPane.showMessageDialog(null, plant.getName() + " behöver " + plant.calculateWaterNeed() + "L av vätsketypen " + plant.getWaterType());
                plantFound = true;
                break;
            }
        }
        
        //Visas om växten som användaren angivit inte finns
        if (!plantFound) {
            JOptionPane.showMessageDialog(null, "Det finns ingen växt som heter " + plantName);
        }
    }
}
