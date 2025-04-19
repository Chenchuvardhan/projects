package in.zee.service;

import java.util.List;

import in.zee.entity.Subscriber;

public interface ISubscriberService {
public Subscriber saveSubscriber(Subscriber sub);
public abstract List<Subscriber> getAllSubscribers();
}
