/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.1.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.app.main;

import com.app.main.model.ImpactControl;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Validated
@Api(value = "ImpactControl", description = "the ImpactControl API")
public interface ImpactControlApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /get/dashboard/impactControl : Get all impactControl.
     * This is a impactControl service description
     *
     * @param lanID Type of land Id fetch (required)
     * @param password Password (required)
     * @return This means its ok. (status code 200)
     */
    @ApiOperation(value = "Get all impactControl.", nickname = "getAllImpactControl", notes = "This is a impactControl service description", response = ImpactControl.class, responseContainer = "List", tags={ "ImpactControl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "This means its ok.", response = ImpactControl.class, responseContainer = "List") })
    @GetMapping(
        value = "/get/dashboard/impactControl",
        produces = { "application/json" }
    )
    default ResponseEntity<List<ImpactControl>> getAllImpactControl(@ApiParam(value = "Type of land Id fetch" ,required=true) @RequestHeader(value="lanID", required=true) String lanID,@ApiParam(value = "Password" ,required=true) @RequestHeader(value="password", required=true) String password) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"businessUnit\" : \"businessUnit\", \"dnis\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
