package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;
    Team team2;
    Team team3;
    Team team4;
    Team t;


    @BeforeEach
    public void setup() {
        team = new Team("test-team");
        team2 = new Team("test-team");
        team3 = new Team("test-team");
        team4 = new Team("test-team");
        team2.addMember("Bob");
        team3.addMember("Bob");
        team4.addMember("Carl");
        t = new Team("test-team");
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

   @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)
    @Test
    public void equals_test(){
        
        
        assertEquals(true,team.equals(team));
        assertEquals(false,team.equals(15));
        assertEquals(true,team2.equals(team3));
        assertEquals(false,team2.equals(team4));

    }
    
    @Test
    public void hashcode_test(){
        int result = t.hashCode();
        int expectedResult = -1226298695;
        assertEquals(expectedResult, result);
    }
}
