/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.dao;

import br.com.senac.entidade.Cliente;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author marie
 */
public class ClienteDaoImpl extends BaseDaoImpl<Cliente, Long>{

    @Override
    public Cliente pesquisarPorId(Long id, Session sessao) throws HibernateException {
        
        return null;
        
    }
    
}
