/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PersonaService;

import Entidad.Persona;

public class PersonaService{
    public PersonaService(){
     
    }
    
    public void mostrarPersona(Persona persona){
        System.out.println(persona.getNombre() + " " + persona.getApellido() + " - " + persona.getDocumentoIdentidad());
    }
}