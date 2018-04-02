package com.sjtu.ladder;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

import java.util.Stack;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sjtu.ladder.Ladder;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootWordLadder3ApplicationTests {
	@Test
	public void contextLoads() {
		Ladder la = new Ladder();
        Stack<String> st = new Stack<String>();
        String word_1 = "beg";
        String word_2 = "bed";
        st.push(word_1);
        st.push(word_2);
		la.printStack(st, word_1, word_2);
        assertTrue(st.isEmpty());
	}

}
