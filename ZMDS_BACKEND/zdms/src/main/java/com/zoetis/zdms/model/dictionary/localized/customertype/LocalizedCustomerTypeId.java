package com.zoetis.zdms.model.dictionary.localized.customertype;

import com.zoetis.zdms.model.dictionary.CustomerType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.io.Serializable;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class LocalizedCustomerTypeId implements Serializable {

    @Column(name = "LANG")
    private String language;

    @Column(name = "TYPE")
    @Enumerated(EnumType.STRING)
    private CustomerType type;
}
