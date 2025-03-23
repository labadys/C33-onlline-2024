package lesson_23;

import org.w3c.dom.*;
import javax.xml.parsers.*; // Импортируем парсер XML
import java.io.*; // Импортируем классы для работы с файлами

public class XMLParser {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            Document document = builder.parse(new File(
                    "C:\\Users\\Slava\\IdeaProjects\\C33-onlline-2024v2\\src\\lesson_23\\sonnet.xml"));

            Element root = document.getDocumentElement();

            String firstName = root.getElementsByTagName("firstName").item(0).getTextContent();
            String lastName = root.getElementsByTagName("lastName").item(0).getTextContent();
            String title = root.getElementsByTagName("title").item(0).getTextContent();

            String fileName = firstName + "_" + lastName + "_" + title + ".txt";

            NodeList lineNodes = root.getElementsByTagName("line");

            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            File outputFile = new File("C:\\Users\\Slava\\IdeaProjects\\C33-onlline-2024v2\\src\\lesson_23");

            for (int i = 0; i < lineNodes.getLength(); i++) {
                writer.write(lineNodes.item(i).getTextContent());
                writer.newLine();
            }

            writer.close();

            System.out.println("Файл \"" + fileName + "\" успешно создан!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}