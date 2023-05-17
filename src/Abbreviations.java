import java.util.HashMap;
public class Abbreviations {
    public static void main(String[] args) {
        Abbreviations abbreviations = new Abbreviations();
        abbreviations.addAbbreviation("e.g.", "for example");
        abbreviations.addAbbreviation("etc.", "and so on");
        abbreviations.addAbbreviation("i.e.", "more precisely");

        String text = "e.g. i.e. etc. lol";

        for (String part : text.split(" ")) {
            if (abbreviations.hasAbbreviation(part)) {
                part = abbreviations.findExplanationFor(part);
            }

            System.out.print(part);
            System.out.print(" ");
        }
        System.out.println("hi");
    }

    private String findExplanationFor(String part) {
        return null;
    }

    public Abbreviations {
        String abbreviation;
        String explanation;

        public boolean hasAbbreviation(String abbreviation) {

        }
        public String findExplanationFor(String abbreviation) {

        }
        public void addAbbreviation(String abbreviation, String explanation) {
        
        }


    }
}
