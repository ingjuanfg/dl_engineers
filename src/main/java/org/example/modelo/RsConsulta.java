package org.example.modelo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RsConsulta {
	private int perPage;
	private int total;
	private List<DataItem> data;
	private int page;
	private int totalPages;
	private Support support;
}