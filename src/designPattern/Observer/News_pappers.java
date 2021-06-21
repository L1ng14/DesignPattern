package com.designPattern.Observer;

public class News_pappers extends TheSubject{
    private  String news;

    public String getNews() {
        return news;
    }

    @Override
    public void setChange(String Data) {
        this.news ="最新报道："+ Data;
        System.out.println("发布最新报道："+Data);
        upDataObserver(Data);
    }

    @Override
    public void upDataObserver(String Data) {
        for (Observer observer : observerList) {
            observer.update(Data);
        }
    }
}
