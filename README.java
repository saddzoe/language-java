# language-java
// This is a language project from codecademy

class Language {

  protected String name;
  protected int numSpeakers;
  protected String regionsSpoken;

  protected String wordOrder;

  Language (String nameLang, int speakers, String regions, String wordOrd) {
    this.name = nameLang;
    this.numSpeakers = speakers;
    this.regionsSpoken = regions;
    this.wordOrder = wordOrd;
  }

  public void getInfo() {
    System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
    System.out.println("The language follows the word order: " + this.wordOrder + ".");
  }

  public static void main(String[] args) {
    Language yoruba = new Language("Yoruba", 5500000, "Nigeria, Benin, Togo", "subject-verb-object");
    yoruba.getInfo();

    Language spanish = new Language("Spanish", 555000000, "Spain, Latin America, and Equatorial Guinea", "subject-verb-object");
    spanish.getInfo();

    Mayan mam = new Mayan("Mam", 488,500);
    mam.getInfo;

    Mayan kiche = new Mayan("Ki'che'", 2330000);
    kiche.getInfo();

    SinoTibetan mandarin = new SinoTibetan("Mandarin Chinese", 1110000000);
    mandarin.getInfo();
    
    SinoTibetan burmese = new SinoTibetan("Burmese", 43000000);
    burmese.getInfo();

  }


};

class Mayan extends Language {
  Mayan(String langName, int speakers) {
    super(langName, speakers, "Central America", "verb-object-subject");
  }

  @Override
  public void getInfo() {
    System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
    System.out.println("The language follows the word order: " + this.wordOrder);
    System.out.println("Fun fact: " + this.name + " is an ergative language.");
    };
};

class SineTibetan extends Language {

  SinoTibetan(String languageName, int speakers) {
    super(languageName, speakers, "Asia", "subject-object-verb");
  };
    if (languageName.contains("Chinese")) {
      this.wordOrder = "subject-verb-object";
    };
};

class Mayan extends Language {
  Mayan(String langName, int speakers) {
    super(langName, speakers, "Central America", "verb-object-subject");
  };
  
  @Override
  public void getInfo() {
    System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
    System.out.println("The language follows the word order: " + this.wordOrder);
    System.out.println("Fun fact: " + this.name + " is an ergative language.");
    };
}

class SineTibetan extends Language {

  SinoTibetan(String languageName, int speakers) {
    super(languageName, speakers, "Asia", "subject-object-verb");
  };
    if (languageName.contains("Chinese")) {
      this.wordOrder = "subject-verb-object";
    };
}

