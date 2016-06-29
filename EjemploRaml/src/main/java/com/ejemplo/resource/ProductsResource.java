
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
import com.ejemplo.model.Product;
import com.ejemplo.support.PATCH;

@Path("products")
public interface ProductsResource {


    /**
     * 
     * @param region
     *     Filter by region
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
    Response getProducts(
        @HeaderParam("Authorization")
        String authorization,
        @QueryParam("region")
        String region,
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
    Response postProducts(
        @HeaderParam("Authorization")
        String authorization, Product entity);

    /**
     * 
     * @param authorization
     *     The auth token for this request
     * @param productId
     *     
     */
    @GET
    @Path("{productId}")
    @Produces({
        "application/json"
    })
    Response getProductsByProductId(
        @PathParam("productId")
        @NotNull
        String productId,
        @HeaderParam("Authorization")
        String authorization);

    /**
     * 
     * @param entity
     *     
     * @param authorization
     *     The auth token for this request
     * @param productId
     *     
     */
    @PUT
    @Path("{productId}")
    @Consumes("application/json")
    @Produces({
        "application/json"
    })
    Response putProductsByProductId(
        @PathParam("productId")
        @NotNull
        String productId,
        @HeaderParam("Authorization")
        String authorization, Product entity);

    /**
     * 
     * @param entity
     *     
     * @param authorization
     *     The auth token for this request
     * @param productId
     *     
     */
    @PATCH
    @Path("{productId}")
    @Consumes("application/json")
    @Produces({
        "application/json"
    })
    Response patchProductsByProductId(
        @PathParam("productId")
        @NotNull
        String productId,
        @HeaderParam("Authorization")
        String authorization, Product entity);

    /**
     * 
     * @param authorization
     *     The auth token for this request
     * @param productId
     *     
     */
    @DELETE
    @Path("{productId}")
    Response deleteProductsByProductId(
        @PathParam("productId")
        @NotNull
        String productId,
        @HeaderParam("Authorization")
        String authorization);

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
     * @param productId
     *     
     */
    @GET
    @Path("{productId}/presentations")
    @Produces({
        "application/json"
    })
    Response getProductsByProductIdPresentations(
        @PathParam("productId")
        @NotNull
        String productId,
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
     * @param productId
     *     
     */
    @POST
    @Path("{productId}/presentations")
    @Consumes("application/json")
    @Produces({
        "application/json"
    })
    Response postProductsByProductIdPresentations(
        @PathParam("productId")
        @NotNull
        String productId,
        @HeaderParam("Authorization")
        String authorization, Presentation entity);

    /**
     * 
     * @param authorization
     *     The auth token for this request
     * @param presentationId
     *     
     * @param productId
     *     
     */
    @GET
    @Path("{productId}/presentations/{presentationId}")
    @Produces({
        "application/json"
    })
    Response getProductsByProductIdPresentationsByPresentationId(
        @PathParam("presentationId")
        @NotNull
        String presentationId,
        @PathParam("productId")
        @NotNull
        String productId,
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
     * @param productId
     *     
     */
    @PUT
    @Path("{productId}/presentations/{presentationId}")
    @Consumes("application/json")
    @Produces({
        "application/json"
    })
    Response putProductsByProductIdPresentationsByPresentationId(
        @PathParam("presentationId")
        @NotNull
        String presentationId,
        @PathParam("productId")
        @NotNull
        String productId,
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
     * @param productId
     *     
     */
    @PATCH
    @Path("{productId}/presentations/{presentationId}")
    @Consumes("application/json")
    @Produces({
        "application/json"
    })
    Response patchProductsByProductIdPresentationsByPresentationId(
        @PathParam("presentationId")
        @NotNull
        String presentationId,
        @PathParam("productId")
        @NotNull
        String productId,
        @HeaderParam("Authorization")
        String authorization, Presentation entity);

    /**
     * 
     * @param authorization
     *     The auth token for this request
     * @param presentationId
     *     
     * @param productId
     *     
     */
    @DELETE
    @Path("{productId}/presentations/{presentationId}")
    Response deleteProductsByProductIdPresentationsByPresentationId(
        @PathParam("presentationId")
        @NotNull
        String presentationId,
        @PathParam("productId")
        @NotNull
        String productId,
        @HeaderParam("Authorization")
        String authorization);

}
