package edu.parinya.softarchdesign.behavioral;

import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

public class NewsSubscriber implements Subscriber<News> {
	// You need to implement this class
    private String subscriber;

    public NewsSubscriber(String subscriber){
        this.subscriber = subscriber;
    }

    @Override
    public void onSubscribe(Subscription subscription){
    }

    @Override
    public void onNext(News news){
        System.out.printf("Sending news (%s) to : %s \n",news.getContent(), subscriber);
    }

    @Override
    public void onError(Throwable throwable){
        System.out.printf("Error!");
    }

    @Override
    public void onComplete(){
    }
}
