/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enum;

/**
 *
 * @author rafael
 */
public enum DentesEnum {
    //Dntes superiores(lado direito)
    SD11("Incisivo central superior direito"),
    SD12("Incisivo lateral superior direito"),
    SD13("Canino superior direito"),
    SD14("Primeiro pré-molar superior direito"),
    SD15("Segundo pré-molar superior direito "),
    SD16("Primeiro molar superior direito "),
    SD17("Segundo molar superior direito"),
    SD18("Terceiro molar superior direito (siso)"),
    
    SE21("Incisivo central superior esquerdo"),
    SE22("Incisivo lateral superior esquerdo"),
    SE23("Canino superior esquerdo"),
    SE24("Primeiro pré-molar superior esquerdo"),
    SE25("Segundo pré-molar superior esquerdo"),
    SE26("Primeiro molar superior esquerdo"),
    SE27("Segundo molar superior esquerdo"),
    SE28("Terceiro molar superior esquerdo (siso)"),
    
    IE31("Incisivo central inferior esquerdo"),
    IE32("Incisivo lateral inferior esquerdo"),
    IE33("Canino superior inferior esquerdo"),
    IE34("Primeiro pré-molar inferior esquerdo"),
    IE35("Segundo pré-molar inferior esquerdo"),
    IE36("Primeiro molar inferior esquerdo"),
    IE37("Segundo molar inferior esquerdo"),
    IE38("Terceiro molar inferior esquerdo (siso)"),
    
    ID41("Incisivo central inferior direito"),
    ID42("Incisivo lateral inferior direito"),
    ID43("Canino superior inferior direito"),
    ID44("Primeiro pré-molar inferior direito"),
    ID45("Segundo pré-molar inferior direito"),
    ID46("Primeiro molar inferior direito"),
    ID47("Segundo molar inferior direito"),
    ID48("Terceiro molar inferior direito (siso)");
    
    private final String dente;
    
    DentesEnum(String numDente){
        this.dente = numDente;
    }
    
}
