import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        String[] questions = {
                "Vad betyder SQL?",
                "Vad är en databas?",
                "Vad är en relationsdatabas?",
                "Vad är en tabell?",
                "Vad är en primärnyckel (primary key)?",
                "Vad är en främmande nyckel (foreign key)?",
                "Varför är det bra eller dåligt med dubletter i en SQL-databas?",
                "Vad är en null?",
                "Vad är CRUD?",
                "Vad är en SELECT-sats?",
                "Vad är en INSERT-sats?",
                "Vad är en UPDATE-sats?",
                "Vad är en DELETE-sats?",
                "Vad är en WHERE-sats?",
                "Vad är en ORDER BY-sats?",
                "Vad är en JOIN-sats?",
                "Hur fungerar en LEFT JOIN-sats?",
                "Hur fungerar en INNER JOIN-sats?",
                "Hur fungerar en RIGHT JOIN-sats?",
                "Hur fungerar en FULL OUTER JOIN-sats?",
                "Vad är en GROUP BY-sats?",
                "Du har en lista som ser ut såhär\n\nNamn\tÅlder\tStad\nAdam\t20\tLund\nBert\t30\tLund\nCissi\t40\tLund\nDavid\t50\tLund\nHur skapar du en databas för att hantera denna data? (gäller ej SQLite)",
                "Hur skapar du tabellen?",
                "Hur lägger du till data i tabellen?",
                "Hur läser du all data från tabellen?",
                "Hur läser du data från tabellen där namnet är Adam?",
                "Hur läser du data från tabellen där namnet är Adam och åldern är 20?",
                "Hur raderar du Cissi från tabellen?",
                "Hur uppdaterar du Davids ålder till 60?",
                "Hur sorterar du alla efter ålder i fallande ordning?",
                "Hur sorterar du alla efter ålder i stigande ordning?",
                "Vad är en SQL-Injection",
                "Vad heter Bobby Tables egentligen?",
                "Vad händer om man inte använder parametrar i sin SQL kommunikation?",
                "Vad hände när Bobby Tables skrev in i skolan?",
                "Vad är lärdomen med Bobby Tables?",
                "Vad betyder den här koden? strSQL = \"SELECT name, lastName from People where Name = ? AND LastName = ?\"",
                "Varför är den här koden att föredra? strSQL = \"SELECT name, lastName from People where Name = ? AND LastName = ?\"",
                "Vad är Brute Force?",
                "Hur fungerar Brute Force?",
                "Vad är ett design pattern?",
                "Vad har man en builder till?",
                "Vad för annat namn har builder pattern?",
                "Vad gör Builderns metoder speciella?",
                "Vad gör metoden Build()?",
                "Vad är en singleton?",
                "Vad är en factory?",
                "Vad gör metoden Build() i en factory?",
                "Vad är skillnaden mellan factory och builder?"
        };

        String[][] options = {
                {"Structured Query Language", "Structured Question Language", "Structured Query List", "Structured Question List"},
                {"En samling av relaterade data som lagras på ett organiserat sätt för att möjliggöra effektiv hantering och användning av information.", "En samling av slumpmässigt utvalda data som lagras på ett oorganiserat sätt för att göra det svårare att hitta information.", "En samling av textdokument som lagras på ett kaotiskt sätt för att göra det enklare att förlora viktig information."},
                {"En relationsdatabas är en typ av databas som lagrar data i en oorganiserad struktur och kräver att användare söker manuellt efter informationen de behöver.", "En relationsdatabas är en typ av databas som organiserar data i tabeller med rader och kolumner, där informationen i varje tabell är relaterad till informationen i en annan tabell genom användning av nycklar.", "En relationsdatabas är en typ av databas som inte är kompatibel med andra programvaror och system, vilket gör det svårt att överföra data från en plattform till en annan.", "En relationsdatabas är en typ av databas som bara kan hantera numerisk data och inte kan lagra andra typer av data som text, bilder och ljud."},
                {"En tabell är en sorts stol som används för att sitta vid ett matbord.", "En tabell är en plats i databasen med information på ett organiserat sätt, uppdelat rader och kolumner.", "En tabell är en sorts medicin som används för att behandla huvudvärk.", "En tabell är en sorts bil som tillverkas i Frankrike - Le Tabellé."},
                {"En kolumn som innehåller värden som kan vara dubbletter", "En kolumn som innehåller unika värden", "En kolumn som innehåller värden som kan vara null", "En kolumn som innehåller värden som inte kan vara null"},
                {"En kolumn som innehåller värden som kan vara dubbletter", "En kolumn som innehåller värden som kan vara null", "En kolumn som innehåller värden som inte kan vara null", "En kolumn som innehåller unika värden"},
                {"Dubletter i en SQL-databas är bra eftersom det gör att det finns fler data att arbeta med.", "Dubletter i en SQL-databas är bra eftersom det gör det enklare att hitta data.", "Dubletter i en SQL-databas är bra eftersom det gör att databasen är mer robust.", "Dubletter i en SQL-databas är dåligt eftersom det ökar risken för inkonsekvens och felaktigheter i data."},
                {"En rad som innehåller samma värden som en annan rad", "En rad som innehåller unika värden", "En rad som innehålenrvärden som kan vara null", "En rad som innehåller värden som inte kan vara null"},
                {"Create, Read, Update, Delete", "Create, Read, Update, Destroy", "Create, Read, Upload, Delete", "Create, Read, Upload, Destroy"},
                {"En sats som skapar en tabell", "En sats som hämtar data från en tabell", "En sats som uppdaterar data i en tabell", "En sats som tar bort data från en tabell"},
                {"En sats som skapar en tabell", "En sats som läser data från en tabell", "En sats som uppdaterar data i en tabell", "En sats som tar bort data från en tabell", "Svar"},
                {"En sats som skapar en tabell", "En sats som läser data från en tabell", "En sats som uppdaterar data i en tabell", "En sats som tar bort data från en tabell", "Svar"},
                {"En sats som skapar en tabell", "En sats som läser data från en tabell", "En sats som uppdaterar data i en tabell", "En sats som tar bort data från en tabell", "Svar"},
                {"En sats som skapar en tabell", "En sats som läser data från en tabell", "En sats som uppdaterar data i en tabell", "En sats som tar bort data från en tabell", "Svar"},
                {"En sats som skapar en tabell", "En sats som läser data från en tabell", "En sats som uppdaterar data i en tabell", "En sats som tar bort data från en tabell", "Svar"},
                {"En sats som skapar en tabell", "En sats som läser data från en tabell", "En sats som uppdaterar data i en tabell", "En sats som tar bort data från en tabell", "Svar"},
                {"Den kombinerar data från två tabeller", "Den kombinerar data från två tabeller och tar bort dubbletter", "Den kombinerar data från två tabeller och tar bort rader som inte matchar i den första tabellen", "Den kombinerar data från två tabeller och tar bort rader som inte matchar och dubbletter", "Svar"},
                {"Den kombinerar data från två tabeller", "Den kombinerar data från två tabeller och tar bort dubbletter", "Den kombinerar data från två tabeller och tar bort rader som inte matchar i den båda tabellerna", "Den kombinerar data från två tabeller och tar bort rader som inte matchar och dubbletter", "Svar"},
                {"Den kombinerar data från två tabeller", "Den kombinerar data från två tabeller och tar bort dubbletter", "Den kombinerar data från två tabeller och tar bort rader som inte matchar i den andra tabellen", "Den kombinerar data från två tabeller och tar bort rader som inte matchar och dubbletter", "Svar"},
                {"Den kombinerar data från två tabeller", "Den kombinerar data från två tabeller och tar bort dubbletter", "En FULL OUTER JOIN-sats i SQL kombinerar rader från två eller flera tabeller, inklusive rader som inte matchar i båda tabellerna.", "Den kombinerar data från två tabeller och tar bort rader som inte matchar och dubbletter", "Svar"},
                {"En sats som grupperar data från en tabell", "Svar"},
                {"CREATE DATABASE personer;", "CREATE TABLE personer;", "CREATE TABLE personer (Namn, Ålder, Stad);", "CREATE TABLE personer (Namn VARCHAR(255), Ålder INT, Stad VARCHAR(255));", "Svar"},
                {"CREATE TABLE personer;", "CREATE TABLE personer (Namn, Ålder, Stad);", "CREATE TABLE personer (Namn VARCHAR(255), Ålder INT, Stad VARCHAR(255));", "CREATE TABLE personer (Namn VARCHAR(255), Ålder INT, Stad VARCHAR(255), PRIMARY KEY (Namn));", "Svar"},
                {"INSERT INTO personer (Namn, Ålder, Stad) VALUES ('Adam', 20, 'Lund');", "INSERT INTO personer (Namn, Ålder, Stad) VALUES ('Bert', 'Lund', 30);", "INSERT INTO personer (Namn, Ålder, Stad) VALUES (40, 'Cissi', 'Lund');", "INSERT INTO personer (Namn, Ålder, Stad) VALUES ('David', 50, 'Lund');", "Svar"},
                {"SELECT * FROM personer;", "SELECT * FROM personer WHERE Namn = 'Adam';", "SELECT * FROM personer WHERE Namn = 'Adam' AND Ålder = 20;", "SELECT * FROM personer WHERE Namn = 'Adam' OR Ålder = 20;", "Svar"},
                {"SELECT * FROM personer;", "SELECT * FROM personer WHERE Namn = 'Adam';", "SELECT * FROM personer WHERE Namn = 'Adam' AND Ålder = 20;", "SELECT * FROM personer WHERE Namn = 'Adam' OR Ålder = 20;", "Svar"},
                {"SELECT * FROM personer;", "SELECT * FROM personer WHERE Namn = 'Adam';", "SELECT * FROM personer WHERE Namn = 'Adam' AND Ålder = 20;", "SELECT * FROM personer WHERE Namn = 'Adam' OR Ålder = 20;", "Svar"},
                {"Delete FROM personer WHERE Namn != 'Cissi';", "Delete FROM personer WHERE Namn = 'Cissi';", "Delete FROM personer WHERE Namn = 'Cissi' AND Ålder = 40;", "Delete FROM personer WHERE Namn = 'Cissi' OR Ålder = 40;", "Svar"},
                {"UPDATE personer SET Ålder = 60 WHERE Namn = 'David';", "UPDATE personer SET Ålder = 60 WHERE Ålder = 50;", "UPDATE personer SET Ålder = 60 WHERE Namn = 'David' AND Ålder = 50;", "UPDATE personer SET Ålder = 60 WHERE Namn = 'David' OR Ålder = 50;", "Svar"},
                {"SELECT * FROM personer ORDER BY Ålder DESC;", "SELECT * FROM personer ORDER BY Ålder ASC;", "SELECT * FROM personer ORDER BY Ålder;", "SELECT * FROM personer ORDER BY Ålder DESC LIMIT 1;", "Svar"},
                {"SELECT * FROM personer ORDER BY Ålder DESC;", "SELECT * FROM personer ORDER BY Ålder ASC;", "SELECT * FROM personer ORDER BY Ålder;", "SELECT * FROM personer ORDER BY Ålder DESC LIMIT 1;", "Svar"},
                {"Skydd för databasen", "Vaccination mot virus", "Vaccin för att sluta tänka på SQL", "Skadlig SQL-kod som körs i databasen"},
                {"Robert Tables", "Robert'); DROP TABLE personer; --", "Robert'); DROP TABLE students; --", "Robert'); DROP TABLE people; --"},
                {"Inget speciellt", "SQL-Injection och Marcus ger dig IG!", "Parametrar behövs bara om man ska skriva till databasen", "Parametrar är onödig extra kod"},
                {"Skolans studenttabell blev raderad", "Skolan blev vaccinerad mot SQL-Injection", "Skolan blev vaccinerad mot SQL-Injection och Bobby fick IG", "Skolan blev vaccinerad"},
                {"Använd parametrar", "Använd inte parametrar", "Använd Bobby Tables", "Använd inte Bobby Tables"},
                {"Hämta alla namn och efternamn från tabellen People", "Hämta alla namn och efternamn från tabellen People där namnet är lika med efternamnet", "Hämta alla namn och efternamn från tabellen People där namnet och efternamnet är lika med de parameter som skickas in", "Hämta alla namn och efternamn från tabellen People där namnet och efternamnet är bokstavligt talat frågotecken"},
                {"Den är inte att föredra", "Den är att föredra för att den är enklare att läsa", "Den är att föredra för att den är enklare att skriva", "Den är att föredra för att den är säkrare"},
                {"En metod för att visa lösenord", "En metod för att knäcka nötter", "En metod för att knäcka koder genom att testa alla möjliga kombinationer", "En metod för att göra knäck vid jul"},
                {"Den skickar en stor mängd oönskad trafik till nätverksresursen. Attacken syftar till att göra den målstyrda resursen otillgänglig för sina avsedda användare genom att överbelasta dess kapacitet.", "Den sticker en kniv i ryggen på Caesar - Et tu, Brute?", "Den testar alla möjliga kombinationer av tecken tills den hittar rätt", "Den testar alla möjliga kombinationer av glass tills den hittar den godaste"},
                {"En lösning på ett vanligt problem", "En lösning på ett specifikt problem", "En lösning på ett problem som kan användas i flera olika situationer", "En lösning på ett problem som kan användas i flera olika situationer och som är dokumenterad"},
                {"Att bygga kod åt oss (som Copilot)", "Att generera alla parametrar till constructorn och skapa objektet", "Att generera olika objekt med olika parametrar", "Att generera olika parametrar"},
                {"Factory pattern", "Fluent pattern", "Fluent builder pattern", "Factory builder pattern"},
                {"De returnerar this", "De returnerar en ny instans av en annan klass", "De returnerar en gammal instans av en annan klass", "De returnerar en ny instans av en annan klass som ärver från den första klassen"},
                {"Den returnerar this", "Den returnerar en ny instans av en annan klass", "Den returnerar en gammal instans av en annan klass", "Den returnerar en ny instans av en annan klass som ärver från den första klassen"},
                {"En klass som bara kan instansieras en gång", "En klass som bara kan instansieras en gång och som har en statisk metod som returnerar instansen", "En klass som bara kan instansieras en gång och som har en statisk metod som returnerar instansen och som har en privat konstruktor", "En klass som bara kan instansieras en gång och som har en statisk metod som returnerar instansen och som har en privat konstruktor och som har en privat statisk instans"},
                {"En klass som skapar andra klasser", "En klass som skapar andra klasser och som har en statisk metod som returnerar instansen", "En klass som skapar andra klasser och som har en statisk metod som returnerar instansen och som har en privat konstruktor", "En klass som skapar andra klasser och som har en statisk metod som returnerar instansen och som har en privat konstruktor och som har en privat statisk instans"},
                {"Den returnerar this", "Den returnerar en ny instans av en annan klass", "Den returnerar en gammal instans av en annan klass", "Den returnerar en ny instans av en annan klass som ärver från den första klassen"},
                {"Factory skapar objekt, builder bygger objekt", "Factory skapar objekt, builder bygger objekt och factory har en statisk metod som returnerar instansen", "Factory skapar objekt, builder bygger objekt och builder har en statisk metod som returnerar instansen", "Factory skapar objekt, builder bygger objekt och factory har en statisk metod som returnerar instansen och builder har en statisk metod som returnerar instansen"}
        };

        int[] correctAnswers = {1, 1, 2, 2, 4, 1, 3, 3, 1, 2, 1, 3, 4, 2, 2, 1, 4, 3, 3, 3, 5, 4, 4, 1, 2, 2, 2, 1, 2, 3, 4, 3, 2, 1, 1, 4, 4, 3, 3, 2, 3, 2, 2, 1, 2, 2};

        String text = "";
        //extractQuestionsAndOptions(text);
        //questionMaker(text);

        tenta(questions, options, correctAnswers);
    }

    private static void tenta(String[] questions, String[][] options, int[] correctAnswers) {
        int numQuestions = questions.length;
        int numCorrectAnswers = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numQuestions; i++) {
            System.out.println("Fråga " + (i + 1) + ":");
            System.out.println(questions[i]);
            System.out.println("Alternativ:");

            for (int j = 0; j < options[i].length; j++) {
                System.out.println((j + 1) + ". " + options[i][j]);
            }

            System.out.print("Skriv ditt svar (ange numret på det korrekta svaret): ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == correctAnswers[i]) {
                System.out.println("Rätt svar!\n");
                numCorrectAnswers++;
            } else {
                System.out.println("Fel svar.\n");
            }
        }
        System.out.println("Resultat:");
        System.out.println("Antal frågor: " + numQuestions);
        System.out.println("Antal rätt svar: " + numCorrectAnswers);
    }

    public static void questionMaker(String text) {

        List<String> questions = new ArrayList<>();
        String[] lins = text.split("\n");
        for (String lin : lins) {

            if (lin.endsWith("?")) {
                questions.add(lin);
            }
        }
        for (String question : questions) {
            System.out.println("\"" + question + "\"");
        }
    }

    public static void extractQuestionsAndOptions(String text) {
        String[] lines = text.split("\n");
        List<String[]> questionOptionPairs = new ArrayList<>();

        for (int i = 0; i < lines.length; i++) {
            String line = lines[i].trim();
            if (!line.endsWith("?") || line.contains("svar") || line.contains("Svar") || line.contains("SVAR")) {
                String[] options = line.substring(1).trim().split("\n-");
                questionOptionPairs.add(options);
            }
        }

        String[][] result = new String[questionOptionPairs.size()][];
        for (int i = 0; i < questionOptionPairs.size(); i++) {
            result[i] = questionOptionPairs.get(i);
        }

        for (String[] questionOptionPair : questionOptionPairs) {
            System.out.print("{");
            for (int i = 0; i < questionOptionPair.length; i++) {
                System.out.print("\"" + questionOptionPair[i] + "\"");
                if (i < questionOptionPair.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("}");
        }
    }
}