package com.jamiepitts.springservlet.endpoints;

import com.jamiepitts.springservlet.domain.Status;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/status")
public class ServerStatus {
    private final String version;

    public ServerStatus(final String version) {
        this.version = version;
    }

    @GET
    @Produces({APPLICATION_JSON})
    public Response getStatus() {
        Status status = Status.Builder.statusBuilder()
                            .withStatusMessage("OK")
                            .withVersion(version)
                            .build();
        return Response.ok(status).build();
    }
}
