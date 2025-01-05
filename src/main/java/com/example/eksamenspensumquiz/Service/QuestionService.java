package com.example.eksamenspensumquiz.Service;

import com.example.eksamenspensumquiz.Model.Question;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService {

    private final List<String> userAnswers = new ArrayList<>();
    private List<Question> questions;

    public QuestionService() {
        questions = new ArrayList<Question>();
        questions.add(new Question("Hvad er forskellen på en LinkedList og en ArrayList?", "LinkedList er en dobbeltkædet liste, hvor hvert element har en reference til både forrige og næste element. ArrayList er en dynamisk liste, der udvider sig efter behov, og elementer sættes altid til sidst.",
                List.of("LinkedList og ArrayList er begge dynamiske lister, men LinkedList har en stor fordel i hastigheden af adgang til specifikke indekser.",
                        "LinkedList er en dobbeltkædet liste, hvor hvert element har en reference til både forrige og næste element. ArrayList er en dynamisk liste, der udvider sig efter behov, og elementer sættes altid til sidst.",
                        "LinkedList er en statisk liste, hvor elementerne placeres på faste pladser. ArrayList er en dynamisk liste, der kan ændre størrelse, efterhånden som data tilføjes.")));


        questions.add(new Question("Hvad er formålet med JUnit?", "JUnit er et unit test framework, der tester isoleret og verificerer, at en enkelt funktion eller komponent fungerer som forventet.",
                List.of("JUnit er et framework, der tester hele systemer for at finde sikkerhedsfejl.",
                        "JUnit er et unit test framework, der tester isoleret og verificerer, at en enkelt funktion eller komponent fungerer som forventet.",
                        "JUnit er et værktøj til at integrere test på tværs af flere systemer.")));

        questions.add(new Question("Hvad er formålet med Singleton-pattern?", "Singleton-pattern sikrer, at en klasse kun har én instans og giver global adgang til den.",
                List.of("Singleton-pattern er et designmønster, der tvinger en klasse til at oprette flere instanser af sig selv.",
                        "Singleton-pattern sikrer, at en klasse kun har én instans og giver global adgang til den.",
                        "Singleton-pattern sikrer, at en klasse kan have flere instanser, men kun én kan være aktiv ad gangen.")));


        questions.add(new Question("Hvad er forskellen på et ER-diagram og et EER-diagram?", "EER-diagram (Enhanced Entity-Relationship) er en udvidelse af ER-diagrammet, der indeholder yderligere funktionaliteter som generalisering, specialisering og abstrakte entiteter.",
                List.of("ER-diagram er kun en visuel repræsentation af tabeller i en database, mens EER-diagrammet også inkluderer SQL-kode.",
                        "EER-diagrammet er mere forenklet end ER-diagrammet og bruges til at vise relationer mellem entiteter.",
                        "EER-diagram (Enhanced Entity-Relationship) er en udvidelse af ER-diagrammet, der indeholder yderligere funktionaliteter som generalisering, specialisering og abstrakte entiteter.")));


        questions.add(new Question("Hvad er forskellen på en primær nøgle, en kandidatnøgle og en fremmednøgle?", "En primær nøgle er en unik attribut, der identificerer en rekord. En fremmednøgle er en reference til en primær nøgle i en anden tabel, og en kandidatnøgle er en unik attribut, der kunne være en primær nøgle.",
                List.of("Kandidatnøgler er ikke nødvendige for at definere primærnøgler i databaser, da kun fremmednøgler er vigtige for relationer.",
                        "En primær nøgle er en unik attribut, der identificerer en rekord. En fremmednøgle er en reference til en primær nøgle i en anden tabel, og en kandidatnøgle er en unik attribut, der kunne være en primær nøgle.",
                        "En primær nøgle er et attribut, der kan duplikere sig selv i en tabel. En fremmednøgle bruges til at sikre referentiel integritet mellem tabeller.")));

// Aggregates and Summary Functions, Subqueries
        questions.add(new Question("Hvad er forskellen mellem aggregation functions og subqueries?", "Aggregation functions bruges til at udføre beregninger som SUM(), AVG() osv. Subqueries bruges til at udføre en forespørgsel inden i en anden forespørgsel.",
                List.of("Subqueries bruges kun i data-modifikation som INSERT og UPDATE, mens aggregation functions kun bruges til at hente data.",
                        "Aggregation functions bruges til at udføre beregninger som SUM(), AVG() osv. Subqueries bruges til at udføre en forespørgsel inden i en anden forespørgsel.",
                        "Aggregation functions bruges kun i SELECT statements, mens subqueries kun bruges i WHERE statements.")));

// Normalization, the concept
        questions.add(new Question("Hvad er normalisering i databasedesign?", "Normalisering er en proces, der strukturerer en database for at reducere redundans og forbedre datakonsistens. Det består af flere normalformer, som sikrer effektivitet og skalerbarhed.",
                List.of("Normalisering er en metode til at undgå dataintegritet ved at lagre redundant data på tværs af tabeller.",
                        "Normalisering er en proces, der strukturerer en database for at reducere redundans og forbedre datakonsistens. Det består af flere normalformer, som sikrer effektivitet og skalerbarhed.",
                        "Normalisering er en teknik, der hjælper med at opbygge en stor og omfattende database, men kan føre til ineffektivitet i forespørgsler.")));

        // 1. normalform
        questions.add(new Question("Hvad kræves for, at en tabel er i første normalform?", "Der må ikke være gentagne grupper, og alle kolonner skal indeholde atomare værdier (én værdi per kolonne).",
                List.of("Der må ikke være gentagne grupper, og alle kolonner skal indeholde atomare værdier (én værdi per kolonne).",
                        "Alle kolonner skal indeholde flere værdier i en celle, hvilket muliggør komplekse datatyper.",
                        "Der må ikke være nogen kolonner, der refererer til en fremmednøgle.")));

// 2. normalform
        questions.add(new Question("Hvad kræves for, at en tabel er i anden normalform?", "Den skal være i første normalform, og alle kolonner skal afhænge fuldstændigt af primærnøglen (ikke kun dele af den).",
                List.of("Tabelstrukturen skal være i første normalform, og alle kolonner skal afhænge fuldstændigt af primærnøglen.",
                        "Tabelstrukturen skal være i første normalform, og der må ikke være nogen fremmednøgler i tabellen.",
                        "Alle kolonner skal være unikke og uafhængige af hinanden.")));

// 3. normalform
        questions.add(new Question("Hvad kræves for, at en tabel er i tredje normalform?", "Den skal være i anden normalform, og der må ikke være transitiv afhængighed – en kolonne må ikke afhænge af andre kolonner før de er afhængige af primærnøglen.",
                List.of("Tabelstrukturen skal være i anden normalform, og der må ikke være transitiv afhængighed.",
                        "Alle kolonner skal være primitive datatyper, og der må ikke være nogen fremmednøgler.",
                        "Der skal være en direkte relation mellem alle kolonner i tabellen.")));

// Try/Catch and Exceptions
        questions.add(new Question("Hvad er forskellen mellem checked exceptions og unchecked exceptions?", "Checked exceptions forekommer ved kompilering, og vi skal håndtere dem. Unchecked exceptions forekommer ved runtime og kræver ikke, at vi håndterer dem.",
                List.of("Checked exceptions kan kun håndteres i catch-blokke, mens unchecked exceptions altid håndteres i throws.",
                        "Checked exceptions forekommer ved kompilering, og vi skal håndtere dem. Unchecked exceptions forekommer ved runtime og kræver ikke, at vi håndterer dem.",
                        "Unchecked exceptions er runtime fejl, og kræver ikke at man tager stilling til dem.")));

        questions.add(new Question("Hvad er DDL (Data Definition Language)?", "DDL består af SQL-kommandoer som CREATE, ALTER, og DROP, der bruges til at definere og ændre strukturen af databaser og tabeller.",
                List.of("DDL består af SQL-kommandoer som CREATE, ALTER, og DROP, der bruges til at definere og ændre strukturen af databaser og tabeller.",
                        "DDL bruges til at manipulere data i databasen, som INSERT, UPDATE og DELETE.",
                        "DDL bruges kun til at oprette relationer mellem tabeller i databasen.")));


// GUI via Spring (Client in a browser / server)
        questions.add(new Question("Hvad betyder 'server-side' i relation til en webapplikation?", "Server-side refererer til den del af applikationen, der kører på serveren og håndterer forretningslogik, datahåndtering og rendering af dynamiske sider.",
                List.of("Server-side refererer kun til databaseinteraktioner, mens client-side kun behandler brugergrænsefladen.",
                        "Server-side refererer til den del af applikationen, der kører på serveren og håndterer forretningslogik, datahåndtering og rendering af dynamiske sider.",
                        "Server-side er den del af applikationen, der kører på klienten, mens client-side håndterer serveren.")));

// Annotations in Spring
        questions.add(new Question("Hvad gør annotationen @Autowired i Spring?", "@Autowired bruges til automatisk at injicere en afhængighed (bean/objekt) i din klasse, så du slipper for selv at oprette eller styre den.",
                List.of("@Autowired er en metode, der automatisk opretter nye objekter i Spring applikationen.",
                        "@Autowired bruges til automatisk at injicere en afhængighed (bean/objekt) i din klasse, så du slipper for selv at oprette eller styre den.",
                        "@Autowired bruges til at definere en databaseforbindelse automatisk.")));

        // Spørgsmål om pakker i Spring
        questions.add(new Question("Hvad er formålet med at bruge pakker i en Spring-applikation?", "Pakker bruges til at organisere kode og ressourcer, og adskille funktionalitet som Controller, Service og Repository.",
                List.of("Pakker bruges til at organisere kode og ressourcer, og adskille funktionalitet som Controller, Service og Repository.",
                        "Pakker bruges til at kombinere alle klasser i én samlet fil for at gøre applikationen mere kompakt.",
                        "Pakker bruges til at opbevare statiske filer som CSS, billeder og JavaScript.")));

// Spørgsmål om Static og Template mapperne i Spring
        questions.add(new Question("Hvad bruges 'Static'-mappen til i en Spring-applikation?", "Static-mappen bruges til statiske filer som CSS-filer, JavaScript-filer, billeder og skrifttyper, der tilgås direkte af browseren.",
                List.of("Static-mappen bruges til statiske filer som CSS-filer, JavaScript-filer, billeder og skrifttyper, der tilgås direkte af browseren.",
                        "Static-mappen bruges til at opbevare Thymeleaf-skabeloner, som serveren fylder ud med dynamisk data.",
                        "Static-mappen bruges til at opbevare Java-klasser, der håndterer logik for HTTP-anmodninger.")));

        questions.add(new Question("Hvad er en LinkedList?", "En LinkedList er en datastruktur, hvor hvert element (node) indeholder en reference (pointer) til det næste element.",
                List.of("En LinkedList er en datastruktur, hvor hvert element (node) indeholder en reference (pointer) til det næste element.",
                        "En LinkedList er en type array, der kan ændres dynamisk.",
                        "En LinkedList er en datastruktur, hvor alle elementer er organiseret i én enkelt sekventiel blok.")));

        questions.add(new Question("Hvad er en Iterator i forbindelse med en LinkedList?", "En Iterator er et objekt, der bruges til at navigere igennem elementerne i en LinkedList.",
                List.of("En Iterator er et objekt, der bruges til at navigere igennem elementerne i en LinkedList.",
                        "En Iterator bruges til at opdatere alle elementer i en LinkedList samtidig.",
                        "En Iterator er et værktøj, der gør det muligt at opdele en LinkedList i flere lister.")));

        questions.add(new Question("Hvad er Git?", "Git er et distribueret versionsstyringssystem, der hjælper med at holde styr på ændringer i koden.",
                List.of("Git er et distribueret versionsstyringssystem, der hjælper med at holde styr på ændringer i koden.",
                        "Git er et system til at kompilere kode.",
                        "Git er et værktøj til at oprette nye programmer.")));

        questions.add(new Question("Hvordan opretter man et nyt Git-repository?", "Man bruger kommandoen 'git init' for at initialisere et nyt repository.",
                List.of("Man bruger kommandoen 'git init' for at initialisere et nyt repository.",
                        "Man bruger kommandoen 'git start' for at oprette et repository.",
                        "Man kan kun oprette et Git-repository ved at bruge en ekstern platform som GitHub.")));

        questions.add(new Question("Hvad er den relationelle datamodel?", "Den relationelle datamodel organiserer data i tabeller, der består af rækker og kolonner.",
                List.of("Den relationelle datamodel organiserer data i tabeller, der består af rækker og kolonner.",
                        "Den relationelle datamodel bruger et hierarkisk forhold mellem tabeller.",
                        "Den relationelle datamodel gemmer data i uorganiserede filer.")));

        questions.add(new Question("Hvad betyder referentiel integritet i en relationel database?", "Referentiel integritet sikrer, at forholdet mellem tabellerne bevares korrekt, især ved brug af fremmednøgler.",
                List.of("Referentielle integritet sikrer, at forholdet mellem tabellerne bevares korrekt, især ved brug af fremmednøgler.",
                        "Referentielle integritet betyder, at data i én tabel ikke kan opdateres uden at ændre data i alle andre tabeller.",
                        "Referentielle integritet sikrer, at der aldrig kan være NULL-værdier i en tabel.")));

        questions.add(new Question("Hvad er en database tabel?", "En tabel er en samling af relaterede data organiseret i rækker og kolonner.",
                List.of("En tabel er en samling af relaterede data organiseret i rækker og kolonner.",
                        "En tabel er en opstilling af værdier som kan indeholde flere nøgler.",
                        "En tabel er en datastruktur, hvor hver række indeholder et bestemt datasæt.")));

        questions.add(new Question("Hvilke SQL-kommandoer er en del af DML?", "INSERT, UPDATE og DELETE er alle DML-kommandoer, der bruges til at manipulere data.",
                List.of("INSERT, UPDATE og DELETE er alle DML-kommandoer, der bruges til at manipulere data.",
                        "INSERT er en DML-kommando, der bruges til at hente data.",
                        "CREATE er en DML-kommando, der bruges til at oprette tabeller.")));

        questions.add(new Question("Hvad gør en SQL JOIN?", "En JOIN bruges til at kombinere data fra to eller flere tabeller baseret på en relateret kolonne.",
                List.of("En JOIN bruges til at kombinere data fra to eller flere tabeller baseret på en relateret kolonne.",
                        "En JOIN bruges til at opdatere data i flere tabeller samtidig.",
                        "En JOIN bruges til at oprette nye tabeller i databasen.")));

        questions.add(new Question("Hvad er forskellen på INNER JOIN og LEFT JOIN?", "En INNER JOIN returnerer kun de rækker, der har matchende værdier i begge tabeller, mens en LEFT JOIN returnerer alle rækker fra venstre tabel.",
                List.of("En INNER JOIN returnerer kun de rækker, der har matchende værdier i begge tabeller, mens en LEFT JOIN returnerer alle rækker fra venstre tabel.",
                        "En INNER JOIN returnerer alle rækker fra begge tabeller, mens en LEFT JOIN kun returnerer fra venstre tabel.",
                        "Der er ingen forskel på INNER JOIN og LEFT JOIN.")));

        questions.add(new Question("Hvordan opretter man forbindelse til en database i Java?", "Man bruger JDBC (Java Database Connectivity) til at oprette forbindelse til en database i Java.",
                List.of("Man bruger JDBC (Java Database Connectivity) til at oprette forbindelse til en database i Java.",
                        "Man bruger en webservice til at oprette forbindelse til en database.",
                        "Man bruger JavaFX til at oprette forbindelse til en database.")));

        questions.add(new Question("Hvordan forbinder man Spring Boot til en database?", "I Spring Boot kan man bruge JDBCTemplate eller JPA til at oprette forbindelse til en database.",
                List.of("I Spring Boot kan man bruge JDBCTemplate eller JPA til at oprette forbindelse til en database.",
                        "I Spring Boot bruges der kun REST API'er til at interagere med databaser.",
                        "I Spring Boot er det ikke nødvendigt at oprette forbindelse til en database.")));

        questions.add(new Question("Hvad er et ResultSet i JDBC?", "Et ResultSet er et objekt, der indeholder data returneret fra en SQL-forespørgsel.",
                List.of("Et ResultSet er et objekt, der indeholder data returneret fra en SQL-forespørgsel.",
                        "Et ResultSet er en SQL-kommando, der bruges til at opdatere data.",
                        "Et ResultSet er et værktøj til at gemme SQL-forespørgsler.")));

        questions.add(new Question("Hvad gør en BeanPropertyRowMapper?", "En BeanPropertyRowMapper mapper resultatet fra en SQL-forespørgsel til en Java-bean.",
                List.of("En BeanPropertyRowMapper mapper resultatet fra en SQL-forespørgsel til en Java-bean.",
                        "En BeanPropertyRowMapper bruges til at oprette en ny databaseforbindelse.",
                        "En BeanPropertyRowMapper gemmer data i en ResultSet.")));

        questions.add(new Question("Hvad er forskellen på inline, internal og external CSS?", "Inline CSS er direkte i HTML-tagget, internal CSS er i et <style>-tag i dokumentets head, og external CSS er i en separat fil.",
                List.of("Inline CSS er direkte i HTML-tagget, internal CSS er i et <style>-tag i dokumentets head, og external CSS er i en separat fil.",
                        "Inline CSS er i en separat fil, internal CSS er i et <style>-tag, og external CSS er i et <link>-tag.",
                        "Der er ingen forskel på inline, internal og external CSS.")));

        questions.add(new Question("Hvad gør CSS-filen, når den er ekstern?", "En ekstern CSS-fil indeholder stilarter, der kan tilknyttes flere HTML-sider.",
                List.of("En ekstern CSS-fil indeholder stilarter, der kan tilknyttes flere HTML-sider.",
                        "En ekstern CSS-fil bruges kun til at formatere tekst i en HTML-side.",
                        "En ekstern CSS-fil kan kun bruges til at formatere billeder.")));

        questions.add(new Question("Hvad bruges @GetMapping til i Spring?", "@GetMapping bruges til at håndtere HTTP GET-anmodninger i en controller.",
                List.of("@GetMapping bruges til at håndtere HTTP GET-anmodninger i en controller.",
                        "@GetMapping bruges til at sende data til klienten i en HTTP POST-anmodning.",
                        "@GetMapping bruges til at definere data i en database.")));

        questions.add(new Question("Hvordan adskiller @PostMapping sig fra @GetMapping?", "@PostMapping bruges til at håndtere HTTP POST-anmodninger, som ofte bruges til at sende data til serveren.",
                List.of("@PostMapping bruges til at håndtere HTTP POST-anmodninger, som ofte bruges til at sende data til serveren.",
                        "@PostMapping bruges til at hente data fra serveren.",
                        "@PostMapping bruges til at tilføje et HTTP-header i en anmodning.")));

        questions.add(new Question("Hvad gør @Autowired i Spring?", "@Autowired bruges til automatisk at injicere afhængigheder i en klasse.",
                List.of("@Autowired bruges til automatisk at injicere afhængigheder i en klasse.",
                        "@Autowired bruges til at deklarere en klasse som en singleton.",
                        "@Autowired bruges til at definere en databaseforbindelse.")));

        questions.add(new Question("Hvilken fordel har @Autowired over manuel instansiering?", "Fordelen ved @Autowired er, at Spring automatisk håndterer afhængighederne og reducerer boilerplate-kode.",
                List.of("Fordelen ved @Autowired er, at Spring automatisk håndterer afhængighederne og reducerer boilerplate-kode.",
                        "Fordelen ved @Autowired er, at den gør applikationen hurtigere.",
                        "Fordelen ved @Autowired er, at den tillader brugeren at definere nye klasser.")));

        questions.add(new Question("Hvad betyder lagdelt arkitektur i Spring?", "Lagdelt arkitektur opdeler applikationen i separate lag (som controller, service og repository), der hver især har ansvaret for specifik funktionalitet.",
                List.of("Lagdelt arkitektur opdeler applikationen i separate lag (som controller, service og repository), der hver især har ansvaret for specifik funktionalitet.",
                        "Lagdelt arkitektur kombinerer alle funktionaliteter i ét lag.",
                        "Lagdelt arkitektur betyder, at alle klasser skal være placeret i én package.")));

    }

    public List<Question> getQuestions() {
        return questions;
    }

    public Question getQuestionByIndex(int index) {
        if (index >= 0 && index < questions.size()) {
            return questions.get(index);
        }
        return null;
    }

    public int getTotalQuestions() {
        return questions.size();
    }

    public void saveAnswer(int questionIndex, String answer) {
        while (userAnswers.size() <= questionIndex) {
            userAnswers.add(null);
        }

        userAnswers.set(questionIndex, answer);
    }

    public int checkAllAnswers() {
        int correctAnswersCount = 0;

        // Loop igennem alle spørgsmålene og brugerens svar
        for (int i = 0; i < userAnswers.size(); i++) {
            String userAnswer = userAnswers.get(i);
            Question question = questions.get(i);

            // Hent det korrekte svar fra question.getCorrectAnswer()
            String correctAnswer = question.getCorrectAnswer();

            // Tjek om brugerens svar er korrekt
            if (userAnswer != null && userAnswer.equals(correctAnswer)) {
                correctAnswersCount++;
            }
        }

        return correctAnswersCount;
    }
}
