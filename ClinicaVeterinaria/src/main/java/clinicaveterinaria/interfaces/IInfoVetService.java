/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package clinicaveterinaria.interfaces;

import clinicaveterinaria.model.Veterinario;
public interface IInfoVetService {
    void crearVeterinario(Veterinario veterinario);

    Veterinario obtenerVeterinario(int id);
}
