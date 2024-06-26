package ar.edu.davinci.dvds20232cg7.controller.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ItemInsertRequest {

	private Integer cantidad;

	private Long prendaId;

}
