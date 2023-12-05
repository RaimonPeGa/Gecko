package org.openqa.selenium;


import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class JAXBWriterExample {
    public static void main(String[] args) throws JAXBException {

        Hero hero = new Hero();
        hero.setName("Nombre del héroe");

        String xmlFilePath = "/home/usuario/Documentos/Heros.xml";

        try {
            JAXBContext context = JAXBContext.newInstance(Hero.class);
            Marshaller marshaller = context.createMarshaller();

            marshaller.marshal(hero, new File(xmlFilePath));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}


