/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Lamaran;
import model.Pelamaar;

/**
 *
 * @author LOQ
 */
public class LamaranController extends Controller {
      public static int insert(ArrayList<String> values)  {
        return new Lamaran().insert( values,Lamaran.class);
    }
}
