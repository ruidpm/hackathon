package org.academiadecodigo.whiledlings.hackathon.command;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class CrowdPostDto {

    public static final String moneyRegex = "^\\$?0*[1-9]\\d*(\\.\\d{0,2})?|\\d*(\\.0[1-9])|\\d*(\\.[1-9]\\d?)?$?";

    private Integer id;

    @NotNull(message = "Title cannot be null")
    private String title;

    @NotNull(message = "Message cannot be null")
    private String message;

    @Pattern(regexp = moneyRegex, message = "Amount is not valid")
    @NotNull(message = "Initial amount is mandatory")
    @NotBlank(message = "Initial amount is mandatory")
    private String balance;
}
