
package com.ejemplo.resource;

import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import com.ejemplo.model.Presentation;
import com.ejemplo.support.PATCH;

@Path("presentations")
public interface PresentationsResource {


    /**
     * 
     * @param title
     *     Filter by title
     * @param start
     *     The first page to return
     * @param pages
     *     The number of pages to return
     * @param authorization
     *     The auth token for this request
     */
    @GET
    @Produces({
        "application/json"
    })
    Response getPresentations(
        @HeaderParam("Authorization")
        String authorization,
        @QueryParam("title")
        String title,
        @QueryParam("start")
        Long start,
        @QueryParam("pages")
        Long pages);

    /**
     * 
     * @param entity
     *     
     * @param authorization
     *     The auth token for this request
     */
    @POST
    @Consumes("application/json")
    @Produces({
        "application/json"
    })
    Response postPresentations(
        @HeaderParam("Authorization")
        String authorization, Presentation entity);

    /**
     * 
     * @param authorization
     *     The auth token for this request
     * @param presentationId
     *     
     */
    @GET
    @Path("{presentationId}")
    @Produces({
        "application/json"
    })
    Response getPresentationsByPresentationId(
        @PathParam("presentationId")
        @NotNull
        String presentationId,
        @HeaderParam("Authorization")
        String authorization);

    /**
     * 
     * @param entity
     *     
     * @param authorization
     *     The auth token for this request
     * @param presentationId
     *     
     */
    @PUT
    @Path("{presentationId}")
    @Consumes("application/json")
    @Produces({
        "application/json"
    })
    Response putPresentationsByPresentationId(
        @PathParam("presentationId")
        @NotNull
        String presentationId,
        @HeaderParam("Authorization")
        String authorization, Presentation entity);

    /**
     * 
     * @param entity
     *     
     * @param authorization
     *     The auth token for this request
     * @param presentationId
     *     
     */
    @PATCH
    @Path("{presentationId}")
    @Consumes("application/json")
    @Produces({
        "application/json"
    })
    Response patchPresentationsByPresentationId(
        @PathParam("presentationId")
        @NotNull
        String presentationId,
        @HeaderParam("Authorization")
        String authorization, Presentation entity);

    /**
     * 
     * @param authorization
     *     The auth token for this request
     * @param presentationId
     *     
     */
    @DELETE
    @Path("{presentationId}")
    Response deletePresentationsByPresentationId(
        @PathParam("presentationId")
        @NotNull
        String presentationId,
        @HeaderParam("Authorization")
        String authorization);

}
