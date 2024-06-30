package com.persona.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PersonTest {
    @Test
    void testGetName() {
        //Given
        Person pepa = new Person("pepa","alvarez","12345678A",1985,"USA",'M');
        assertEquals("pepa", pepa.getName());
        
    }

    @Test
    void testGetLastName() {
          //Given
          Person pepa = new Person("pepa","alvarez","12345678A",1985,"USA",'M');
          assertEquals("alvarez", pepa.getLastName());
    }

    @Test
    void testGetDate() {
          //Given
          Person pepa = new Person("pepa","alvarez","12345678A",1985,"USA",'M');
          assertEquals("12345678A", pepa.getDni());
    }

    @Test
    void testGetDni() {
           //Given
           Person pepa = new Person("pepa","alvarez","12345678A",1985,"USA",'M');
           assertEquals(1985, pepa.getDate());
     }

    @Test
    void testGetCountry() {
         //Given
         Person pepa = new Person("pepa","alvarez","12345678A",1985,"USA",'M');
         assertEquals("USA", pepa.getCountry());
    }

    @Test
    void testGetGender() {
          //Given
          Person pepa = new Person("pepa","alvarez","12345678A",1985,"USA",'M');
          assertEquals('M', pepa.getGender());
    }
    }


