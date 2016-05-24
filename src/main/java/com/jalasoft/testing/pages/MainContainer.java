package com.jalasoft.testing.pages;

public class MainContainer extends AbstractBasePage {

    public Header goToHeader() {
        return new Header();
    }

    public TabBar goToTabBar() {
        return new TabBar();
    }

    public Footer gotToFooter() {
        return new Footer();
    }

//    private Header header;
//
//    private TabBar tabBar;
//
//    private Footer footer;
//
//    public MainContainer() {
//        header = new Header();
//        tabBar = new TabBar();
//        footer = new Footer();
//    }
//
//    public Header getHeader() {
//        return header;
//    }
//
//    public TabBar getTabBar() {
//        return tabBar;
//    }
//
//    public Footer getFooter() {
//        return footer;
//    }
}
