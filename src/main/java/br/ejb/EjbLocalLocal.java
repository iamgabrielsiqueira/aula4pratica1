/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ejb;

import javax.ejb.Local;

/**
 *
 * @author Usuário
 */
@Local
public interface EjbLocalLocal {

    public int dobrar(int valor);
    
}
