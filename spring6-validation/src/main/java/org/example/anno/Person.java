package org.example.anno;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class Person {
    @NotNull
    private String name;

    @Min(0)
    @Max(200)
    private int age;
}
