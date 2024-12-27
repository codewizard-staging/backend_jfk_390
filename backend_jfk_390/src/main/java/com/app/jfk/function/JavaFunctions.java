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
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.jfk.repository.OrganizationRepository;
import com.app.jfk.repository.EmployeePersonalInfoRepository;
import com.app.jfk.repository.EmlpoyeeProfileRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
