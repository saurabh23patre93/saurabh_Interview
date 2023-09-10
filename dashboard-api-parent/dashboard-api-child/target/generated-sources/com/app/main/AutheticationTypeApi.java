/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.1.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.app.main;

import com.app.main.model.AutheticationType;
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
@Api(value = "AutheticationType", description = "the AutheticationType API")
public interface AutheticationTypeApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /get/autheticationType : Get autheticationType.
     * This is a autheticationType metrics description
     *
     * @param businessUnit Type of business Unit need to fetch (required)
     * @param fromDate Start Date time (required)
     * @param toDate End Date time (required)
     * @return This means its ok. (status code 200)
     */
    @ApiOperation(value = "Get autheticationType.", nickname = "getAutheticationTypeMetrics", notes = "This is a autheticationType metrics description", response = AutheticationType.class, responseContainer = "List", tags={ "AutheticationType", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "This means its ok.", response = AutheticationType.class, responseContainer = "List") })
    @PostMapping(
        value = "/get/autheticationType",
        produces = { "application/json" }
    )
    default ResponseEntity<List<AutheticationType>> getAutheticationTypeMetrics(@ApiParam(value = "Type of business Unit need to fetch" ,required=true) @RequestHeader(value="businessUnit", required=true) String businessUnit,@ApiParam(value = "Start Date time" ,required=true) @RequestHeader(value="fromDate", required=true) String fromDate,@ApiParam(value = "End Date time" ,required=true) @RequestHeader(value="toDate", required=true) String toDate) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"Authenticated Call\" : 5, \"FullyAuth\" : 0, \"PartialAuth\" : 6, \"NoAuth\" : 1 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
