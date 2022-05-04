package com.uuu.demo1.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class NormalUser3 {

    @NotBlank(message = "name should not be null")
    private String name;
}
