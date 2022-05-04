package com.uuu.demo1.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class NormalUser2 {

    @NotEmpty(message = "name should not be null")
    private String name;
}
