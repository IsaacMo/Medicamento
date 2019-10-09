package br.com.medicamento.service.interfaces;

public interface CRUDServiceInterface {
	
	public void create(Class<?> estado);
	public Class<?> findByEstado(Integer id);
	public void update(Class<?> clasz);
	public void delete(Integer id);
	

}
