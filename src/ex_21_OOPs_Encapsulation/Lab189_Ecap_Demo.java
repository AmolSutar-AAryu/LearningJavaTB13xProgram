package ex_21_OOPs_Encapsulation;

import java.util.LinkedList;

public class Lab189_Ecap_Demo {
    public static void main(String[] args) {
   VWOLogin vwoLogin = new VWOLogin("amol", "1213asd");
        System.out.println(vwoLogin.Password);
        vwoLogin.Password = "345";
        System.out.println(vwoLogin.Password);

        GoodVWOLogin goodVWOLogin = new GoodVWOLogin("sutar","2345");
        goodVWOLogin.setPassword("amol",false);
        String pass = goodVWOLogin.getPassword();
        System.out.println(pass);


        LinkedList<String> ll  = new LinkedList<>();

    }
}

class VWOLogin {
    public String username;
    public String Password;

    public VWOLogin(String username, String password) {
        this.username = username;
        Password = password;
    }
}

class GoodVWOLogin {
    private String usename;
    private String password;

    public GoodVWOLogin(String usename, String password) {
        this.usename = usename;
        this.password = password;
    }

    public String getUsename() {
        return usename;
    }

    public void setUsename(String usename) {
        this.usename = usename;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean isAdmin) {
        if(isAdmin) {
            this.password = password;
        }else {
            System.out.println("Can't change the password!");
        }
    }
}