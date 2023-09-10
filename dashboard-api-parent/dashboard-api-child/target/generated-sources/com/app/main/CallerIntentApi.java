/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.1.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.app.main;

import com.app.main.model.CallerIntent;
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
@Api(value = "CallerIntent", description = "the CallerIntent API")
public interface CallerIntentApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /get/callerIntent : Get callerIntent.
     * This is a callerIntent metrics description
     *
     * @param businessUnit Type of business Unit need to fetch (required)
     * @param fromDate Start Date time (required)
     * @param toDate End Date time (required)
     * @return This means its ok. (status code 200)
     */
    @ApiOperation(value = "Get callerIntent.", nickname = "getCallerIntentMetrics", notes = "This is a callerIntent metrics description", response = CallerIntent.class, responseContainer = "List", tags={ "CallerIntent", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "This means its ok.", response = CallerIntent.class, responseContainer = "List") })
    @PostMapping(
        value = "/get/callerIntent",
        produces = { "application/json" }
    )
    default ResponseEntity<List<CallerIntent>> getCallerIntentMetrics(@ApiParam(value = "Type of business Unit need to fetch" ,required=true) @RequestHeader(value="businessUnit", required=true) String businessUnit,@ApiParam(value = "Start Date time" ,required=true) @RequestHeader(value="fromDate", required=true) String fromDate,@ApiParam(value = "End Date time" ,required=true) @RequestHeader(value="toDate", required=true) String toDate) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"callTransfer\" : 0, \"CFT Call\" : 1, \"Authenticated Call\" : 5, \"GhostCALL\" : 6 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
