package com.alc.tacos.data;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.AccessLevel;

@Data
@Entity
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE, force=true)
public class Ingredient {
		@Id
		private final String id;
		private final String name;
		private final Type type;
		
		
		public static enum Type{
			WRAP,PROTEIN,VEGGIES,CHEESE,SAUCE,TEMP
		}



}