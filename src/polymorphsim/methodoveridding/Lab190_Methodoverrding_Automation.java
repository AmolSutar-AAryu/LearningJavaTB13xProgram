package polymorphsim.methodoveridding;

public class Lab190_Methodoverrding_Automation {
    public static void main(String[] args) {

        CromeTC cromeTC = new CromeTC();
        cromeTC.oepnbrowser();

    }
}
     class OpenToAll {
        void oepnbrowser() {
            System.out.println("IE browser");
        }
    }

    class CromeTC extends OpenToAll{
        @Override
        void oepnbrowser(){
            System.out.println("Crome browesr");
        }
    }

    class FireFox extends OpenToAll{
        @Override
        void oepnbrowser(){
            System.out.println("firefox browser");
        }
    }

