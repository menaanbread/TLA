package com.tla.domain.interfaces;

import com.tla.domain.ServiceRequest;
import com.tla.domain.ServiceResponse;

/**
 * Created by tommydomm123 on 06/01/2016.
 */
public interface IServiceProvider {

    ServiceResponse CallResponse(ServiceRequest serviceRequest);

}
