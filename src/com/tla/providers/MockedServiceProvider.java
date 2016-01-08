package com.tla.providers;

import com.tla.domain.ServiceRequest;
import com.tla.domain.ServiceResponse;
import com.tla.domain.interfaces.IServiceProvider;

import java.util.ArrayList;

/**
 * Created by tommydomm123 on 06/01/2016.
 */
public class MockedServiceProvider implements IServiceProvider {

    @Override
    public ServiceResponse CallResponse(ServiceRequest serviceRequest) {
        ServiceResponse serviceResponse = new ServiceResponse();

        try {
            ArrayList<String> results = new ArrayList<String>();

            if (serviceRequest.getLattitude() > 53.0) {
                results.add("ayup");
                results.add("ayup");
                results.add("ayup");
                results.add("ayup");
                results.add("ayup");
                results.add("ayup");
                results.add("hello");
                results.add("goodbye");
                results.add("yes");
                results.add("no");
                results.add("yes");
                results.add("yes");
                results.add("reet");
                results.add("reet");
                results.add("reet");
                results.add("reet");
                results.add("reet");
                results.add("reet");
                results.add("yo");
                results.add("yo");
                results.add("hi");
                results.add("hi");
                results.add("hi");
                results.add("love");
                results.add("love");
                results.add("love");
                results.add("love");
                results.add("aye");
                results.add("aye");
                results.add("aye");
                results.add("aye");
                results.add("aye");
                results.add("aye");
                results.add("aye");
                results.add("the");
                results.add("the");
                results.add("the");
                results.add("the");
                results.add("a");
                results.add("a");
                results.add("a");
                results.add("a");
                results.add("one");
                results.add("two");
                results.add("two");
                results.add("two");
            }
            else {
                results.add("hello");
                results.add("hello");
                results.add("hello");
                results.add("hello");
                results.add("hello");
                results.add("hello");
                results.add("hello");
                results.add("hello");
                results.add("hello");
                results.add("goodbye");
                results.add("goodbye");
                results.add("goodbye");
                results.add("goodbye");
                results.add("goodbye");
                results.add("goodbye");
                results.add("goodbye");
                results.add("goodbye");
                results.add("goodbye");
                results.add("one");
                results.add("one");
                results.add("one");
                results.add("one");
                results.add("one");
                results.add("one");
                results.add("two");
                results.add("hi");
                results.add("hi");
                results.add("ayup");
                results.add("yes");
                results.add("love");
                results.add("the");
                results.add("the");
                results.add("the");
                results.add("aye");
                results.add("no");
                results.add("no");
                results.add("no");
                results.add("no");
                results.add("spiffing");
                results.add("spiffing");
                results.add("spiffing");
                results.add("no");
                results.add("yes");
                results.add("the");
                results.add("a");
                results.add("a");
            }

            JsonNode mockedResponse = Json.toJson(results);

            serviceResponse.setResponse();
        }
        catch (Exception e) {
            //ToDo logging provider... not that it matters too much in a mocked object
        }

        return serviceResponse;
    }
}
