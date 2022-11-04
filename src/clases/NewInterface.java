/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package clases;

/**
 *En esta interfaz se pasan los metodos necesarios para la otra clase.
 * @author james
 */
public interface NewInterface {

    /**
     * @return the addres
     */
    String getAddres();

    /**
     * @return the DNI
     */
    String getDNI();

    /**
     * @return the name
     */
    String getName();

    /**
     * @return the phone
     */
    String getPhone();

    /**
     * @param addres the addres to set
     */
    void setAddres(String addres);

    /**
     * @param DNI the DNI to set
     */
    void setDNI(String DNI);

    /**
     * @param name the name to set
     */
    void setName(String name);

    /**
     * @param phone the phone to set
     */
    void setPhone(String phone);
    
}
