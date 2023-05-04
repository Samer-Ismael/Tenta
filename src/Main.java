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
                "Hur sorterar du alla efter ålder i stigande ordning?"
        };

        String[][] options = {
                {"Structured Query Language", "Structured Question Language", "Structured Query List", "Structured Question List"},

                {"En samling av relaterade data som lagras på ett organiserat sätt för att möjliggöra effektiv hantering och användning av information.",
                        "En samling av slumpmässigt utvalda data som lagras på ett oorganiserat sätt för att göra det svårare att hitta information.",
                        "En samling av textdokument som lagras på ett kaotiskt sätt för att göra det enklare att förlora viktig information."},

                {"En relationsdatabas är en typ av databas som organiserar data i tabeller med rader och kolumner, där informationen i varje tabell är relaterad till informationen i en annan tabell genom användning av nycklar.",
                        "En relationsdatabas är en typ av databas som lagrar data i en oorganiserad struktur och kräver att användare söker manuellt efter informationen de behöver.",
                        "En relationsdatabas är en typ av databas som använder grafstrukturer för att lagra data och möjliggör snabba sökningar och analyser."},

                {"En sorts stol som används för att sitta vid ett matbord.",
                        "En plats i databasen med information på ett organiserat sätt, uppdelat rader och kolumner.",
                        "En sorts medicin som används för att behandla huvudvärk.",
                        "En sorts bil som tillverkas i Frankrike - Le Tabellé."},

                {"En kolumn som innehåller värden som kan vara dubbletter",
                        "En kolumn som innehåller unika värden",
                        "En kolumn som innehåller värden som kan vara null",
                        "En kolumn som innehåller värden som inte kan vara null"},

                {"En kolumn som innehåller värden som kan vara dubbletter",
                        "En kolumn som innehåller värden som kan vara null",
                        "En kolumn som innehåller värden som inte kan vara null",
                        "En kolumn som innehåller unika värden"},

                {"Dubletter i en SQL-databas är bra eftersom det gör att det finns fler data att arbeta med.",
                        "Dubletter i en SQL-databas är bra eftersom det gör det enklare att hitta data.",
                        "Dubletter i en SQL-databas är bra eftersom det gör att databasen är mer robust.",
                        "Dubletter i en SQL-databas är dåligt eftersom det ökar risken för inkonsekvens och felaktigheter i data."},

                {"En rad som innehåller samma värden som en annan rad",
                        "En rad som innehåller unika värden",
                        "En rad som innehåller värden som kan vara null",
                        "En rad som innehåller värden som inte kan vara null"},

                {"Create, Read, Update, Delete", "Create, Read, Update, Destroy", "Create, Read, Update, Execute", "Create, Read, Update, Modify"},

                {"För att lägga till data i en tabell används SQL-kommandot INSERT INTO.",
                        "För att uppdatera data i en tabell används SQL-kommandot UPDATE.",
                        "För att ta bort data från en tabell används SQL-kommandot REMOVE FROM.",
                        "För att söka efter data i en tabell används SQL-kommandot SEARCH."},

                {"För att skapa en ny tabell används SQL-kommandot CREATE TABLE.",
                        "För att radera en tabell används SQL-kommandot DELETE TABLE.",
                        "För att ändra strukturen på en befintlig tabell används SQL-kommandot ALTER TABLE.",
                        "För att flytta en tabell till en annan databas används SQL-kommandot MOVE TABLE."},

                {"En SQL-fråga för att filtrera rader baserat på ett villkor är SELECT * FROM table WHERE condition;",
                        "En SQL-fråga för att sortera rader i fallande ordning baserat på en kolumn är SELECT * FROM table ORDER BY column DESC;",
                        "En SQL-fråga för att välja specifika kolumner från en tabell är SELECT column1, column2 FROM table;",
                        "En SQL-fråga för att uppdatera värden i en tabell är UPDATE table SET column = value WHERE condition;"},

                {"En SQL-join används för att kombinera rader från två eller flera tabeller baserat på en gemensam kolumn.",
                        "En SQL-join används för att dela upp en tabell i mindre delar för att förbättra prestanda.",
                        "En SQL-join används för att ta bort duplicerade rader från en tabell.",
                        "En SQL-join används för att skapa en ny tabell från två befintliga tabeller."},

                {"En primärnyckel är en unik identifierare för varje rad i en tabell som används för att säkerställa att varje rad kan identifieras entydigt.",
                        "En primärnyckel är en kolumn som tillåter duplicerade värden i en tabell.",
                        "En primärnyckel är en kolumn som innehåller null-värden.",
                        "En primärnyckel är en kolumn som används för att koppla samman två tabeller."},

                {"En främmande nyckel är en kolumn eller en kombination av kolumner i en tabell som används för att skapa en relation mellan två tabeller.",
                        "En främmande nyckel är en kolumn som tillåter duplicerade värden i en tabell.",
                        "En främmande nyckel är en kolumn som innehåller null-värden.",
                        "En främmande nyckel är en kolumn som används för att skapa en unik identifierare för varje rad i en tabell."},

                {"En SQL-index används för att snabba upp sökningar i en tabell genom att skapa en separat datastruktur som innehåller indexet på en eller flera kolumner.",
                        "En SQL-index används för att kopiera data från en tabell till en annan.",
                        "En SQL-index används för att ta bort duplicerade rader från en tabell.",
                        "En SQL-index används för att ändra strukturen på en befintlig tabell."}
        };

        int[] correctAnswers = {1, 1, 1, 2, 2, 1, 4, 3, 1, 1, 2, 4, 1, 2, 1, 2, 3, 1};

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
}