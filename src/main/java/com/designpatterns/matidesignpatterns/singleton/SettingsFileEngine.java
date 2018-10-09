package com.designpatterns.matidesignpatterns.singleton;

public class SettingsFileEngine {
    private static SettingsFileEngine settingsFileEngineInstance = null;
    //1. pole statyczne przechowuje referencję do instancji klasy

    private String fileName = "";

    //2. ukrywasz konstruktor bezparametrowy dodaj 'private'

    private SettingsFileEngine() {
        this.fileName = fileName;
    }

    //3. dodanie metody getInstance
    //przy próbie wywołania - sprawdza czy pole settingsFileEngineInstance jest zainicjowane,
    // tworzy obiekt klasy SettingsFileEngine i przypisuje go do pola settingsFileEngineInstance

    public static SettingsFileEngine getInstance(){
        if(settingsFileEngineInstance == null){
            synchronized (SettingsFileEngine.class){
                if(settingsFileEngineInstance == null){
                    settingsFileEngineInstance = new SettingsFileEngine();
                }
            }
        }
        return settingsFileEngineInstance;
    }

//    Singletona dokonujemy dwukrotnego sprawdzenia czy został już wcześniej
//    zainicjowany. Co ważne - drugie sprawdzenie odbywa się wewnątrz bloku synchronized(), dzięki czemu
//    będziemy mieli pewność, że nie wystąpi równoczesne utworzenie osobnych obiektów Singletona przez
//    równolegle działające wątki aplikacji.

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void open(final String fileName) {
        this.fileName = fileName;
        System.out.println("Opening the settings file");
    }

    public void close() {
        this.fileName = "";
        System.out.println("Closing the settings file");
    }

    public boolean loadSettings() {
        System.out.println("Loading settings from file");
        return true;
    }

    public boolean saveSettings() {
        System.out.println("Saving settings to file");
        return true;
    }
}
