package com.js;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareOnlyThisForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)

@PrepareOnlyThisForTest(My.class)
@PowerMockIgnore("org.jacoco.agent.rt.*")
public class MyTest {

    @Test
    public void testSay() throws Exception {
        PowerMockito.mockStatic(My.class);
        Mockito.when(My.getString(Mockito.anyString())).thenReturn("returning Jatin");
        assertEquals("returning Jatin", My.getString("Jatin"));
    }

}