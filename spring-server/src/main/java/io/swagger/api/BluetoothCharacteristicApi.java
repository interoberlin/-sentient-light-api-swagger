/**
 * NOTE: This class is auto generated by the swagger code generator program (2.2.3).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.BluetoothGattCharacteristic;

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

@Api(value = "bluetoothCharacteristic", description = "the bluetoothCharacteristic API")
public interface BluetoothCharacteristicApi {

    @ApiOperation(value = "Disables value notification of a bluetooth characteristic", notes = "", response = Void.class, tags={ "bluetooth characteristic", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Void.class),
        @ApiResponse(code = 400, message = "invalid uuid supplied", response = Void.class),
        @ApiResponse(code = 404, message = "bluetooth characteristic not found", response = Void.class) })
    
    @RequestMapping(value = "/bluetoothCharacteristic/{uuid}/disableValueNotification",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Void> disableValueNotification(@ApiParam(value = "The uuid of the bluetooth characteristic. ",required=true ) @PathVariable("uuid") String uuid);


    @ApiOperation(value = "Enables value notification of a bluetooth characteristic", notes = "", response = Void.class, tags={ "bluetooth characteristic", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Void.class),
        @ApiResponse(code = 400, message = "invalid uuid supplied", response = Void.class),
        @ApiResponse(code = 404, message = "bluetooth characteristic not found", response = Void.class) })
    
    @RequestMapping(value = "/bluetoothCharacteristic/{uuid}/enableValueNotification",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Void> enableValueNotification(@ApiParam(value = "The uuid of the bluetooth characteristic. ",required=true ) @PathVariable("uuid") String uuid);


    @ApiOperation(value = "Get bluetooth characteristic by uuid", notes = "", response = BluetoothGattCharacteristic.class, tags={ "bluetooth characteristic", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = BluetoothGattCharacteristic.class),
        @ApiResponse(code = 400, message = "invalid uuid supplied", response = Void.class),
        @ApiResponse(code = 404, message = "bluetooth service not found", response = Void.class) })
    
    @RequestMapping(value = "/bluetoothCharacteristic/{uuid}/",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<BluetoothGattCharacteristic> getBluetoothGattCharacteristic(@ApiParam(value = "The uuid of the bluetooth characteristic. ",required=true ) @PathVariable("uuid") String uuid);


    @ApiOperation(value = "Reads a bluetooth characteristic's value", notes = "", response = BluetoothGattCharacteristic.class, tags={ "bluetooth characteristic", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = BluetoothGattCharacteristic.class),
        @ApiResponse(code = 400, message = "invalid uuid supplied", response = Void.class),
        @ApiResponse(code = 404, message = "bluetooth characteristic not found", response = Void.class) })
    
    @RequestMapping(value = "/bluetoothCharacteristic/{uuid}/readValue",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<BluetoothGattCharacteristic> readValue(@ApiParam(value = "The uuid of the bluetooth characteristic. ",required=true ) @PathVariable("uuid") String uuid);


    @ApiOperation(value = "Writes a value to a given characteristic", notes = "", response = Void.class, tags={ "bluetooth characteristic", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Void.class),
        @ApiResponse(code = 400, message = "invalid uuid supplied", response = Void.class),
        @ApiResponse(code = 404, message = "bluetooth characteristic not found", response = Void.class) })
    
    @RequestMapping(value = "/bluetoothCharacteristic/{uuid}/writeValue",
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<Void> writeValue(@ApiParam(value = "The uuid of the bluetooth characteristic. ",required=true ) @PathVariable("uuid") String uuid,@ApiParam(value = "Value to be written in characteristic", required=true) @RequestPart(value="value", required=true)  String value);

}
