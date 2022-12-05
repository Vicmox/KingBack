package com.example.shoes.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import java.io.Serializable;



import lombok.Data;

@Entity
@Table(name="productos")
@Data
public class Producto implements Serializable {
	
	@Id
	@SequenceGenerator(name="producto_id_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="producto_id_seq")
	private Integer id;
	
	private String nombre;
	
	private String descripcion;
	
	/*@ManyToOne
	@JoinColumn(name="categoria_id")
	private Categoria categoria;*/
	
	
}
