package com.Jones.University_Event_Management.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Student")
public class Student {
    @Id
    private Long studentId;

    @NotBlank
    @Pattern(regexp = "^[A-Z][a-zA-Z]*$", message = "First name must start with a capital letter.")
    private String firstName;

    private String lastName;

    @Min(18) @Max(25)
    private Integer age;

    private DepartmentType department;
}
