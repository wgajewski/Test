package Vodafon.HMC.Utils.TestData;

import Vodafon.HMC.Utils.LowerCaseHashMap;
import Vodafon.HMC.Utils.LowerCaseSet;

import java.util.Map;
import java.util.Set;

/**
 * Created by Grzegorz Gałuszka on 01.06.2017.
 */
public class AddonsToBasket {

    public static Map<String, Set<String>> addons = new LowerCaseHashMap<>();
    private static Set<String> extraAddons = new LowerCaseSet<>();
    private static Set<String> discounts = new LowerCaseSet<>();
    private static Set<String> myPhoneNumber = new LowerCaseSet<>();

    static {
        addons.put("Kiegészítő szolgáltatások", extraAddons);
        addons.put("Kedvezmények", discounts);
        addons.put("Telefonszámom", myPhoneNumber);

/////////////////////////////////////extraAddons////////////////////////////////////////////////////////

        extraAddons.add("Vodafone EU Roaming");
        // EU ROAMING MUSI BYC!!!!!!!
        extraAddons.add("Gyermekzár opció");
        // kontrola rodzicielska

        //extraAddons.add("Konferencia-beszélgetés");
        // telekonferencja

        //extraAddons.add("Határon túl opció - Románia");
        //opcja cross-over - Rumunia

        //extraAddons.add("Kedvezményes Megújuló PluszAdat 5 GB");
        //Zdyskontowanych danych odnawialna Plus 5 GB

        //extraAddons.add("Vodafone Ajánló ajánlott");
        // Vodafone sprzedaje oferowane

        //extraAddons.add("Kedvezményes Megújuló PluszAdat 200 MB");
        //Zdyskontowanych danych odnawialna Plus 200 GB

        //extraAddons.add("Kedvezményes Megújuló PluszAdat 1 GB");
        //Odnawialne Rabat Plus 1GB danych

        //extraAddons.add("Kedvezményes Megújuló PluszAdat 5 GB");
        //Odnawialne Rabat Plus 5GB danych

        //extraAddons.add("Világ Napijegy");
        //Światowy Dzień biletów

        //extraAddons.add("30 napos hálózati és lefedettségi garancia");
        //30-dniowa gwarancja i sieć

        //extraAddons.add("Forgalmi díjas roaming árazás");
        //Ruch stawki cen roamingu

        //extraAddons.add("Készülékbiztosítás Extra L");
        //Extra Ubezpieczenia Jednostka L


/////////////////////////////////////discounts////////////////////////////////////////////////////////


        //discounts.add("Van Vodafone-os ajánlóm");
        //nie vodafone oferta

/////////////////////////////////////myPhoneNumber////////////////////////////////////////////////////////

        //myPhoneNumber.add("Új telefonszámot szeretnék");
        //Chcę nowy numer telefonu

        //myPhoneNumber.add("Szeretném áthordozni a telefonszámomat");
        //Chciałbym mój numer telefonu
    }

}
