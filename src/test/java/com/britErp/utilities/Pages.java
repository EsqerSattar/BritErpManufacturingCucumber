package com.britErp.utilities;


import com.britErp.pages.LoginPage;
import com.britErp.pages.MajorFunctionalityPage;

public class Pages {
   private LoginPage loginPage;
   private MajorFunctionalityPage majorFunctionalityPage;

   public LoginPage login() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public MajorFunctionalityPage majorFunctionalityPage() {
        if (majorFunctionalityPage == null) {
            majorFunctionalityPage = new MajorFunctionalityPage();
        }
        return majorFunctionalityPage;
    }



}
