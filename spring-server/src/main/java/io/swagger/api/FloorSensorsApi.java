/**
 * NOTE: This class is auto generated by the swagger code generator program (2.2.3).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.FloorSensor;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-10-30T16:30:18.546Z")

@Api(value = "floorSensors", description = "the floorSensors API")
public interface FloorSensorsApi {

    @ApiOperation(value = "Subscribes to all floor sensors' values", notes = "", response = FloorSensor.class, responseContainer = "List", tags={ "floor sensor", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = FloorSensor.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "invalid id supplied", response = Void.class),
        @ApiResponse(code = 404, message = "floor sensor not found", response = Void.class) })
    
    @RequestMapping(value = "/floorSensors/subscribe",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<FloorSensor>> subscribeAll();

}
