/**
 * NOTE: This class is auto generated by the swagger code generator program (2.2.3).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.BluetoothDevice;
import io.swagger.model.BluetoothGattService;

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

@Api(value = "bluetoothDevice", description = "the bluetoothDevice API")
public interface BluetoothDeviceApi {

    @ApiOperation(value = "Connects bluetooth device", notes = "", response = Void.class, tags={ "bluetooth device", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Void.class),
        @ApiResponse(code = 400, message = "invalid uuid supplied", response = Void.class),
        @ApiResponse(code = 404, message = "bluetooth device not found", response = Void.class) })
    
    @RequestMapping(value = "/bluetoothDevice/{uuid}/connect",
        method = RequestMethod.GET)
    ResponseEntity<Void> connect(@ApiParam(value = "The uuid of the bluetooth device. ",required=true ) @PathVariable("uuid") String uuid);


    @ApiOperation(value = "Disconnects bluetooth device", notes = "", response = Void.class, tags={ "bluetooth device", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Void.class),
        @ApiResponse(code = 400, message = "invalid uuid supplied", response = Void.class),
        @ApiResponse(code = 404, message = "bluetooth device not found", response = Void.class) })
    
    @RequestMapping(value = "/bluetoothDevice/{uuid}/disconnect",
        method = RequestMethod.GET)
    ResponseEntity<Void> disconnect(@ApiParam(value = "The uuid of the bluetooth device. ",required=true ) @PathVariable("uuid") String uuid);


    @ApiOperation(value = "Get bluetooth device by uuid", notes = "", response = BluetoothDevice.class, tags={ "bluetooth device", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = BluetoothDevice.class),
        @ApiResponse(code = 400, message = "invalid id supplied", response = Void.class),
        @ApiResponse(code = 404, message = "bluetooth device not found", response = Void.class) })
    
    @RequestMapping(value = "/bluetoothDevice/{uuid}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<BluetoothDevice> getBluetoothDevice(@ApiParam(value = "The uuid of the bluetooth device. ",required=true ) @PathVariable("uuid") String uuid);


    @ApiOperation(value = "Returns bluetooth device's services", notes = "", response = BluetoothGattService.class, tags={ "bluetooth manager", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = BluetoothGattService.class),
        @ApiResponse(code = 400, message = "invalid uuid supplied", response = Void.class),
        @ApiResponse(code = 404, message = "bluetooth device not found", response = Void.class) })
    
    @RequestMapping(value = "/bluetoothDevice/{uuid}/services",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<BluetoothGattService> getServices(@ApiParam(value = "The uuid of the bluetooth service. ",required=true ) @PathVariable("uuid") String uuid);


    @ApiOperation(value = "Pairs bluetooth device", notes = "", response = Void.class, tags={ "bluetooth device", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Void.class),
        @ApiResponse(code = 400, message = "invalid uuid supplied", response = Void.class),
        @ApiResponse(code = 404, message = "bluetooth device not found", response = Void.class) })
    
    @RequestMapping(value = "/bluetoothDevice/{uuid}/pair",
        method = RequestMethod.GET)
    ResponseEntity<Void> pair(@ApiParam(value = "The uuid of the bluetooth device. ",required=true ) @PathVariable("uuid") String uuid);

}
