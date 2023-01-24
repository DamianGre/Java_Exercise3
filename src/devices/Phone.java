package devices;

import creatures.Edible;
import creatures.Human;

import java.util.*;


import java.util.List;

public class Phone extends Device implements Salleable{

    private static final  String DEFAULT_VERSION = "latest version";
    private static final String DEFAULT_SERVERIP = "https://damiangrembocki.com";

    public List<Application> instaledApplicationList = new ArrayList<Application>();


    public Phone(String producer, String model, Double value, Integer yearOfProduction)
    {
        super(producer, model, value, yearOfProduction);
    }

    public void installApp(Human human,Application application){
        if(human.salary >= application.price){
            human.salary -= application.price;
            this.instaledApplicationList.add(application);
            System.out.println("Applikacja: " + application + " została zainstalowana.");
        }
    }
    public void installedAppChecker(Application application){
        Boolean appIsInstalled = false;
        for(int i = 0; i < this.instaledApplicationList.size(); i++){
            if(application.equals(this.instaledApplicationList.get(i))){
                appIsInstalled = true;
            }
        }
        if(appIsInstalled == true){
            System.out.println("Aplikacja jest zainstalowana na telefonie.");
        }
        else{
            System.out.println("NIE MA TAKIEJ aplikacji na telefonie.");
        }
    }
    public void installedAppCheckerByName(String applicationName){
        Boolean appIsInstalled = false;
        for(int i = 0; i < this.instaledApplicationList.size(); i++){
            if(applicationName.equals(this.instaledApplicationList.get(i).name)){
                appIsInstalled = true;
            }
        }
        if(appIsInstalled == true){
            System.out.println("Aplikacja jest zainstalowana na telefonie.");
        }
        else{
            System.out.println("NIE MA TAKIEJ aplikacji na telefonie.");
        }
    }
    public void freeAppPrinter(){
        for(int i = 0; i < this.instaledApplicationList.size(); i++){
            if(this.instaledApplicationList.get(i).price == 0.0){
                System.out.println("Darmowa Apka - " + this.instaledApplicationList.get(i));
            }
        }
    }
    public Double sumOfApps(){
        Double allAppsPrice = 0.0;
        for(int i = 0; i < this.instaledApplicationList.size(); i++){
            allAppsPrice += this.instaledApplicationList.get(i).price;
        }
        return allAppsPrice;
    }

    public void allAppsNamesPrinter(){
        for(Application app: instaledApplicationList){
            System.out.println(app.name);
        }
    }
    public void allAppsPricePrinter(){
        for(Application app: instaledApplicationList){
            System.out.println(app.price);
        }
    }

    public void sell(Human seller, Human buyer, Double price){

        Scanner scan3 = new Scanner(System.in);

        String salaryDate;

        if(seller.phone != null)
        {
            if(buyer.salary >= price)
            {
                seller.phone = null;
                buyer.phone = this;

                buyer.salary -= price;
                seller.salary += price;

                System.out.println("Podaj Datę przelewu za towar: ");
                salaryDate = scan3.nextLine();
                seller.salaryDateList.add(salaryDate);
                buyer.salaryDateList.add(salaryDate);

                double goodsCost = price * (-1);
                buyer.salaryHistoryList.add(goodsCost);
                seller.salaryHistoryList.add(price);
            }
            else
            {
                System.out.println("Nie masz tyle pieniedzy");
            }
        }
        else {
            System.out.println("Nie posiadasz tego na sprzedaż.");
        }
        System.out.println("Phone: " + this + "- ZOSTASŁ SPRZEDANY");
    }
    @Override
    public void recharge(Integer precentage) {
        System.out.println("Ładuje");
        System.out.println("Ładuje");
        System.out.println("Naładowano" + precentage);
    }
    @Override
    public void turnOn(){
        System.out.println("Phone włączony");
    }


    public void installAPP(String appName){
        this.installAPP(appName, DEFAULT_VERSION);
    }
    public void installAPP(String appName, String version){
        this.installAPP(appName, version, DEFAULT_SERVERIP);
    }
    public void installAPP(String appName, String version, String serverIP){
        System.out.println("Próba instalacji aplikacji" + appName + " w wersji: " + version );
        System.out.println("Z serwera" + serverIP );
        System.out.println("Sprawdzam płatności");
        System.out.println("Pobieranie aplikacji");
        System.out.println("Instalowanie aplikacji");
    }
    public void installAPP(List<String> appsToInstallNames) {
        for(String appName : appsToInstallNames){
            this.installAPP(appName);
        }
    }

    public String toString() {
        return "Producer: " + this.producer + " " + "Model: " + this.model;
    }
}