package org.openqa.selenium;

import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;

public class CSVWriterExample {
    public static void main(String[] args) throws IOException {
        String csvFilePath = "/home/usuario/Documentos/Heros.csv";

        try (CSVWriter writer = new CSVWriter(new FileWriter(csvFilePath))) {
                       String[] data = {"Hero Name", "Hero Class", "Hero Description"};
            writer.writeNext(data);


        }
    }
}

