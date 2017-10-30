package io.swagger.api;

import io.swagger.model.BluetoothGattCharacteristic;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-10-30T16:30:18.546Z")

@Controller
public class BluetoothCharacteristicApiController implements BluetoothCharacteristicApi {



    public ResponseEntity<Void> disableValueNotification(@ApiParam(value = "The uuid of the bluetooth characteristic. ",required=true ) @PathVariable("uuid") String uuid) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> enableValueNotification(@ApiParam(value = "The uuid of the bluetooth characteristic. ",required=true ) @PathVariable("uuid") String uuid) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<BluetoothGattCharacteristic> getBluetoothGattCharacteristic(@ApiParam(value = "The uuid of the bluetooth characteristic. ",required=true ) @PathVariable("uuid") String uuid) {
        // do some magic!
        return new ResponseEntity<BluetoothGattCharacteristic>(HttpStatus.OK);
    }

    public ResponseEntity<BluetoothGattCharacteristic> readValue(@ApiParam(value = "The uuid of the bluetooth characteristic. ",required=true ) @PathVariable("uuid") String uuid) {
        // do some magic!
        return new ResponseEntity<BluetoothGattCharacteristic>(HttpStatus.OK);
    }

    public ResponseEntity<Void> writeValue(@ApiParam(value = "The uuid of the bluetooth characteristic. ",required=true ) @PathVariable("uuid") String uuid,
        @ApiParam(value = "Value to be written in characteristic", required=true) @RequestPart(value="value", required=true)  String value) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
