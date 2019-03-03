package be.capyx.erp.ms.master.erpmaster.domain;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {

    private Long UUID ;

    private String name ;

    private String lastName ;

    private String email ;

    private String companyCar ;

}
