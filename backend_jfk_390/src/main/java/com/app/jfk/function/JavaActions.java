package com.app.jfk.function;

import com.app.jfk.model.Organization;
import com.app.jfk.model.EmployeePersonalInfo;
import com.app.jfk.model.EmlpoyeeProfile;




import com.app.jfk.enums.EmploymentType;
import com.app.jfk.enums.OrgDept;
import com.app.jfk.enums.OrgBranch;
import com.app.jfk.converter.OrgBranchConverter;
import com.app.jfk.converter.EmploymentTypeConverter;
import com.app.jfk.converter.OrgDeptConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmAction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataAction;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;

@Component
public class JavaActions implements ODataAction {
    private final EntityManager entityManager;

    public JavaActions(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

	
	
}
  