/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package clinicaveterinaria.interfaces;

import clinicaveterinaria.model.Mascota;



public interface IMascotaService {
     void crearMascota(Mascota mascota);

    Mascota obtenerMascota(int id);

    void actualizarMascota(Mascota mascota);

    void eliminarMascota(int id);

    
}
