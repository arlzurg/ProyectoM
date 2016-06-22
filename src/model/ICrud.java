package model;

import java.util.List;

public interface ICrud<T> {
	void ReadFile();
    List<T> DataSender();
    void OrdenamientoPorNombre();
    void OrdenamientoPorDni();
    void OrdenamientoPorApellido();
    void OrdenamientoPorSexo();
    void OrdenamientoPorEdad();
    void OrdenamientoPorFecha();
}
