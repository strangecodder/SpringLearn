package com.example.exmpl2.DataClasses;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;

@Data
public class Taco {
    @NotNull
    @Size(min = 5,message = "Must be include minimum 5 characters")
    private String name;

    @NotNull
    @Size(min = 1,message = "You must add minimum one ingredient")
    private List<Ingredient> ingredients;
}
