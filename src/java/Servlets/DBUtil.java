/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Kimbreal
 */


public class DBUtil {
    private static final EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("TobaPU");
    
    public static EntityManagerFactory getEmFactory() {
        return emf;
    }
}

