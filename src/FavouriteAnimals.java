import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FavouriteAnimals {
    public static void main(String[] args) {
        // The program's aim is to collect your favourite animals and store them in a text file.
        // There is a given text file called '''favourites.txt''', it will contain the animals
        // If ran from the command line without arguments
        // It should print out the usage:
        // ```java FavouriteAnimals [animal] [animal]```
        // You can add as many command line arguments as many favourite you have.
        // One animal should be stored only at once
        // Each animal should be written in separate lines
        // The program should only save animals, no need to print them


        FavouriteAnimals favourite = new FavouriteAnimals();

        if (args.length == 0) {
            favourite.printUsage();
        } else if (args.length > 0){
            favourite.storeAnimal(args);
        }

    }

    public void printUsage() {
        System.out.println("```java FavouriteAnimals [animal] [animal]```");
    }

    public void storeAnimal(String[] args) {
        ArrayList<String> inputAnimals = new ArrayList<>();
        ArrayList<String> animalsInFile = new ArrayList<>();
        for (int i = 0; i < args.length; i++) {
            inputAnimals.add(i, args[i]);
        }
        List<String> inputAnimalsNoDuplicates = inputAnimals.stream().distinct().collect(Collectors.toList());
        try {
            Path myPath = Paths.get("favourites.txt");
            Scanner sc = new Scanner(new File("favourites.txt"));
            while (sc.hasNext()){
                animalsInFile.add(sc.next());
            }
            for (int i = 0; i < inputAnimalsNoDuplicates.size(); i++) {
                if (animalsInFile.contains(inputAnimalsNoDuplicates.get(i))) {
                    inputAnimalsNoDuplicates.remove(i);
                    i--;
                }
            }
            Files.write(myPath, inputAnimalsNoDuplicates, StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("Cannot copy, something went wrong...");
        }
    }

}