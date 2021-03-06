/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g01.muu.enums;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Enumaration created in order to get an enumeration of the types of users
 * @author Sergio
 */

public enum TipoUsuarioEnum 
{
    ADMINISTRADOR("Administrador"),
    PARTICIPANTE("Participante"),
    DEUDOR("Deudor"),
    ACREEDOR("Acreedor");
            
    private String valor;
    
    TipoUsuarioEnum(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return valor;
    }
}
    

