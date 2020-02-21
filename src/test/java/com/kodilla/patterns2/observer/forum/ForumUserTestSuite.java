package com.kodilla.patterns2.observer.forum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ForumUserTestSuite {
    @Test
    public void testUpdate() {
        //Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser johnSmith = new ForumUser("Jan Smith");
        ForumUser ivoneEscobar = new ForumUser("Ivone Escobar");
        ForumUser jessiePinkman = new ForumUser("Jessie Pinkman");
        javaHelpForum.registryObserver(johnSmith);
        javaToolsForum.registryObserver(ivoneEscobar);
        javaHelpForum.registryObserver(jessiePinkman);
        javaToolsForum.registryObserver(jessiePinkman);
        //When
        javaHelpForum.addPost("Message1");
        javaHelpForum.addPost("Message2");
        javaToolsForum.addPost("Message3");
        javaHelpForum.addPost("Message4");
        javaToolsForum.addPost("Message5");
        //Then
        assertEquals(3,johnSmith.getUpdateCount());
        assertEquals(2,ivoneEscobar.getUpdateCount());
        assertEquals(5,jessiePinkman.getUpdateCount());

    }
}
