package br.com.gabrielpaz.spring.main.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Table(name="tb_user")
@Data @Builder
@AllArgsConstructor @NoArgsConstructor
public class User implements Serializable {
	private static final long serialVersionUID = -6921647021502891099L;

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	private int id;
	
	@Column(name="email", nullable=false)
	@NotNull @NotEmpty
	private String email;
	
	@Column(name="password", nullable=false)
	@NotNull @NotEmpty
	private String password;
}