package org.example.app.data;

import lombok.*;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustDto {
    private String id;
    private String name;
    private String pwd;
}
