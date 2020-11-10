package com.designPattern.Observer;

public class postive {
/*================客户端============================*/
    public static void main(String[] args) {
        News_pappers newspaper = new News_pappers();
        Reader lili = new Reader("lili");
        Reader mumu = new Reader("mumu");
        Reader shanshan = new Reader("shanshan");

        newspaper.addObserver(lili);
        newspaper.addObserver(mumu);
        newspaper.addObserver(shanshan);

        newspaper.setChange("Big News");

        shanshan.disObservered(newspaper);

        newspaper.setChange("small00000 News");

        News_pappers news_pappers_02 = new News_pappers();
        mumu.doObservered(news_pappers_02);
        news_pappers_02.setChange("大新闻");

    }
}
