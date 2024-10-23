package org.example;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        File inputFile = new File("src/main/resources/test-input.json");
        JsonNode data = mapper.readTree(inputFile).get("data");

        Universe starWars = new Universe("starwars", new ArrayList<>());
        Universe hitchhikers = new Universe("hitchhikers", new ArrayList<>());
        Universe marvel = new Universe("marvel", new ArrayList<>());
        Universe rings = new Universe("rings", new ArrayList<>());

        for (JsonNode entry : data) {
            int id = entry.get("id").asInt();
            boolean isHumanoid = entry.has("isHumanoid") && entry.get("isHumanoid").asBoolean();
            String planet = entry.has("planet") ? entry.get("planet").asText() : "Unknown Planet";
            List<String> traits = new ArrayList<>();
            if (entry.has("traits")) {
                for (JsonNode trait : entry.get("traits")) {
                    traits.add(trait.asText());
                }
            }

            if (isHumanoid) {
                if (planet.equalsIgnoreCase("Earth")) {
                    marvel.individuals().add(entry.toString());
                    System.out.println("Added humanoid from Earth to Marvel: " + entry);
                } else if (planet.equalsIgnoreCase("Asgard")) {
                    rings.individuals().add(entry.toString());
                    System.out.println("Added humanoid from Asgard to Rings: " + entry);
                } else {
                    hitchhikers.individuals().add(entry.toString());
                    System.out.println("Added humanoid to Hitchhiker's Universe: " + entry);
                }
            } else {
                if (traits.contains("HAIRY") || traits.contains("TALL")) {
                    starWars.individuals().add(entry.toString());
                    System.out.println("Added non-humanoid (HAIRY/TALL) to Star Wars: " + entry);
                } else {
                    hitchhikers.individuals().add(entry.toString());
                    System.out.println("Added non-humanoid to Hitchhiker's Universe: " + entry);
                }
            }
        }

        mapper.writeValue(new File("src/main/resources/output/starwars.json"), starWars);
        mapper.writeValue(new File("src/main/resources/output/hitchhikers.json"), hitchhikers);
        mapper.writeValue(new File("src/main/resources/output/marvel.json"), marvel);
        mapper.writeValue(new File("src/main/resources/output/rings.json"), rings);

        System.out.println("\nClassification Summary:");
        System.out.println("Star Wars Universe: " + starWars.individuals().size() + " aliens");
        System.out.println("Hitchhiker's Universe: " + hitchhikers.individuals().size() + " aliens");
        System.out.println("Marvel Universe: " + marvel.individuals().size() + " aliens");
        System.out.println("Rings Universe: " + rings.individuals().size() + " aliens");
    }
}

record Universe(String name, List<String> individuals) {}
