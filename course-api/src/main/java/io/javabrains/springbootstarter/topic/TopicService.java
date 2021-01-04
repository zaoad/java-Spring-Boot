package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	private List<Topic> topics=new ArrayList<>((List<Topic>) Arrays.asList(
			new Topic("1","java","object oriented"),
			new Topic("2", "C++","programming language"),
			new Topic("3","python","high level language")
			));
	public List<Topic> getTopics()
	{
		return topics;
	}
	public Topic getTopic(String id)
	{
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}
	public void addTopic(Topic topic) {
		topics.add(topic);
	}
	public void updateTopic(String id, Topic topic) {
		for(int i=0;i<topics.size();i++)
		{
			if(topics.get(i).getId().equals(id))
			{
				topics.set(i,topic);
			}
		}
	}
	public void deleteTopic(String id, Topic topic) {
		for(int i=0;i<topics.size();i++)
		{
			if(topics.get(i).getId().equals(id))
			{
				topics.remove(i);
			}
		}
	}

}
